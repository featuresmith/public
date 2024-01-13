load("@io_bazel_rules_scala//scala:scala.bzl", "scala_binary")

scala_binary(
    name       = "app",
    srcs       = glob(["*.scala"]),
    deps       = ["//src/scala/lib"],
    main_class = "app.App"
)