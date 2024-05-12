package com.ss.android.ugc.aweme.spark;

import X.C29S;
import X.C58909NAb;
import X.C59816Ndk;
import X.C60404NnE;
import X.C78983UzD;
import X.NH3;
import X.NU7;
import X.NUT;
import X.NVO;
import X.NVS;
import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class CommonSparkBizWebChromeDelegate extends C60404NnE implements WeakHandler.IHandler {
    public static final C59816Ndk Companion = new C59816Ndk();
    public final NUT bulletBusiness;
    public final NVO container;
    public final WeakHandler mHandler;

    @Override // X.AbstractC60402NnC
    public Bitmap getDefaultVideoPoster() {
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        o.LJIIIIZZ(createBitmap, "createBitmap(1, 1, Bitmap.Config.ARGB_8888)");
        return createBitmap;
    }

    @Override // X.AbstractC60402NnC
    public void onGeolocationPermissionsHidePrompt() {
    }

    @Override // X.AbstractC60402NnC
    public View getVideoLoadingProgressView() {
        Activity activity = this.bulletBusiness.getActivity();
        if (!(activity instanceof C29S) || activity == null) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ProgressBar progressBar = new ProgressBar(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(progressBar, layoutParams);
        return frameLayout;
    }

    @Override // X.AbstractC60402NnC
    public void onHideCustomView() {
        super.onHideCustomView();
        NVO nvo = this.container;
        nvo.getClass();
        new NVS(nvo).onHideCustomView();
    }

    public CommonSparkBizWebChromeDelegate(NVO container) {
        o.LJIIIZ(container, "container");
        this.container = container;
        this.mHandler = new WeakHandler(this);
        this.bulletBusiness = container.LJLIL;
    }

    private final boolean isEnablePopup(String str) {
        Boolean valueOf;
        int i;
        boolean z;
        String[] LJIILIIL;
        Integer LJIIL;
        if (str == null) {
            return false;
        }
        C58909NAb.LIZ.getClass();
        if (NH3.LIZJ() != null && (valueOf = Boolean.valueOf(NU7.LJIILJJIL())) != null) {
            valueOf.booleanValue();
            if (NH3.LIZJ() != null && (LJIIL = NU7.LJIIL()) != null) {
                i = LJIIL.intValue();
            } else {
                i = 1;
            }
            if (NH3.LIZJ() != null && (LJIILIIL = NU7.LJIILIIL()) != null) {
                for (String str2 : LJIILIIL) {
                    if (s.LJJJLZIJ(str, str2, false)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!this.bulletBusiness.LIZLLL() || i == 0 || i != 1 || z) {
                return false;
            }
            return true;
        }
        return this.bulletBusiness.LIZLLL();
    }

    private final boolean reportLocalEvent(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = UriProtector.parse(str);
            if (!o.LJ("log_event", parse.getHost())) {
                return false;
            }
            z = true;
            Message obtainMessage = this.mHandler.obtainMessage(1);
            o.LJIIIIZZ(obtainMessage, "mHandler.obtainMessage(MSG_REPORT_LOCAL_EVENT)");
            obtainMessage.obj = parse;
            this.mHandler.sendMessage(obtainMessage);
            return true;
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            return z;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:13|(2:14|15)|(9:17|18|19|(1:21)|23|(4:29|30|26|28)|25|26|28)|37|18|19|(0)|23|(0)|25|26|28) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0057, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
    
        X.C78983UzD.LJIIZILJ(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052 A[Catch: Exception -> 0x0057, TRY_LEAVE, TryCatch #2 {Exception -> 0x0057, blocks: (B:19:0x004a, B:21:0x0052), top: B:18:0x004a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleMsg(android.os.Message r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L3
            return
        L3:
            int r1 = r11.what
            r0 = 1
            if (r1 != r0) goto Le
            java.lang.Object r1 = r11.obj
            boolean r0 = r1 instanceof android.net.Uri
            if (r0 != 0) goto Lf
        Le:
            return
        Lf:
            java.lang.String r0 = "null cannot be cast to non-null type android.net.Uri"
            kotlin.jvm.internal.o.LJII(r1, r0)     // Catch: java.lang.Exception -> L7a
            android.net.Uri r1 = (android.net.Uri) r1     // Catch: java.lang.Exception -> L7a
            java.lang.String r2 = "log_event"
            java.lang.String r0 = r1.getHost()     // Catch: java.lang.Exception -> L7a
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)     // Catch: java.lang.Exception -> L7a
            if (r0 != 0) goto L23
            goto L7f
        L23:
            java.lang.String r0 = "category"
            java.lang.String r2 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)     // Catch: java.lang.Exception -> L7a
            java.lang.String r0 = "tag"
            java.lang.String r3 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)     // Catch: java.lang.Exception -> L7a
            java.lang.String r0 = "label"
            java.lang.String r4 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)     // Catch: java.lang.Exception -> L7a
            r7 = 0
            java.lang.String r0 = "value"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)     // Catch: java.lang.Exception -> L44
            if (r0 == 0) goto L48
            long r5 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Exception -> L44
            goto L4a
        L44:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)     // Catch: java.lang.Exception -> L7a
        L48:
            r5 = 0
        L4a:
            java.lang.String r0 = "ext_value"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)     // Catch: java.lang.Exception -> L57
            if (r0 == 0) goto L5b
            long r7 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Exception -> L57
            goto L5b
        L57:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)     // Catch: java.lang.Exception -> L7a
        L5b:
            java.lang.String r0 = "extra"
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)     // Catch: java.lang.Exception -> L7a
            boolean r0 = X.C38354F3m.LJ(r1)     // Catch: java.lang.Exception -> L7a
            if (r0 != 0) goto L71
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Exception -> L6d
            r9.<init>(r1)     // Catch: java.lang.Exception -> L6d
            goto L72
        L6d:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)     // Catch: java.lang.Exception -> L7a
        L71:
            r9 = 0
        L72:
            android.content.Context r1 = X.EF7.LIZIZ()     // Catch: java.lang.Exception -> L7a
            X.C38836FMa.LIZJ(r1, r2, r3, r4, r5, r7, r9)     // Catch: java.lang.Exception -> L7a
            goto Le
        L7a:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)
            goto Le
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.spark.CommonSparkBizWebChromeDelegate.handleMsg(android.os.Message):void");
    }

    @Override // X.AbstractC60402NnC
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        super.onGeolocationPermissionsShowPrompt(str, callback);
    }

    @Override // X.AbstractC60402NnC
    public void onProgressChanged(WebView webView, int i) {
        AdWebStatBusiness adWebStatBusiness;
        if (webView != null && (adWebStatBusiness = (AdWebStatBusiness) this.bulletBusiness.LIZ(AdWebStatBusiness.class)) != null) {
            adWebStatBusiness.LJIILIIL(webView, i);
        }
        super.onProgressChanged(webView, i);
    }

    @Override // X.AbstractC60402NnC
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
        NVO nvo = this.container;
        nvo.getClass();
        new NVS(nvo).onShowCustomView(view, customViewCallback);
    }

    @Override // X.AbstractC60402NnC
    public void onConsoleMessage(String str, int i, String str2) {
        Logger.debug();
        if (str != null && ujb.o.LJJJLIIL(str, "bytedance://", false)) {
            reportLocalEvent(str);
            AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.bulletBusiness.LIZ(AdWebStatBusiness.class);
            if (adWebStatBusiness != null) {
                adWebStatBusiness.LIZIZ(str);
            }
        }
    }

    @Override // X.AbstractC60402NnC
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    @Override // X.AbstractC60402NnC
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (isEnablePopup(str)) {
            return false;
        }
        if (jsResult != null) {
            jsResult.cancel();
        }
        return true;
    }

    @Override // X.AbstractC60402NnC
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (isEnablePopup(str)) {
            return false;
        }
        if (jsResult != null) {
            jsResult.confirm();
        }
        return true;
    }

    @Override // X.AbstractC60402NnC
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (isEnablePopup(str)) {
            return false;
        }
        if (jsResult != null) {
            jsResult.cancel();
        }
        return true;
    }

    @Override // X.AbstractC60402NnC
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (isEnablePopup(str)) {
            return false;
        }
        if (jsPromptResult != null) {
            jsPromptResult.cancel();
        }
        return true;
    }
}
