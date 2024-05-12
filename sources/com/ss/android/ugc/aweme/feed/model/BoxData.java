package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BoxData implements Serializable {

    @InterfaceC65349Pkn("box")
    public final Coordinate box;

    @InterfaceC65349Pkn("timestamp_MS")
    public final int timestampMS;

    /* JADX WARN: Multi-variable type inference failed */
    public BoxData() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BoxData copy$default(BoxData boxData, Coordinate coordinate, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coordinate = boxData.box;
        }
        if ((i2 & 2) != 0) {
            i = boxData.timestampMS;
        }
        return boxData.copy(coordinate, i);
    }

    public final BoxData copy(Coordinate coordinate, int i) {
        return new BoxData(coordinate, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxData)) {
            return false;
        }
        BoxData boxData = (BoxData) obj;
        return o.LJ(this.box, boxData.box) && this.timestampMS == boxData.timestampMS;
    }

    public int hashCode() {
        Coordinate coordinate = this.box;
        return ((coordinate == null ? 0 : coordinate.hashCode()) * 31) + this.timestampMS;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BoxData(box=");
        LIZ.append(this.box);
        LIZ.append(", timestampMS=");
        return b0.LIZJ(LIZ, this.timestampMS, ')', LIZ);
    }

    public final Coordinate getBox() {
        return this.box;
    }

    public final int getTimestampMS() {
        return this.timestampMS;
    }

    public BoxData(Coordinate coordinate, int i) {
        this.box = coordinate;
        this.timestampMS = i;
    }

    public /* synthetic */ BoxData(Coordinate coordinate, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : coordinate, (i2 & 2) != 0 ? 0 : i);
    }
}
