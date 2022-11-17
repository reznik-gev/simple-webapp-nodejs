
void call(boolean isStupid) {
    if (isStupid) {
        print 'nino'
    } else {
        print 'goodness gracious'
    }
}

void call(Map args) {
    call(
        args.isStupid
    )
}
