package X;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MW1 {
    public final MWL LIZ;
    public final boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public Drawable LJ;
    public boolean LJFF;
    public boolean LJI;
    public final boolean LJII;
    public boolean LJIIIIZZ;

    public MW1() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MW1)) {
            return false;
        }
        MW1 mw1 = (MW1) obj;
        return o.LJ(this.LIZ, mw1.LIZ) && this.LIZIZ == mw1.LIZIZ && this.LIZJ == mw1.LIZJ && this.LIZLLL == mw1.LIZLLL && o.LJ(this.LJ, mw1.LJ) && this.LJFF == mw1.LJFF && this.LJI == mw1.LJI && this.LJII == mw1.LJII && this.LJIIIIZZ == mw1.LJIIIIZZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.LIZJ;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.LIZLLL;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        Drawable drawable = this.LJ;
        int hashCode2 = (i6 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        boolean z4 = this.LJFF;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (hashCode2 + i7) * 31;
        boolean z5 = this.LJI;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z6 = this.LJII;
        int i11 = z6;
        if (z6 != 0) {
            i11 = 1;
        }
        return ((i10 + i11) * 31) + (this.LJIIIIZZ ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MTTemplateNotificationHolderConfig(relationConfig=");
        LIZ.append(this.LIZ);
        LIZ.append(", needRecordGuide=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", needEnableMovementMethodEllipsizePatch=");
        LIZ.append(this.LIZJ);
        LIZ.append(", needCheckEmoji=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", rightCover=");
        LIZ.append(this.LJ);
        LIZ.append(", needAddAuthorIdToSchema=");
        LIZ.append(this.LJFF);
        LIZ.append(", needFollowRelationLabel=");
        LIZ.append(this.LJI);
        LIZ.append(", needMatchFriendForFollowRelationLabel=");
        LIZ.append(this.LJII);
        LIZ.append(", profileNeedRecommend=");
        return C48339Iy7.LIZJ(LIZ, this.LJIIIIZZ, ')', LIZ);
    }

    public MW1(int i) {
        this.LIZ = new MWL();
        this.LIZIZ = false;
        this.LIZJ = false;
        this.LIZLLL = false;
        this.LJ = null;
        this.LJFF = false;
        this.LJI = true;
        this.LJII = true;
        this.LJIIIIZZ = false;
    }
}
