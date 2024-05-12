package X;

import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rhl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70257Rhl implements InterfaceC70269Rhx {
    public final String LIZ;
    public final Image LIZIZ;
    public final List<Image> LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.LIZ.hashCode() * 31;
        Image image = this.LIZIZ;
        int i = 0;
        if (image == null) {
            hashCode = 0;
        } else {
            hashCode = image.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        List<Image> list = this.LIZJ;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i3 = (((i2 + hashCode2) * 31) + this.LIZLLL) * 31;
        String str = this.LJ;
        if (str != null) {
            i = str.hashCode();
        }
        int i4 = (i3 + i) * 31;
        boolean z = this.LJFF;
        int i5 = 1;
        int i6 = z;
        if (z != 0) {
            i6 = 1;
        }
        int i7 = (i4 + i6) * 31;
        boolean z2 = this.LJI;
        int i8 = z2;
        if (z2 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        if (!this.LJII) {
            i5 = 0;
        }
        return i9 + i5;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UI(id=");
        LIZ.append(this.LIZ);
        LIZ.append(", image=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", skcImages=");
        LIZ.append(this.LIZJ);
        LIZ.append(", pos=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", skcName=");
        LIZ.append(this.LJ);
        LIZ.append(", hasStock=");
        LIZ.append(this.LJFF);
        LIZ.append(", isSelected=");
        LIZ.append(this.LJI);
        LIZ.append(", isEnable=");
        return C48339Iy7.LIZJ(LIZ, this.LJII, ')', LIZ);
    }

    @Override // X.InterfaceC70269Rhx
    public final boolean LIZ() {
        return this.LJI;
    }

    @Override // X.InterfaceC70269Rhx
    public final String getId() {
        return this.LIZ;
    }

    @Override // X.InterfaceC70269Rhx
    public final boolean isEnable() {
        return this.LJII;
    }

    @Override // X.InterfaceC70269Rhx
    public final InterfaceC70269Rhx LIZIZ(boolean z) {
        return LIZJ(this, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70257Rhl)) {
            return false;
        }
        C70257Rhl c70257Rhl = (C70257Rhl) obj;
        if (o.LJ(this.LIZ, c70257Rhl.LIZ) && o.LJ(this.LIZIZ, c70257Rhl.LIZIZ) && o.LJ(this.LIZJ, c70257Rhl.LIZJ) && this.LIZLLL == c70257Rhl.LIZLLL && o.LJ(this.LJ, c70257Rhl.LJ) && this.LJFF == c70257Rhl.LJFF && this.LJI == c70257Rhl.LJI && this.LJII == c70257Rhl.LJII) {
            return true;
        }
        return false;
    }

    public static C70257Rhl LIZJ(C70257Rhl c70257Rhl, boolean z) {
        String id = c70257Rhl.LIZ;
        Image image = c70257Rhl.LIZIZ;
        List<Image> list = c70257Rhl.LIZJ;
        int i = c70257Rhl.LIZLLL;
        String str = c70257Rhl.LJ;
        boolean z2 = c70257Rhl.LJFF;
        boolean z3 = c70257Rhl.LJII;
        c70257Rhl.getClass();
        o.LJIIIZ(id, "id");
        return new C70257Rhl(id, image, list, i, str, z2, z, z3);
    }

    public C70257Rhl(String id, Image image, List<Image> list, int i, String str, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(id, "id");
        this.LIZ = id;
        this.LIZIZ = image;
        this.LIZJ = list;
        this.LIZLLL = i;
        this.LJ = str;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = z3;
    }
}
