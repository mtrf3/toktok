package X;

import com.ss.android.ugc.aweme.base.ImageUrlModel;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.WHl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82033WHl {
    public final C6MP LIZ;
    public final EnumC147935rJ LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final ImageUrlModel LJI;
    public final WI0 LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final Integer LJIIJJI;

    public final int hashCode() {
        return Objects.hash(this.LJIIJJI) + C78269Unh.LIZIZ(new Object[]{Boolean.valueOf(this.LJIIJ)}, C78269Unh.LIZIZ(new Object[]{Boolean.valueOf(this.LJIIIZ)}, C78269Unh.LIZIZ(new Object[]{Boolean.valueOf(this.LJIIIIZZ)}, C78269Unh.LIZIZ(new Object[]{this.LJII}, C78269Unh.LIZIZ(new Object[]{this.LJI}, C78269Unh.LIZIZ(new Object[]{Integer.valueOf(this.LJFF)}, C78269Unh.LIZIZ(new Object[]{Integer.valueOf(this.LJ)}, C78269Unh.LIZIZ(new Object[]{Integer.valueOf(this.LIZLLL)}, C78269Unh.LIZIZ(new Object[]{Integer.valueOf(this.LIZJ)}, C78269Unh.LIZIZ(new Object[]{this.LIZIZ}, Objects.hashCode(this.LIZ) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("id:");
        LIZ.append(this.LIZ);
        LIZ.append(" status:");
        LIZ.append(this.LIZIZ);
        LIZ.append(" iconResId:");
        LIZ.append(this.LIZJ);
        LIZ.append(" position:");
        LIZ.append(this.LJII);
        LIZ.append(" isShowName");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(" textResId:");
        LIZ.append(this.LJI);
        LIZ.append(" deleteIconShow:");
        LIZ.append(this.LJIIIZ);
        LIZ.append(" isSelected");
        LIZ.append(this.LJIIJ);
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C82033WHl)) {
            return false;
        }
        C82033WHl c82033WHl = (C82033WHl) obj;
        if (this.LIZ == c82033WHl.LIZ && this.LIZIZ == c82033WHl.LIZIZ && this.LIZJ == c82033WHl.LIZJ && this.LIZLLL == c82033WHl.LIZLLL && this.LJ == c82033WHl.LJ && this.LJFF == c82033WHl.LJFF && o.LJ(this.LJI, c82033WHl.LJI) && o.LJ(this.LJII, c82033WHl.LJII) && this.LJIIIIZZ == c82033WHl.LJIIIIZZ && this.LJIIIZ == c82033WHl.LJIIIZ && this.LJIIJ == c82033WHl.LJIIJ && o.LJ(this.LJIIJJI, c82033WHl.LJIIJJI)) {
            return true;
        }
        return false;
    }

    public C82033WHl(C6MP id, EnumC147935rJ status, int i, int i2, int i3, int i4, ImageUrlModel imageUrlModel, WI0 position, boolean z, boolean z2, Integer num) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(status, "status");
        o.LJIIIZ(position, "position");
        this.LIZ = id;
        this.LIZIZ = status;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = i4;
        this.LJI = imageUrlModel;
        this.LJII = position;
        this.LJIIIIZZ = z;
        this.LJIIIZ = false;
        this.LJIIJ = z2;
        this.LJIIJJI = num;
    }
}
