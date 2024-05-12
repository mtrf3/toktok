package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.model.CartRefreshEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.LvY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55824LvY {
    public static CartRefreshEvent LIZ(String json) {
        o.LJIIIZ(json, "json");
        CartRefreshEvent cartRefreshEvent = null;
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), json, C65330PkU.LIZJ(C65352Pkq.LIZLLL(CartRefreshEvent.class)));
            if (!(fromJson instanceof CartRefreshEvent)) {
                fromJson = null;
            }
            cartRefreshEvent = (CartRefreshEvent) fromJson;
        } catch (s unused) {
        }
        if (cartRefreshEvent == null) {
            return new CartRefreshEvent(1, null, null, null, null, null, 62, null);
        }
        return cartRefreshEvent;
    }
}
