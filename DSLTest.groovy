job('example1') {
	steps {
for (( i=2; i <= $max; ++i ))
do
    echo "$i"
done
}
}
