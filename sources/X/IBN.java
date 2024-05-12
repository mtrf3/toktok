package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IBN extends EO7 {
    public static final IBN LIZ = new IBN();

    @Override // X.EO7
    public final boolean LIZ(Effect sticker, String category) {
        o.LJIIIZ(category, "category");
        o.LJIIIZ(sticker, "sticker");
        if (ID0.LJJII(sticker) || V3N.LJIILIIL(sticker)) {
            return true;
        }
        return false;
    }
}
