job('example1') {
	steps {
max=10
for i in {2..$max}
do
    echo "$i"
done
}
}
