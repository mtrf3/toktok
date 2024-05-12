package X;

import android.webkit.WebView;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F4A {
    public static final /* synthetic */ int LIZ = 0;

    public static F4I LIZ(WebView webView, JSInjectConfig jSInjectConfig) {
        Object LIZ2;
        F4M f4m = F4G.LIZJ;
        Object obj = null;
        if (f4m == null) {
            return null;
        }
        try {
            LIZ2 = f4m.LIZJ(EnumC37658EqE.Offline, new F4D(f4m, webView, jSInjectConfig));
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
        if (m10exceptionOrNullimpl != null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("[Resource] Fail to fetch js code by resourceLoader. JSName: ");
            LIZ3.append(jSInjectConfig.name);
            LIZ3.append(", cdnUrl: ");
            LIZ3.append(jSInjectConfig.geckoUrl);
            C37198Eio.LIZ(X1D.LIZIZ(LIZ3), m10exceptionOrNullimpl);
            LIZ2 = C76800UCe.LIZ;
        }
        if (LIZ2 instanceof F4I) {
            obj = LIZ2;
        }
        return (F4I) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(android.webkit.WebView r10, com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig r11, X.F48 r12, X.F4B r13) {
        /*
            long r8 = java.lang.System.currentTimeMillis()
            boolean r0 = r11.isUseHardCode
            r7 = 1
            r6 = 0
            r2 = 0
            if (r0 == 0) goto L19
            if (r12 == 0) goto L19
            java.lang.String r0 = r12.LIZLLL()
            if (r0 == 0) goto L19
            int r0 = r0.length()
            if (r0 != 0) goto La4
        L19:
            r3 = r2
        L1a:
            X.F4I r5 = LIZ(r10, r11)
            if (r5 == 0) goto L69
            java.io.InputStream r4 = r5.getData()
            if (r4 == 0) goto L69
            java.lang.String r1 = "[Resource] Success to fetch js code by resourceLoader. "
            java.lang.String r0 = "JSName: "
            java.lang.StringBuilder r1 = defpackage.b1.LIZJ(r1, r0)
            java.lang.String r0 = r11.name
            r1.append(r0)
            java.lang.String r0 = ", cdnUrl: "
            r1.append(r0)
            java.lang.String r0 = r11.geckoUrl
            r1.append(r0)
            java.lang.String r0 = ", loadFrom: "
            r1.append(r0)
            X.EqE r0 = r5.LJIIIZ()
            r1.append(r0)
            java.lang.String r0 = ", mimeType: "
            r1.append(r0)
            java.lang.String r0 = r5.getMimeType()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C37198Eio.LIZ(r0, r2)
            X.Ejz r1 = X.C37271Ejz.LIZ
            java.lang.String r0 = r5.LJI()
            r1.getClass()
            java.lang.String r3 = X.C37271Ejz.LIZ(r4, r0)
        L69:
            X.F4J r1 = r13.LIZLLL
            if (r1 == 0) goto L71
            java.lang.String r0 = r11.geckoUrl
            r1.LIZJ = r0
        L71:
            r2 = 1
        L72:
            if (r3 == 0) goto L7a
            int r0 = r3.length()
            if (r0 != 0) goto L8f
        L7a:
            X.F4J r1 = r13.LIZLLL
            if (r1 == 0) goto L84
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1.LIZ = r0
        L84:
            X.F4J r1 = r13.LIZLLL
            if (r1 == 0) goto L8e
            java.lang.Long r0 = X.C44847Hit.LIZ(r8)
            r1.LIZLLL = r0
        L8e:
            return r3
        L8f:
            X.F4J r1 = r13.LIZLLL
            if (r1 == 0) goto L99
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1.LIZ = r0
        L99:
            X.F4J r1 = r13.LIZLLL
            if (r1 == 0) goto L84
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.LIZIZ = r0
            goto L84
        La4:
            java.lang.String r3 = r12.LIZLLL()
            if (r3 == 0) goto L1a
            int r0 = r3.length()
            if (r0 != 0) goto Lb2
            goto L1a
        Lb2:
            r2 = 0
            goto L72
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F4A.LIZIZ(android.webkit.WebView, com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig, X.F48, X.F4B):java.lang.String");
    }

    public static String LIZJ(WebView webView, android.net.Uri uri, String str, JSInjectConfig jSInjectConfig, F48 f48, F4B f4b) {
        String str2;
        o.LJIIJ(webView, "webView");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("/*version:1.0.1*/javascript:(function(){var e=Date.now(),n=");
        LIZ2.append(f4b.LIZ);
        LIZ2.append(";function getClientContext(){return ");
        if (f48 != null) {
            str2 = f48.LJ(uri, webView);
        } else {
            str2 = null;
        }
        LIZ2.append(str2);
        LIZ2.append("}var t=function(e,n){return e.substring(0,n.length)===n},i=function(e,n){var t;return e.indexOf(n)>-1},o=/iPhone|iPad/.test(navigator.userAgent),a=location.hostname+location.pathname,r=location.href,s=\"js_inject_manage_fe\";function l(t,i,a){var s,l,c,d,u,f;i.totalDuration=Date.now()-n,i.totalFeDuration=Date.now()-e,i.current_url=r,i.is_main_doc=window.top===window.self?1:0;var m={eventName:t,category:i,metrics:a,url:r};o?null===(d=null===(c=null===(l=null===(s=window.webkit)||void 0===s?void 0:s.messageHandlers)||void 0===l?void 0:l.WJSIReport)||void 0===c?void 0:c.postMessage)||void 0===d||d.call(c,m):null===(f=null===(u=window.WJSIReport)||void 0===u?void 0:u.postMessage)||void 0===f||f.call(u,JSON.stringify(m))}try{var c=");
        LIZ2.append(GsonProtectorUtils.toJson((Gson) F4N.LIZ.getValue(), jSInjectConfig));
        LIZ2.append(";if(!c)return l(s,{js_name:\"default\",inject_time:\"default\",err_msg:\"inject failed, js config empty\",err_no:4},{}),JSON.stringify({code:4,msg:\"failed\"});for(var d=c.blockList||[],u=c.allowList||[],f=c.injectTime,m=0;m<d.length;m++){var g;if(t(a,g=d[m]))return l(s,{js_name:c.name,inject_time:f,err_msg:\"inject failed, in block list\",err_no:1},{blockListDuration:Date.now()-e}),JSON.stringify({code:1,msg:\"failed\"})}for(var w=Date.now(),_=0,v=!1;_<u.length;){var g;if(i(a,g=u[_])){v=!0;break}_+=1}if(!v)return l(s,{js_name:c.name,inject_time:f,err_msg:\"inject failed, not in allowList\",err_no:2},{allowListDuration:Date.now()-w,blockListDuration:w-e}),JSON.stringify({code:2,msg:\"failed\"});var j=Date.now(),D=(function () { ");
        LIZ2.append(str);
        LIZ2.append(" })();return l(s,{js_name:c.name,inject_time:f,err_msg:\"inject success\",err_no:0},{jsExecuteDuration:Date.now()-j,allowListDuration:j-w,blockListDuration:w-e}),JSON.stringify({code:0,msg:\"success\",data:D})}catch(e){return l(s,{js_name:\"default_failed\",inject_time:\"default_failed\",err_msg:\"inject failed, \".concat(e&&e.message||\"unknown\"),err_no:3},{}),JSON.stringify({code:3,msg:\"failed\"})}})();");
        return X1D.LIZIZ(LIZ2);
    }
}
