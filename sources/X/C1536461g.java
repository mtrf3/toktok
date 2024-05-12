package X;

import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.61g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1536461g {
    public static final List<Integer> LJII = C47261Igj.LJJIJIIJI(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 14, 16, 15, 17, 18, 19, 20, 21, 22, 23, 24, 25, 1004, 1101, 1100, 26);
    public final int LIZ;
    public final int LIZIZ;
    public final Integer LIZJ;
    public final String LIZLLL;
    public final Integer LJ;
    public final InterfaceC88473Ynt<SmartImageView, TextView, Integer, C76800UCe> LJFF;
    public final boolean LJI;

    public C1536461g() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1536461g)) {
            return false;
        }
        C1536461g c1536461g = (C1536461g) obj;
        return this.LIZ == c1536461g.LIZ && this.LIZIZ == c1536461g.LIZIZ && o.LJ(this.LIZJ, c1536461g.LIZJ) && o.LJ(this.LIZLLL, c1536461g.LIZLLL) && o.LJ(this.LJ, c1536461g.LJ) && o.LJ(this.LJFF, c1536461g.LJFF) && this.LJI == c1536461g.LJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        Integer num = this.LIZJ;
        int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LIZLLL;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.LJ;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        InterfaceC88473Ynt<SmartImageView, TextView, Integer, C76800UCe> interfaceC88473Ynt = this.LJFF;
        int hashCode4 = (hashCode3 + (interfaceC88473Ynt != null ? interfaceC88473Ynt.hashCode() : 0)) * 31;
        boolean z = this.LJI;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditToolbarItemModel(type=");
        LIZ.append(this.LIZ);
        LIZ.append(", iconRes=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", textRes=");
        LIZ.append(this.LIZJ);
        LIZ.append(", textString=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", tuxIcon=");
        LIZ.append(this.LJ);
        LIZ.append(", animationRegistry=");
        LIZ.append(this.LJFF);
        LIZ.append(", isSelected=");
        return C48339Iy7.LIZJ(LIZ, this.LJI, ')', LIZ);
    }

    public C1536461g(int i, int i2, Integer num, String str, Integer num2, C1536661i c1536661i, boolean z, int i3) {
        i2 = (i3 & 2) != 0 ? 0 : i2;
        str = (i3 & 8) != 0 ? null : str;
        num2 = (i3 & 16) != 0 ? null : num2;
        c1536661i = (i3 & 32) != 0 ? null : c1536661i;
        z = (i3 & 64) != 0 ? false : z;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = num;
        this.LIZLLL = str;
        this.LJ = num2;
        this.LJFF = c1536661i;
        this.LJI = z;
    }
}
