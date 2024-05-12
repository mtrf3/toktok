package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WFX extends AbstractC03120Ai {
    public final List<C81975WFf> LIZ;
    public final List<C81975WFf> LIZIZ;

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WFX(List<? extends C81975WFf> list, List<? extends C81975WFf> newItems) {
        o.LJIIIZ(newItems, "newItems");
        this.LIZ = list;
        this.LIZIZ = newItems;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        if (((C81975WFf) ListProtector.get(this.LIZ, i)).LL == ((C81975WFf) ListProtector.get(this.LIZIZ, i2)).LL && o.LJ(ListProtector.get(this.LIZ, i), ListProtector.get(this.LIZIZ, i2))) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        if (((C81975WFf) ListProtector.get(this.LIZ, i)).LJLIL == ((C81975WFf) ListProtector.get(this.LIZIZ, i2)).LJLIL) {
            return true;
        }
        return false;
    }
}
