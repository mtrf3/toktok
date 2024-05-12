package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5WP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5WP {
    public final java.util.Map<String, Effect> LIZ = new LinkedHashMap();
    public final java.util.Map<String, EffectChannelResponse> LIZIZ = new LinkedHashMap();

    public final Effect LIZ(String str, String str2) {
        return (Effect) ((LinkedHashMap) this.LIZ).get(C00F.LIZIZ(str, '-', str2));
    }

    public final void LIZIZ(Effect effect, String str, String str2) {
        o.LJIIIZ(effect, "effect");
        java.util.Map<String, Effect> map = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append('-');
        LIZ.append(str2);
        map.put(X1D.LIZIZ(LIZ), effect);
    }
}
