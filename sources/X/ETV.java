package X;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ETV {
    public static final HashMap<String, List<String>> LIZ = new HashMap<>();

    public static final boolean LIZ(Effect effect) {
        o.LJIIIZ(effect, "effect");
        ArrayList<String> LIZ2 = EQ7.LIZ();
        if (LIZ2.isEmpty()) {
            return false;
        }
        return LIZ2.contains(effect.getEffectId());
    }

    public static final boolean LIZIZ(Effect effect) {
        if (effect == null || !V3N.LJIJJ(effect) || V3N.LJIILJJIL(effect)) {
            return false;
        }
        String effectId = effect.getEffectId();
        if (TextUtils.isEmpty(effectId)) {
            return false;
        }
        Iterator<String> it = EQ7.LIZ().iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(effectId, it.next())) {
                return false;
            }
        }
        return true;
    }
}
