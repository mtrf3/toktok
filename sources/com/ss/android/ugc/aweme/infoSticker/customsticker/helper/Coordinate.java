package com.ss.android.ugc.aweme.infoSticker.customsticker.helper;

import X.C74221TAz;
import X.InterfaceC65349Pkn;
import X.X1D;

/* loaded from: classes10.dex */
public final class Coordinate {

    @InterfaceC65349Pkn("x")
    public float x;

    @InterfaceC65349Pkn("y")
    public float y;

    public static /* synthetic */ Coordinate copy$default(Coordinate coordinate, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = coordinate.x;
        }
        if ((i & 2) != 0) {
            f2 = coordinate.y;
        }
        return coordinate.copy(f, f2);
    }

    public final Coordinate copy(float f, float f2) {
        return new Coordinate(f, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Coordinate)) {
            return false;
        }
        Coordinate coordinate = (Coordinate) obj;
        return Float.compare(this.x, coordinate.x) == 0 && Float.compare(this.y, coordinate.y) == 0;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.y) + (Float.floatToIntBits(this.x) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('[');
        LIZ.append(this.x);
        LIZ.append(", ");
        return C74221TAz.LIZLLL(LIZ, this.y, ']', LIZ);
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public final void setX(float f) {
        this.x = f;
    }

    public final void setY(float f) {
        this.y = f;
    }

    public Coordinate(float f, float f2) {
        this.x = f;
        this.y = f2;
    }
}
