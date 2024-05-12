package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.Hc5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44425Hc5 extends EO7 {
    public static final C44425Hc5 LIZ = new C44425Hc5();

    @Override // X.EO7
    public final boolean LIZ(Effect sticker, String category) {
        o.LJIIIZ(category, "category");
        o.LJIIIZ(sticker, "sticker");
        if (!V3N.LJIJJ(sticker)) {
            return false;
        }
        if (C1B8.LIZJ() && !C1DG.LJIIIIZZ()) {
            return false;
        }
        return true;
    }
}
