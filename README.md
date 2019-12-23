# json_reader_tkachenko

OTUS Spark Homework

Launch the job:

```shell script
.../spark-submit --master local --class com.tkachenko.JsonReader src/main/resources/json_reader_tkachenko-assembly-0.0.1.jar src/main/resources/winemag-data-130k-v2.json
``` 

Should print something like:

```
...
Wine(Some(129967),Some(US),Some(90),Some(75.0),Some(Citation 2004 Pinot Noir (Oregon)),Some(Pinot Noir),Some(Citation))
Wine(Some(129968),Some(France),Some(90),Some(30.0),Some(Domaine Gresser 2013 Kritt Gewurztraminer (Alsace)),Some(Gewürztraminer),Some(Domaine Gresser))
Wine(Some(129969),Some(France),Some(90),Some(32.0),Some(Domaine Marcel Deiss 2012 Pinot Gris (Alsace)),Some(Pinot Gris),Some(Domaine Marcel Deiss))
Wine(Some(129970),Some(France),Some(90),Some(21.0),Some(Domaine Schoffit 2012 Lieu-dit Harth Cuvée Caroline Gewurztraminer (Alsace)),Some(Gewürztraminer),Some(Domaine Schoffit))
```
