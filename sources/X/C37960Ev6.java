package X;

import Y.ARunnableS42S0100000_6;
import android.os.Looper;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ev6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37960Ev6 {
    public static final C36741EbR LJIJJLI = new C36741EbR();
    public static final HashMap<String, C37986EvW> LJIL = new HashMap<>();
    public static final HashMap<String, Object> LJJ = new HashMap<>();
    public Boolean LIZ;
    public Integer LIZIZ;
    public Boolean LIZJ;
    public Boolean LIZLLL;
    public String LJ;
    public String LJFF;
    public Boolean LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public Integer LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public Integer LJIILLIIL;
    public final HashMap<String, Object> LJIIZILJ = new HashMap<>();
    public View LJIJ;
    public Integer LJIJI;
    public String LJIJJ;

    public final void LIZ() {
        Integer num;
        if ((C37905EuD.LJIILIIL || (num = this.LJIIJJI) == null || num.intValue() != 0) && (this.LJIJ instanceof WebView)) {
            if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
                View view = this.LJIJ;
                if (view != null) {
                    ((WebView) view).evaluateJavascript("window.__jsb_s_inject_data__", new C37212Ej2(this));
                    return;
                }
                throw new C37692Eqm("null cannot be cast to non-null type android.webkit.WebView");
            }
            View view2 = this.LJIJ;
            if (view2 != null) {
                view2.post(new ARunnableS42S0100000_6(this, 82));
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type android.webkit.WebView");
        }
    }

    public final void LIZJ(Integer num) {
        if (this.LJIILLIIL != null) {
            return;
        }
        this.LJIILLIIL = num;
    }

    public final void LIZIZ(int i, String str, java.util.Map map) {
        ArrayList arrayList;
        StringBuilder sb = new StringBuilder();
        java.util.Set<String> keySet = LJIL.keySet();
        o.LJFF(keySet, "jsbAuthPackageMessage.keys");
        Iterator<String> it = keySet.iterator();
        while (true) {
            arrayList = null;
            JSONObject jSONObject = null;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            StringBuilder LIZIZ = C25620zW.LIZIZ("sdk: ", next, ": ");
            C37986EvW c37986EvW = LJIL.get(next);
            if (c37986EvW != null) {
                jSONObject = c37986EvW.LIZ();
            }
            LIZIZ.append(String.valueOf(jSONObject));
            LIZIZ.append(",");
            sb.append(X1D.LIZIZ(LIZIZ));
        }
        String sb2 = sb.toString();
        o.LJFF(sb2, "StringBuilder().apply {\n…   }\n        }.toString()");
        View view = this.LJIJ;
        C79605VMb c79605VMb = new C79605VMb(str);
        c79605VMb.LIZIZ = "jsb_auth_error_bid";
        c79605VMb.LIZ = this.LJIIIZ;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("jsb_auth_method_name", this.LJII);
        jSONObject2.put("jsb_webview_url", this.LJIIIIZZ);
        jSONObject2.put("jsb_auth_url", this.LJIIIZ);
        jSONObject2.put("jsb_auth_token", this.LJIIJ);
        jSONObject2.put("jsb_auth_token_state", this.LJIIJJI);
        jSONObject2.put("jsb_auth_bridge_sdk", this.LJIILL);
        C36741EbR c36741EbR = LJIJJLI;
        jSONObject2.put("jsb_auth_fetch_success", c36741EbR.LIZIZ);
        jSONObject2.put("jsb_auth_fetch_fail_reason", c36741EbR.LIZ);
        jSONObject2.put("jsb_auth_package_message", sb2);
        jSONObject2.put("jsb_auth_fail_reason", this.LJIILLIIL);
        jSONObject2.put("jsb_raw_inject_data", this.LJIILJJIL);
        jSONObject2.put("jsb_auth_token_no_token_reason", this.LJIIL);
        jSONObject2.put("jsb_auth_current_webview_state", this.LJIILIIL);
        jSONObject2.put("jsb_auth_token_check_begin", this.LIZ);
        jSONObject2.put("jsb_auth_token_state_be_assigned", this.LIZIZ);
        jSONObject2.put("jsb_auth_token_no_token_pass_reason_no_null", this.LIZJ);
        jSONObject2.put("jsb_auth_token_no_token_pass_method_begin", this.LIZLLL);
        jSONObject2.put("jsb_auth_token_will_check_pass_state_two", this.LJ);
        jSONObject2.put("jsb_auth_token_will_check_pass_state_one", this.LJFF);
        jSONObject2.put("jsb_auth_token_is_null_or_empty", this.LJI);
        jSONObject2.put("jsb_auth_protocol_version", this.LJIJI);
        View view2 = this.LJIJ;
        if (view2 instanceof WebView) {
            if (view2 != null) {
                WebBackForwardList copyBackForwardList = ((WebView) view2).copyBackForwardList();
                o.LJFF(copyBackForwardList, "(view as WebView).copyBackForwardList()");
                arrayList = new ArrayList();
                int size = copyBackForwardList.getSize();
                for (int i2 = 0; i2 < size; i2++) {
                    WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i2);
                    o.LJFF(itemAtIndex, "historyList.getItemAtIndex(i)");
                    arrayList.add(itemAtIndex.getUrl());
                }
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type android.webkit.WebView");
            }
        }
        jSONObject2.put("jsb_auth_webview_url_history", arrayList);
        jSONObject2.put("jsb_auth_iframe_url", this.LJIJJ);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, Object> entry2 : this.LJIIZILJ.entrySet()) {
            jSONObject2.put(entry2.getKey(), entry2.getValue().toString());
        }
        for (Map.Entry<String, Object> entry3 : LJJ.entrySet()) {
            jSONObject2.put(entry3.getKey(), entry3.getValue().toString());
        }
        jSONObject2.put("jsb_auth_error_all_message", jSONObject2.toString());
        c79605VMb.LIZLLL = jSONObject2;
        c79605VMb.LIZIZ(i);
        C37088Eh2.LIZ(view, c79605VMb.LIZ());
    }
}
