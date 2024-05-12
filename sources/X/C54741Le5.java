package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMainFragment;
import java.util.concurrent.CancellationException;
import org.json.JSONObject;
import ujb.o;

/* renamed from: X.Le5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54741Le5 {
    public static boolean LIZIZ() {
        String str = ShopMainFragment.LLD;
        if (str == null) {
            return C53286Kvi.LJ();
        }
        return o.LJJJJIZL(str, "homepage_mall", false);
    }

    public static boolean LIZ(ActivityC45651qj activityC45651qj) {
        String str;
        boolean z;
        Intent intent;
        if (activityC45651qj != null && (intent = activityC45651qj.getIntent()) != null) {
            str = C16880lQ.LLJJIJIIJIL(intent, "extra_non_click_open_from");
        } else {
            str = null;
        }
        if (str == null || o.LJJJJJL(str)) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        String nv0 = C116694i1.LIZ(activityC45651qj).nv0();
        if (!kotlin.jvm.internal.o.LJ(nv0, "SHOP_MALL") && !ShopMainFragment.LLIIJLIL && !z2 && (!kotlin.jvm.internal.o.LJ(nv0, "HOME") || !com.bytedance.hox.Hox.LJLLI.LIZ(activityC45651qj).vv0("Shop"))) {
            return false;
        }
        return true;
    }

    public static void LIZJ(JSONObject jSONObject, EnumC46468ILo visitedType) {
        kotlin.jvm.internal.o.LJIIIZ(visitedType, "visitedType");
        try {
            String optString = jSONObject.optString("mall_homepage_visited_type", "");
            kotlin.jvm.internal.o.LJIIIIZZ(optString, "extraInfo.optString(MALL…OMEPAGE_VISITED_TYPE, \"\")");
            if (optString.length() == 0) {
                jSONObject.put("mall_homepage_visited_type", visitedType.getValue());
            }
            ShopMainFragment.LLFF = jSONObject.toString();
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
