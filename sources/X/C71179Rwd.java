package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Rwd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71179Rwd implements InterfaceC31694CcE {
    public final /* synthetic */ C72242sW LJLIL;
    public final /* synthetic */ C71188Rwm LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C71180Rwe LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public C71179Rwd(C72242sW c72242sW, C71188Rwm c71188Rwm, String str, C71180Rwe c71180Rwe, String str2) {
        this.LJLIL = c72242sW;
        this.LJLILLLLZI = c71188Rwm;
        this.LJLJI = str;
        this.LJLJJI = c71180Rwe;
        this.LJLJJL = str2;
    }

    @Override // X.InterfaceC31694CcE
    public final void LIZ() {
        this.LJLIL.element = SystemClock.elapsedRealtime();
        this.LJLILLLLZI.LLJIJIL.LJII("guidance_text_type", this.LJLJI, false);
        C48502J1u eventParamHelper = this.LJLILLLLZI.LLJIJIL;
        o.LJIIIZ(eventParamHelper, "eventParamHelper");
        LinkedHashMap LIZ = C0JU.LIZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        String LIZJ = eventParamHelper.LIZJ("author_id");
        String str = "";
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
            str = LIZJ9;
        }
        LIZ.put("guidance_text_type", str);
        C48658J7u.LIZ("livesdk_tiktokec_product_entrance_guidance_show", LIZ);
        C71180Rwe c71180Rwe = this.LJLJJI;
        if (c71180Rwe != null) {
            c71180Rwe.LIZ.storeBoolean("bubble_shown", true);
        }
        C53799L9n.LIZLLL(2, this.LJLJJL, "SLOT_BAG_BUBBLE_SHOW");
    }
}
