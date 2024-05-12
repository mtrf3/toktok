package X;

import android.content.ComponentName;
import android.content.Intent;
import android.text.TextUtils;
import android.webkit.WebView;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.ad.settings.IntentSchemeInterceptConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes11.dex */
public final class NUN {
    public static String LIZ(String url) {
        o.LJIIIZ(url, "url");
        if (!TextUtils.isEmpty(url) && s.LJJJLZIJ(url, "__back_url__", false)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("snssdk");
            LIZ.append(EF7.LJIIIZ);
            LIZ.append("://adx");
            String encode = android.net.Uri.encode(X1D.LIZIZ(LIZ));
            o.LJIIIIZZ(encode, "encode(AbsConstants.SCHE…er.getAppId() + \"://adx\")");
            return ujb.o.LJJJJZ(url, "__back_url__", encode, false);
        }
        return url;
    }

    public static void LJ(String str, String str2, IntentSchemeInterceptConfig intentSchemeInterceptConfig, boolean z) {
        String LJLLJ;
        boolean z2;
        String shortClassName;
        String packageName;
        String str3;
        String str4;
        String className;
        if (str2 == null || ujb.o.LJJJJJL(str2) || ujb.o.LJJJJJL(str)) {
            return;
        }
        JSONObject LJ = C47135Ieh.LJ("url", str, "scheme", str2);
        if (z) {
            LJLLJ = C16880lQ.LJLLJ(C59581NZx.class);
        } else {
            LJLLJ = C16880lQ.LJLLJ(C59580NZw.class);
        }
        LJ.put("from", LJLLJ);
        if (intentSchemeInterceptConfig != null) {
            LJ.put("pattern", intentSchemeInterceptConfig.pattern);
            LJ.put("config_type", intentSchemeInterceptConfig.type);
        }
        if (o.LJ("intent", str2)) {
            try {
                Intent parseUri = Intent.parseUri(str, 1);
                if (parseUri != null) {
                    String str5 = parseUri.getPackage();
                    if (str5 != null && !ujb.o.LJJJJJL(str5)) {
                        LJ.put("package", parseUri.getPackage());
                    }
                    if (C16880lQ.LLJJIJI(parseUri) != null) {
                        LJ.put("extra", String.valueOf(C16880lQ.LLJJIJI(parseUri)));
                    }
                    ComponentName component = parseUri.getComponent();
                    if (component == null || (className = component.getClassName()) == null || !(!ujb.o.LJJJJJL(className))) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    String str6 = null;
                    if (z2) {
                        ComponentName component2 = parseUri.getComponent();
                        if (component2 != null) {
                            str4 = component2.getClassName();
                        } else {
                            str4 = null;
                        }
                        LJ.put("className", str4);
                    }
                    ComponentName component3 = parseUri.getComponent();
                    if (component3 != null && (packageName = component3.getPackageName()) != null && (!ujb.o.LJJJJJL(packageName))) {
                        ComponentName component4 = parseUri.getComponent();
                        if (component4 != null) {
                            str3 = component4.getPackageName();
                        } else {
                            str3 = null;
                        }
                        LJ.put("packageName", str3);
                    }
                    ComponentName component5 = parseUri.getComponent();
                    if (component5 != null && (shortClassName = component5.getShortClassName()) != null && (!ujb.o.LJJJJJL(shortClassName))) {
                        ComponentName component6 = parseUri.getComponent();
                        if (component6 != null) {
                            str6 = component6.getShortClassName();
                        }
                        LJ.put("shortClassName", str6);
                    }
                    String action = parseUri.getAction();
                    if (action != null && !ujb.o.LJJJJJL(action)) {
                        LJ.put("action", parseUri.getAction());
                    }
                    java.util.Set<String> categories = parseUri.getCategories();
                    if (categories != null && !categories.isEmpty()) {
                        LJ.put("categories", parseUri.getCategories().toString());
                    }
                    String dataString = parseUri.getDataString();
                    if (dataString != null && !ujb.o.LJJJJJL(dataString)) {
                        LJ.put("data", parseUri.getDataString());
                    }
                    String type = parseUri.getType();
                    if (type != null && !ujb.o.LJJJJJL(type)) {
                        LJ.put("type", parseUri.getType());
                    }
                    LJ.put("flag", parseUri.getFlags());
                }
            } catch (Exception e) {
                LJ.put("exception_name", C16880lQ.LJLLJ(e.getClass()));
                String message = e.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                LJ.put("exception_message", message);
            }
        }
        C09900aA.LJ("webview_intent_scheme_log", LJ);
    }

    public static void LIZLLL(Aweme aweme, android.net.Uri uri, String str, WebView webView, C59866NeY c59866NeY, InterfaceC59561NZd interfaceC59561NZd) {
        AwemeRawAd awemeRawAd;
        if (interfaceC59561NZd != null) {
            interfaceC59561NZd.getCrossPlatformParams();
            interfaceC59561NZd.getCrossPlatformParams();
        }
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            awemeRawAd.getGroupId();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("【filterUrl】 = ");
        LIZ.append(str);
        LIZ.append(" 【market】 special handle");
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("commerce_jump", X1D.LIZIZ(LIZ));
        o.LJIIIZ(webView, "webView");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        intent.putExtra("pns.sandbox.dataflow_id", 1207965953);
        NUS.LIZ(str, c59866NeY);
        C16880lQ.LIZJ(webView.getContext(), intent);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(2:345|(2:347|348))(1:227)|228|(1:343)(1:232)|233|(3:(1:341)(1:242)|243|(3:(1:248)|246|247)(2:249|(15:252|253|254|(1:256)(1:338)|257|(1:337)(1:261)|262|(1:264)(8:281|(4:316|(1:318)(1:336)|319|(2:325|(2:327|(4:329|(1:331)(1:334)|332|333)(1:335))))|283|(1:285)(1:311)|286|(4:288|(2:290|(2:294|295))|296|(2:300|301))|302|(4:304|(1:306)(1:310)|307|(1:309)))|(1:280)(1:270)|(1:279)|272|273|274|275|276)))|342|(1:266)|280|(0)|272|273|274|275|276) */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x023d, code lost:
    
        if (X.C59252NNg.LJ(r26) != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x02e0, code lost:
    
        if (X.C59252NNg.LJ(r26) == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x039f, code lost:
    
        if (X.C59252NNg.LJ(r26) == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x07da, code lost:
    
        if (r31 != null) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0443 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x07f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x07f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0199 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [X.NK2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(android.webkit.WebView r28, java.lang.String r29, android.webkit.WebResourceRequest r30, X.InterfaceC59561NZd r31, boolean r32, X.C59866NeY r33, X.NZX r34, X.InterfaceC65784Pro r35) {
        /*
            Method dump skipped, instructions count: 2037
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NUN.LIZIZ(android.webkit.WebView, java.lang.String, android.webkit.WebResourceRequest, X.NZd, boolean, X.NeY, X.NZX, X.Pro):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme r11, android.net.Uri r12, java.lang.String r13, boolean r14, android.webkit.WebView r15, com.ss.android.ugc.aweme.ad.model.AdLandingPageConfig r16, boolean r17, boolean r18, X.C59866NeY r19, X.InterfaceC59561NZd r20) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NUN.LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme, android.net.Uri, java.lang.String, boolean, android.webkit.WebView, com.ss.android.ugc.aweme.ad.model.AdLandingPageConfig, boolean, boolean, X.NeY, X.NZd):boolean");
    }
}
