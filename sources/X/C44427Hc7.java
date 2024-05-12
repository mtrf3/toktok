package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.Hc7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44427Hc7 extends EO7 {
    public static final C44427Hc7 LIZ = new C44427Hc7();

    @Override // X.EO7
    public final boolean LIZ(Effect sticker, String category) {
        o.LJIIIZ(category, "category");
        o.LJIIIZ(sticker, "sticker");
        if (!sticker.isBusiness() && !V3N.LJJI(sticker) && !V3N.LJIJ(sticker.getExtra(), "prop_block_story", false)) {
            return false;
        }
        return true;
    }
}
