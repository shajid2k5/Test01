job('example1') {
	steps {
	#!/bin/bash
for a in 1 2 3 4 5 6 7 8 9 10
do
    if [$a == 5];
    then
        sleep 10
       fi
    echo "Iteration no $a"
done
}
}
