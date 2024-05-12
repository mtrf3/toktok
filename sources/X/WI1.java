package X;

import com.ss.android.ugc.aweme.base.ImageUrlModel;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public abstract class WI1 {
    public ImageUrlModel LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public Integer LJI;
    public EnumC147935rJ LIZ = EnumC147935rJ.ENABLE_CLICK;
    public final int LIZIZ = -1;
    public int LIZJ = -1;
    public final boolean LJII = true;
    public final boolean LJIIIIZZ = C149055t7.LIZ();

    public void LIZ(WI0 wi0) {
    }

    public abstract WI0 LIZJ();

    public int LIZLLL() {
        return 0;
    }

    public int LJII() {
        return -1;
    }

    public abstract C6MP LJIIIIZZ();

    public final boolean LIZIZ() {
        if (this.LIZ == EnumC147935rJ.ENABLE_CLICK) {
            return true;
        }
        return false;
    }

    public int LJFF() {
        return LJ();
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(LJIIIZ())) + C78269Unh.LIZIZ(new Object[]{Boolean.FALSE}, C78269Unh.LIZIZ(new Object[]{Boolean.valueOf(this.LJ)}, C78269Unh.LIZIZ(new Object[]{LIZJ()}, C78269Unh.LIZIZ(new Object[]{this.LIZLLL}, C78269Unh.LIZIZ(new Object[]{Integer.valueOf(LJII())}, C78269Unh.LIZIZ(new Object[]{Integer.valueOf(LIZLLL())}, C78269Unh.LIZIZ(new Object[]{Integer.valueOf(LJFF())}, C78269Unh.LIZIZ(new Object[]{Integer.valueOf(LJI())}, C78269Unh.LIZIZ(new Object[]{Boolean.valueOf(LIZIZ())}, C78269Unh.LIZIZ(new Object[]{this.LIZ}, Objects.hashCode(LJIIIIZZ()) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public int LJ() {
        return this.LIZJ;
    }

    public int LJI() {
        return this.LIZIZ;
    }

    public boolean LJIIIZ() {
        return this.LJFF;
    }

    public final void LJIIJ(EnumC147935rJ state) {
        o.LJIIIZ(state, "state");
        this.LIZ = state;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WI1)) {
            return false;
        }
        WI1 wi1 = (WI1) obj;
        if (wi1.LJIIIIZZ() == LJIIIIZZ() && wi1.LIZ == this.LIZ && wi1.LIZIZ() == LIZIZ() && wi1.LJI() == LJI() && wi1.LJFF() == LJFF() && wi1.LIZLLL() == LIZLLL() && wi1.LJII() == LJII() && o.LJ(wi1.LIZLLL, this.LIZLLL) && o.LJ(wi1.LIZJ(), LIZJ()) && wi1.LJ == this.LJ) {
            wi1.getClass();
            if (wi1.LJIIIZ() == LJIIIZ()) {
                return true;
            }
        }
        return false;
    }
}
