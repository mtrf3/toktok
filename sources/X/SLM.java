package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SLM extends AbstractC03120Ai {
    public final /* synthetic */ List<SKZ> LIZ;
    public final /* synthetic */ List<SKZ> LIZIZ;
    public final /* synthetic */ SLJ LIZJ;
    public final /* synthetic */ SKZ LIZLLL;
    public final /* synthetic */ Object LJ;

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        if (o.LJ(ListProtector.get(this.LIZ, i), ListProtector.get(this.LIZIZ, i2)) && !o.LJ(ListProtector.get(this.LIZIZ, i2), this.LIZLLL)) {
            return true;
        }
        return false;
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
        if (o.LJ(ListProtector.get(this.LIZIZ, i2), this.LIZLLL)) {
            return this.LJ;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SLM(List<? extends SKZ> list, List<? extends SKZ> list2, SLJ slj, SKZ skz, Object obj) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = slj;
        this.LIZLLL = skz;
        this.LJ = obj;
    }
}
