package X;

import kotlin.jvm.internal.o;

/* renamed from: X.FLr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38827FLr {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C38827FLr() {
        this(0, null, 0 == true ? 1 : 0, 7);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreloadStrategy(maxAgeMilliseconds=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", baseUrl=");
        LIZ.append(this.LIZJ);
        LIZ.append(", useOnlyOnce=");
        return C19U.LIZ(LIZ, this.LIZLLL, ")", LIZ);
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(C38827FLr.class, cls)) {
            return false;
        }
        if (obj != null) {
            if (this.LIZ == ((C38827FLr) obj).LIZ) {
                return true;
            }
            return false;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.ies.powerpreload.preload.PreloadStrategy");
    }

    public C38827FLr(int i, String str, boolean z) {
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = z;
        this.LIZ = 3000;
        this.LIZ = i;
    }

    public /* synthetic */ C38827FLr(int i, String str, boolean z, int i2) {
        this((i2 & 1) != 0 ? 3000 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? true : z);
    }
}
