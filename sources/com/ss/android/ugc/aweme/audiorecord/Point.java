package com.ss.android.ugc.aweme.audiorecord;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class Point implements Serializable {

    @InterfaceC65349Pkn("time")
    public long t;

    @InterfaceC65349Pkn("x")
    public int x;

    @InterfaceC65349Pkn("y")
    public int y;

    public final long getT() {
        return this.t;
    }

    public final int getX() {
        return this.x;
    }

    public final int getY() {
        return this.y;
    }

    public final boolean isEqual(Point p) {
        o.LJIIIZ(p, "p");
        if (this.x == p.x && this.y == p.y && this.t == p.t) {
            return true;
        }
        return false;
    }

    public final void setT(long j) {
        this.t = j;
    }

    public final void setX(int i) {
        this.x = i;
    }

    public final void setY(int i) {
        this.y = i;
    }

    public Point(int i, int i2, long j) {
        this.x = i;
        this.y = i2;
        this.t = j;
    }
}
