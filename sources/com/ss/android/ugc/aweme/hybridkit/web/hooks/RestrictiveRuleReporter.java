package com.ss.android.ugc.aweme.hybridkit.web.hooks;

import X.C03880Dg;
import X.C141335gf;
import X.C35993EAr;
import X.C35994EAs;
import X.C37023Efz;
import X.C37024Eg0;
import X.C3C5;
import X.C65300Pk0;
import X.C76800UCe;
import X.C79605VMb;
import X.VMI;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class RestrictiveRuleReporter {
    public final WebView LIZ;

    public RestrictiveRuleReporter(WebView webView) {
        this.LIZ = webView;
    }

    @JavascriptInterface
    public final void reportRestrictiveRule(String jsonString) {
        Object LIZ;
        int optInt;
        String str;
        VMI vmi;
        String str2;
        String str3 = "";
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {jsonString};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;)V", "-9219881600354423229");
        if (c03880Dg.LIZJ(300001, "com/ss/android/ugc/aweme/hybridkit/web/hooks/RestrictiveRuleReporter", "reportRestrictiveRule", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/ss/android/ugc/aweme/hybridkit/web/hooks/RestrictiveRuleReporter", "reportRestrictiveRule", null, objArr, this, c65300Pk0, false);
            return;
        }
        o.LJIIIZ(jsonString, "jsonString");
        try {
            JSONObject jSONObject = new JSONObject(jsonString);
            optInt = jSONObject.optInt("ruleId");
            String url = jSONObject.optString("url");
            str = null;
            if (url != null) {
                try {
                    C35994EAs LIZ2 = C35993EAr.LIZ(UriProtector.parse(url));
                    if (LIZ2 != null) {
                        str = LIZ2.LIZ;
                    }
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
            }
            o.LJIIIIZZ(url, "url");
            C37023Efz.LIZ(new C37024Eg0(optInt, url, ""));
            vmi = VMI.LJ;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            WebView webView = this.LIZ;
            C79605VMb c79605VMb = new C79605VMb("hybrid_monitor_restrictive_rule");
            c79605VMb.LIZIZ = "restrictive_rule";
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("ruleId", optInt);
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            jSONObject2.put("url", str2);
            c79605VMb.LIZLLL = jSONObject2;
            if (str != null) {
                str3 = str;
            }
            c79605VMb.LIZ = str3;
            c79605VMb.LIZIZ(0);
            vmi.LJIILL(webView, c79605VMb.LIZ());
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th3) {
            th = th3;
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            C3C5.m10exceptionOrNullimpl(LIZ);
            c03880Dg.LIZIZ(300001, "com/ss/android/ugc/aweme/hybridkit/web/hooks/RestrictiveRuleReporter", "reportRestrictiveRule", null, objArr, this, c65300Pk0, true);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
        c03880Dg.LIZIZ(300001, "com/ss/android/ugc/aweme/hybridkit/web/hooks/RestrictiveRuleReporter", "reportRestrictiveRule", null, objArr, this, c65300Pk0, true);
    }
}
