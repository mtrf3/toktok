package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C1EW;
import X.C37144Ehw;
import X.C38507F9j;
import X.C64797Pbt;
import X.C70902RsA;
import X.C70905RsD;
import X.C76800UCe;
import X.EBZ;
import X.EDN;
import X.EDO;
import X.EDQ;
import X.EO7;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.WM7;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class AqS48S1200000_6 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS48S1200000_6 aqS48S1200000_6, Object obj) {
        LaneParams update = (LaneParams) obj;
        o.LJIIIZ(update, "$this$update");
        update.plusAssign(WM7.SCENE_SERVICE, EBZ.SCHEMA.getValue());
        update.plusAssign("path", ((C70902RsA) aqS48S1200000_6.l1).LJIIIIZZ);
        update.plusAssign("source", aqS48S1200000_6.s0);
        update.plusAssign("result", Integer.valueOf(((EDO) aqS48S1200000_6.l2).L()));
        update.plusAssign("key", ((EDO) aqS48S1200000_6.l2).LJLIL);
        update.plusAssign("type", Integer.valueOf(((EDO) aqS48S1200000_6.l2).LJLILLLLZI.getValue()));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS48S1200000_6 aqS48S1200000_6, Object obj) {
        LaneParams update = (LaneParams) obj;
        o.LJIIIZ(update, "$this$update");
        update.plusAssign(WM7.SCENE_SERVICE, EBZ.SCHEMA.getValue());
        update.plusAssign("path", ((C70905RsD) aqS48S1200000_6.l1).LJIIIIZZ);
        update.plusAssign("source", aqS48S1200000_6.s0);
        int value = EDQ.SUCCESS.getValue();
        JSONObject jSONObject = new JSONObject();
        for (EDN edn : (List) aqS48S1200000_6.l2) {
            if (edn.LIZIZ.getValue() > value) {
                value = edn.LIZIZ.getValue();
            }
            if (!edn.LIZJ.isEmpty()) {
                String str = edn.LIZ;
                JSONObject jSONObject2 = new JSONObject();
                for (EDO edo : edn.LIZJ) {
                    jSONObject2.put(edo.LJLIL, edo.LJLILLLLZI.getValue());
                }
                jSONObject.put(str, jSONObject2);
            }
        }
        update.plusAssign("result", Integer.valueOf(value));
        update.plusAssign("errors", jSONObject.toString());
        C1EW.LIZIZ(System.currentTimeMillis(), ((C70905RsD) aqS48S1200000_6.l1).LJIIIZ, update, "cost_time");
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        if (r2.LJIILJJIL == true) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AqS48S1200000_6 r5, java.lang.Object r6) {
        /*
            X.Axv r6 = (X.C27943Axv) r6
            java.lang.String r0 = "$this$sendLog"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.C78880UxY.LJIJI(r6)
            java.lang.Object r1 = r5.l1
            X.Pbt r1 = (X.C64797Pbt) r1
            X.EeA r0 = r1.LIZ
            r3 = 0
            if (r0 == 0) goto L99
            java.lang.Object r2 = r0.LJFF
        L15:
            boolean r0 = r2 instanceof X.C64668PZo
            if (r0 == 0) goto L97
            X.PZo r2 = (X.C64668PZo) r2
        L1b:
            T r0 = r1.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0
            int r0 = r0.code
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "error_code"
            r6.LIZIZ(r0, r1)
            java.net.URL r1 = new java.net.URL
            java.lang.Object r0 = r5.l1
            X.Pbt r0 = (X.C64797Pbt) r0
            X.EeA r0 = r0.LIZ
            if (r0 == 0) goto L36
            java.lang.String r3 = r0.LIZ
        L36:
            r1.<init>(r3)
            java.lang.String r1 = r1.getPath()
            java.lang.String r0 = "path"
            r6.LIZIZ(r0, r1)
            java.lang.Object r1 = r5.l1
            X.Pbt r1 = (X.C64797Pbt) r1
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r1 = X.C36671EaJ.LIZ(r1)
            java.lang.String r0 = "log_id"
            r6.LIZIZ(r0, r1)
            java.lang.String r1 = "page_name"
            java.lang.String r0 = r5.s0
            r6.LIZIZ(r1, r0)
            if (r2 == 0) goto L94
            long r0 = r2.LJIILLIIL
        L5f:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "duration"
            r6.LIZJ(r0, r1)
            r4 = 0
            if (r2 == 0) goto L92
            boolean r1 = r2.LJIILJJIL
            r0 = 1
            if (r1 != r0) goto L92
        L70:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "is_socket_reused"
            r6.LIZJ(r0, r1)
            java.lang.Object r3 = r5.l2
            X.OSZ[] r3 = (X.OSZ[]) r3
            int r2 = r3.length
        L7e:
            if (r4 >= r2) goto L9c
            r0 = r3[r4]
            java.lang.Object r1 = r0.getFirst()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getSecond()
            r6.LIZIZ(r1, r0)
            int r4 = r4 + 1
            goto L7e
        L92:
            r0 = 0
            goto L70
        L94:
            r0 = 0
            goto L5f
        L97:
            r2 = r3
            goto L1b
        L99:
            r2 = r3
            goto L15
        L9c:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS48S1200000_6.invoke$2(kotlin.jvm.internal.AqS48S1200000_6, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AqS48S1200000_6 r7, java.lang.Object r8) {
        /*
            X.O3v r8 = (X.C61295O3v) r8
            java.lang.String r0 = "response"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            boolean r0 = r8.LJZL
            if (r0 == 0) goto L8e
            byte[] r2 = r8.S()
            if (r2 == 0) goto L89
            java.lang.Object r4 = r7.l1
            X.F9j r4 = (X.C38507F9j) r4
            java.lang.Object r5 = r7.l2
            android.webkit.WebView r5 = (android.webkit.WebView) r5
            java.lang.String r0 = r8.L()
            if (r0 == 0) goto L31
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r0)
            java.lang.String r0 = "forName(charset)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r6 = new java.lang.String
            r6.<init>(r2, r1)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L38
        L31:
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r0 = X.PVC.LIZ
            r6.<init>(r2, r0)
        L38:
            boolean r0 = X.C78685UuP.LJJJZ(r6)
            if (r0 == 0) goto L89
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "window.__pumbaa_web_whitelist_setting__="
            r7.<init>(r0)
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            com.bytedance.ies.abmock.SettingsManager r8 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.ss.android.ugc.aweme.compliance.sandbox.webview.pumbaa.PumbaaInjectHostPrefixSettings$PumbaaInjectHostPrefixModel> r1 = com.ss.android.ugc.aweme.compliance.sandbox.webview.pumbaa.PumbaaInjectHostPrefixSettings.PumbaaInjectHostPrefixModel.class
            com.ss.android.ugc.aweme.compliance.sandbox.webview.pumbaa.PumbaaInjectHostPrefixSettings$PumbaaInjectHostPrefixModel r2 = com.ss.android.ugc.aweme.compliance.sandbox.webview.pumbaa.PumbaaInjectHostPrefixSettings.LIZ
            java.lang.String r0 = "pumbaa_inject_host_prefix"
            java.lang.Object r0 = r8.LJIIIIZZ(r0, r1, r2)
            com.ss.android.ugc.aweme.compliance.sandbox.webview.pumbaa.PumbaaInjectHostPrefixSettings$PumbaaInjectHostPrefixModel r0 = (com.ss.android.ugc.aweme.compliance.sandbox.webview.pumbaa.PumbaaInjectHostPrefixSettings.PumbaaInjectHostPrefixModel) r0
            if (r0 != 0) goto L8c
        L5d:
            org.json.JSONArray r1 = new org.json.JSONArray
            com.ss.android.ugc.aweme.compliance.sandbox.webview.pumbaa.PumbaaInjectHostPrefixSettings$PumbaaInjectUrl r0 = r2.injectUrl
            java.util.List<java.lang.String> r0 = r0.excludes
            r1.<init>(r0)
            java.lang.String r0 = "excludes"
            r3.put(r0, r1)
            org.json.JSONArray r1 = new org.json.JSONArray
            com.ss.android.ugc.aweme.compliance.sandbox.webview.pumbaa.PumbaaInjectHostPrefixSettings$PumbaaInjectUrl r0 = r2.injectUrl
            java.util.List<java.lang.String> r0 = r0.includes
            r1.<init>(r0)
            java.lang.String r0 = "includes"
            r3.put(r0, r1)
            r7.append(r3)
            java.lang.String r0 = r7.toString()
            r4.getClass()
            X.C38507F9j.LIZJ(r5, r0)
            X.C38507F9j.LIZJ(r5, r6)
        L89:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L8c:
            r2 = r0
            goto L5d
        L8e:
            java.lang.Object r2 = r7.l1
            X.F9j r2 = (X.C38507F9j) r2
            java.lang.Object r1 = r7.l2
            android.webkit.WebView r1 = (android.webkit.WebView) r1
            java.lang.String r0 = r7.s0
            r2.getClass()
            X.C38507F9j.LIZLLL(r1, r0)
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS48S1200000_6.invoke$3(kotlin.jvm.internal.AqS48S1200000_6, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$4(AqS48S1200000_6 aqS48S1200000_6, Object obj) {
        boolean z;
        Effect it = (Effect) obj;
        o.LJIIIZ(it, "it");
        C37144Ehw c37144Ehw = (C37144Ehw) aqS48S1200000_6.l1;
        String category = aqS48S1200000_6.s0;
        List<EO7> list = (List) aqS48S1200000_6.l2;
        c37144Ehw.getClass();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (EO7 eo7 : list) {
                eo7.getClass();
                o.LJIIIZ(category, "category");
                if (eo7.LIZ(it, category)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS48S1200000_6(C37144Ehw c37144Ehw, String str, List list, int i) {
        super(1);
        this.$t = i;
        this.l1 = c37144Ehw;
        this.s0 = str;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS48S1200000_6(C64797Pbt c64797Pbt, C64797Pbt<Response<Object>> c64797Pbt2, String str, OSZ<String, ? extends Object>[] oszArr) {
        super(1);
        this.$t = oszArr;
        this.l1 = c64797Pbt;
        this.s0 = c64797Pbt2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS48S1200000_6(C70902RsA c70902RsA, String str, EDO edo, int i) {
        super(1);
        this.$t = i;
        this.l1 = c70902RsA;
        this.s0 = str;
        this.l2 = edo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS48S1200000_6(C70905RsD c70905RsD, C70905RsD c70905RsD2, String str, List<EDN> list) {
        super(1);
        this.$t = list;
        this.l1 = c70905RsD;
        this.s0 = c70905RsD2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS48S1200000_6(C38507F9j c38507F9j, WebView webView, String str, long j, int i) {
        super(1);
        this.$t = i;
        this.l1 = c38507F9j;
        this.l2 = webView;
        this.s0 = str;
    }
}
