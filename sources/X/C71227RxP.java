package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.slot.IBcToggleService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.CreatorProductListLynxConfigSettings;
import org.json.JSONObject;
import ujb.o;

/* renamed from: X.RxP, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71227RxP {
    public static Context LIZJ;
    public static String LIZLLL;
    public static boolean LIZ = true;
    public static int LIZIZ = 3;
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C30585BzR.LJLIL);

    public static IBcToggleService LIZIZ() {
        return (IBcToggleService) LJ.getValue();
    }

    public static String LIZ() {
        boolean z = false;
        Uri.Builder buildUpon = UriProtector.parse(o.LJJJJZ(o.LJJJJZ(o.LJJJJZ(CreatorProductListLynxConfigSettings.LIZ(), "_roomId_", CardStruct.IStatusCode.DEFAULT, false), "_isLiving_", "false", false), "_liveStatus_", "before_live", false)).buildUpon();
        int i = LIZIZ;
        if (i >= 0 && i < 3 && LIZLLL != null) {
            if (1 <= i && i < 3) {
                z = true;
            }
            buildUpon.appendQueryParameter("toggle", String.valueOf(z));
            buildUpon.appendQueryParameter("self_sale", String.valueOf(LIZ));
        }
        String uri = buildUpon.build().toString();
        kotlin.jvm.internal.o.LJIIIIZZ(uri, "parse(\n            Creat…     }.build().toString()");
        return uri;
    }

    public static void LIZJ(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            jSONObject.put("page_name", "live_take_page");
            jSONObject.put("popup_name", "live_brand_content_toggle");
            if (str2 != null) {
                jSONObject.put("action_type", str2);
            }
            C48658J7u.LIZIZ(str, jSONObject);
        } catch (Exception unused) {
        }
    }
}
