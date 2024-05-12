package X;

import Y.ARunnableS7S1100000_6;
import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.WebView;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.compliance.sandbox.webview.WebapiReport;
import com.ss.android.ugc.aweme.compliance.sandbox.webview.pumbaa.PumbaaInjectHostPrefixSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AqS48S1200000_6;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.F9j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38507F9j extends C59862NeU {
    public C38507F9j() {
        super(7);
    }

    public static void LIZJ(WebView webView, String str) {
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS7S1100000_6(webView, str, 17));
    }

    public static void LIZLLL(WebView webView, String str) {
        String str2;
        if (webView != null) {
            C35537Dx7.LIZ.getClass();
            C62822Ol8 c62822Ol8 = C35537Dx7.LIZJ;
            if (((WebapiReport) c62822Ol8.getValue()).enable) {
                List<String> list = ((WebapiReport) c62822Ol8.getValue()).denyList;
                ArrayList arrayList = new ArrayList();
                for (String str3 : list) {
                    if (true ^ o.LJ(str3, "")) {
                        arrayList.add(str3);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str4 = (String) it.next();
                        if (o.LJ("*", str4)) {
                            return;
                        }
                        if (str != null && s.LJJJLZIJ(str, str4, false)) {
                            return;
                        }
                    }
                }
                String str5 = C64707PaR.LIZJ;
                if (str5 != null) {
                    str2 = str5.toLowerCase(Locale.ROOT);
                    o.LJIIIIZZ(str2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                } else {
                    str2 = null;
                }
                LIZJ(webView, ("isTTP=" + (o.LJ(str2, "us") ? 1 : 0) + ';') + "!function(t){\"function\"==typeof define&&define.amd?define(t):t()}((function(){\"use strict\";function t(){return t=Object.assign||function(t){for(var e=1;e<arguments.length;e++){var n=arguments[e];for(var o in n)Object.prototype.hasOwnProperty.call(n,o)&&(t[o]=n[o])}return t},t.apply(this,arguments)}var e=function(){},n=function(t){return\"object\"==typeof t&&null!==t},o=function(t){return\"string\"==typeof t},i=function(){var t=function(){for(var t=new Array(16),e=0,n=0;n<16;n++)0==(3&n)&&(e=4294967296*Math.random()),t[n]=e>>>((3&n)<<3)&255;return t}();return t[6]=15&t[6]|64,t[8]=63&t[8]|128,function(t){for(var e=[],n=0;n<256;++n)e[n]=(n+256).toString(16).substr(1);var o=0,i=e;return[i[t[o++]],i[t[o++]],i[t[o++]],i[t[o++]],\"-\",i[t[o++]],i[t[o++]],\"-\",i[t[o++]],i[t[o++]],\"-\",i[t[o++]],i[t[o++]],\"-\",i[t[o++]],i[t[o++]],i[t[o++]],i[t[o++]],i[t[o++]],i[t[o++]]].join(\"\")}(t)},r=function(t){return\"HYBRID_SLARDAR_WEB\"+t},a=function(t){var e=t.bid,n=t.userId,o=t.deviceId;!function(t,e){try{var n=\"string\"==typeof e?e:JSON.stringify(e);localStorage.setItem(t,n)}catch(t){}}(r(e),{userId:n,deviceId:o})},c=function(e){void 0===e&&(e=\"\");var n=function(t){try{var e=localStorage.getItem(t),n=e;return e&&\"string\"==typeof e&&(n=JSON.parse(e)),n}catch(t){return}}(r(e));return n||(n={userId:i(),deviceId:i()},a(t({bid:e},n))),n},u=function(t,e,n){var o=e.url,i=e.data,r=e.withCredentials,a={\"Content-Type\":\"application/json\"};void 0!==r&&r&&(a.credentials=\"include\"),\"POST\"===t?window.fetch(o,{method:t,headers:a,body:i}):window.fetch(o,{method:t,headers:a})},s=function(t){if(t&&n(t)&&t.name&&o(t.name)){var e={name:t.name,type:\"event\"};if(\"metrics\"in t&&n(t.metrics)){var i=t.metrics,r={};Object.entries(i).forEach((function(t){var e=t[0],n=t[1];\"number\"==typeof n&&(r[e]=n)})),e.metrics=r}if(\"categories\"in t&&n(t.categories)){var a=t.categories,c={};Object.entries(a).forEach((function(t){var e=t[0],n=t[1];c[e]=function(t){try{return o(t)?t:JSON.stringify(t)}catch(t){return\"[FAILED_TO_STRINGIFY]:\"+String(t)}}(n)})),e.categories=c}return e}},d=function(){if(\"object\"==typeof window&&n(window))return window},f=function(){if(\"object\"==typeof document&&n(document))return document},v=function(t){return function(t){var e=f();if(!e||!t)return{url:t,protocol:\"\",domain:\"\",query:\"\",path:\"\",hash:\"\"};var n=e.createElement(\"a\");n.href=t;var o=n.pathname||\"/\";return\"/\"!==o[0]&&(o=\"/\"+o),{url:n.href,protocol:n.protocol.slice(0,-1),domain:n.hostname,query:n.search.substring(1),path:o,hash:n.hash}}(t).path},l=function(e){var n=t({},e);n=t({},n,function(){var t,e=d()&&d()&&window.location;return e?{url:null==(t=e.href)?void 0:t.split(\"?\")[0],protocol:e.protocol.slice(0,-1),domain:e.hostname,path:e.pathname,query:e.search.substring(1)}:{}}(),{timestamp:Date.now(),sdk_version:\"0.0.1\",sdk_name:\"HYBRID_SLARDAR_WEB_SDK\"});var o=function(t){return(null==t?void 0:t.effectiveType)||(null==t?void 0:t.type)||\"\"}(function(){var t=function(){if(d()&&\"navigator\"in window)return window.navigator}();if(t)return t.connection||t.mozConnection||t.webkitConnection}());return n=t({},n,{network_type:o})},p=function(o){if(!(o&&n(o)&&(r=o,n(r)&&\"bid\"in r)))throw new Error(\"invalid InitConfig, init failed\");var r,a,d,f,p,m,h,g,w=(f=c((a=o).bid),{pid:v(location.href),viewId:(d=\"_\",d+\"_\"+Date.now()),userId:f.userId,deviceId:f.deviceId,sessionId:i(),domain:1===window.isTTP?\"mon.us.tiktokv.com\":\"mon-va.tiktokv.com\",env:a.env||\"production\",sample_rate:1}),y=t({},w,o),b=(void 0===g&&(g=\"/monitor_browser/collect/batch/\"),p=((h=w.domain)&&h.indexOf(\"//\")>=0?\"\":\"https://\")+h+g,m=fetch?{get:function(t){return u(\"GET\",t)},post:function(t){return u(\"POST\",t)}}:{get:e,post:e},function(t){m.post({url:p,data:t})});return{sendEvent:function(t){var e=s(t),n=l(y);this.report({ev_type:\"custom\",payload:e,common:n})},report:function(t){var e;t&&b((e=[t],JSON.stringify({ev_type:\"batch\",list:e})))}}};!function(t){t.document;var e=t.navigator,n=p({bid:\"tiktok_pns_webview\",env:\"production\"});function o(t){n.sendEvent({name:\"hybrid_monitor_sensitiveApi\",categories:{fnName:t}})}function i(t,e){var n=(e=e||{})[t],i=function(){var i=Array.prototype.slice.call(arguments,0);return o(t),n.apply(e,i)};\"getUserMedia\"===t?e.constructor.prototype[t]=i:e[t]=i}e.clipboard&&e.clipboard.readText&&i(\"readText\",e.clipboard),e.geolocation&&e.geolocation.getCurrentPosition&&(e.geolocation.getCurrentPosition=function(t,e,n){o(\"getCurrentPosition\")}),e.geolocation&&e.geolocation.watchPosition&&(e.geolocation.watchPosition=function(t,e,n){o(\"watchPosition\")}),e.geolocation&&e.geolocation.clearWatch&&(e.geolocation.clearWatch=function(t){o(\"clearWatch\")}),e.mediaDevices&&e.mediaDevices.getUserMedia?i(\"getUserMedia\",e.mediaDevices):e.getUserMedia?i(\"getUserMedia\",e):e.webkitGetUserMedia?i(\"webkitGetUserMedia\",e):e.mozGetUserMedia&&i(\"mozGetUserMedia\",e)}(window)}));");
            }
        }
    }

    @Override // X.C59862NeU, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        List<String> list;
        List<String> list2;
        super.onPageStarted(webView, str, bitmap);
        if (!C37794EsQ.LIZJ(str)) {
            return;
        }
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        PumbaaInjectHostPrefixSettings.PumbaaInjectHostPrefixModel pumbaaInjectHostPrefixModel = PumbaaInjectHostPrefixSettings.LIZ;
        PumbaaInjectHostPrefixSettings.PumbaaInjectHostPrefixModel pumbaaInjectHostPrefixModel2 = (PumbaaInjectHostPrefixSettings.PumbaaInjectHostPrefixModel) LIZLLL.LJIIIIZZ("pumbaa_inject_host_prefix", PumbaaInjectHostPrefixSettings.PumbaaInjectHostPrefixModel.class, pumbaaInjectHostPrefixModel);
        if (pumbaaInjectHostPrefixModel2 != null) {
            pumbaaInjectHostPrefixModel = pumbaaInjectHostPrefixModel2;
        }
        if (pumbaaInjectHostPrefixModel != null && pumbaaInjectHostPrefixModel.enabled) {
            android.net.Uri parse = UriProtector.parse(str);
            String host = parse.getHost();
            if (host == null) {
                host = "";
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(host);
            LIZ.append(parse.getPath());
            String LIZIZ = X1D.LIZIZ(LIZ);
            PumbaaInjectHostPrefixSettings.PumbaaInjectUrl pumbaaInjectUrl = pumbaaInjectHostPrefixModel.injectUrl;
            if (pumbaaInjectUrl != null && (list2 = pumbaaInjectUrl.excludes) != null) {
                Iterator<String> it = list2.iterator();
                while (it.hasNext()) {
                    if (ujb.o.LJJJLIIL(LIZIZ, it.next(), false)) {
                        break;
                    }
                }
            }
            PumbaaInjectHostPrefixSettings.PumbaaInjectUrl pumbaaInjectUrl2 = pumbaaInjectHostPrefixModel.injectUrl;
            if (pumbaaInjectUrl2 != null && (list = pumbaaInjectUrl2.includes) != null) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (ujb.o.LJJJJ(host, it2.next(), false)) {
                        long currentTimeMillis = System.currentTimeMillis();
                        Forest LIZ2 = C39914FlW.LIZ();
                        RequestParams requestParams = new RequestParams(null, 1, null);
                        requestParams.setChannel("fe_pns_runtime_framework");
                        requestParams.setBundle("loader/inject.js");
                        LIZ2.fetchResourceAsync("", requestParams, new AqS48S1200000_6(this, webView, str, currentTimeMillis, 3));
                        return;
                    }
                }
            }
        }
        LIZLLL(webView, str);
    }
}
