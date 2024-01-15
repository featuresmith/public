load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# bazelbuild/bazel-skylib
bazel_skylib_tag = "1.4.1"
bazel_skylib_sha = "060426b186670beede4104095324a72bd7494d8b4e785bf0d84a612978285908"
# bazelbuilds/rules_java
rules_java_version = "5.4.0"
rules_java_hash    = "f90111a597b2aa77b7104dbdc685fd35ea0cca3b7c3f807153765e22319cbd88"
# bazelbuild/rules_scala
rules_scala_tag = "394c0aaf585652e75d475f49dcba1b33095f3446"
rules_scala_sha = "b548d60ac29dab6b7cce4086bc61fc0d2815a3d7c9dbbf04c41115a203ef2a84"
# bazelbuild/rules_jvm_external
rules_jvm_external_tag = "5.2"
rules_jvm_external_sha = "3824ac95d9edf8465c7a42b7fcb88a5c6b85d2bac0e98b941ba13f235216f313"

http_archive(
  name         = "bazel_skylib",
  url          = "https://github.com/bazelbuild/bazel-skylib/archive/refs/tags/%s.tar.gz" % bazel_skylib_tag,
  strip_prefix = "bazel-skylib-%s" % bazel_skylib_tag,
  sha256       = bazel_skylib_sha,
)
http_archive(
    name         = "rules_java",
    strip_prefix = "rules_java-%s" % rules_java_version,
    url          = "https://github.com/bazelbuild/rules_java/archive/refs/tags/%s.tar.gz" % rules_java_version,
    sha256       = rules_java_hash,
)
http_archive(
  name         = "io_bazel_rules_scala",
  url          = "https://github.com/bazelbuild/rules_scala/archive/%s.tar.gz" % rules_scala_tag,
  strip_prefix = "rules_scala-%s" % rules_scala_tag,
  sha256       = rules_scala_sha,
)
http_archive(
  name         = "rules_jvm_external",
  url          = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % rules_jvm_external_tag,
  strip_prefix = "rules_jvm_external-%s" % rules_jvm_external_tag,
  sha256       = rules_jvm_external_sha,
)

load("@rules_java//java:repositories.bzl", "rules_java_dependencies", "rules_java_toolchains")
rules_java_dependencies()
rules_java_toolchains()

load("@rules_jvm_external//:repositories.bzl", "rules_jvm_external_deps")
rules_jvm_external_deps()
load("@rules_jvm_external//:setup.bzl", "rules_jvm_external_setup")
rules_jvm_external_setup()
load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
  artifacts = [
    "org.typelevel:cats-core_3:2.9.0",
  ],
  repositories = [
    "https://repo1.maven.org/maven2",
  ],
  maven_install_json = "@//:maven_install.json",
  fetch_sources = True,
)

load("@maven//:defs.bzl", "pinned_maven_install")
pinned_maven_install()

load("@io_bazel_rules_scala//:scala_config.bzl", "scala_config")
scala_config(scala_version = "3.2.1", enable_compiler_dependency_tracking = True)
load("@io_bazel_rules_scala//scala:scala.bzl", "rules_scala_setup", "rules_scala_toolchain_deps_repositories")
rules_scala_setup()
rules_scala_toolchain_deps_repositories(fetch_sources = True)
load("@rules_proto//proto:repositories.bzl", "rules_proto_dependencies", "rules_proto_toolchains")
rules_proto_dependencies()
rules_proto_toolchains()
load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains")
scala_register_toolchains()
load("@io_bazel_rules_scala//testing:scalatest.bzl", "scalatest_repositories", "scalatest_toolchain")
scalatest_repositories()
scalatest_toolchain()
