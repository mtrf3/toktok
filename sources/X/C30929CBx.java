package X;

import Y.AfS2S2200000_5;
import Y.AfS2S2300000_5;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ttnet.TTNetInit;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.CBx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30929CBx extends C29830BnG {
    public static final C30929CBx LIZ = new C30929CBx();

    public static final void LJIILL(String str) {
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            str = "";
        }
        C05630Jz.LJI(jSONObject, "show_entrance", str);
        LJIIZILJ("subscription_entrance_click", jSONObject);
    }

    public static final void LJIILLIIL(String str) {
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            str = "";
        }
        C05630Jz.LJI(jSONObject, "show_entrance", str);
        LJIIZILJ("subscription_entrance_show", jSONObject);
    }

    public static final void LJIIJ(long j, Throwable th) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        JSONObject jSONObject = new JSONObject();
        LIZ.LJIIIZ(th, jSONObject);
        C05630Jz.LJFF(jSONObject, "cost", currentTimeMillis);
        LJIJ("subscription_get_sub_info_failed", jSONObject);
    }

    public static final void LJIILIIL(long j, Throwable th) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        JSONObject jSONObject = new JSONObject();
        LIZ.LJIIIZ(th, jSONObject);
        C05630Jz.LJFF(jSONObject, "cost", currentTimeMillis);
        LJIIZILJ("subscription_get_emotes_failed", jSONObject);
    }

    public static final void LJIILJJIL(long j, Throwable th) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        JSONObject jSONObject = new JSONObject();
        LIZ.LJIIIZ(th, jSONObject);
        C05630Jz.LJFF(jSONObject, "cost", currentTimeMillis);
        LJIIZILJ("subscription_privilege_all_detail_failed", jSONObject);
    }

    public static void LJIIZILJ(String str, JSONObject jSONObject) {
        if (C29306Beo.LJIIJJI(DataChannelGlobal.LJLJJI)) {
            C29830BnG.LJIIIIZZ(jSONObject);
            C05630Jz.LJI(jSONObject, "event_id", str);
            C0K2.LJIIIIZZ("ttlive_client_subscription_live_anchor_monitor", 0, jSONObject);
        } else {
            if (!LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_client_subscription_live_audience_monitor", 0.01d)) {
                return;
            }
            C29830BnG.LJIIIIZZ(jSONObject);
            C05630Jz.LJI(jSONObject, "event_id", str);
            C0K2.LJIILLIIL(0, 1, "ttlive_client_subscription_live_audience_monitor", jSONObject);
        }
    }

    public static void LJIJ(String str, JSONObject jSONObject) {
        User user;
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_client_subscription_broadcast_monitor")) {
            InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
            InterfaceC05190Ih interfaceC05190Ih = null;
            if (LIZIZ != null) {
                interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ;
            }
            if ((interfaceC05190Ih instanceof User) && (user = (User) interfaceC05190Ih) != null) {
                long id = user.getId();
                C05630Jz.LJFF(jSONObject, "current_user_id", id);
                C05630Jz.LJFF(jSONObject, "current_anchor_id", id);
                C05630Jz.LJII(jSONObject, "anchor_qualification", User.sSubPermission);
                C05630Jz.LJ(jSONObject, "device_score", TTliveAnchorDeviceScoreSetting.INSTANCE.getValue());
                C05630Jz.LJFF(jSONObject, "network_type", TTNetInit.getEffectiveConnectionType());
            }
            C05630Jz.LJI(jSONObject, "event_id", str);
            C0K2.LJIIIIZZ("ttlive_client_subscription_broadcast_monitor", 0, jSONObject);
        }
    }

    public static final void LJIIL(BZI bzi, C72242sW c72242sW, String str) {
        bzi.LJIJJ(Long.valueOf(c72242sW.element), "start_time");
        if (str == null) {
            str = "";
        }
        bzi.LJIJJ(str, "show_entrance");
        I9A.LIZ(System.currentTimeMillis(), c72242sW.element, bzi, "cost");
    }

    public static C73422Sri LJIIJJI(AbstractC73672Svk abstractC73672Svk, EnumC30931CBz subscriptionAPI, String str, InterfaceC88472Yns predicateNonEmpty) {
        String str2;
        o.LJIIIZ(subscriptionAPI, "subscriptionAPI");
        o.LJIIIZ(predicateNonEmpty, "predicateNonEmpty");
        C72242sW c72242sW = new C72242sW();
        int i = CC0.LIZ[subscriptionAPI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str2 = "privilege_all_detail";
                } else {
                    throw new C162476Zf();
                }
            } else {
                str2 = "get_emotes";
            }
        } else {
            str2 = "get_sub_info";
        }
        return abstractC73672Svk.LJIL(new AfS2S2200000_5(subscriptionAPI, str2, str, c72242sW, 4)).LJIJJLI(new AfS2S2300000_5(predicateNonEmpty, subscriptionAPI, c72242sW, str2, str, 1)).LJIJJ(new AfS2S2200000_5(subscriptionAPI, str2, str, c72242sW, 3));
    }
}
