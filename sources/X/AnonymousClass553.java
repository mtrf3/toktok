package X;

import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.553, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass553 {
    public final boolean LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final Drawable LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final int LJI;

    public AnonymousClass553() {
        this(false, 0, false, null, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass553)) {
            return false;
        }
        AnonymousClass553 anonymousClass553 = (AnonymousClass553) obj;
        return this.LIZ == anonymousClass553.LIZ && this.LIZIZ == anonymousClass553.LIZIZ && this.LIZJ == anonymousClass553.LIZJ && o.LJ(this.LIZLLL, anonymousClass553.LIZLLL) && o.LJ(this.LJ, anonymousClass553.LJ) && this.LJFF == anonymousClass553.LJFF && this.LJI == anonymousClass553.LJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    public final int hashCode() {
        int hashCode;
        boolean z = this.LIZ;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = ((r0 * 31) + this.LIZIZ) * 31;
        ?? r02 = this.LIZJ;
        int i3 = r02;
        if (r02 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        Drawable drawable = this.LIZLLL;
        if (drawable == null) {
            hashCode = 0;
        } else {
            hashCode = drawable.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LJ, (i4 + hashCode) * 31, 31);
        if (!this.LJFF) {
            i = 0;
        }
        return ((LJ + i) * 31) + this.LJI;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FirstNullItemConfig(addNullItemInFirst=");
        LIZ.append(this.LIZ);
        LIZ.append(", nullItemResource=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", enableSelector=");
        LIZ.append(this.LIZJ);
        LIZ.append(", nullItemIcon=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", nullItemName=");
        LIZ.append(this.LJ);
        LIZ.append(", isIdentical=");
        LIZ.append(this.LJFF);
        LIZ.append(", selectorResource=");
        return b0.LIZJ(LIZ, this.LJI, ')', LIZ);
    }

    public AnonymousClass553(boolean z, int i, boolean z2, SY9 sy9, String nullItemName, int i2) {
        boolean z3;
        z = (i2 & 1) != 0 ? false : z;
        i = (i2 & 2) != 0 ? R.drawable.as0 : i;
        z2 = (i2 & 4) != 0 ? false : z2;
        sy9 = (i2 & 8) != 0 ? null : sy9;
        nullItemName = (i2 & 16) != 0 ? "" : nullItemName;
        if ((i2 & 32) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i3 = (i2 & 64) != 0 ? R.drawable.arz : 0;
        o.LJIIIZ(nullItemName, "nullItemName");
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = z2;
        this.LIZLLL = sy9;
        this.LJ = nullItemName;
        this.LJFF = z3;
        this.LJI = i3;
    }
}
