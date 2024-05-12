package com.ss.android.sdk.webview;

import X.C07780Sg;
import X.C0ON;
import X.C16880lQ;
import X.C2NU;
import X.C38048EwW;
import X.C38049EwX;
import X.C38053Ewb;
import X.C38060Ewi;
import X.C38072Ewu;
import X.C38075Ewx;
import X.C38077Ewz;
import X.C38113ExZ;
import X.C38150EyA;
import X.C38269F0f;
import X.C38270F0g;
import X.C38271F0h;
import X.C38272F0i;
import X.C38273F0j;
import X.C38274F0k;
import X.C38354F3m;
import X.EnumC38078Ex0;
import X.F0E;
import X.F71;
import X.InterfaceC38047EwV;
import X.InterfaceC38050EwY;
import X.InterfaceC38275F0l;
import X.InterfaceC38276F0m;
import X.InterfaceC38277F0n;
import X.UC0;
import X.X1D;
import Y.IDHandlerS19S0100000_6;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class BaseJsMessageHandler implements InterfaceC38047EwV, InterfaceC38275F0l, InterfaceC38277F0n, InterfaceC38276F0m, WeakHandler.IHandler {
    public String hasAdInfoJson;
    public long mAdCId;
    public String mAdId;
    public String mAdInfoJson;
    public int mAdSystemOrigin;
    public String mAdType;
    public String mAdvId;
    public String mAppName;
    public WeakReference<Context> mContextRef;
    public String mCreativeId;
    public String mDownloadUrl;
    public boolean mFeatureListInited;
    public long mGroupId;
    public C38150EyA mIesJsBridge;
    public String mItemId;
    public String mLandingPageInfo;
    public String mLogExtra;
    public String mPackageName;
    public String mPendingConfigKey;
    public C38048EwW mPendingConfigMsg;
    public InterfaceC38050EwY mProtectedUpdateListener;
    public List<String> mPublicFunc;
    public List<String> mSafeHost;
    public List<String> mSupportProtectedFunc;
    public Long mViewTime = 0L;
    public String mDesc = null;
    public String mCoverUrl = null;
    public Boolean allowGeolocationPermissions = Boolean.TRUE;
    public Handler mHandler = new WeakHandler(this);
    public C38270F0g mLastConfigItem = null;
    public JSONArray mSupportList = new JSONArray();

    public boolean checkMiniAppEnable(Context context) {
        return false;
    }

    public String getBridgeScheme() {
        return "bytedance";
    }

    public String getJSAppName() {
        return null;
    }

    public void onDestroy() {
        this.mContextRef = null;
        C38150EyA c38150EyA = this.mIesJsBridge;
        if (c38150EyA != null) {
            C38049EwX c38049EwX = c38150EyA.LJ;
            if (c38049EwX != null) {
                c38049EwX.LIZ = null;
                IDHandlerS19S0100000_6 iDHandlerS19S0100000_6 = c38049EwX.LJIIJ;
                if (iDHandlerS19S0100000_6 != null) {
                    iDHandlerS19S0100000_6.removeCallbacksAndMessages(null);
                }
                c38049EwX.LJI = null;
                c38049EwX.LJFF = null;
            }
            C38113ExZ c38113ExZ = c38150EyA.LJII;
            if (c38113ExZ != null) {
                c38113ExZ.LJ();
            }
            this.mIesJsBridge = null;
        }
        C38269F0f LIZIZ = C38269F0f.LIZIZ();
        List<InterfaceC38275F0l> list = LIZIZ.LIZJ;
        if (list != null && !((ArrayList) list).isEmpty()) {
            ((ArrayList) LIZIZ.LIZJ).remove(this);
        }
        this.mProtectedUpdateListener = null;
    }

    public void onGeolocationPermissionsHidePrompt() {
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public abstract void registerJavaMethod(C38150EyA c38150EyA, F0E f0e);

    public abstract void registerJavaMethodIn3WV(C38150EyA c38150EyA, F0E f0e);

    public boolean shouldDisablePermissionCheck() {
        return false;
    }

    public List<String> addPublicFunc() {
        if (this.mPublicFunc == null) {
            this.mPublicFunc = new ArrayList();
        }
        this.mPublicFunc.add("openConfig");
        this.mPublicFunc.add("config");
        this.mPublicFunc.add("appInfo");
        this.mPublicFunc.add("close");
        this.mPublicFunc.add("gallery");
        this.mPublicFunc.add("toggleGalleryBars");
        this.mPublicFunc.add("slideShow");
        this.mPublicFunc.add("relatedShow");
        this.mPublicFunc.add("toast");
        this.mPublicFunc.add("slideDownload");
        this.mPublicFunc.add("requestChangeOrientation");
        this.mPublicFunc.add("adInfo");
        return this.mPublicFunc;
    }

    public List<String> addSupportProtectedFunc() {
        if (this.mSupportProtectedFunc == null) {
            this.mSupportProtectedFunc = new ArrayList();
        }
        this.mSupportProtectedFunc.add("isAppInstalled");
        this.mSupportProtectedFunc.add("share");
        this.mSupportProtectedFunc.add("open");
        this.mSupportProtectedFunc.add("openThirdApp");
        this.mSupportProtectedFunc.add("copyToClipboard");
        return this.mSupportProtectedFunc;
    }

    public Activity getActivityCtx() {
        return UC0.LJIJJLI(this.mContextRef);
    }

    public Boolean getAllowGeolocationPermissions() {
        return this.allowGeolocationPermissions;
    }

    public BaseJsMessageHandler(Context context) {
        this.mContextRef = new WeakReference<>(context);
        C38269F0f LIZIZ = C38269F0f.LIZIZ();
        if (LIZIZ.LIZJ == null) {
            LIZIZ.LIZJ = new ArrayList();
        }
        if (!((ArrayList) LIZIZ.LIZJ).contains(this)) {
            ((ArrayList) LIZIZ.LIZJ).add(this);
        }
    }

    public static boolean INVOKESTATIC_com_ss_android_sdk_webview_BaseJsMessageHandler_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailableTwo(Context context) {
        try {
            return C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isHttpUrl(String str) {
        if (C38354F3m.LJ(str)) {
            return false;
        }
        if (!str.startsWith("http://") && !str.startsWith("https://")) {
            return false;
        }
        return true;
    }

    private void registerMethod(C38150EyA c38150EyA) {
        c38150EyA.LIZ("isAppInstalled", new F71(this.mContextRef));
        c38150EyA.LIZ("copyToClipboard", new C38274F0k());
        c38150EyA.LIZ("adInfo", new C38273F0j(this));
        c38150EyA.LIZ("getAdInfoFromAweme", new C38272F0i(this));
    }

    public void callWebGameComplete(String str) {
        invokeJsMethod("onGameComplete", str);
    }

    public void callWebGameStart(String str) {
        invokeJsMethod("onGameStart", str);
    }

    public boolean checkJsEventEnable(ValueCallback<Boolean> valueCallback) {
        C38049EwX c38049EwX;
        C38150EyA c38150EyA = this.mIesJsBridge;
        if (c38150EyA != null && (c38049EwX = c38150EyA.LJ) != null && c38049EwX.LIZ != null) {
            c38049EwX.LIZ.evaluateJavascript(C0ON.LIZJ("javascript:ToutiaoJSBridge", ".", "_handleMessageFromToutiao", "()"), new C38271F0h(valueCallback));
            return true;
        }
        return false;
    }

    public void checkLogMsg(String str) {
        if (str == null || !str.startsWith("bytedance://")) {
            return;
        }
        reportLocalEvent(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[Catch: Exception -> 0x00bd, TryCatch #0 {Exception -> 0x00bd, blocks: (B:4:0x0005, B:6:0x000b, B:8:0x0019, B:14:0x0044, B:19:0x005b, B:21:0x006b, B:22:0x006f, B:24:0x0075, B:26:0x0083, B:27:0x0086, B:29:0x008c, B:32:0x0098, B:42:0x00a0, B:35:0x00a6, B:36:0x00b2, B:40:0x00af), top: B:3:0x0005, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c A[Catch: Exception -> 0x00bd, TryCatch #0 {Exception -> 0x00bd, blocks: (B:4:0x0005, B:6:0x000b, B:8:0x0019, B:14:0x0044, B:19:0x005b, B:21:0x006b, B:22:0x006f, B:24:0x0075, B:26:0x0083, B:27:0x0086, B:29:0x008c, B:32:0x0098, B:42:0x00a0, B:35:0x00a6, B:36:0x00b2, B:40:0x00af), top: B:3:0x0005, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098 A[Catch: Exception -> 0x00bd, TryCatch #0 {Exception -> 0x00bd, blocks: (B:4:0x0005, B:6:0x000b, B:8:0x0019, B:14:0x0044, B:19:0x005b, B:21:0x006b, B:22:0x006f, B:24:0x0075, B:26:0x0083, B:27:0x0086, B:29:0x008c, B:32:0x0098, B:42:0x00a0, B:35:0x00a6, B:36:0x00b2, B:40:0x00af), top: B:3:0x0005, inners: #4 }] */
    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleMsg(android.os.Message r13) {
        /*
            r12 = this;
            int r1 = r13.what
            r0 = 1
            if (r1 != r0) goto Lbd
            java.lang.Object r1 = r13.obj     // Catch: java.lang.Exception -> Lbd
            boolean r0 = r1 instanceof android.net.Uri     // Catch: java.lang.Exception -> Lbd
            if (r0 == 0) goto Lbd
            android.net.Uri r1 = (android.net.Uri) r1     // Catch: java.lang.Exception -> Lbd
            java.lang.String r2 = "log_event"
            java.lang.String r0 = r1.getHost()     // Catch: java.lang.Exception -> Lbd
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Exception -> Lbd
            if (r0 == 0) goto Lbd
            java.lang.String r0 = "category"
            java.lang.String r4 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)     // Catch: java.lang.Exception -> Lbd
            java.lang.String r0 = "tag"
            java.lang.String r5 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)     // Catch: java.lang.Exception -> Lbd
            java.lang.String r0 = "label"
            java.lang.String r6 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)     // Catch: java.lang.Exception -> Lbd
            r9 = 0
            java.lang.String r0 = "value"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)     // Catch: java.lang.Exception -> L38
            long r7 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Exception -> L38
            goto L3a
        L38:
            r7 = 0
        L3a:
            java.lang.String r0 = "ext_value"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)     // Catch: java.lang.Exception -> L44
            long r9 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Exception -> L44
        L44:
            java.lang.String r0 = "extra"
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)     // Catch: java.lang.Exception -> Lbd
            boolean r0 = X.C38354F3m.LJ(r1)     // Catch: java.lang.Exception -> Lbd
            if (r0 != 0) goto L56
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: java.lang.Exception -> L56
            r11.<init>(r1)     // Catch: java.lang.Exception -> L56
            goto L57
        L56:
            r11 = 0
        L57:
            if (r5 == 0) goto L86
            if (r6 == 0) goto L86
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch: java.lang.Exception -> Lbd
            java.lang.String r1 = ""
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch: java.lang.Exception -> Lbd
            X.N0h r3 = X.C58704N2e.LJ(r5, r6, r2, r1, r0)     // Catch: java.lang.Exception -> Lbd
            if (r11 == 0) goto L83
            java.util.Iterator r2 = r11.keys()     // Catch: java.lang.Exception -> Lbd
        L6f:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> Lbd
            if (r0 == 0) goto L83
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> Lbd
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Lbd
            java.lang.Object r0 = r11.opt(r1)     // Catch: java.lang.Exception -> Lbd
            r3.LIZJ(r0, r1)     // Catch: java.lang.Exception -> Lbd
            goto L6f
        L83:
            r3.LJII()     // Catch: java.lang.Exception -> Lbd
        L86:
            boolean r0 = X.C58704N2e.LIZJ()     // Catch: java.lang.Exception -> Lbd
            if (r0 == 0) goto L98
            java.lang.ref.WeakReference<android.content.Context> r0 = r12.mContextRef     // Catch: java.lang.Exception -> Lbd
            java.lang.Object r3 = r0.get()     // Catch: java.lang.Exception -> Lbd
            android.content.Context r3 = (android.content.Context) r3     // Catch: java.lang.Exception -> Lbd
            X.C73040SlY.LJIIIIZZ(r3, r4, r5, r6, r7, r9, r11)     // Catch: java.lang.Exception -> Lbd
            goto Lbd
        L98:
            boolean r0 = X.C58704N2e.LIZIZ()     // Catch: java.lang.Exception -> Lbd
            if (r0 == 0) goto Lbd
            if (r11 != 0) goto La6
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lae java.lang.Exception -> Lbd
            r0.<init>()     // Catch: org.json.JSONException -> Lae java.lang.Exception -> Lbd
            r11 = r0
        La6:
            java.lang.String r1 = "_ad_staging_flag"
            java.lang.String r0 = "1"
            r11.put(r1, r0)     // Catch: org.json.JSONException -> Lae java.lang.Exception -> Lbd
            goto Lb2
        Lae:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Exception -> Lbd
        Lb2:
            java.lang.ref.WeakReference<android.content.Context> r0 = r12.mContextRef     // Catch: java.lang.Exception -> Lbd
            java.lang.Object r3 = r0.get()     // Catch: java.lang.Exception -> Lbd
            android.content.Context r3 = (android.content.Context) r3     // Catch: java.lang.Exception -> Lbd
            X.C73040SlY.LJIIIIZZ(r3, r4, r5, r6, r7, r9, r11)     // Catch: java.lang.Exception -> Lbd
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.sdk.webview.BaseJsMessageHandler.handleMsg(android.os.Message):void");
    }

    public boolean isSafeDomain(String str) {
        String str2;
        C38150EyA c38150EyA = this.mIesJsBridge;
        if (c38150EyA != null && !TextUtils.isEmpty(str)) {
            C38113ExZ c38113ExZ = c38150EyA.LJII;
            if (c38113ExZ != null) {
                o.LJI(str);
                EnumC38078Ex0 enumC38078Ex0 = null;
                if (!TextUtils.isEmpty(str)) {
                    C38060Ewi c38060Ewi = C38113ExZ.LJI;
                    if (c38060Ewi.LIZ() != null) {
                        if (TextUtils.isEmpty(null)) {
                            str2 = "host";
                        } else {
                            str2 = null;
                        }
                        C38072Ewu LIZJ = c38060Ewi.LIZ().LIZJ(str2, null);
                        if (!TextUtils.isEmpty(str)) {
                            Uri parse = UriProtector.parse(str);
                            String scheme = parse.getScheme();
                            String authority = parse.getAuthority();
                            String LIZJ2 = C38072Ewu.LIZJ(authority);
                            if (!TextUtils.isEmpty(scheme) && !TextUtils.isEmpty(authority) && LIZJ2 != null) {
                                try {
                                    List<C38075Ewx> LIZ = LIZJ.LIZ(LIZJ2);
                                    if (LIZ != null) {
                                        for (C38075Ewx c38075Ewx : LIZ) {
                                            if (c38075Ewx.LIZ.matcher(str).find() && (enumC38078Ex0 == null || c38075Ewx.LIZIZ.compareTo(enumC38078Ex0) >= 0)) {
                                                enumC38078Ex0 = c38075Ewx.LIZIZ;
                                            }
                                        }
                                    }
                                } catch (C38077Ewz unused) {
                                }
                            }
                        }
                        String authority2 = UriProtector.parse(str).getAuthority();
                        if (enumC38078Ex0 == null) {
                            if (!TextUtils.isEmpty(authority2)) {
                                for (String str3 : c38113ExZ.LIZ.LJII.LIZIZ.LIZ) {
                                    if (!authority2.equals(str3)) {
                                        StringBuilder LIZ2 = X1D.LIZ();
                                        LIZ2.append(".");
                                        LIZ2.append(str3);
                                        if (authority2.endsWith(X1D.LIZIZ(LIZ2))) {
                                        }
                                    }
                                    enumC38078Ex0 = EnumC38078Ex0.PRIVATE;
                                }
                            }
                        }
                        if (enumC38078Ex0 != null && EnumC38078Ex0.PUBLIC != enumC38078Ex0) {
                            return true;
                        }
                    }
                }
            } else {
                C38049EwX c38049EwX = c38150EyA.LJ;
                if (c38049EwX != null) {
                    return c38049EwX.LJFF(str);
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC38047EwV
    public boolean needUpdateConfig(C38048EwW c38048EwW) {
        if (c38048EwW != null && "call".equals(c38048EwW.LIZ) && "config".equals(c38048EwW.LIZJ) && !C38354F3m.LJ(c38048EwW.LIZIZ)) {
            return true;
        }
        return false;
    }

    public void putAdInfo(JSONObject jSONObject) {
        int i;
        if (TextUtils.equals(this.hasAdInfoJson, "1") && !TextUtils.isEmpty(this.mAdInfoJson)) {
            JSONObject jSONObject2 = new JSONObject(this.mAdInfoJson);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.opt(next));
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    return;
                }
            }
            return;
        }
        jSONObject.put("cid", this.mAdCId);
        jSONObject.put("group_id", this.mGroupId);
        jSONObject.put("ad_type", this.mAdSystemOrigin);
        jSONObject.put("log_extra", this.mLogExtra);
        jSONObject.put("download_url", this.mDownloadUrl);
        jSONObject.put("package_name", this.mPackageName);
        jSONObject.put("app_name", this.mAppName);
        if (this.mAdCId == 0) {
            i = 0;
        } else {
            i = 1;
        }
        jSONObject.put("code", i);
        jSONObject.put("land_page_data", this.mLandingPageInfo);
    }

    @Override // X.InterfaceC38276F0m
    public void putAdInfoFromAweme(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("creative_id", this.mCreativeId);
                jSONObject.put("ad_id", this.mAdId);
                jSONObject.put("item_id", this.mItemId);
                jSONObject.put("advertiser_id", this.mAdvId);
                jSONObject.put("desc", this.mDesc);
                jSONObject.put("view_time", this.mViewTime);
                jSONObject.put("cover_url", this.mCoverUrl);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public boolean reportLocalEvent(String str) {
        boolean z = false;
        if (C38354F3m.LJ(str)) {
            return false;
        }
        try {
            Uri parse = UriProtector.parse(str);
            if (!"log_event".equals(parse.getHost())) {
                return false;
            }
            z = true;
            Message obtainMessage = this.mHandler.obtainMessage(1);
            obtainMessage.obj = parse;
            this.mHandler.sendMessage(obtainMessage);
            return true;
        } catch (Exception unused) {
            return z;
        }
    }

    public void setAllowGeolocationPermissions(Boolean bool) {
        this.allowGeolocationPermissions = bool;
    }

    public void setAppName(String str) {
        this.mAppName = str;
    }

    public void setGroupId(long j) {
        this.mGroupId = j;
    }

    public void setPackageName(String str) {
        this.mPackageName = str;
    }

    private void invokeJsMethod(String method, String... params) {
        C38150EyA c38150EyA = this.mIesJsBridge;
        if (c38150EyA != null) {
            c38150EyA.getClass();
            o.LJIIIZ(method, "method");
            o.LJIIIZ(params, "params");
            C38049EwX c38049EwX = c38150EyA.LJ;
            if (c38049EwX != null) {
                String[] strArr = (String[]) Arrays.copyOf(params, params.length);
                StringBuilder LIZIZ = C07780Sg.LIZIZ("javascript:", method, "(");
                if (strArr != null) {
                    for (int i = 0; i < strArr.length; i++) {
                        LIZIZ.append(strArr[0]);
                        if (i < strArr.length - 1) {
                            LIZIZ.append(",");
                        }
                    }
                }
                LIZIZ.append(")");
                if (c38049EwX.LIZ != null) {
                    C38053Ewb.LIZ(c38049EwX.LIZ, LIZIZ.toString());
                }
            }
        }
    }

    public void callWebGameDownloadProgress(String str, int i) {
        invokeJsMethod("onGameProgress", str, String.valueOf(i));
    }

    public List<String> getSafeHost(List<String> list, boolean z) {
        if (this.mSafeHost == null) {
            this.mSafeHost = new ArrayList();
        }
        return this.mSafeHost;
    }

    public void sendEventMsg(String str, JSONObject jSONObject) {
        C38049EwX c38049EwX;
        C38150EyA c38150EyA = this.mIesJsBridge;
        if (c38150EyA != null && (c38049EwX = c38150EyA.LJ) != null) {
            c38049EwX.LJIIIIZZ(str, jSONObject);
        }
    }

    public void setIesJsBridge(C38150EyA c38150EyA, F0E f0e) {
        this.mIesJsBridge = c38150EyA;
        if (c38150EyA != null) {
            registerMethod(c38150EyA);
            registerJavaMethod(this.mIesJsBridge, f0e);
        }
    }

    public void setIesJsBridgeIn3WV(C38150EyA c38150EyA, F0E f0e) {
        this.mIesJsBridge = c38150EyA;
        if (c38150EyA != null) {
            c38150EyA.LIZ("adInfo", new C38273F0j(this));
            registerJavaMethodIn3WV(this.mIesJsBridge, f0e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        if (r10 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c2, code lost:
    
        if (r15 < 1200000) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00da, code lost:
    
        if (r14 != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void config(X.C38048EwW r20, org.json.JSONObject r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.sdk.webview.BaseJsMessageHandler.config(X.EwW, org.json.JSONObject, java.lang.String):void");
    }

    @Override // X.InterfaceC38275F0l
    public void onJsConfigLoaded(String str, C38270F0g c38270F0g, String str2) {
        String str3;
        int i;
        List<String> list;
        WebView webView;
        if (str == null || !str.equals(this.mPendingConfigKey) || this.mPendingConfigMsg == null) {
            return;
        }
        C38150EyA c38150EyA = this.mIesJsBridge;
        if (c38150EyA != null && (webView = c38150EyA.LIZ) != null) {
            str3 = webView.getUrl();
        } else {
            str3 = null;
        }
        if (!C38354F3m.LJ(str3) && isHttpUrl(str3)) {
            try {
                String host = UriProtector.parse(str3).getHost();
                if (host == null || !host.equals(str2)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                if (c38270F0g != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject.put("code", i);
                if (c38270F0g == null) {
                    list = null;
                } else {
                    list = c38270F0g.LIZIZ;
                }
                InterfaceC38050EwY interfaceC38050EwY = this.mProtectedUpdateListener;
                if (interfaceC38050EwY != null) {
                    interfaceC38050EwY.LIZ(list, this.mPendingConfigMsg, jSONObject);
                }
                this.mLastConfigItem = c38270F0g;
                this.mPendingConfigKey = null;
                this.mPendingConfigMsg = null;
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.InterfaceC38047EwV
    public void updateProtectedFunc(C38048EwW c38048EwW, JSONObject jSONObject, String str, InterfaceC38050EwY interfaceC38050EwY) {
        try {
            this.mProtectedUpdateListener = interfaceC38050EwY;
            if (interfaceC38050EwY != null) {
                config(c38048EwW, jSONObject, str);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public void setAdInfoFromAweme(String str, String str2, String str3, String str4, String str5, long j, String str6) {
        this.mCreativeId = str;
        this.mAdId = str2;
        this.mItemId = str3;
        this.mAdvId = str4;
        this.mDesc = str5;
        this.mViewTime = Long.valueOf(j);
        this.mCoverUrl = str6;
    }

    public void setAdInfo(long j, String str, int i, String str2, String str3, String str4, String str5, String str6) {
        this.mAdCId = j;
        this.mAdType = str;
        this.mAdSystemOrigin = i;
        this.mLogExtra = str2;
        this.mDownloadUrl = str3;
        this.hasAdInfoJson = str4;
        this.mAdInfoJson = str5;
        this.mLandingPageInfo = str6;
    }
}
