package com.zhiliaoapp.musically.openauthorize;

import X.ActivityC61947OSx;
import X.C65803Ps7;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AwemeAuthorizedActivity extends ActivityC61947OSx {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    @Override // X.ActivityC61947OSx, X.ActivityC86117Xqz, X.KMV
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // X.ActivityC61947OSx, X.ActivityC86117Xqz, X.KMV
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

    public void com_zhiliaoapp_musically_openauthorize_AwemeAuthorizedActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // X.KMV, X.JBS
    public /* bridge */ /* synthetic */ void onBeforeActivityCreated(Activity activity) {
    }

    @Override // X.ActivityC61947OSx, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStop() {
        C65803Ps7.LJFF(this);
        com_zhiliaoapp_musically_openauthorize_AwemeAuthorizedActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    public static void com_zhiliaoapp_musically_openauthorize_AwemeAuthorizedActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(AwemeAuthorizedActivity awemeAuthorizedActivity) {
        awemeAuthorizedActivity.com_zhiliaoapp_musically_openauthorize_AwemeAuthorizedActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                awemeAuthorizedActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    public static void com_zhiliaoapp_musically_openauthorize_AwemeAuthorizedActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(AwemeAuthorizedActivity awemeAuthorizedActivity) {
        com_zhiliaoapp_musically_openauthorize_AwemeAuthorizedActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(awemeAuthorizedActivity);
        try {
            awemeAuthorizedActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }

    @Override // X.ActivityC61947OSx, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
    }
}
