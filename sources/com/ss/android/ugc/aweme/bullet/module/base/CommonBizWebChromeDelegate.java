package com.ss.android.ugc.aweme.bullet.module.base;

import X.C03880Dg;
import X.C29S;
import X.C58909NAb;
import X.C59819Ndn;
import X.C59821Ndp;
import X.C59827Ndv;
import X.C61115Nyh;
import X.C61184Nzo;
import X.C62005OVd;
import X.C65300Pk0;
import X.C78983UzD;
import X.F3T;
import X.InterfaceC59822Ndq;
import X.NH3;
import X.NU7;
import X.NUT;
import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class CommonBizWebChromeDelegate extends C59827Ndv implements WeakHandler.IHandler {
    public static final C59821Ndp Companion = new C59821Ndp();
    public final NUT bulletBusiness;
    public final F3T ctx;
    public final WeakHandler mHandler;

    @Override // X.C59825Ndt, android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        o.LJIIIIZZ(createBitmap, "createBitmap(1, 1, Bitmap.Config.ARGB_8888)");
        return createBitmap;
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r2 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.ss.android.ugc.aweme.bullet.module.base.UploadFileFragment getFileFragment() {
        /*
            r5 = this;
            X.NUT r0 = r5.bulletBusiness
            android.app.Activity r2 = r0.getActivity()
            boolean r0 = r2 instanceof X.C29S
            r4 = 0
            if (r0 == 0) goto L4d
            X.1qj r2 = (X.ActivityC45651qj) r2
            if (r2 != 0) goto L1e
        Lf:
            java.lang.String r0 = "activity is null, file upload failed!"
            X.C36922EeM.LJ(r0)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "activity is null, call zhangxiang.aaron"
            r1.<init>(r0)
            com.bytedance.common.utility.Logger.throwException(r1)
        L1e:
            java.lang.String r3 = "web_view_upload_file"
            if (r2 == 0) goto L2c
            androidx.fragment.app.FragmentManager r0 = r2.getSupportFragmentManager()
            if (r0 == 0) goto L2c
            androidx.fragment.app.Fragment r4 = r0.LJJJIL(r3)
        L2c:
            boolean r0 = r4 instanceof com.ss.android.ugc.aweme.bullet.module.base.UploadFileFragment
            if (r0 != 0) goto L4a
            com.ss.android.ugc.aweme.bullet.module.base.UploadFileFragment r4 = new com.ss.android.ugc.aweme.bullet.module.base.UploadFileFragment
            r4.<init>()
            if (r2 == 0) goto L4a
            androidx.fragment.app.FragmentManager r0 = r2.getSupportFragmentManager()
            if (r0 == 0) goto L4a
            X.1B3 r2 = new X.1B3
            r2.<init>(r0)
            r1 = 0
            r0 = 1
            r2.LJIIIIZZ(r1, r0, r4, r3)
            r2.LJI()
        L4a:
            com.ss.android.ugc.aweme.bullet.module.base.UploadFileFragment r4 = (com.ss.android.ugc.aweme.bullet.module.base.UploadFileFragment) r4
            return r4
        L4d:
            r2 = r4
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebChromeDelegate.getFileFragment():com.ss.android.ugc.aweme.bullet.module.base.UploadFileFragment");
    }

    @Override // X.C59825Ndt, android.webkit.WebChromeClient
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

    public final F3T getCtx() {
        return this.ctx;
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebChromeDelegate.handleMsg(android.os.Message):void");
    }

    @Override // X.C59825Ndt
    public void openFileChooser(ValueCallback<Uri> uploadMsg) {
        o.LJIIIZ(uploadMsg, "uploadMsg");
        getFileFragment().LJLIL = uploadMsg;
        getFileFragment().Al("", "");
    }

    public CommonBizWebChromeDelegate(F3T ctx, NUT bulletBusiness) {
        o.LJIIIZ(ctx, "ctx");
        o.LJIIIZ(bulletBusiness, "bulletBusiness");
        this.ctx = ctx;
        this.bulletBusiness = bulletBusiness;
        this.mHandler = new WeakHandler(this);
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (new C03880Dg(2).LIZJ(100003, "com/ss/android/ugc/aweme/bullet/module/base/CommonBizWebChromeDelegate", "onGeolocationPermissionsShowPrompt", this, new Object[]{str, callback}, "void", new C65300Pk0(false, "(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V", "-7222266479794816468")).LIZ) {
            return;
        }
        super.onGeolocationPermissionsShowPrompt(str, callback);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        AdWebStatBusiness adWebStatBusiness;
        if (webView != null && (adWebStatBusiness = (AdWebStatBusiness) this.bulletBusiness.LIZ(AdWebStatBusiness.class)) != null) {
            adWebStatBusiness.LJIILIIL(webView, i);
        }
        super.onProgressChanged(webView, i);
    }

    @Override // X.C59825Ndt
    public void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType) {
        o.LJIIIZ(uploadMsg, "uploadMsg");
        o.LJIIIZ(acceptType, "acceptType");
        getFileFragment().LJLIL = uploadMsg;
        getFileFragment().Al(acceptType, "");
    }

    @Override // android.webkit.WebChromeClient
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

    @Override // X.C59825Ndt
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, InterfaceC59822Ndq interfaceC59822Ndq) {
        boolean z;
        String[] strArr;
        boolean z2;
        String str;
        if (interfaceC59822Ndq == null) {
            return false;
        }
        Activity activity = this.bulletBusiness.getActivity();
        if (!(activity instanceof C29S) || activity == null) {
            return false;
        }
        UploadFileFragment fileFragment = getFileFragment();
        String[] LIZ = interfaceC59822Ndq.LIZ();
        fileFragment.getClass();
        C62005OVd c62005OVd = C61184Nzo.LIZ;
        if (c62005OVd.LIZLLL(activity) == 0 && c62005OVd.LIZJ(activity) == 0 && c62005OVd.LJ(activity) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (C61184Nzo.LIZ(activity) == 0 && z) {
            fileFragment.LJLILLLLZI = valueCallback;
            if (LIZ == null || LIZ.length == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                str = "";
            } else {
                str = LIZ[0];
            }
            fileFragment.Al(str, "");
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                strArr = new String[]{"android.permission.CAMERA", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO"};
            } else {
                strArr = new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};
            }
            C61115Nyh.LIZIZ(activity, TokenCert.Companion.with("bpea-webview_select_file_write_storage_2"), strArr, new C59819Ndn(fileFragment, valueCallback, LIZ));
        }
        return true;
    }

    @Override // X.C59825Ndt
    public void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType, String capture) {
        o.LJIIIZ(uploadMsg, "uploadMsg");
        o.LJIIIZ(acceptType, "acceptType");
        o.LJIIIZ(capture, "capture");
        getFileFragment().LJLIL = uploadMsg;
        getFileFragment().Al(acceptType, capture);
    }

    @Override // X.C59825Ndt, android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (isEnablePopup(str)) {
            return false;
        }
        if (jsResult != null) {
            jsResult.cancel();
        }
        return true;
    }

    @Override // X.C59825Ndt, android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (isEnablePopup(str)) {
            return false;
        }
        if (jsResult != null) {
            jsResult.confirm();
        }
        return true;
    }

    @Override // X.C59825Ndt, android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (isEnablePopup(str)) {
            return false;
        }
        if (jsResult != null) {
            jsResult.cancel();
        }
        return true;
    }

    @Override // X.C59825Ndt, android.webkit.WebChromeClient
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
