package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes9.dex */
public final class IY5 {
    public final List<IY4> LIZ;
    public final IYH LIZIZ;
    public final IYI LIZJ;
    public int LIZLLL;

    public final IY0 LIZ(IYH iyh) {
        if (this.LIZLLL >= this.LIZ.size()) {
            return null;
        }
        IY4 iy4 = (IY4) ListProtector.get(this.LIZ, this.LIZLLL);
        if (!iy4.isValid()) {
            this.LIZLLL++;
            return LIZ(iyh);
        }
        return iy4.LIZJ(new IY5(this.LIZ, iyh, this.LIZLLL + 1));
    }

    public final IY0 LIZIZ(IYI iyi) {
        if (this.LIZLLL >= this.LIZ.size()) {
            return null;
        }
        IY4 iy4 = (IY4) ListProtector.get(this.LIZ, this.LIZLLL);
        if (!iy4.isValid()) {
            this.LIZLLL++;
            return LIZIZ(iyi);
        }
        return iy4.LIZIZ(new IY5(this.LIZ, iyi, this.LIZLLL + 1));
    }

    public IY5(List<IY4> list, IYH iyh, int i) {
        this.LIZ = list;
        this.LIZIZ = iyh;
        this.LIZLLL = i;
    }

    public IY5(List<IY4> list, IYI iyi, int i) {
        this.LIZ = list;
        this.LIZLLL = i;
        this.LIZJ = iyi;
    }
}
