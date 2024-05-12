package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Coordinate implements Serializable {

    @InterfaceC65349Pkn("centerX")
    public final Float centerX;

    @InterfaceC65349Pkn("centerY")
    public final Float centerY;

    /* JADX WARN: Multi-variable type inference failed */
    public Coordinate() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Coordinate copy$default(Coordinate coordinate, Float f, Float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = coordinate.centerX;
        }
        if ((i & 2) != 0) {
            f2 = coordinate.centerY;
        }
        return coordinate.copy(f, f2);
    }

    public final Coordinate copy(Float f, Float f2) {
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
        return o.LJ(this.centerX, coordinate.centerX) && o.LJ(this.centerY, coordinate.centerY);
    }

    public int hashCode() {
        Float f = this.centerX;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.centerY;
        return hashCode + (f2 != null ? f2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Coordinate(centerX=");
        LIZ.append(this.centerX);
        LIZ.append(", centerY=");
        LIZ.append(this.centerY);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Float getCenterX() {
        return this.centerX;
    }

    public final Float getCenterY() {
        return this.centerY;
    }

    public Coordinate(Float f, Float f2) {
        this.centerX = f;
        this.centerY = f2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Coordinate(java.lang.Float r4, java.lang.Float r5, int r6, kotlin.jvm.internal.DefaultConstructorMarker r7) {
        /*
            r3 = this;
            r2 = r6 & 1
            r0 = 0
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            if (r2 == 0) goto La
            r4 = r1
        La:
            r0 = r6 & 2
            if (r0 == 0) goto Lf
            r5 = r1
        Lf:
            r3.<init>(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.Coordinate.<init>(java.lang.Float, java.lang.Float, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
