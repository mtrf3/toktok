package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.Puf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65961Puf {
    public String LIZ;
    public int LIZIZ;
    public String LIZJ;

    public C65961Puf() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65961Puf)) {
            return false;
        }
        C65961Puf c65961Puf = (C65961Puf) obj;
        return o.LJ(this.LIZ, c65961Puf.LIZ) && this.LIZIZ == c65961Puf.LIZIZ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PLPageInfo(name=");
        LIZ.append(this.LIZ);
        LIZ.append(", hash=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C65961Puf(int i) {
        this.LIZ = null;
        this.LIZIZ = 0;
    }

    public final void LIZ(Object obj) {
        String str;
        int i = 0;
        if (obj != null && this.LIZIZ == obj.hashCode()) {
            return;
        }
        this.LIZJ = this.LIZ;
        if (obj != null) {
            str = obj.getClass().getName();
        } else {
            str = null;
        }
        this.LIZ = str;
        if (obj != null) {
            i = obj.hashCode();
        }
        this.LIZIZ = i;
    }
}
