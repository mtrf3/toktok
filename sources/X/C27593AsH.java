package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.AsH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27593AsH {
    public final LinkedHashMap<String, Object> LIZ;
    public long LIZIZ;
    public final List<String> LIZJ;

    public final void LIZIZ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.put("button_name", str);
        C76542zS.LIZ("tiktokec_button_show", linkedHashMap);
    }

    public final void LIZJ(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.put("stay_time", Long.valueOf(elapsedRealtime));
        linkedHashMap.put("quit_type", str);
        C76542zS.LIZ("tiktokec_stay_page", linkedHashMap);
    }

    public C27593AsH(EnterParams enterParams, boolean z) {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        this.LIZ = linkedHashMap;
        this.LIZIZ = System.currentTimeMillis();
        this.LIZJ = new ArrayList();
        HashMap<String, Object> hashMap = enterParams.trackParams;
        if (hashMap != null) {
            linkedHashMap.putAll(hashMap);
        }
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "bank_selection_page");
        if (z) {
            linkedHashMap.put("previous_page", "order_submit");
        } else {
            linkedHashMap.put("previous_page", "payment_method");
        }
    }

    public final void LIZ(int i, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.put("button_name", str);
        linkedHashMap.put("option_name", str2);
        linkedHashMap.put("original_rank", Integer.valueOf(i));
        C76542zS.LIZ("tiktokec_button_click", linkedHashMap);
    }
}
