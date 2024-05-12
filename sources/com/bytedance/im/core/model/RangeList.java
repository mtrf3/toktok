package com.bytedance.im.core.model;

import X.InterfaceC65349Pkn;
import X.V1B;
import Y.IDComparatorS38S0000000_10;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes11.dex */
public class RangeList implements Serializable {
    public transient Comparator<Range> comparator = new IDComparatorS38S0000000_10(3);

    @InterfaceC65349Pkn("list")
    public List<Range> ranges;

    public synchronized RangeList copy() {
        RangeList rangeList;
        rangeList = new RangeList(new ArrayList());
        List<Range> list = this.ranges;
        if (list != null) {
            Iterator<Range> it = list.iterator();
            while (it.hasNext()) {
                rangeList.ranges.add(it.next().copy());
            }
        }
        return rangeList;
    }

    public synchronized Range getMaxRange() {
        if (!V1B.LJJZZIII(this.ranges)) {
            return (Range) ListProtector.get(this.ranges, r1.size() - 1);
        }
        return null;
    }

    public synchronized boolean isRangeListNullOrEmpty() {
        return V1B.LJJZZIII(this.ranges);
    }

    public final synchronized String toString() {
        String str;
        List<Range> list = this.ranges;
        if (list != null) {
            str = list.toString();
        } else {
            str = "[]";
        }
        return str;
    }

    public RangeList() {
    }

    public RangeList(List<Range> list) {
        this.ranges = list;
    }

    public synchronized boolean check(long j) {
        if (V1B.LJJZZIII(this.ranges)) {
            return false;
        }
        for (Range range : this.ranges) {
            if (range.start <= j && j <= range.end) {
                return true;
            }
        }
        return false;
    }

    public synchronized void merge(Range range) {
        if (!range.isValid()) {
            return;
        }
        if (V1B.LJJZZIII(this.ranges)) {
            ArrayList arrayList = new ArrayList();
            this.ranges = arrayList;
            arrayList.add(range);
            return;
        }
        this.ranges.add(range);
        Collections.sort(this.ranges, this.comparator);
        LinkedList linkedList = new LinkedList();
        for (Range range2 : this.ranges) {
            if (linkedList.isEmpty() || ((Range) linkedList.getLast()).end + 1 < range2.start) {
                linkedList.add(range2);
            } else {
                ((Range) linkedList.getLast()).end = Math.max(((Range) linkedList.getLast()).end, range2.end);
            }
        }
        this.ranges = linkedList;
    }
}
