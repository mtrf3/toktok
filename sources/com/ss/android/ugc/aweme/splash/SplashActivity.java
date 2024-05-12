package com.ss.android.ugc.aweme.splash;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C158056If;
import X.C16880lQ;
import X.C2YJ;
import X.C36093EEn;
import X.C36922EeM;
import X.C38752FIu;
import X.C38995FSd;
import X.C40328FsC;
import X.C48236IwS;
import X.C56662Kg;
import X.C61017Nx7;
import X.C73040SlY;
import X.C78598Ut0;
import X.C79004UzY;
import X.EF7;
import X.EI0;
import X.EnumC62512cp;
import X.F9J;
import X.FIP;
import X.FJU;
import X.FMX;
import X.FWS;
import X.FWT;
import X.FWW;
import X.InterfaceC62984Onk;
import X.LNZ;
import X.WX6;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.launcher.serviceimpl.crashsdk.CrashSdkImpl;
import com.ss.android.ugc.aweme.legoImp.task.UploadInstallEventTask;
import com.ss.android.ugc.aweme.legoImp.task.UploadSysStatusTask;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes7.dex */
public class SplashActivity extends ActivityC45651qj implements WeakHandler.IHandler, InterfaceC62984Onk {
    public static EnumC62512cp sConfirmWelcomeType = EnumC62512cp.FULL_SCREEN_WELCOME;
    public static boolean sShowWelcomeCheckBox;
    public boolean isFirstShow;
    public boolean mDirectlyGoMain;
    public boolean mInited;
    public boolean mJumped;
    public boolean mTrackSession;
    public volatile boolean mAlive = true;
    public boolean mFirstResume = true;
    public boolean mAllowAd = true;
    public final Handler mHandler = new WeakHandler(this);
    public Dialog mDialog = null;
    public FWT mSubmitPreloadHelper = new FWT();

    public void doInit() {
    }

    @Override // X.InterfaceC62984Onk
    public boolean getCanCollectConsent() {
        return false;
    }

    public void goMainActivity() {
        goMainActivity(null);
    }

    public boolean isSplashShowing() {
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    public void onDialogShowOrDismiss(DialogInterface dialogInterface, boolean z) {
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public void onResume() {
        Bundle LLJJIJI;
        C56662Kg.LIZ().LIZLLL = false;
        super.onResume();
        if (this.mDirectlyGoMain) {
            goMainActivity();
            return;
        }
        Intent intent = getIntent();
        if (!this.mFirstResume || this.mJumped) {
            return;
        }
        this.mFirstResume = false;
        if (intent != null && (LLJJIJI = C16880lQ.LLJJIJI(intent)) != null && LLJJIJI.getBoolean("from_notification")) {
            C73040SlY.LJII(this, "more_tab", "notify_click");
            C73040SlY.LJII(this, "apn", "recall");
        }
        if (!quickLaunch()) {
            return;
        }
        goMainActivity();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public void onStop() {
        com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    public boolean quickLaunch() {
        return false;
    }

    public void tryShowShortCutDlg() {
        C56662Kg.LIZ().LIZJ("method_splash_try_show_ad_duration", false);
        tryShowAdAndGoNext();
        C56662Kg.LIZ().LJFF("method_splash_try_show_ad_duration", false);
    }

    public static boolean enableSplashLaunchFix() {
        try {
            return C2YJ.LIZIZ.LIZ.getEnableSplashLaunchFix().booleanValue();
        } catch (C158056If unused) {
            return true;
        }
    }

    private void mobLaunchMob() {
        try {
            Intent intent = getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                boolean booleanExtra = getIntent().getBooleanExtra("from_notification", false);
                String queryParameter = data != null ? UriProtector.getQueryParameter(data, "gd_label") : "";
                if (booleanExtra || queryParameter != null) {
                    FWS.LIZ().LIZIZ = false;
                    return;
                }
            }
            MobClick obtain = MobClick.obtain();
            obtain.setEventName("launch_app");
            obtain.setLabelName("enter_launch");
            FMX.onEvent(obtain);
            FWS.LIZ().LIZIZ = false;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    private void submitPreload() {
        this.mSubmitPreloadHelper.getClass();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.mHandler.removeMessages(100);
        this.mAlive = false;
        super.onDestroy();
    }

    public void tryInit() {
        if (!this.mInited) {
            doInit();
            this.mInited = true;
        }
    }

    private void hotStartIntercept() {
        if (!isHotStart()) {
            return;
        }
        FIP.LIZIZ.LIZIZ();
    }

    private boolean isHotStart() {
        Intent intent = getIntent();
        if (isTaskRoot() && intent != null && intent.hasCategory("android.intent.category.LAUNCHER") && "android.intent.action.MAIN".equals(intent.getAction())) {
            return true;
        }
        return false;
    }

    private void reportLaunchTime() {
        long currentTimeMillis = System.currentTimeMillis() - C56662Kg.LIZ().LJIIJ;
        int LIZ = C38752FIu.LIZ();
        AwemeAppData LIZIZ = FJU.LIZIZ();
        int i = LIZIZ.LIZ;
        boolean z = true;
        if (i == -1 || i == 0 || i == 1) {
            LIZIZ.LIZ = (int) EF7.LIZJ();
        }
        int i2 = LIZIZ.LIZ;
        if (LIZ == i2) {
            z = false;
        }
        if (FWS.LIZ().LIZ) {
            EI0 LIZJ = C40328FsC.LIZJ(C36093EEn.LIZ);
            LIZJ.LIZLLL(LNZ.LIZIZ.getMobLaunchEventTask(z, currentTimeMillis));
            LIZJ.LIZJ();
        }
        if (LIZ == 0) {
            SharedPreferences.Editor edit = F9J.LIZIZ(EF7.LIZIZ(), 0, "app_setting").edit();
            edit.putInt("last_version_code", i2);
            WX6.LIZ(edit);
        }
    }

    public Intent getMainIntent() {
        Intent intent = getIntent();
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getApplicationService().getClass();
        Intent intent2 = new Intent(this, (Class<?>) SplashActivity.class);
        intent2.setFlags(335544320);
        if (intent != null) {
            intent2.setAction(intent.getAction());
            Set<String> categories = intent.getCategories();
            if (!C79004UzY.LJJIFFI(categories)) {
                Iterator<String> it = categories.iterator();
                while (it.hasNext()) {
                    intent2.addCategory(it.next());
                }
            }
            if (C16880lQ.LLJJIJI(intent) != null) {
                intent2.putExtras(C16880lQ.LLJJIJI(intent));
            }
        }
        return intent2;
    }

    public void com_ss_android_ugc_aweme_splash_SplashActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    public void tryShowAdAndGoNext() {
        goMainActivity();
    }

    public static void com_ss_android_ugc_aweme_splash_SplashActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(SplashActivity splashActivity) {
        splashActivity.com_ss_android_ugc_aweme_splash_SplashActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                splashActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    public static void com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(SplashActivity splashActivity) {
        com_ss_android_ugc_aweme_splash_SplashActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(splashActivity);
        try {
            splashActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!C48236IwS.LJIJ) {
            C48236IwS.LJIJ = true;
            C38995FSd.LIZLLL().execute(FWW.LJLIL);
        }
        super.attachBaseContext(context);
    }

    public void goMainActivity(Bundle bundle) {
        submitPreload();
        this.mHandler.removeMessages(100);
        if (this.mJumped) {
            return;
        }
        this.mJumped = true;
        if (!this.mAlive) {
            return;
        }
        Intent mainIntent = getMainIntent();
        if (bundle != null) {
            mainIntent.putExtra("extra_splash_data", bundle);
        }
        C78598Ut0.LJIJJ(mainIntent, this);
        startActivity(mainIntent);
        if (!isFinishing()) {
            finish();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (!this.mAlive || message.what != 100) {
            return;
        }
        goMainActivity(message.getData());
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        C56662Kg.LIZ().LJFF("cold_boot_application_to_splash", true);
        C56662Kg.LIZ().LIZJ("cold_boot_splash_duration", true);
        CrashSdkImpl.LJ().LIZLLL(this);
        C56662Kg.LIZ().LIZJ("method_splash_super_duration", false);
        getWindow().setBackgroundDrawable(new ColorDrawable(AnonymousClass636.LJIIIIZZ(R.attr.ct, this)));
        super.onCreate(bundle);
        C56662Kg.LIZ().LJFF("method_splash_super_duration", false);
        if (getIntent() != null && TextUtils.equals(getIntent().getAction(), "android.intent.action.MAIN") && getIntent().getCategories() != null && getIntent().getCategories().size() > 0 && getIntent().getCategories().contains("android.intent.category.LAUNCHER") && !isTaskRoot() && C61017Nx7.LIZ().LIZIZ() && enableSplashLaunchFix()) {
            C36922EeM.LIZLLL(4, "SplashActivity", "finish SplashActivity directly");
            finish();
            return;
        }
        if (!isTaskRoot()) {
            goMainActivity();
            return;
        }
        this.mAlive = true;
        this.mFirstResume = true;
        this.mJumped = false;
        reportLaunchTime();
        mobLaunchMob();
        FWS.LIZ().LIZ = false;
        EI0 LIZJ = C40328FsC.LIZJ(C36093EEn.LIZ);
        LIZJ.LIZIZ(new UploadInstallEventTask(), true);
        LIZJ.LIZJ();
        if (sConfirmWelcomeType == EnumC62512cp.NO_WELCOME) {
            this.mTrackSession = true;
            tryInit();
        }
        hotStartIntercept();
        if (!this.mJumped) {
            tryInit();
            if (!quickLaunch()) {
                tryShowShortCutDlg();
            }
        }
        EI0 ei0 = new EI0();
        ei0.LIZLLL(LNZ.LIZIZ.getAntispamApiUploadTask());
        ei0.LIZJ();
        EI0 ei02 = new EI0();
        ei02.LIZIZ(new UploadSysStatusTask(), true);
        ei02.LIZJ();
        C56662Kg.LIZ().LJFF("cold_boot_splash_duration", true);
        C56662Kg.LIZ().LIZJ("cold_boot_splash_to_main", true);
    }
}
