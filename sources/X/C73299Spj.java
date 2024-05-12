package X;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Spj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73299Spj implements T4J<Effect> {
    public final HashMap<String, Integer> LIZ = new HashMap<>();
    public final HashMap<String, Integer> LIZIZ = new HashMap<>();

    @Override // X.T4J
    public final int L4(Effect effect) {
        Integer num;
        Effect effect2 = effect;
        if (effect2 == null || ((num = this.LIZ.get(effect2.getEffectId())) == null && (TextUtils.isEmpty(effect2.getResourceId()) || (num = this.LIZIZ.get(effect2.getResourceId())) == null))) {
            return -1;
        }
        return num.intValue();
    }

    @Override // X.T4J
    public final void LIZ(int i, List list) {
        o.LJIIIZ(list, "list");
        this.LIZ.clear();
        this.LIZIZ.clear();
        C10K.LIZJ(new CallableC73298Spi(this, list, i));
    }
}
