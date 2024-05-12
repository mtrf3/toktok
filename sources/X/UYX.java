package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UYX extends AbstractC03120Ai {
    public final List<AbstractC77373UYf> LIZ;
    public final List<AbstractC77373UYf> LIZIZ;

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UYX(List<? extends AbstractC77373UYf> oldList, List<? extends AbstractC77373UYf> list) {
        o.LJIIIZ(oldList, "oldList");
        this.LIZ = oldList;
        this.LIZIZ = list;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        Object obj = (AbstractC77373UYf) ListProtector.get(this.LIZ, i);
        Object obj2 = (AbstractC77373UYf) ListProtector.get(this.LIZIZ, i2);
        if ((obj instanceof UYY) && (obj2 instanceof UYY)) {
            return o.LJ(((UYY) obj).LIZ().getEffectId(), ((UYY) obj2).LIZ().getEffectId());
        }
        if ((obj instanceof C58302Qo) && (obj2 instanceof C58302Qo)) {
            obj.getClass();
            obj2.getClass();
            return o.LJ(null, null);
        }
        return o.LJ(obj, obj2);
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        return o.LJ(ListProtector.get(this.LIZ, i), ListProtector.get(this.LIZIZ, i2));
    }
}
