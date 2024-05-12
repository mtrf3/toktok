package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I4A {
    public final C82622Wbi LIZ;
    public final I0N LIZIZ;
    public final ShortVideoContext LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final C08630Vn<C76800UCe> LJI;
    public final boolean LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I4A)) {
            return false;
        }
        I4A i4a = (I4A) obj;
        return o.LJ(this.LIZ, i4a.LIZ) && o.LJ(this.LIZIZ, i4a.LIZIZ) && o.LJ(this.LIZJ, i4a.LIZJ) && this.LIZLLL == i4a.LIZLLL && this.LJ == i4a.LJ && this.LJFF == i4a.LJFF && o.LJ(this.LJI, i4a.LJI) && this.LJII == i4a.LJII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31)) * 31;
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.LJ;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.LJFF;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        C08630Vn<C76800UCe> c08630Vn = this.LJI;
        return ((i6 + (c08630Vn == null ? 0 : c08630Vn.hashCode())) * 31) + (this.LJII ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowDockBarStatus(diContainer=");
        LIZ.append(this.LIZ);
        LIZ.append(", stickerApiComponent=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", shortVideoContext=");
        LIZ.append(this.LIZJ);
        LIZ.append(", showDockBar=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", effectEntrance=");
        LIZ.append(this.LJ);
        LIZ.append(", effectEntranceVisible=");
        LIZ.append(this.LJFF);
        LIZ.append(", modifyDisplayView=");
        LIZ.append(this.LJI);
        LIZ.append(", showEffectUpload=");
        return C48339Iy7.LIZJ(LIZ, this.LJII, ')', LIZ);
    }

    public static I4A LIZ(I4A i4a, boolean z, boolean z2, boolean z3, C08630Vn c08630Vn, boolean z4, int i) {
        C82622Wbi diContainer;
        I0N stickerApiComponent;
        boolean z5 = z4;
        C08630Vn c08630Vn2 = c08630Vn;
        boolean z6 = z3;
        boolean z7 = z;
        boolean z8 = z2;
        ShortVideoContext shortVideoContext = null;
        if ((i & 1) != 0) {
            diContainer = i4a.LIZ;
        } else {
            diContainer = null;
        }
        if ((i & 2) != 0) {
            stickerApiComponent = i4a.LIZIZ;
        } else {
            stickerApiComponent = null;
        }
        if ((i & 4) != 0) {
            shortVideoContext = i4a.LIZJ;
        }
        if ((i & 8) != 0) {
            z7 = i4a.LIZLLL;
        }
        if ((i & 16) != 0) {
            z8 = i4a.LJ;
        }
        if ((i & 32) != 0) {
            z6 = i4a.LJFF;
        }
        if ((i & 64) != 0) {
            c08630Vn2 = i4a.LJI;
        }
        if ((i & 128) != 0) {
            z5 = i4a.LJII;
        }
        i4a.getClass();
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(stickerApiComponent, "stickerApiComponent");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        return new I4A(diContainer, stickerApiComponent, shortVideoContext, z7, z8, z6, c08630Vn2, z5);
    }

    public I4A(C82622Wbi diContainer, I0N stickerApiComponent, ShortVideoContext shortVideoContext, boolean z, boolean z2, boolean z3, C08630Vn<C76800UCe> c08630Vn, boolean z4) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(stickerApiComponent, "stickerApiComponent");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LIZ = diContainer;
        this.LIZIZ = stickerApiComponent;
        this.LIZJ = shortVideoContext;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = z3;
        this.LJI = c08630Vn;
        this.LJII = z4;
    }
}
