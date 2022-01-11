# Accelerator Log

## Options
```json
{
  "branch" : "main",
  "description" : "This accelerator is used to help upgrade an existing java function to use TAP",
  "icon" : "https://hackernoon.com/hn-images/1*KLO-1UMtj6I6YlsRi1ZLXQ.png",
  "name" : "java-func",
  "projectName" : "java-func-accelerator",
  "url" : "https://github.com/mgbrodi/java-func"
}
```
## Log
```
┏ engine (Chain)
┃  Info Running Chain(Combo, UniquePath)
┃ ┏ engine.transformations[0] (Combo)
┃ ┃  Info Combo running as Chain(Merge(merge), UniquePath(UseLast))
┃ ┃ engine.transformations[0].merge (Chain)
┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┏ engine.transformations[0].merge.transformations[0] (Merge)
┃ ┃ ┃  Info Running Merge(YTT, Combo)
┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[0] (YTT)
┃ ┃ ┃ ┃ Debug Wrote values file with json content:   {"artifactVersion":"0.0.1-beta","icon":"https://hackernoon.com/hn-images/1*KLO-1UMtj6I6YlsRi1ZLXQ.png","name":"java-func","description":"This accelerator is used to help upgrade an existing java function to use TAP","artifactId":"java-func-accelerator","projectName":"java-func-accelerator","branch":"main","url":"https://github.com/mgbrodi/java-func"}
┃ ┃ ┃ ┗  Info Shelling out to YTT with args: [ytt, -f, /tmp/ytt-input14483371690494666497, --data-values-file, /tmp/accelerator-options14128272197914194504.json, --output-files, /tmp/ytt-output10573522194039941033]
┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃  Info Combo running as Include
┃ ┃ ┃ ┃ engine.transformations[0].merge.transformations[0].sources[1].include (Include)
┃ ┃ ┃ ┃  Info Will include [README.md]
┃ ┃ ┃ ┃ Debug LICENSE didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ Debug README.md matched [README.md] -> included
┃ ┃ ┃ ┃ Debug k8s-resource.yaml didn't match [README.md] -> excluded
┃ ┃ ┗ ┗ Debug new-accelerator.yaml didn't match [README.md] -> excluded
┃ ┗ ╺ engine.transformations[0].merge.transformations[1] (UniquePath)
┗ ╺ engine.transformations[1] (UniquePath)
```
