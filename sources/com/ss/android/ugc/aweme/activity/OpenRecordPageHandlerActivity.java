package com.ss.android.ugc.aweme.activity;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C65803Ps7;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.sticker.AddYoursStickerRecordServiceImpl;
import com.ss.android.ugc.aweme.tools.sticker.IAddYoursStickerRecordService;
import com.ss.ugc.aweme.creation.base.AddYoursModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class OpenRecordPageHandlerActivity extends ActivityC86117Xqz {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public boolean needStartRecord;

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

    public void com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // X.KMV, X.JBS
    public /* bridge */ /* synthetic */ void onBeforeActivityCreated(Activity activity) {
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStop() {
        C65803Ps7.LJFF(this);
        com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.activity.OpenRecordPageHandlerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        overridePendingTransition(0, 0);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.activity.OpenRecordPageHandlerActivity", "onResume", true);
        super.onResume();
        if (!this.needStartRecord) {
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.activity.OpenRecordPageHandlerActivity", "onResume", false);
            return;
        }
        this.needStartRecord = false;
        try {
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "extar_start_creation_type");
            if (LLJJIJIIJIL == null || LLJJIJIIJIL.hashCode() != 1388698267 || !LLJJIJIIJIL.equals("start_ay_record")) {
                exitPage();
            } else {
                AddYoursModel addYoursModel = (AddYoursModel) getIntent().getParcelableExtra("extar_add_yours_params");
                if (addYoursModel == null) {
                    exitPage();
                    ActivityAgent.onTrace("com.ss.android.ugc.aweme.activity.OpenRecordPageHandlerActivity", "onResume", false);
                    return;
                }
                startAYRecord(addYoursModel);
            }
        } catch (Exception unused) {
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.activity.OpenRecordPageHandlerActivity", "onResume", false);
    }

    private final void exitPage() {
        finish();
    }

    public static void com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(OpenRecordPageHandlerActivity openRecordPageHandlerActivity) {
        openRecordPageHandlerActivity.com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                openRecordPageHandlerActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    public static void com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(OpenRecordPageHandlerActivity openRecordPageHandlerActivity) {
        com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(openRecordPageHandlerActivity);
        try {
            openRecordPageHandlerActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }

    private final void startAYRecord(AddYoursModel addYoursModel) {
        IAddYoursStickerRecordService LIZIZ = AddYoursStickerRecordServiceImpl.LIZIZ();
        String ayEnterMethod = addYoursModel.getAyEnterMethod();
        if (ayEnterMethod == null) {
            ayEnterMethod = "H5";
        }
        LIZIZ.LIZ(this, null, new AddYourRecordParam(null, false, false, "H5", "add_yours", ayEnterMethod, null, true, false, null, addYoursModel.getAyTopicId(), null, 2048, null)).LIZIZ();
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.activity.OpenRecordPageHandlerActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        this.needStartRecord = true;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.activity.OpenRecordPageHandlerActivity", "onCreate", false);
    }
}
