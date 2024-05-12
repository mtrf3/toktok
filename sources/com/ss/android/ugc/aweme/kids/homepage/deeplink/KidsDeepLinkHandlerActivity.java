package com.ss.android.ugc.aweme.kids.homepage.deeplink;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C26045AKb;
import X.C38354F3m;
import X.C40338FsM;
import X.C40397FtJ;
import X.C84763XOl;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class KidsDeepLinkHandlerActivity extends ActivityC86117Xqz {
    public static final C40338FsM Companion = new C40338FsM();
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public String gdLabel = "";
    public boolean isOpenAwemeDetail;
    public boolean mNoMatched;
    public Uri mUri;

    @Override // X.ActivityC86117Xqz, X.KMV
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void com_ss_android_ugc_aweme_kids_homepage_deeplink_KidsDeepLinkHandlerActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // X.KMV, X.JBS
    public /* bridge */ /* synthetic */ void onBeforeActivityCreated(Activity activity) {
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStop() {
        com_ss_android_ugc_aweme_kids_homepage_deeplink_KidsDeepLinkHandlerActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mNoMatched = false;
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStart() {
        super.onStart();
        finish();
    }

    public final boolean getMNoMatched() {
        return this.mNoMatched;
    }

    public final Uri getMUri() {
        return this.mUri;
    }

    public static void com_ss_android_ugc_aweme_kids_homepage_deeplink_KidsDeepLinkHandlerActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(KidsDeepLinkHandlerActivity kidsDeepLinkHandlerActivity) {
        kidsDeepLinkHandlerActivity.com_ss_android_ugc_aweme_kids_homepage_deeplink_KidsDeepLinkHandlerActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                kidsDeepLinkHandlerActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    public static void com_ss_android_ugc_aweme_kids_homepage_deeplink_KidsDeepLinkHandlerActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(KidsDeepLinkHandlerActivity kidsDeepLinkHandlerActivity) {
        com_ss_android_ugc_aweme_kids_homepage_deeplink_KidsDeepLinkHandlerActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(kidsDeepLinkHandlerActivity);
        try {
            kidsDeepLinkHandlerActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }

    private final boolean parseUri(Intent intent) {
        if (intent == null) {
            return false;
        }
        String action = intent.getAction();
        if (!C38354F3m.LJ(action)) {
            o.LJI(action);
            if (s.LJJLIIIJL(action, "com.ss.android.sdk.", 0, false, 6) == 0) {
                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "open_url");
                if (!C38354F3m.LJ(LLJJIJIIJIL)) {
                    try {
                        this.mUri = UriProtector.parse(LLJJIJIIJIL);
                    } catch (Exception unused) {
                        return false;
                    }
                }
            }
        }
        if (this.mUri == null) {
            this.mUri = intent.getData();
        }
        Uri uri = this.mUri;
        if (uri == null || uri.isOpaque()) {
            return false;
        }
        return true;
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        activityConfiguration(C40397FtJ.LJLIL);
        super.onCreate(bundle);
        C84763XOl.LJIIJ(this);
        Intent intent = getIntent();
        if (!parseUri(intent)) {
            if (!isFinishing()) {
                finish();
                return;
            }
            return;
        }
        Uri data = intent.getData();
        if (data != null && UriProtector.getQueryParameter(data, "gd_label") != null) {
            String queryParameter = UriProtector.getQueryParameter(data, "gd_label");
            o.LJI(queryParameter);
            this.gdLabel = queryParameter;
        }
        SmartRouter.buildRoute(this, "//kids/main").open();
        if (TextUtils.equals("amazon_alexa", this.gdLabel) || TextUtils.equals("google_assistant", this.gdLabel)) {
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIZ(getResources().getString(R.string.ef8));
            c26045AKb.LIZ(true);
            c26045AKb.LJIIJ();
        }
    }

    public final void setMNoMatched(boolean z) {
        this.mNoMatched = z;
    }

    public final void setMUri(Uri uri) {
        this.mUri = uri;
    }

    @Override // X.ActivityC86117Xqz, X.C29S, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        try {
            super.setTheme(i);
        } catch (Exception unused) {
        }
    }
}
