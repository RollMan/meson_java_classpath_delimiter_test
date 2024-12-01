project('JavaDelimiterTest', 'java',
  version : '0.1',
  default_options : ['warning_level=1'])

src = files(
  'com/example/SimpleLib.java',
)

src_dep = declare_dependency(
  sources : src,
)

jarlib = files(
  'jarlib/JarLib.jar',
)

subproj = subproject('subproj')
subproj_dep = subproj.get_variable('src_dep')

exe = jar('JavaDelimiterTest', 'JavaDelimiterTest.java',
  main_class : 'JavaDelimiterTest',
  install : false,
  dependencies : [src_dep, subproj_dep],
  objects : jarlib,
)
