package com.bytedance.android.live.liveinteract.matchx.models;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class Combo {

    @InterfaceC65349Pkn("from")
    public final Long from;

    @InterfaceC65349Pkn("position")
    public final int position;

    @InterfaceC65349Pkn("to")
    public final Long to;

    @InterfaceC65349Pkn("win")
    public final boolean win;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Combo)) {
            return false;
        }
        Combo combo = (Combo) obj;
        return o.LJ(this.from, combo.from) && o.LJ(this.to, combo.to) && this.win == combo.win && this.position == combo.position;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Long l = this.from;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.to;
        int hashCode2 = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        boolean z = this.win;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode2 + i) * 31) + this.position;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Combo(from=");
        LIZ.append(this.from);
        LIZ.append(", to=");
        LIZ.append(this.to);
        LIZ.append(", win=");
        LIZ.append(this.win);
        LIZ.append(", position=");
        return b0.LIZJ(LIZ, this.position, ')', LIZ);
    }

    public Combo(Long l, Long l2, boolean z, int i) {
        this.from = l;
        this.to = l2;
        this.win = z;
        this.position = i;
    }

    public /* synthetic */ Combo(Long l, Long l2, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 0 : i);
    }
}
