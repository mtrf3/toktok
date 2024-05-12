package com.ss.android.ugc.aweme.infoSticker.customsticker.helper;

import X.InterfaceC65349Pkn;
import X.X1D;

/* loaded from: classes12.dex */
public final class Location {

    @InterfaceC65349Pkn("h")
    public final int height;

    @InterfaceC65349Pkn("x")
    public final int left;

    @InterfaceC65349Pkn("y")
    public final int top;

    @InterfaceC65349Pkn("w")
    public final int width;

    public static /* synthetic */ Location copy$default(Location location, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = location.left;
        }
        if ((i5 & 2) != 0) {
            i2 = location.top;
        }
        if ((i5 & 4) != 0) {
            i3 = location.width;
        }
        if ((i5 & 8) != 0) {
            i4 = location.height;
        }
        return location.copy(i, i2, i3, i4);
    }

    public final Location copy(int i, int i2, int i3, int i4) {
        return new Location(i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Location)) {
            return false;
        }
        Location location = (Location) obj;
        return this.left == location.left && this.top == location.top && this.width == location.width && this.height == location.height;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.width) * 31) + this.height;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('[');
        LIZ.append(this.left);
        LIZ.append(", ");
        LIZ.append(this.top);
        LIZ.append("], width: ");
        LIZ.append(this.width);
        LIZ.append(", height: ");
        LIZ.append(this.height);
        return X1D.LIZIZ(LIZ);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getTop() {
        return this.top;
    }

    public final int getWidth() {
        return this.width;
    }

    public Location(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.width = i3;
        this.height = i4;
    }
}
