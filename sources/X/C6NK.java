package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6NK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6NK {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final CharSequence LJFF;
    public final InterfaceC65784Pro<C76800UCe> LJI;
    public final View LJII;

    public C6NK() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6NK)) {
            return false;
        }
        C6NK c6nk = (C6NK) obj;
        return this.LIZ == c6nk.LIZ && this.LIZIZ == c6nk.LIZIZ && this.LIZJ == c6nk.LIZJ && this.LIZLLL == c6nk.LIZLLL && this.LJ == c6nk.LJ && o.LJ(this.LJFF, c6nk.LJFF) && o.LJ(this.LJI, c6nk.LJI) && o.LJ(this.LJII, c6nk.LJII);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DialogItem(iconId=");
        LIZ.append(this.LIZ);
        LIZ.append(", textId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", textColor=");
        LIZ.append(this.LIZJ);
        LIZ.append(", tintColorRes=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", textRes=");
        LIZ.append(this.LJ);
        LIZ.append(", text=");
        LIZ.append((Object) this.LJFF);
        LIZ.append(", clickListener=");
        LIZ.append(this.LJI);
        LIZ.append(", iconView=");
        LIZ.append(this.LJII);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LIZLLL = C1JX.LIZLLL(this.LJI, (this.LJFF.hashCode() + (((((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31)) * 31, 31);
        View view = this.LJII;
        if (view == null) {
            hashCode = 0;
        } else {
            hashCode = view.hashCode();
        }
        return LIZLLL + hashCode;
    }

    public C6NK(int i, int i2, int i3, int i4, InterfaceC65784Pro interfaceC65784Pro, int i5) {
        String text;
        i2 = (i5 & 2) != 0 ? 0 : i2;
        i3 = (i5 & 4) != 0 ? R.attr.go : i3;
        i4 = (i5 & 8) != 0 ? R.attr.go : i4;
        if ((i5 & 32) != 0) {
            text = "";
        } else {
            text = null;
        }
        o.LJIIIZ(text, "text");
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = 0;
        this.LJFF = text;
        this.LJI = interfaceC65784Pro;
        this.LJII = null;
    }
}
