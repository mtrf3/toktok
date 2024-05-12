package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.Hyd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45823Hyd extends EO7 {
    public static final C45823Hyd LIZ = new C45823Hyd();

    @Override // X.EO7
    public final boolean LIZ(Effect sticker, String category) {
        String LJII;
        o.LJIIIZ(category, "category");
        o.LJIIIZ(sticker, "sticker");
        boolean z = false;
        if (!V3N.LJIJI(sticker) && !V3N.LJIILIIL(sticker) && !V3N.LJIILLIIL(sticker) && !V3N.LJIJ(sticker.getSdkExtra(), "isTC21RedEnvelope", false) && !V3N.LJJIII(sticker) && ((LJII = V3N.LJII(sticker.getSdkExtra(), "multi_segments")) == null || LJII.isEmpty())) {
            z = true;
        }
        return !z;
    }
}
