package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.Mfj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57391Mfj {
    public final String LIZ;
    public final EnumC58006Mpe LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Bundle LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57391Mfj)) {
            return false;
        }
        C57391Mfj c57391Mfj = (C57391Mfj) obj;
        return o.LJ(this.LIZ, c57391Mfj.LIZ) && this.LIZIZ == c57391Mfj.LIZIZ && this.LIZJ == c57391Mfj.LIZJ && this.LIZLLL == c57391Mfj.LIZLLL && o.LJ(this.LJ, c57391Mfj.LJ) && o.LJ(this.LJFF, c57391Mfj.LJFF) && o.LJ(this.LJI, c57391Mfj.LJI);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AuthState(uid=");
        LIZ.append(this.LIZ);
        LIZ.append(", authStep=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isProcessing=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isGrant=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LJ);
        LIZ.append(", enterMethod=");
        LIZ.append(this.LJFF);
        LIZ.append(", extra=");
        LIZ.append(this.LJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31;
        boolean z = this.LIZJ;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode2 + i2) * 31;
        if (!this.LIZLLL) {
            i = 0;
        }
        int LJ = C79062V1e.LJ(this.LJFF, C79062V1e.LJ(this.LJ, (i3 + i) * 31, 31), 31);
        Bundle bundle = this.LJI;
        if (bundle == null) {
            hashCode = 0;
        } else {
            hashCode = bundle.hashCode();
        }
        return LJ + hashCode;
    }

    public /* synthetic */ C57391Mfj(String str, boolean z) {
        this(str, EnumC58006Mpe.INITIAL, false, z, "", "", null);
    }

    public C57391Mfj(String str, EnumC58006Mpe authStep, boolean z, boolean z2, String enterFrom, String enterMethod, Bundle bundle) {
        o.LJIIIZ(authStep, "authStep");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LIZ = str;
        this.LIZIZ = authStep;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = enterFrom;
        this.LJFF = enterMethod;
        this.LJI = bundle;
    }

    public static C57391Mfj LIZ(C57391Mfj c57391Mfj, EnumC58006Mpe enumC58006Mpe, boolean z, String str, String str2, Bundle bundle, int i) {
        String uid;
        boolean z2;
        Bundle bundle2 = bundle;
        String enterMethod = str2;
        String enterFrom = str;
        EnumC58006Mpe authStep = enumC58006Mpe;
        boolean z3 = z;
        if ((i & 1) != 0) {
            uid = c57391Mfj.LIZ;
        } else {
            uid = null;
        }
        if ((i & 2) != 0) {
            authStep = c57391Mfj.LIZIZ;
        }
        if ((i & 4) != 0) {
            z2 = c57391Mfj.LIZJ;
        } else {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = c57391Mfj.LIZLLL;
        }
        if ((i & 16) != 0) {
            enterFrom = c57391Mfj.LJ;
        }
        if ((i & 32) != 0) {
            enterMethod = c57391Mfj.LJFF;
        }
        if ((i & 64) != 0) {
            bundle2 = c57391Mfj.LJI;
        }
        c57391Mfj.getClass();
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(authStep, "authStep");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        return new C57391Mfj(uid, authStep, z2, z3, enterFrom, enterMethod, bundle2);
    }
}
