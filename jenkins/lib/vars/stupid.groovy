
void call(boolean isStupid) {
    if (isStupid) {
        print 'nino'
    } else {
        print 'goodness gracious'
    }
}

void call(map args) {
    call(
        args.isStupid
    )
}
