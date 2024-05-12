package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.6Hh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C157816Hh {
    public boolean downloaded;
    public final Effect effect;

    public boolean LIZIZ() {
        String effectId = this.effect.getEffectId();
        int i = -1;
        if (effectId != null) {
            try {
                i = CastIntegerProtector.parseInt(effectId);
            } catch (Throwable unused) {
            }
            if (i >= 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean LIZ() {
        if (LIZIZ() || this.downloaded) {
            return true;
        }
        return false;
    }

    public C157816Hh(Effect effect) {
        o.LJIIIZ(effect, "effect");
        this.effect = effect;
    }
}
