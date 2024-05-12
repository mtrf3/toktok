package X;

import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Jax, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49451Jax {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(Product product, JL8 jl8, JL9 jl9, InterfaceC49452Jay interfaceC49452Jay, String str) {
        Aweme aweme;
        JQA jqa;
        if (jl8 == null || (aweme = jl8.LJLIL) == null) {
            aweme = new Aweme();
        }
        String str2 = null;
        if (jl9 != null) {
            jqa = jl9.LIZIZ;
        } else {
            jqa = null;
        }
        if (interfaceC49452Jay != null) {
            str2 = interfaceC49452Jay.LIZ();
        }
        java.util.Map LIZ2 = JZ0.LIZ(aweme, product, jqa, str, str2);
        C48658J7u.LIZ("livesdk_tiktokec_product_entrance_show", LIZ2);
        LIZ2.put("item_order", "1");
        C48658J7u.LIZ("livesdk_tiktokec_product_show", LIZ2);
    }

    public static void LIZ(Product product, JL8 jl8, JL9 jl9, InterfaceC49452Jay interfaceC49452Jay, String str, String str2) {
        Aweme aweme;
        JQA jqa;
        String str3;
        boolean z;
        if (jl8 == null || (aweme = jl8.LJLIL) == null) {
            aweme = new Aweme();
        }
        if (interfaceC49452Jay != null) {
            interfaceC49452Jay.LIZIZ(aweme);
        }
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        Uri.Builder builder = null;
        if (jl9 != null) {
            jqa = jl9.LIZIZ;
        } else {
            jqa = null;
        }
        if (interfaceC49452Jay != null) {
            str3 = interfaceC49452Jay.LIZ();
        } else {
            str3 = null;
        }
        java.util.Map LIZ2 = JZ0.LIZ(aweme, product, jqa, str2, str3);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZ2);
        linkedHashMap.put("source_page_type", "live");
        linkedHashMap.remove("room_id");
        linkedHashMap.remove("is_self");
        linkedHashMap.remove("product_source");
        linkedHashMap.remove("source_from");
        linkedHashMap.remove("source");
        linkedHashMap.remove("is_ad");
        linkedHashMap.remove("request_id");
        linkedHashMap.remove("page_name");
        JSONObject jSONObject = new JSONObject();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str4 = (String) entry.getKey();
            String str5 = (String) entry.getValue();
            if (str4.length() != 0 && str5.length() != 0) {
                jSONObject.put(str4, str5);
            }
        }
        if (product != null) {
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            Integer num = product.platform;
            if (num != null && (num.intValue() == 5 || num.intValue() == 6 || num.intValue() == 100)) {
                z = true;
            }
            if (z) {
                String str6 = product.schema;
                if (str6 != null) {
                    builder = UriProtector.parse(str6).buildUpon();
                    builder.appendQueryParameter("trackParams", jSONObject.toString());
                    builder.appendQueryParameter("click_scene_start_time", String.valueOf(SystemClock.elapsedRealtime()));
                }
            } else {
                JSONObject jSONObject2 = new JSONObject();
                if (jSONObject.has("enter_from_merge")) {
                    jSONObject2.put("enter_from", jSONObject.get("enter_from_merge"));
                }
                String jSONObject3 = jSONObject2.toString();
                o.LJIIIIZZ(jSONObject3, "JSONObject().apply {\n   …\n            }.toString()");
                String str7 = product.detailUrl;
                if (str7 != null) {
                    builder = UriProtector.parse("aweme://echybrid").buildUpon();
                    builder.appendQueryParameter("url", str7);
                    builder.appendQueryParameter("should_track_duration_time", "1");
                    builder.appendQueryParameter("track_duration_event", "track_duration_event");
                    builder.appendQueryParameter("track_duration_custom_params", jSONObject3);
                    builder.appendQueryParameter("container_color_auto_dark", "1");
                    builder.appendQueryParameter("container_height", "0.73");
                    builder.appendQueryParameter("hide_nav_bar", "1");
                    builder.appendQueryParameter("should_full_screen", "1");
                    builder.appendQueryParameter("trackParams", jSONObject.toString());
                    builder.appendQueryParameter("fullScreen", "false");
                }
            }
            roomsData.extraSchema = String.valueOf(builder);
        }
        if (interfaceC49452Jay != null) {
            interfaceC49452Jay.LIZLLL(aweme, jl9, enterRoomConfig, str);
        }
        C48658J7u.LIZ("livesdk_tiktokec_product_entrance_click", LIZ2);
        LIZ2.put("item_order", "1");
        C48658J7u.LIZ("livesdk_tiktokec_product_click", LIZ2);
    }
}
