package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UYZ extends AbstractC03120Ai {
    public final List<AbstractC77369UYb> LIZ;
    public final List<AbstractC77369UYb> LIZIZ;

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UYZ(List<? extends AbstractC77369UYb> oldList, List<? extends AbstractC77369UYb> list) {
        o.LJIIIZ(oldList, "oldList");
        this.LIZ = oldList;
        this.LIZIZ = list;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        String str;
        Object obj = (AbstractC77369UYb) ListProtector.get(this.LIZ, i);
        Object obj2 = (AbstractC77369UYb) ListProtector.get(this.LIZIZ, i2);
        if ((obj instanceof InterfaceC47392Iiq) && (obj2 instanceof InterfaceC47392Iiq)) {
            return o.LJ(((InterfaceC47392Iiq) obj).LIZ().getEffectId(), ((InterfaceC47392Iiq) obj2).LIZ().getEffectId());
        }
        if ((obj instanceof C77368UYa) && (obj2 instanceof C77368UYa)) {
            Effect effect = ((C77368UYa) obj).LIZ;
            String str2 = null;
            if (effect != null) {
                str = effect.getId();
            } else {
                str = null;
            }
            Effect effect2 = ((C77368UYa) obj2).LIZ;
            if (effect2 != null) {
                str2 = effect2.getId();
            }
            return o.LJ(str, str2);
        }
        return o.LJ(obj, obj2);
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        return o.LJ(ListProtector.get(this.LIZ, i), ListProtector.get(this.LIZIZ, i2));
    }
}
