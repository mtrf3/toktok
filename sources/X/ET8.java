package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ET8 extends EO7 {
    public final C139715e3 LIZ = new C139715e3();

    @Override // X.EO7
    public final boolean LIZ(Effect sticker, String category) {
        o.LJIIIZ(category, "category");
        o.LJIIIZ(sticker, "sticker");
        if (sticker.isBusiness()) {
            return false;
        }
        C139715e3 c139715e3 = this.LIZ;
        String effectId = sticker.getEffectId();
        c139715e3.getClass();
        o.LJIIIZ(effectId, "effectId");
        return ORY.LJJIJIIJIL(effectId, c139715e3.LIZIZ(C60903NvH.LJIIJJI().getAccountService().getCurrentUserID()));
    }
}
