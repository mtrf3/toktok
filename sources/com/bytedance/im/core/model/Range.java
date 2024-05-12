package com.bytedance.im.core.model;

import X.C0H1;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;

/* loaded from: classes11.dex */
public class Range implements Serializable {

    @InterfaceC65349Pkn("end")
    public long end;

    @InterfaceC65349Pkn("start")
    public long start;

    public Range copy() {
        return new Range(this.start, this.end);
    }

    public boolean isValid() {
        long j = this.start;
        if (j > 0 && j <= this.end) {
            return true;
        }
        return false;
    }

    public void reverse() {
        long j = this.start;
        this.start = this.end;
        this.end = j;
    }

    public Range() {
        this.start = -1L;
        this.end = -1L;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[");
        LIZ.append(this.start);
        LIZ.append(",");
        return C0H1.LIZJ(LIZ, this.end, "]", LIZ);
    }

    public void merge(Range range) {
        if (!range.isValid()) {
            return;
        }
        long j = range.start;
        long j2 = this.start;
        if (j2 <= 0) {
            j2 = Long.MAX_VALUE;
        }
        this.start = Math.min(j, j2);
        long j3 = range.end;
        long j4 = this.end;
        if (j4 <= 0) {
            j4 = Long.MIN_VALUE;
        }
        this.end = Math.max(j3, j4);
    }

    public Range(long j, long j2) {
        this.start = j;
        this.end = j2;
    }
}
