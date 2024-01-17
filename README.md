# featuresmith/public

[![Open in GitHub Codespaces](https://github.com/codespaces/badge.svg)](https://codespaces.new/featuresmith/public?quickstart=1)
[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Ffeaturesmith%2Fpublic.svg?type=shield)](https://app.fossa.com/projects/git%2Bgithub.com%2Ffeaturesmith%2Fpublic?ref=badge_shield)

Build with Bazel: `bazel build //src/scala/app:app`

Update maven_install.json: `bazel run @unpinned_maven//:pin`

Run Bazel Steward locally: `coursier launch org.virtuslab:bazel-steward:1.1.0 --main org.virtuslab.bazelsteward.app.Main -- --no-remote --analyze-only`


## License
[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Ffeaturesmith%2Fpublic.svg?type=large)](https://app.fossa.com/projects/git%2Bgithub.com%2Ffeaturesmith%2Fpublic?ref=badge_large)