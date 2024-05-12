package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.55U, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C55U {
    public final String LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final InterfaceC65784Pro<C76800UCe> LJFF;

    public C55U() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55U)) {
            return false;
        }
        C55U c55u = (C55U) obj;
        return o.LJ(this.LIZ, c55u.LIZ) && this.LIZIZ == c55u.LIZIZ && this.LIZJ == c55u.LIZJ && this.LIZLLL == c55u.LIZLLL && this.LJ == c55u.LJ && o.LJ(this.LJFF, c55u.LJFF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((((((hashCode + i) * 31) + this.LIZJ) * 31) + (this.LIZLLL ? 1 : 0)) * 31) + this.LJ) * 31;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJFF;
        return i2 + (interfaceC65784Pro == null ? 0 : interfaceC65784Pro.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CustomItemConfig(customItemText=");
        LIZ.append(this.LIZ);
        LIZ.append(", addCustomItemInFirst=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", customItemResource=");
        LIZ.append(this.LIZJ);
        LIZ.append(", enableCustomSelector=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", customItemIcon=");
        LIZ.append(this.LJ);
        LIZ.append(", onClearButtonClick=");
        return C06540Nm.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public C55U(int i) {
        this.LIZ = "自定义";
        this.LIZIZ = false;
        this.LIZJ = R.drawable.as0;
        this.LIZLLL = false;
        this.LJ = R.drawable.arr;
        this.LJFF = null;
    }
}
