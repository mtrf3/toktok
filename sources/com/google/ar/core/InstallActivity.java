package com.google.ar.core;

import X.C16880lQ;
import X.C65803Ps7;
import X.C78598Ut0;
import X.C93535aSR;
import X.C93537aST;
import X.C93538aSU;
import X.C94121abt;
import X.EnumC93540aSW;
import X.ViewOnClickListenerC93533aSP;
import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes34.dex */
public class InstallActivity extends Activity {
    public boolean finished;
    public ArCoreApk.InstallBehavior installBehavior;
    public boolean installStarted;
    public ArCoreApk.UserMessageType messageType;
    public boolean waitingForCompletion;
    public final ContextThemeWrapper themeWrapper = new ContextThemeWrapper(this, R.style.Theme.Material.Light.Dialog.Alert);
    public EnumC93540aSW lastEvent = EnumC93540aSW.CANCELLED;

    public static /* synthetic */ EnumC93540aSW access$402(InstallActivity installActivity, EnumC93540aSW enumC93540aSW) {
        installActivity.lastEvent = enumC93540aSW;
        return enumC93540aSW;
    }

    public void com_google_ar_core_InstallActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
    }

    @Override // android.app.Activity
    public void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // android.app.Activity
    public void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // android.app.Activity
    public void onStop() {
        C65803Ps7.LJFF(this);
        com_google_ar_core_InstallActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    public void startInstaller() {
        this.installStarted = true;
        this.lastEvent = EnumC93540aSW.CANCELLED;
        k.a().b(this).d(this, new C93538aSU(this));
    }

    private boolean isOptional() {
        if (this.installBehavior == ArCoreApk.InstallBehavior.OPTIONAL) {
            return true;
        }
        return false;
    }

    private void showEducationDialog() {
        setContentView(com.zhiliaoapp.musically.R.layout.dui);
        C16880lQ.LJIIJ(new ViewOnClickListenerC93533aSP(this, 0), findViewById(com.zhiliaoapp.musically.R.id.nlc));
        if (!isOptional()) {
            findViewById(com.zhiliaoapp.musically.R.id.nlc).setVisibility(8);
        }
        C16880lQ.LJIIJ(new ViewOnClickListenerC93533aSP(this), findViewById(com.zhiliaoapp.musically.R.id.nld));
        TextView textView = (TextView) findViewById(com.zhiliaoapp.musically.R.id.nle);
        if (this.messageType.ordinal() != 1) {
            textView.setText(com.zhiliaoapp.musically.R.string.tyv);
        } else {
            textView.setText(com.zhiliaoapp.musically.R.string.tyw);
        }
    }

    public void animateToSpinner() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = (int) (displayMetrics.density * 280.0f);
        int width = getWindow().getDecorView().getWidth();
        int height = getWindow().getDecorView().getHeight();
        setContentView(new RelativeLayout(this));
        getWindow().getDecorView().setMinimumWidth(i);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new C93535aSR(this, width, i, height));
        ofFloat.addListener(new C93537aST(this));
        ofFloat.start();
    }

    public void closeInstaller() {
        Intent flags = new Intent(this, (Class<?>) InstallActivity.class).setFlags(67108864);
        C78598Ut0.LJIJJ(flags, this);
        startActivity(flags);
    }

    @Override // android.app.Activity
    public void finish() {
        finishWithFailure(new UnavailableUserDeclinedInstallationException());
    }

    public void showSpinner() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = (int) (displayMetrics.density * 280.0f);
        getWindow().setLayout(i, i);
        RelativeLayout relativeLayout = new RelativeLayout(this.themeWrapper);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        ProgressBar progressBar = new ProgressBar(this.themeWrapper);
        progressBar.setIndeterminate(true);
        progressBar.setLayoutParams(layoutParams);
        relativeLayout.addView(progressBar);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        layoutParams2.bottomMargin = (int) (displayMetrics.density * 30.0f);
        TextView textView = new TextView(this.themeWrapper);
        textView.setText(com.zhiliaoapp.musically.R.string.tyx);
        textView.setLayoutParams(layoutParams2);
        relativeLayout.addView(textView);
        setContentView(relativeLayout);
        getWindow().setLayout(i, i);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        C65803Ps7.LIZIZ(this);
        if (!this.finished) {
            k.a().c();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
        if (!this.installStarted) {
            if (this.messageType == ArCoreApk.UserMessageType.USER_ALREADY_INFORMED) {
                startInstaller();
            }
        } else if (!this.finished) {
            synchronized (this) {
                EnumC93540aSW enumC93540aSW = this.lastEvent;
                if (enumC93540aSW == EnumC93540aSW.CANCELLED) {
                    finish();
                } else if (enumC93540aSW == EnumC93540aSW.ACCEPTED) {
                    this.waitingForCompletion = true;
                } else {
                    finishWithFailure(k.a().a);
                }
            }
        }
    }

    public static void com_google_ar_core_InstallActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(InstallActivity installActivity) {
        installActivity.com_google_ar_core_InstallActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                installActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    public static void com_google_ar_core_InstallActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(InstallActivity installActivity) {
        com_google_ar_core_InstallActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(installActivity);
        try {
            installActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }

    public void finishWithFailure(Exception exc) {
        k.a().a = exc;
        k.a().c();
        this.finished = true;
        super.finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
        try {
            if (bundle != null) {
                finishWithFailure(new FatalException("Install activity was suspended and recreated."));
                return;
            }
            this.messageType = (ArCoreApk.UserMessageType) getIntent().getSerializableExtra("message");
            ArCoreApk.InstallBehavior installBehavior = (ArCoreApk.InstallBehavior) getIntent().getSerializableExtra("behavior");
            this.installBehavior = installBehavior;
            if (this.messageType != null && installBehavior != null) {
                setTheme(R.style.Theme.Material.Light.Dialog.Alert);
                getWindow().requestFeature(1);
                setFinishOnTouchOutside(isOptional());
                if (this.messageType == ArCoreApk.UserMessageType.USER_ALREADY_INFORMED) {
                    showSpinner();
                    return;
                }
                AtomicReference atomicReference = new AtomicReference(ArCoreApk.Availability.UNKNOWN_CHECKING);
                k.a().b(this).c(this, new C94121abt(atomicReference));
                if (((ArCoreApk.Availability) atomicReference.get()).ordinal() != 3) {
                    showEducationDialog();
                    return;
                } else {
                    finishWithFailure(new UnavailableDeviceNotCompatibleException());
                    return;
                }
            }
            finishWithFailure(new FatalException("Install activity launched without config data."));
        } catch (RuntimeException e) {
            finishWithFailure(new FatalException("Exception starting install flow", e));
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("didResume", true);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
