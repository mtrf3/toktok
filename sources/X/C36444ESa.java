package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ESa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36444ESa extends AbstractC03120Ai {
    public final List<Effect> LIZ;
    public final List<Effect> LIZIZ;
    public final Effect LIZJ;

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
        EffectTemplate effectTemplate = (EffectTemplate) ListProtector.get(this.LIZ, i);
        EffectTemplate effectTemplate2 = (EffectTemplate) ListProtector.get(this.LIZIZ, i2);
        if (this.LIZJ == null || o.LJ(effectTemplate.getEffectId(), this.LIZJ.getEffectId()) == o.LJ(effectTemplate2.getEffectId(), this.LIZJ.getEffectId())) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        return o.LJ(((EffectTemplate) ListProtector.get(this.LIZ, i)).getEffectId(), ((EffectTemplate) ListProtector.get(this.LIZIZ, i2)).getEffectId());
    }

    public C36444ESa(Effect effect, List oldEffectList, List newEffectList) {
        o.LJIIIZ(oldEffectList, "oldEffectList");
        o.LJIIIZ(newEffectList, "newEffectList");
        this.LIZJ = effect;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(ESZ.LJLIL);
        ArrayList arrayList = new ArrayList(oldEffectList);
        ListProtector.add(arrayList, 0, LIZIZ.getValue());
        this.LIZ = arrayList;
        ArrayList arrayList2 = new ArrayList(newEffectList);
        ListProtector.add(arrayList2, 0, LIZIZ.getValue());
        this.LIZIZ = arrayList2;
    }
}
