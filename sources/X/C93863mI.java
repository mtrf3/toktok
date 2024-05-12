package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.3mI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93863mI {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C93863mI)) {
            return false;
        }
        C93863mI c93863mI = (C93863mI) obj;
        return this.LIZ == c93863mI.LIZ && this.LIZIZ == c93863mI.LIZIZ && o.LJ(this.LIZJ, c93863mI.LIZJ);
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TakoDisclaimerPrompt(promptRes=");
        LIZ.append(this.LIZ);
        LIZ.append(", type=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", count=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public /* synthetic */ C93863mI(int i) {
        this(i, 0, null);
    }

    public C93863mI(int i, int i2, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
    }
}
