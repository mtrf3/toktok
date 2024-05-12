package com.bytedance.android.live.effect.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class Area {

    @InterfaceC65349Pkn("bottom")
    public Integer bottom;

    @InterfaceC65349Pkn("left")
    public int left;

    @InterfaceC65349Pkn("right")
    public int right;

    @InterfaceC65349Pkn("top")
    public int top;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Area)) {
            return false;
        }
        Area area = (Area) obj;
        return this.top == area.top && o.LJ(this.bottom, area.bottom) && this.left == area.left && this.right == area.right;
    }

    public final int hashCode() {
        int i = this.top * 31;
        Integer num = this.bottom;
        return ((((i + (num == null ? 0 : num.hashCode())) * 31) + this.left) * 31) + this.right;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Area(top=");
        LIZ.append(this.top);
        LIZ.append(", bottom=");
        LIZ.append(this.bottom);
        LIZ.append(", left=");
        LIZ.append(this.left);
        LIZ.append(", right=");
        return b0.LIZJ(LIZ, this.right, ')', LIZ);
    }

    public Area(int i, Integer num, int i2, int i3) {
        this.top = i;
        this.bottom = num;
        this.left = i2;
        this.right = i3;
    }

    public /* synthetic */ Area(int i, Integer num, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i4 & 2) != 0 ? null : num, i2, i3);
    }
}
