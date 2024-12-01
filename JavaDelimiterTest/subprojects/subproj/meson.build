project('Subproject', 'java',
  version : '0.1',
  default_options : ['warning_level=1'])

src = files(
  'net/example/Subproject.java',
)

src_dep = declare_dependency(
  sources: src,
)

exe = jar('Subproject', 'net/example/Subproject.java',
  install : false,
  dependencies : src_dep
)
