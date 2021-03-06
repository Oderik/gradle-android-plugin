package com.jvoegele.gradle.tasks.android

class AaptExecTask_r7 extends AndroidAntTask {

  public AaptExecTask_r7(project) {
    super(project);
  }

  /* (non-Javadoc)
   * @see com.jvoegele.gradle.tasks.android.AndroidAntTask#execute(java.util.Map)
   */
  @Override
  public void execute(Map args) {
    ant.aaptexec(executable: ant.aapt,
                 command: args.get('command', 'package'),
                 manifest: androidConvention.androidManifest.path,
                 resources: androidConvention.resDir.path,
                 assets: androidConvention.assetsDir,
                 androidjar: ant['android.jar'],
                 outfolder: project.libsDir,
                 basename: project.name)
  }

}
