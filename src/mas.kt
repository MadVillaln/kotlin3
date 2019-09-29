internal class mas(max:Int){
    private val a: LongArray
    private var nElems: Int = 0
    init {
        a = LongArray(max)
        nElems = 0
    }

    fun size(): Int {
        return nElems
    }

    fun find(searchKey: Long): Int {
        var lowerBound = 0
        var upperBoound = nElems - 1
        var curIn: Int
        while (true) {
            curIn = (lowerBound + upperBoound) / 2
            if (a[curIn] == searchKey)
                return curIn
            else if (lowerBound > upperBoound)
                return nElems
            else {
                if (a[curIn] < searchKey)
                    lowerBound = curIn + 1
                else
                    upperBoound = curIn - 1

            }
        }
    }

}
