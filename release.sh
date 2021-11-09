#! /bin/bash

cat version.sbt
sbt clean +test +publishSigned sonatypeBundleUpload sonatypeReleaseAll
