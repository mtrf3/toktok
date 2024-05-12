package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.Cgo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31978Cgo {
    public final String LIZ;
    public final Integer LIZIZ;

    public C31978Cgo() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31978Cgo)) {
            return false;
        }
        C31978Cgo c31978Cgo = (C31978Cgo) obj;
        return o.LJ(this.LIZ, c31978Cgo.LIZ) && o.LJ(this.LIZIZ, c31978Cgo.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.LIZIZ;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OneTapGoLiveInfo(anchorLayoutType=");
        LIZ.append(this.LIZ);
        LIZ.append(", multiGuestEnable=");
        return s0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C31978Cgo(String str, Integer num) {
        this.LIZ = str;
        this.LIZIZ = num;
    }
}
