package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Spk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73300Spk implements T4J<Effect> {
    public final HashMap<String, Integer> LIZ = new HashMap<>();

    @Override // X.T4J
    public final int L4(Effect effect) {
        Integer num;
        Effect effect2 = effect;
        if (effect2 == null || (num = this.LIZ.get(effect2.getId())) == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // X.T4J
    public final void LIZ(int i, List list) {
        o.LJIIIZ(list, "list");
        if (list.isEmpty()) {
            this.LIZ.clear();
            return;
        }
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                this.LIZ.put(((com.ss.ugc.effectplatform.model.Effect) obj).getId(), Integer.valueOf(i2 + i));
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }
}
