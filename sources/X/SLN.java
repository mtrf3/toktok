package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes13.dex */
public final class SLN extends AbstractC03120Ai {
    public final /* synthetic */ List<SKZ> LIZ;
    public final /* synthetic */ List<SKZ> LIZIZ;
    public final /* synthetic */ SLJ LIZJ;
    public final /* synthetic */ Object LIZLLL;

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        return false;
    }

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        if (this.LIZJ.LJZL((SKZ) ListProtector.get(this.LIZ, i)) == this.LIZJ.LJZL((SKZ) ListProtector.get(this.LIZIZ, i2))) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC03120Ai
    public final Object LIZJ(int i, int i2) {
        return this.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SLN(List<? extends SKZ> list, List<? extends SKZ> list2, SLJ slj, Object obj) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = slj;
        this.LIZLLL = obj;
    }
}
