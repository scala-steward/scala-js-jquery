#! /bin/bash

cat version.sbt
export SCALAJS_VERSION=0.6.33
sbt clean +test +publishSigned sonatypeBundleUpload sonatypeReleaseAll
unset SCALAJS_VERSION
sbt clean +test +publishSigned sonatypeBundleUpload sonatypeReleaseAll
