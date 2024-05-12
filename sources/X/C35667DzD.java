package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.DzD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35667DzD implements C33Q {
    public Boolean LJLIL;
    public int LJLILLLLZI;

    public C35667DzD() {
        this(null, 3, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35667DzD)) {
            return false;
        }
        C35667DzD c35667DzD = (C35667DzD) obj;
        return o.LJ(this.LJLIL, c35667DzD.LJLIL) && this.LJLILLLLZI == c35667DzD.LJLILLLLZI;
    }

    public final int hashCode() {
        Boolean bool = this.LJLIL;
        return ((bool == null ? 0 : bool.hashCode()) * 31) + this.LJLILLLLZI;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NonPersonalizedState(triggerNP=");
        LIZ.append(this.LJLIL);
        LIZ.append(", showToastOpt=");
        return b0.LIZJ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public C35667DzD(Boolean bool, int i) {
        this.LJLIL = bool;
        this.LJLILLLLZI = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C35667DzD(java.lang.Boolean r2, int r3, int r4) {
        /*
            r1 = this;
            r0 = r3 & 1
            if (r0 == 0) goto L5
            r2 = 0
        L5:
            r0 = r3 & 2
            if (r0 == 0) goto Le
            r0 = -1
        La:
            r1.<init>(r2, r0)
            return
        Le:
            r0 = 0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35667DzD.<init>(java.lang.Boolean, int, int):void");
    }

    public static C35667DzD LIZ(C35667DzD c35667DzD, Boolean bool, int i, int i2) {
        if ((i2 & 1) != 0) {
            bool = c35667DzD.LJLIL;
        }
        if ((i2 & 2) != 0) {
            i = c35667DzD.LJLILLLLZI;
        }
        c35667DzD.getClass();
        return new C35667DzD(bool, i);
    }
}
