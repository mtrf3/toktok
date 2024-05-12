package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommercelive.common.settings.EcTapShopBagBubbleTipsSettings;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Rwc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71178Rwc implements InterfaceC71651SAd {
    public final /* synthetic */ C71188Rwm LIZ;
    public final /* synthetic */ C72242sW LIZIZ;
    public final /* synthetic */ String LIZJ;

    public C71178Rwc(C71188Rwm c71188Rwm, C72242sW c72242sW, String str) {
        this.LIZ = c71188Rwm;
        this.LIZIZ = c72242sW;
        this.LIZJ = str;
    }

    @Override // X.InterfaceC71651SAd
    public final void LIZ(int i) {
        String str;
        long elapsedRealtime;
        if (i != 1) {
            if (i != 6) {
                str = "others";
            } else {
                str = "click_cart";
            }
        } else {
            str = "time_out";
        }
        C48502J1u eventParamHelper = this.LIZ.LLJIJIL;
        if (this.LIZIZ.element <= 0) {
            elapsedRealtime = EcTapShopBagBubbleTipsSettings.LIZ().getShowDuration();
        } else {
            elapsedRealtime = SystemClock.elapsedRealtime() - this.LIZIZ.element;
        }
        o.LJIIIZ(eventParamHelper, "eventParamHelper");
        LinkedHashMap LIZ = C0JU.LIZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        String LIZJ = eventParamHelper.LIZJ("author_id");
        String str2 = "";
        if (LIZJ == null) {
            LIZJ = "";
        }
        LIZ.put("author_id", LIZJ);
        String LIZJ2 = eventParamHelper.LIZJ("room_id");
        if (LIZJ2 == null) {
            LIZJ2 = "";
        }
        LIZ.put("room_id", LIZJ2);
        String LIZJ3 = eventParamHelper.LIZJ("enter_from_merge");
        if (LIZJ3 == null) {
            LIZJ3 = "";
        }
        LIZ.put("enter_from_merge", LIZJ3);
        String LIZJ4 = eventParamHelper.LIZJ("enter_method");
        if (LIZJ4 == null) {
            LIZJ4 = "";
        }
        LIZ.put("enter_method", LIZJ4);
        String LIZJ5 = eventParamHelper.LIZJ("action_type");
        if (LIZJ5 == null) {
            LIZJ5 = "";
        }
        LIZ.put("action_type", LIZJ5);
        String LIZJ6 = eventParamHelper.LIZJ("follow_status");
        if (LIZJ6 == null) {
            LIZJ6 = "";
        }
        LIZ.put("follow_status", LIZJ6);
        String LIZJ7 = eventParamHelper.LIZJ("rec_params");
        if (LIZJ7 == null) {
            LIZJ7 = "";
        }
        LIZ.put("rec_params", LIZJ7);
        LIZ.put("source_page_type", "live");
        String LIZJ8 = eventParamHelper.LIZJ("request_id");
        if (LIZJ8 == null) {
            LIZJ8 = "";
        }
        LIZ.put("request_id", LIZJ8);
        String LIZJ9 = eventParamHelper.LIZJ("guidance_text_type");
        if (LIZJ9 != null) {
            str2 = LIZJ9;
        }
        LIZ.put("guidance_text_type", str2);
        LIZ.put("close_type", str);
        LIZ.put("stay_time", String.valueOf(elapsedRealtime));
        C48658J7u.LIZ("livesdk_tiktokec_product_entrance_guidance_close", LIZ);
        C53799L9n.LIZLLL(3, this.LIZJ, "SLOT_BAG_BUBBLE_SHOW");
    }
}
