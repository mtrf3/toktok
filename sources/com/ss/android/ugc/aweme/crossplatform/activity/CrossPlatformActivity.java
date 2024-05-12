package com.ss.android.ugc.aweme.crossplatform.activity;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C25741A8j;
import X.C2U8;
import X.C38891fp;
import X.C40101FoX;
import X.C40329FsD;
import X.C54352LUu;
import X.C54353LUv;
import X.C56232Ip;
import X.C59082NGs;
import X.C59308NPk;
import X.C59314NPq;
import X.C59315NPr;
import X.C59592Na8;
import X.C59594NaA;
import X.C59612NaS;
import X.C60003Ngl;
import X.C60058Nhe;
import X.C65803Ps7;
import X.C72818Shy;
import X.C76052yf;
import X.C774832i;
import X.C78939UyV;
import X.C86298Xtu;
import X.C9UE;
import X.EF7;
import X.F15;
import X.FMX;
import X.FUA;
import X.InterfaceC27436Apk;
import X.InterfaceC53944LFc;
import X.KL2;
import X.OFH;
import X.OGB;
import X.QD3;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.crossplatform.view.WebViewFrameLayout;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class CrossPlatformActivity extends ActivityC86117Xqz implements OGB {
    public static long LJLL;
    public static final /* synthetic */ int LJLLI = 0;
    public MixActivityContainer LJLIL;
    public C59314NPq LJLILLLLZI;
    public InterfaceC27436Apk LJLJI;
    public boolean LJLJJI = true;
    public C60003Ngl LJLJJL;
    public long LJLJJLL;
    public C40329FsD LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz
    public final void dismissCustomToast() {
        C60003Ngl c60003Ngl = this.LJLJJL;
        if (c60003Ngl != null) {
            c60003Ngl.LIZ();
        }
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        if (!this.LJLJJI) {
            return;
        }
        C9UE.LIZIZ(this);
        super.finish();
        if (!this.LJLJLJ) {
            C59314NPq c59314NPq = this.LJLILLLLZI;
            if (c59314NPq != null) {
                if (c59314NPq.LIZJ.LJIILIIL) {
                    super.overridePendingTransition(0, R.anim.ag);
                } else if (c59314NPq.LIZJ.LIZ) {
                    if (this.LJLJLLL) {
                        super.overridePendingTransition(0, R.anim.ag);
                    } else {
                        super.overridePendingTransition(0, 0);
                    }
                }
            }
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                super.overridePendingTransition(R.anim.fv, R.anim.g0);
            } else {
                super.overridePendingTransition(R.anim.ft, R.anim.g2);
            }
        }
        MixActivityContainer mixActivityContainer = this.LJLIL;
        if (mixActivityContainer != null) {
            C78939UyV.LJJJJ(mixActivityContainer.LJLIL);
        }
        C59082NGs.LIZ = null;
        EventBus.LIZJ().LJIILL(C59594NaA.class);
        if (getWindow() != null && getWindow().getDecorView() != null) {
            Object tag = getWindow().getDecorView().getTag(R.id.bfk);
            if ((tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
                String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(this.LJLILLLLZI.LIZ.LIZJ), "__spark_session_id");
                if (!TextUtils.isEmpty(queryParameter)) {
                    C40101FoX.LIZJ(queryParameter, this.LJLILLLLZI.LJFF);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r4.LIZIZ == 1) goto L15;
     */
    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBackPressed() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer r1 = r7.LJLIL
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer
            r6 = 0
            if (r0 == 0) goto Lf
            r0 = 0
            boolean r0 = r1.LJIJI(r0, r6)
            if (r0 == 0) goto Lf
            return
        Lf:
            com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer r0 = r7.LJLIL
            if (r0 == 0) goto L44
            boolean r0 = r7.LJLJJI
            if (r0 == 0) goto L44
            r5 = 1
            r7.LJLJLLL = r5
            X.FsD r4 = r7.LJLJL
            if (r4 == 0) goto L45
            com.ss.android.ugc.aweme.fe.method.OnBackPressedMethod r3 = r4.LIZ
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r1 = 3
            java.lang.String r0 = "onBackPressed_event"
            r3.sendEvent(r0, r2, r1)
            int r0 = r4.LIZIZ
            if (r0 != r5) goto L45
        L2f:
            X.NPq r0 = r7.LJLILLLLZI
            if (r0 == 0) goto L44
            X.NPk r0 = r0.LIZ
            java.lang.String r1 = r0.LIZJ
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L44
            com.ss.android.ugc.aweme.specact.api.ISpecActService r0 = com.ss.android.ugc.aweme.specact.SpecActServiceImpl.LJJJIL()
            r0.LJIILLIIL(r1)
        L44:
            return
        L45:
            com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer r1 = r7.LJLIL
            X.NPq r0 = r1.LJLILLLLZI
            X.NPk r0 = r0.LIZ
            java.lang.Integer r0 = r0.LIZ
            int r0 = r0.intValue()
            if (r0 != r5) goto L5b
            java.lang.String r0 = "phone_press"
            r1.LJZ = r0
            r1.LJJI(r6)
            goto L2f
        L5b:
            boolean r0 = r1.canGoBack()
            if (r0 != 0) goto L2f
            java.lang.Runnable r0 = r1.LJLJLLL
            if (r0 == 0) goto L2f
            r0.run()
            java.lang.String r0 = "full_screen_system_click"
            r1.LJLJLJ = r0
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.onBackPressed():void");
    }

    public final boolean LLFZ() {
        if (isDestroyed()) {
            return false;
        }
        if (this.LJLJJL == null) {
            this.LJLJJL = new C60003Ngl(this);
            return true;
        }
        return true;
    }

    public final String LLII() {
        return C59315NPr.LIZ(getIntent().getData(), getIntent(), this.LJLILLLLZI);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        String str;
        String str2;
        C59308NPk c59308NPk;
        C65803Ps7.LIZIZ(this);
        long currentTimeMillis = System.currentTimeMillis() - this.LJLJJLL;
        this.LJLJJLL = currentTimeMillis;
        C2U8.LIZ(new C59592Na8(Long.valueOf(currentTimeMillis)));
        C2U8.LIZ(new C25741A8j(this.LJLJJLL));
        OFH ofh = OFH.LIZLLL;
        String str3 = this.LJLILLLLZI.LJFF;
        ofh.getClass();
        OFH.LJII(str3);
        C59314NPq c59314NPq = this.LJLILLLLZI;
        if (c59314NPq != null && c59314NPq.LIZ != null) {
            C774832i LIZ = C774832i.LIZ();
            String str4 = this.LJLILLLLZI.LIZ.LIZJ;
            LIZ.getClass();
            String LIZIZ = C774832i.LIZIZ(str4);
            if (LIZIZ != null) {
                ((HashMap) LIZ.LIZ).remove(LIZIZ);
            }
        }
        final C54352LUu LIZLLL = C54352LUu.LIZLLL();
        C59314NPq c59314NPq2 = this.LJLILLLLZI;
        LIZLLL.getClass();
        if (c59314NPq2 != null) {
            String str5 = c59314NPq2.LIZ.LIZJ;
            if (!TextUtils.isEmpty(str5)) {
                synchronized (LIZLLL.LJ) {
                    if (Build.VERSION.SDK_INT >= 23 && !LIZLLL.LIZIZ(str5) && ((ArrayList) LIZLLL.LIZ).size() < LIZLLL.LIZLLL) {
                        C16880lQ.LJLI(EF7.LIZIZ().getMainLooper().getQueue(), new MessageQueue.IdleHandler() { // from class: X.LUt
                            @Override // android.os.MessageQueue.IdleHandler
                            public final boolean queueIdle() {
                                C54352LUu c54352LUu = C54352LUu.this;
                                c54352LUu.getClass();
                                SystemClock.uptimeMillis();
                                synchronized (c54352LUu.LJ) {
                                    for (int i = 0; i < c54352LUu.LIZLLL - ((ArrayList) c54352LUu.LIZ).size(); i++) {
                                        ((ArrayList) c54352LUu.LIZ).add(new C59613NaT(new MutableContextWrapper(EF7.LIZIZ())));
                                    }
                                }
                                SystemClock.uptimeMillis();
                                return false;
                            }
                        });
                    }
                }
            }
        }
        C54353LUv.LIZLLL().LIZ(this.LJLILLLLZI);
        super.onDestroy();
        C60003Ngl c60003Ngl = this.LJLJJL;
        if (c60003Ngl != null && !c60003Ngl.LJ && !c60003Ngl.LJFF) {
            c60003Ngl.LJI.removeCallbacks(c60003Ngl.LJII);
            c60003Ngl.LIZ();
            c60003Ngl.LJ = true;
        }
        C59314NPq c59314NPq3 = this.LJLILLLLZI;
        if (c59314NPq3 != null && (c59308NPk = c59314NPq3.LIZ) != null) {
            str = c59308NPk.LIZJ;
            str2 = c59308NPk.LJIIIZ;
        } else {
            str = null;
            str2 = null;
        }
        C2U8.LIZ(new C56232Ip(str2));
        EventBus.LIZJ().LJIJ(this);
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
        long currentTimeMillis2 = System.currentTimeMillis();
        new F15();
        C72818Shy.LIZ(new C76052yf(currentTimeMillis2, F15.LIZLLL(hashMap), "ad_webview_close"));
        if (this.LJLILLLLZI.LIZLLL.LIZJ != null) {
            try {
                JSONObject jSONObject = new JSONObject(this.LJLILLLLZI.LIZLLL.LIZJ);
                jSONObject.put("duration", System.currentTimeMillis() - LJLL);
                FMX.LJIILJJIL("anchor_stay_time", jSONObject);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
        C60003Ngl c60003Ngl = this.LJLJJL;
        if (c60003Ngl == null || c60003Ngl.LJ || c60003Ngl.LJFF) {
            return;
        }
        c60003Ngl.LJI.removeCallbacks(c60003Ngl.LJII);
        c60003Ngl.LIZ();
        c60003Ngl.LJFF = true;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onResume", true);
        super.onResume();
        C60003Ngl c60003Ngl = this.LJLJJL;
        if (c60003Ngl != null) {
            c60003Ngl.LJFF = false;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MixActivityContainer mixActivityContainer = this.LJLIL;
        if (mixActivityContainer != null) {
            InterfaceC53944LFc interfaceC53944LFc = mixActivityContainer.LLFFF;
            if ((interfaceC53944LFc != null && interfaceC53944LFc.LJIIJJI()) || mixActivityContainer.LJLILLLLZI.LIZJ.LJJIIJ) {
                return;
            }
            mixActivityContainer.LJLLLLLL.setLayoutParams(new FrameLayout.LayoutParams(Double.valueOf(KL2.LIZJ(mixActivityContainer.LJLIL, configuration.screenWidthDp)).intValue(), Double.valueOf(KL2.LIZJ(mixActivityContainer.LJLIL, configuration.screenHeightDp)).intValue()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0260  */
    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.onCreate(android.os.Bundle):void");
    }

    @QD3
    public void onEvent(C60058Nhe c60058Nhe) {
        MixActivityContainer mixActivityContainer = this.LJLIL;
        if ((mixActivityContainer instanceof MixActivityContainer) && mixActivityContainer.LJIJI(null, false)) {
            return;
        }
        finish();
    }

    @Override // X.OGB
    public final void setActivityResultListener(InterfaceC27436Apk interfaceC27436Apk) {
        this.LJLJI = interfaceC27436Apk;
    }

    @Override // X.ActivityC86117Xqz
    public final void showCustomToast(String str) {
        if (!LLFZ()) {
            return;
        }
        this.LJLJJL.LIZIZ(0, LiveNetAdaptiveHurryTimeSetting.DEFAULT, str);
    }

    public static void LLIIIILZ(long j, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("webViewPoolIsCache", z);
            jSONObject.put("webViewPoolCostTime", j);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        FUA.LIZIZ("service_monitor", "webview_pool_cache", jSONObject);
    }

    @Override // X.ActivityC86117Xqz, X.KL3
    public final void showCustomLongToast(int i, String str) {
        if (!LLFZ()) {
            return;
        }
        this.LJLJJL.LIZIZ(i, 3500, str);
    }

    @Override // X.ActivityC86117Xqz
    public final void showCustomToast(int i, String str) {
        if (!LLFZ()) {
            return;
        }
        this.LJLJJL.LIZIZ(i, LiveNetAdaptiveHurryTimeSetting.DEFAULT, str);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        super.startActivity(intent, bundle);
        MixActivityContainer mixActivityContainer = this.LJLIL;
        if (mixActivityContainer != null) {
            mixActivityContainer.LJLJJLL.LJIIIIZZ();
        }
    }

    public final WebViewFrameLayout LLFII(String str, Context context, AttributeSet attributeSet) {
        boolean z;
        C54353LUv LIZLLL = C54353LUv.LIZLLL();
        C59314NPq c59314NPq = this.LJLILLLLZI;
        LIZLLL.getClass();
        if (c59314NPq != null) {
            String str2 = c59314NPq.LIZ.LIZJ;
            if (!TextUtils.isEmpty(str2) && !LIZLLL.LIZIZ(str2)) {
                if (!e1.LIZ(31744, "enable_webview_cache", true, false) && !C54353LUv.LJ() && !str2.contains("need_webview_pool=1")) {
                    if (!C38891fp.LJJI(LIZLLL.LJFF)) {
                        Iterator<String> it = LIZLLL.LJFF.iterator();
                        while (it.hasNext()) {
                            if (str2.contains(it.next())) {
                            }
                        }
                    }
                }
                z = true;
                C59612NaS c59612NaS = null;
                if (z || !TextUtils.equals(str, "com.ss.android.ugc.aweme.crossplatform.view.WebViewFrameLayout")) {
                    return null;
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                WebViewFrameLayout webViewFrameLayout = new WebViewFrameLayout(context, attributeSet);
                C54353LUv LIZLLL2 = C54353LUv.LIZLLL();
                if (Build.VERSION.SDK_INT < 23 || (C38891fp.LJJI(LIZLLL2.LJFF) && !e1.LIZ(31744, "enable_webview_cache", true, false) && !C54353LUv.LJ())) {
                    LIZLLL2.getClass();
                } else {
                    synchronized (LIZLLL2.LJ) {
                        if (((ArrayList) LIZLLL2.LIZ).size() > 0) {
                            c59612NaS = (C59612NaS) ((ArrayList) LIZLLL2.LIZ).get(0);
                            ((ArrayList) LIZLLL2.LIZ).remove(0);
                            if (c59612NaS != null) {
                                Context context2 = c59612NaS.getContext();
                                if (context2 instanceof MutableContextWrapper) {
                                    ((MutableContextWrapper) context2).setBaseContext(this);
                                }
                                c59612NaS.initWeb(this);
                            }
                        }
                    }
                    if (c59612NaS != null) {
                        LLIIIILZ(SystemClock.uptimeMillis() - uptimeMillis, true);
                        webViewFrameLayout.setId(R.id.nig);
                        webViewFrameLayout.addView(c59612NaS, new FrameLayout.LayoutParams(-1, -1));
                        return webViewFrameLayout;
                    }
                }
                c59612NaS = new C59612NaS(this, attributeSet);
                LLIIIILZ(SystemClock.uptimeMillis() - uptimeMillis, false);
                webViewFrameLayout.setId(R.id.nig);
                webViewFrameLayout.addView(c59612NaS, new FrameLayout.LayoutParams(-1, -1));
                return webViewFrameLayout;
            }
        }
        z = false;
        C59612NaS c59612NaS2 = null;
        if (z) {
        }
        return null;
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InterfaceC27436Apk interfaceC27436Apk = this.LJLJI;
        if (interfaceC27436Apk != null) {
            interfaceC27436Apk.onActivityResult(i, i2, intent);
        }
        MixActivityContainer mixActivityContainer = this.LJLIL;
        if (mixActivityContainer != null) {
            mixActivityContainer.onActivityResult(i, i2, intent);
        }
    }

    @Override // X.ActivityC45651qj, android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, X.C06Q
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C86298Xtu.LIZIZ(this, i, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // X.ActivityC86117Xqz
    public final void showCustomToast(String str, int i, int i2) {
        if (!LLFZ()) {
            return;
        }
        this.LJLJJL.LIZIZ(0, i, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6 A[RETURN] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.ss.android.ugc.aweme.crossplatform.view.WebViewFrameLayout, android.view.View, android.view.ViewGroup] */
    @Override // X.ActivityC45651qj, android.app.Activity, android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // X.ActivityC86117Xqz, X.KL3
    public final void showCustomToast(int i, String str, int i2, int i3) {
        if (!LLFZ()) {
            return;
        }
        this.LJLJJL.LIZIZ(i, i2, str);
    }
}
