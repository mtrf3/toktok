package com.ss.android.ugc.aweme.services;

import X.AV1;
import X.AbstractC67638Qgc;
import X.ActivityC86117Xqz;
import X.C00F;
import X.C03880Dg;
import X.C141335gf;
import X.C16880lQ;
import X.C34K;
import X.C38884FNw;
import X.C3C5;
import X.C45804HyK;
import X.C53140KtM;
import X.C53262KvK;
import X.C58096Mr6;
import X.C62848OlY;
import X.C65300Pk0;
import X.C67649Qgn;
import X.C67697QhZ;
import X.C67717Qht;
import X.C67727Qi3;
import X.C67732Qi8;
import X.C67735QiB;
import X.C67746QiM;
import X.C67792Qj6;
import X.C67814QjS;
import X.C67925QlF;
import X.C67993QmL;
import X.C67994QmM;
import X.C67995QmN;
import X.C68922R3e;
import X.C68985R5p;
import X.C71426S1m;
import X.C73969T1h;
import X.C76800UCe;
import X.C84763XOl;
import X.DialogC25752A8u;
import X.EF7;
import X.ETK;
import X.FXZ;
import X.G12;
import X.HG3;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC67661Qgz;
import X.InterfaceC86124Xr6;
import X.InterfaceC88472Yns;
import X.InterfaceC92693kP;
import X.MLK;
import X.MLL;
import X.QH7;
import X.QTX;
import X.R5K;
import X.R5L;
import X.R5M;
import X.R5U;
import X.R5V;
import X.R5X;
import X.R5Y;
import X.RBX;
import X.T16;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.ss.android.ugc.aweme.ISmartLockService;
import com.ss.android.ugc.aweme.account.utils.SmartLockSaveHelper;
import defpackage.e1;
import java.lang.ref.SoftReference;
import kotlin.jvm.internal.AqS158S0200000_11;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class SmartLockService implements ISmartLockService {
    public static final Companion Companion = new Companion();
    public InterfaceC92693kP disposable;
    public boolean isLoginSuccessBySmartLock;
    public DialogC25752A8u maskDialog;
    public Runnable timeoutCheckRunnable;
    public int scene = -1;
    public Handler handler = new Handler(C16880lQ.LLJJJJ());

    public static void com_ss_android_ugc_aweme_services_SmartLockService_com_ss_android_ugc_aweme_views_SmartLockMaskDialog_show(DialogC25752A8u dialogC25752A8u) {
        if (new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/views/SmartLockMaskDialog", "show", dialogC25752A8u, new Object[0], "void", new C65300Pk0(false, "()V", "-2730455796652071061")).LIZ) {
            return;
        }
        dialogC25752A8u.show();
    }

    public final void onComplete() {
        InterfaceC92693kP interfaceC92693kP = this.disposable;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
    }

    public final void releaseTimeoutCheck() {
        Runnable runnable = this.timeoutCheckRunnable;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
        }
    }

    @Override // com.ss.android.ugc.aweme.ISmartLockService
    public boolean shouldShowOnInbox() {
        if (!e1.LIZ(31744, "inbox_authority_switch", true, false)) {
            return false;
        }
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "curUserId");
        if (SmartLockSaveHelper.LIZ(3, curUserId)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ISmartLockService
    public boolean shouldShowOnProfile() {
        if (!((Boolean) C53140KtM.LIZ.getValue()).booleanValue()) {
            return false;
        }
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "curUserId");
        if (!SmartLockSaveHelper.LIZ(2, curUserId)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ISmartLockService
    public void smartLockTipMaskDismiss() {
        Context context;
        Activity LJIJJ;
        if (C00F.LIZ(31744, 0, "eea_force_login_authority_new_ui", true) == 1) {
            try {
                DialogC25752A8u dialogC25752A8u = this.maskDialog;
                if (dialogC25752A8u == null || (context = dialogC25752A8u.getContext()) == null || (LJIJJ = C45804HyK.LJIJJ(context)) == null || (!LJIJJ.isDestroyed() && !LJIJJ.isFinishing())) {
                    DialogC25752A8u dialogC25752A8u2 = this.maskDialog;
                    if (dialogC25752A8u2 != null) {
                        dialogC25752A8u2.dismiss();
                    }
                    this.maskDialog = null;
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ISmartLockService
    public boolean shouldShowOnFyp() {
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "curUserId");
        if (SmartLockSaveHelper.LIZ(1, curUserId)) {
            return true;
        }
        return false;
    }

    /* loaded from: classes11.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // com.ss.android.ugc.aweme.ISmartLockService
    public boolean isLoginSuccessBySmartLock() {
        return this.isLoginSuccessBySmartLock;
    }

    private final boolean checkGoogleService(Object obj) {
        if (!C62848OlY.LIZJ()) {
            SmartLockEventHelper.INSTANCE.onGoogleServiceNotReady$account_awemeaccount_release();
            if (obj instanceof R5X) {
                ((R5X) obj).onFailure(6);
                return false;
            }
            if (!(obj instanceof R5V)) {
                return false;
            }
            ((R5V) obj).onFailure();
            return false;
        }
        return true;
    }

    public static ISmartLockService createISmartLockServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(ISmartLockService.class, z);
        if (LIZ != null) {
            return (ISmartLockService) LIZ;
        }
        if (C58096Mr6.b6 == null) {
            synchronized (ISmartLockService.class) {
                if (C58096Mr6.b6 == null) {
                    C58096Mr6.b6 = new SmartLockService();
                }
            }
        }
        return C58096Mr6.b6;
    }

    private final boolean shouldShow(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                return shouldShowOnInbox();
            }
            return shouldShowOnProfile();
        }
        return shouldShowOnFyp();
    }

    @Override // com.ss.android.ugc.aweme.ISmartLockService
    public void checkCredential(final R5V listener) {
        o.LJIIIZ(listener, "listener");
        if (!checkGoogleService(listener)) {
            return;
        }
        C67732Qi8 c67732Qi8 = new C67732Qi8();
        c67732Qi8.LIZ = true;
        CredentialRequest LIZ = c67732Qi8.LIZ();
        C67792Qj6 c67792Qj6 = new C67792Qj6(EF7.LIZIZ(), C67925QlF.LJLJJI);
        final C34K c34k = new C34K();
        final C34K c34k2 = new C34K();
        SmartLockEventHelper.INSTANCE.onReadSmartLock$account_awemeaccount_release("check");
        c67792Qj6.LJ(LIZ).LIZIZ(new InterfaceC67661Qgz() { // from class: com.ss.android.ugc.aweme.services.SmartLockService$checkCredential$1
            @Override // X.InterfaceC67661Qgz
            public final void onComplete(AbstractC67638Qgc<C67814QjS> task) {
                ETK etk;
                o.LJIIIZ(task, "task");
                if (C34K.this.element) {
                    return;
                }
                c34k.element = true;
                this.releaseTimeoutCheck();
                Credential credential = null;
                if (task.LJIILIIL()) {
                    SmartLockEventHelper.INSTANCE.onReadSmartLockSuccess$account_awemeaccount_release("check");
                    C67814QjS LJIIIZ = task.LJIIIZ();
                    if (LJIIIZ != null) {
                        credential = LJIIIZ.LIZ.LJJJJJ();
                    }
                    listener.LIZIZ(this.parseCredential(credential, true));
                    return;
                }
                if (!(task.LJIIIIZZ() instanceof FXZ)) {
                    SmartLockEventHelper.INSTANCE.onReadSmartLockFail$account_awemeaccount_release("check", "other");
                    listener.onFailure();
                    return;
                }
                Exception LJIIIIZZ = task.LJIIIIZZ();
                if ((LJIIIIZZ instanceof FXZ) && (etk = (ETK) LJIIIIZZ) != null && etk.getStatusCode() == 4) {
                    SmartLockEventHelper.INSTANCE.onReadSmartLockFail$account_awemeaccount_release("check", "empty_account");
                    listener.LIZ();
                } else {
                    SmartLockEventHelper.INSTANCE.onReadSmartLockFail$account_awemeaccount_release("check", "multi_account");
                    listener.LIZJ();
                }
            }
        });
        handleTimeout(listener, new AqS161S0100000_11(c34k2, 54), new AqS161S0100000_11(c34k, 55));
    }

    public final InterfaceC86124Xr6 createLoadCredentialActivityCallback(final R5X r5x) {
        return new InterfaceC86124Xr6() { // from class: com.ss.android.ugc.aweme.services.SmartLockService$createLoadCredentialActivityCallback$1
            @Override // X.InterfaceC86124Xr6
            public Context attachPreBaseContext(Context context) {
                return context;
            }

            @Override // X.InterfaceC86124Xr6
            public void finish() {
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityReenter(int i, Intent intent) {
            }

            @Override // X.InterfaceC86124Xr6
            public boolean onKeyDown(int i, KeyEvent keyEvent) {
                return false;
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityDestroyed(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPaused(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPostDestroyed(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPostPaused(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPostResumed(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPostStarted(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPostStopped(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPreDestroyed(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPrePaused(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPreResumed(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPreStarted(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPreStopped(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityResumed(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityStarted(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityStopped(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onPreRestoreInstanceState(Bundle savedInstanceState) {
                o.LJIIIZ(savedInstanceState, "savedInstanceState");
            }

            @Override // X.InterfaceC86124Xr6
            public void onRestoreInstanceState(Bundle savedInstanceState) {
                o.LJIIIZ(savedInstanceState, "savedInstanceState");
            }

            @Override // X.InterfaceC86124Xr6
            public void onSupportContentChanged(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void attachBaseContext(Context context, Activity activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityCreated(ActivityC86117Xqz activity, Bundle bundle) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPostCreated(ActivityC86117Xqz activity, Bundle bundle) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPostSaveInstanceState(ActivityC86117Xqz activityC86117Xqz, Bundle bundle) {
                G12.LIZ(activityC86117Xqz, bundle);
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPreCreated(ActivityC86117Xqz activity, Bundle bundle) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPreSaveInstanceState(ActivityC86117Xqz activityC86117Xqz, Bundle bundle) {
                G12.LIZIZ(activityC86117Xqz, bundle);
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivitySaveInstanceState(ActivityC86117Xqz activityC86117Xqz, Bundle bundle) {
                G12.LIZJ(activityC86117Xqz, bundle);
            }

            @Override // X.InterfaceC86124Xr6
            public void onConfigurationChanged(ActivityC86117Xqz activityC86117Xqz, Configuration configuration) {
                G12.LIZLLL(activityC86117Xqz, configuration);
            }

            @Override // X.InterfaceC86124Xr6
            public void onWindowFocusChanged(ActivityC86117Xqz activity, boolean z) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void setContentView(Activity activity, int i) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void setContentView(Activity activity, View view) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityResult(int i, int i2, Intent intent) {
                Credential credential;
                if (i != 2) {
                    return;
                }
                ActivityC86117Xqz.Companion.getClass();
                C71426S1m.LIZIZ(this);
                if (i2 != -1) {
                    SmartLockEventHelper.INSTANCE.onReadSmartLockFail$account_awemeaccount_release("load", "cancel");
                    R5X.this.onFailure(2);
                    return;
                }
                SmartLockEventHelper.INSTANCE.onReadSmartLockSuccess$account_awemeaccount_release("load");
                if (intent != null) {
                    credential = (Credential) intent.getParcelableExtra("com.google.android.gms.credentials.Credential");
                } else {
                    credential = null;
                }
                this.handleLoadCredential(credential, false, R5X.this);
            }

            public boolean onInterceptorStartActivity(Activity activity, Intent intent, int i, Bundle bundle) {
                o.LJIIIZ(activity, "activity");
                return false;
            }
        };
    }

    public final void disableAccount(MLL mll) {
        this.disposable = R5L.LIZ(mll.LIZ, mll.LJ, 0, R5K.SMART_LOCK).LJIJJ(T16.LIZ()).LJIIL(C73969T1h.LIZIZ()).LJIIZILJ(new InterfaceC64592gB() { // from class: com.ss.android.ugc.aweme.services.SmartLockService$disableAccount$1
            @Override // X.InterfaceC64592gB
            public final void accept(C68922R3e c68922R3e) {
                SmartLockService.this.onComplete();
            }
        }, new InterfaceC64592gB() { // from class: com.ss.android.ugc.aweme.services.SmartLockService$disableAccount$2
            @Override // X.InterfaceC64592gB
            public final void accept(Throwable th) {
                SmartLockService.this.onComplete();
            }
        });
    }

    public final InterfaceC86124Xr6 createSaveCredentialActivityCallback(final MLL mll, final R5X r5x) {
        return new InterfaceC86124Xr6() { // from class: com.ss.android.ugc.aweme.services.SmartLockService$createSaveCredentialActivityCallback$1
            @Override // X.InterfaceC86124Xr6
            public Context attachPreBaseContext(Context context) {
                return context;
            }

            @Override // X.InterfaceC86124Xr6
            public void finish() {
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityReenter(int i, Intent intent) {
            }

            @Override // X.InterfaceC86124Xr6
            public boolean onKeyDown(int i, KeyEvent keyEvent) {
                return false;
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityDestroyed(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPaused(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPostDestroyed(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPostPaused(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPostResumed(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPostStarted(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPostStopped(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPreDestroyed(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPrePaused(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPreResumed(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPreStarted(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPreStopped(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityResumed(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityStarted(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityStopped(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onPreRestoreInstanceState(Bundle savedInstanceState) {
                o.LJIIIZ(savedInstanceState, "savedInstanceState");
            }

            @Override // X.InterfaceC86124Xr6
            public void onRestoreInstanceState(Bundle savedInstanceState) {
                o.LJIIIZ(savedInstanceState, "savedInstanceState");
            }

            @Override // X.InterfaceC86124Xr6
            public void onSupportContentChanged(ActivityC86117Xqz activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void attachBaseContext(Context context, Activity activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityCreated(ActivityC86117Xqz activity, Bundle bundle) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPostCreated(ActivityC86117Xqz activity, Bundle bundle) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPostSaveInstanceState(ActivityC86117Xqz activityC86117Xqz, Bundle bundle) {
                G12.LIZ(activityC86117Xqz, bundle);
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPreCreated(ActivityC86117Xqz activity, Bundle bundle) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityPreSaveInstanceState(ActivityC86117Xqz activityC86117Xqz, Bundle bundle) {
                G12.LIZIZ(activityC86117Xqz, bundle);
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivitySaveInstanceState(ActivityC86117Xqz activityC86117Xqz, Bundle bundle) {
                G12.LIZJ(activityC86117Xqz, bundle);
            }

            @Override // X.InterfaceC86124Xr6
            public void onConfigurationChanged(ActivityC86117Xqz activityC86117Xqz, Configuration configuration) {
                G12.LIZLLL(activityC86117Xqz, configuration);
            }

            @Override // X.InterfaceC86124Xr6
            public void onWindowFocusChanged(ActivityC86117Xqz activity, boolean z) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void setContentView(Activity activity, int i) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void setContentView(Activity activity, View view) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // X.InterfaceC86124Xr6
            public void onActivityResult(int i, int i2, Intent intent) {
                if (i != 1) {
                    return;
                }
                ActivityC86117Xqz.Companion.getClass();
                C71426S1m.LIZIZ(this);
                if (i2 == -1) {
                    String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
                    o.LJIIIIZZ(curUserId, "userService().curUserId");
                    SmartLockSaveHelper.LJFF(curUserId);
                    SmartLockEventHelper.INSTANCE.onSaveCredentialSuccess$account_awemeaccount_release(SmartLockService.this.scene, "click");
                    int i3 = 0;
                    int i4 = SmartLockSaveHelper.LIZLLL().getInt("save_error_times", 0);
                    Keva LIZLLL = SmartLockSaveHelper.LIZLLL();
                    int i5 = i4 - 1;
                    if (i5 >= 0) {
                        i3 = i5;
                    }
                    LIZLLL.storeInt("save_error_times", i3);
                    r5x.onSuccess(mll);
                    return;
                }
                r5x.onFailure(2);
                SmartLockService.this.disableAccount(mll);
                SmartLockEventHelper.INSTANCE.onSaveCredentialFail$account_awemeaccount_release(SmartLockService.this.scene, "cancel");
            }

            public boolean onInterceptorStartActivity(Activity activity, Intent intent, int i, Bundle bundle) {
                o.LJIIIZ(activity, "activity");
                return false;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ISmartLockService
    public void deleteCredential(String uniqueId, final R5X listener) {
        o.LJIIIZ(uniqueId, "uniqueId");
        o.LJIIIZ(listener, "listener");
        if (!checkGoogleService(listener)) {
            return;
        }
        R5U r5u = new R5U(uniqueId);
        Credential credential = new Credential(uniqueId, r5u.LIZ, r5u.LIZIZ, null, r5u.LIZJ, null, null, null);
        C67792Qj6 c67792Qj6 = new C67792Qj6(EF7.LIZIZ(), C67925QlF.LJLJJI);
        C67735QiB c67735QiB = C67717Qht.LIZJ;
        C67727Qi3 c67727Qi3 = c67792Qj6.LJII;
        c67735QiB.getClass();
        QH7.LJIIIZ(c67727Qi3, "client must not be null");
        C67995QmN c67995QmN = new C67995QmN(c67727Qi3, credential);
        c67727Qi3.LJLJI.LIZJ(1, c67995QmN);
        C67697QhZ c67697QhZ = new C67697QhZ();
        C67649Qgn c67649Qgn = new C67649Qgn();
        c67995QmN.LIZJ(new C67746QiM(c67995QmN, c67649Qgn, c67697QhZ));
        c67649Qgn.LIZ.LIZIZ(new InterfaceC67661Qgz() { // from class: com.ss.android.ugc.aweme.services.SmartLockService$deleteCredential$1
            @Override // X.InterfaceC67661Qgz
            public final void onComplete(AbstractC67638Qgc<Void> it) {
                o.LJIIIZ(it, "it");
                if (it.LJIILIIL()) {
                    R5X.this.onSuccess(null);
                } else {
                    R5X.this.onFailure(6);
                }
            }
        });
    }

    public final MLL parseCredential(Credential credential, boolean z) {
        if (credential == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(credential.zbe);
            MLK mlk = new MLK();
            String str = credential.zba;
            o.LJIIIIZZ(str, "credential.id");
            mlk.LIZLLL(str);
            String optString = jSONObject.optString("uid");
            o.LJIIIIZZ(optString, "jsonObject.optString(\"uid\")");
            mlk.LIZJ(optString);
            mlk.LIZ(String.valueOf(credential.zbc));
            String str2 = credential.zbb;
            if (str2 == null) {
                str2 = "";
            }
            mlk.LIZIZ(str2);
            String optString2 = jSONObject.optString("token");
            o.LJIIIIZZ(optString2, "jsonObject.optString(\"token\")");
            MLL mll = mlk.LIZ;
            mll.getClass();
            mll.LJ = optString2;
            MLL mll2 = mlk.LIZ;
            if (mll2.LIZ.length() != 0) {
                if (mll2.LJ.length() == 0) {
                }
                return mll2;
            }
            SmartLockEventHelper.INSTANCE.sendParseCredentialEvent$account_awemeaccount_release(credential, "uid_token_empty", z);
            return mll2;
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            SmartLockEventHelper.INSTANCE.sendParseCredentialEvent$account_awemeaccount_release(credential, "json_error", z);
            MLK mlk2 = new MLK();
            String str3 = credential.zba;
            o.LJIIIIZZ(str3, "credential.id");
            mlk2.LIZLLL(str3);
            return mlk2.LIZ;
        }
    }

    @Override // com.ss.android.ugc.aweme.ISmartLockService
    public void smartLockTipMaskShow(Context context, String str) {
        if (context == null || str == null || C00F.LIZ(31744, 0, "eea_force_login_authority_new_ui", true) != 1) {
            return;
        }
        DialogC25752A8u dialogC25752A8u = new DialogC25752A8u(context, str);
        this.maskDialog = dialogC25752A8u;
        com_ss_android_ugc_aweme_services_SmartLockService_com_ss_android_ugc_aweme_views_SmartLockMaskDialog_show(dialogC25752A8u);
    }

    private final void handleTimeout(Object obj, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<Boolean> interfaceC65784Pro2) {
        if (((Number) C38884FNw.LIZ.getValue()).intValue() == 0) {
            handleTimeoutWithMemoryLeak(obj, interfaceC65784Pro, interfaceC65784Pro2);
        } else {
            handleTimeoutWithSoftReference(obj, interfaceC65784Pro, interfaceC65784Pro2);
        }
    }

    private final void handleTimeoutWithMemoryLeak(final Object obj, final InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, final InterfaceC65784Pro<Boolean> interfaceC65784Pro2) {
        Runnable runnable = new Runnable() { // from class: com.ss.android.ugc.aweme.services.SmartLockService$handleTimeoutWithMemoryLeak$localTimeoutCheckRunnable$1
            @Override // java.lang.Runnable
            public final void run() {
                com_ss_android_ugc_aweme_services_SmartLockService$handleTimeoutWithMemoryLeak$localTimeoutCheckRunnable$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public final void com_ss_android_ugc_aweme_services_SmartLockService$handleTimeoutWithMemoryLeak$localTimeoutCheckRunnable$1__run$___twin___() {
                if (!interfaceC65784Pro2.invoke().booleanValue()) {
                    return;
                }
                interfaceC65784Pro.invoke();
                Object obj2 = obj;
                if (obj2 instanceof R5V) {
                    ((R5V) obj2).onFailure();
                }
                Object obj3 = obj;
                if (obj3 instanceof R5X) {
                    ((R5X) obj3).onFailure(6);
                }
            }

            public static void com_ss_android_ugc_aweme_services_SmartLockService$handleTimeoutWithMemoryLeak$localTimeoutCheckRunnable$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(SmartLockService$handleTimeoutWithMemoryLeak$localTimeoutCheckRunnable$1 smartLockService$handleTimeoutWithMemoryLeak$localTimeoutCheckRunnable$1) {
                boolean LIZ;
                try {
                    smartLockService$handleTimeoutWithMemoryLeak$localTimeoutCheckRunnable$1.com_ss_android_ugc_aweme_services_SmartLockService$handleTimeoutWithMemoryLeak$localTimeoutCheckRunnable$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        };
        this.timeoutCheckRunnable = runnable;
        this.handler.postDelayed(runnable, 6000L);
    }

    private final void handleTimeoutWithSoftReference(Object obj, final InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, final InterfaceC65784Pro<Boolean> interfaceC65784Pro2) {
        final SoftReference softReference = new SoftReference(obj);
        Runnable runnable = new Runnable() { // from class: com.ss.android.ugc.aweme.services.SmartLockService$handleTimeoutWithSoftReference$localTimeoutCheckRunnable$1
            @Override // java.lang.Runnable
            public final void run() {
                com_ss_android_ugc_aweme_services_SmartLockService$handleTimeoutWithSoftReference$localTimeoutCheckRunnable$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public final void com_ss_android_ugc_aweme_services_SmartLockService$handleTimeoutWithSoftReference$localTimeoutCheckRunnable$1__run$___twin___() {
                if (!interfaceC65784Pro2.invoke().booleanValue()) {
                    return;
                }
                interfaceC65784Pro.invoke();
                Object obj2 = softReference.get();
                if (obj2 instanceof R5V) {
                    ((R5V) obj2).onFailure();
                }
                if (obj2 instanceof R5X) {
                    ((R5X) obj2).onFailure(6);
                }
            }

            public static void com_ss_android_ugc_aweme_services_SmartLockService$handleTimeoutWithSoftReference$localTimeoutCheckRunnable$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(SmartLockService$handleTimeoutWithSoftReference$localTimeoutCheckRunnable$1 smartLockService$handleTimeoutWithSoftReference$localTimeoutCheckRunnable$1) {
                boolean LIZ;
                try {
                    smartLockService$handleTimeoutWithSoftReference$localTimeoutCheckRunnable$1.com_ss_android_ugc_aweme_services_SmartLockService$handleTimeoutWithSoftReference$localTimeoutCheckRunnable$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        };
        this.timeoutCheckRunnable = runnable;
        this.handler.postDelayed(runnable, 6000L);
    }

    public final void handleLoadCredential(Credential credential, boolean z, R5X r5x) {
        if (credential == null) {
            r5x.onFailure(0);
            return;
        }
        MLL parseCredential = parseCredential(credential, z);
        if (parseCredential != null) {
            r5x.onSuccess(parseCredential);
        } else {
            r5x.onFailure(5);
        }
    }

    @Override // com.ss.android.ugc.aweme.ISmartLockService
    public void loadCredentials(final Activity activity, boolean z, final R5X listener) {
        o.LJIIIZ(listener, "listener");
        if (!checkGoogleService(listener)) {
            return;
        }
        C67732Qi8 c67732Qi8 = new C67732Qi8();
        c67732Qi8.LIZ = true;
        CredentialRequest LIZ = c67732Qi8.LIZ();
        SmartLockEventHelper.INSTANCE.onReadSmartLock$account_awemeaccount_release("load");
        C67792Qj6 c67792Qj6 = new C67792Qj6(EF7.LIZIZ(), C67925QlF.LJLJJI);
        if (z) {
            C67735QiB c67735QiB = C67717Qht.LIZJ;
            C67727Qi3 c67727Qi3 = c67792Qj6.LJII;
            c67735QiB.getClass();
            QH7.LJIIIZ(c67727Qi3, "client must not be null");
            C67993QmL c67993QmL = new C67993QmL(c67727Qi3);
            c67727Qi3.LJLJI.LIZJ(1, c67993QmL);
            c67993QmL.LIZJ(new C67746QiM(c67993QmL, new C67649Qgn(), new C67697QhZ()));
        }
        final C34K c34k = new C34K();
        final C34K c34k2 = new C34K();
        c67792Qj6.LJ(LIZ).LIZIZ(new InterfaceC67661Qgz() { // from class: com.ss.android.ugc.aweme.services.SmartLockService$loadCredentials$completeListener$1
            @Override // X.InterfaceC67661Qgz
            public final void onComplete(AbstractC67638Qgc<C67814QjS> task) {
                FXZ fxz;
                Integer valueOf;
                o.LJIIIZ(task, "task");
                if (C34K.this.element) {
                    return;
                }
                c34k.element = true;
                this.releaseTimeoutCheck();
                Credential credential = null;
                if (task.LJIILIIL()) {
                    SmartLockEventHelper.INSTANCE.onReadSmartLockSuccess$account_awemeaccount_release("load");
                    C67814QjS LJIIIZ = task.LJIIIZ();
                    if (LJIIIZ != null) {
                        credential = LJIIIZ.LIZ.LJJJJJ();
                    }
                    this.handleLoadCredential(credential, true, listener);
                    return;
                }
                if (!(task.LJIIIIZZ() instanceof FXZ)) {
                    SmartLockEventHelper.INSTANCE.onReadSmartLockFail$account_awemeaccount_release("load", "other");
                    listener.onFailure(6);
                    return;
                }
                Activity activity2 = activity;
                if (activity2 == null) {
                    activity2 = C84763XOl.LJIIIIZZ();
                }
                if (!(activity2 instanceof ActivityC86117Xqz)) {
                    SmartLockEventHelper.INSTANCE.onReadSmartLockFail$account_awemeaccount_release("load", "activity_not_match");
                    listener.onFailure(6);
                    return;
                }
                InterfaceC86124Xr6 createLoadCredentialActivityCallback = this.createLoadCredentialActivityCallback(listener);
                Exception LJIIIIZZ = task.LJIIIIZZ();
                if ((LJIIIIZZ instanceof FXZ) && (fxz = (FXZ) LJIIIIZZ) != null && (valueOf = Integer.valueOf(fxz.getStatusCode())) != null) {
                    if (valueOf.intValue() == 4) {
                        SmartLockEventHelper.INSTANCE.onReadSmartLockFail$account_awemeaccount_release("load", "other");
                        listener.onFailure(1);
                        return;
                    } else if (valueOf.intValue() == 6) {
                        ActivityC86117Xqz.Companion.getClass();
                        C71426S1m.LIZ(createLoadCredentialActivityCallback);
                        fxz.startResolutionForResult(activity2, 2);
                        listener.onDialogShow();
                        return;
                    }
                }
                SmartLockEventHelper.INSTANCE.onReadSmartLockFail$account_awemeaccount_release("load", "other");
                listener.onFailure(6);
            }
        });
        handleTimeout(listener, new AqS161S0100000_11(c34k2, 56), new AqS161S0100000_11(c34k, 57));
    }

    public final void realLoginBySmartLock(MLL mll, final InterfaceC88472Yns<? super C68922R3e, C76800UCe> interfaceC88472Yns, final InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns2) {
        this.disposable = R5L.LIZJ(mll.LIZ, mll.LJ, null, 24).LJIJJ(T16.LIZ()).LJIIL(C73969T1h.LIZIZ()).LJIIZILJ(new InterfaceC64592gB() { // from class: com.ss.android.ugc.aweme.services.SmartLockService$realLoginBySmartLock$1
            @Override // X.InterfaceC64592gB
            public final void accept(C68922R3e it) {
                InterfaceC88472Yns<C68922R3e, C76800UCe> interfaceC88472Yns3 = interfaceC88472Yns;
                o.LJIIIIZZ(it, "it");
                interfaceC88472Yns3.invoke(it);
            }
        }, new InterfaceC64592gB() { // from class: com.ss.android.ugc.aweme.services.SmartLockService$realLoginBySmartLock$2
            @Override // X.InterfaceC64592gB
            public final void accept(Throwable it) {
                InterfaceC88472Yns<Throwable, C76800UCe> interfaceC88472Yns3 = interfaceC88472Yns2;
                o.LJIIIIZZ(it, "it");
                interfaceC88472Yns3.invoke(it);
            }
        });
    }

    public final void loginByToken(Activity activity, MLL mll, C68922R3e c68922R3e, boolean z) {
        QTX userInfo = c68922R3e.LJIIIZ;
        o.LJIIIIZZ(userInfo, "userInfo");
        C68985R5p.LIZ(activity, userInfo, null, z);
        MLK mlk = new MLK();
        mlk.LIZJ(mll.LIZ);
        mlk.LIZLLL(mll.LIZIZ);
        mlk.LIZIZ(mll.LIZJ);
        mlk.LIZ(mll.LIZLLL);
        String string = JSONObjectProtectorUtils.getString(c68922R3e.LJIILJJIL, "cloud_token");
        o.LJIIIIZZ(string, "response.data.getString(\"cloud_token\")");
        MLL mll2 = mlk.LIZ;
        mll2.getClass();
        mll2.LJ = string;
        saveCredential(activity, mlk.LIZ, false, new R5X() { // from class: com.ss.android.ugc.aweme.services.SmartLockService$loginByToken$1
            @Override // X.R5X
            public void onDialogShow() {
            }

            @Override // X.R5X
            public void onFailure(int i) {
            }

            @Override // X.R5X
            public void onSuccess(MLL mll3) {
            }
        });
    }

    public void saveCredential(final Activity activity, final MLL account, final boolean z, final R5X listener) {
        o.LJIIIZ(account, "account");
        o.LJIIIZ(listener, "listener");
        if (!checkGoogleService(listener)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uid", account.LIZ);
        jSONObject.put("token", account.LJ);
        String str = account.LIZIZ;
        R5U r5u = new R5U(str);
        r5u.LIZ = account.LIZJ;
        r5u.LIZIZ = UriProtector.parse(account.LIZLLL);
        r5u.LIZJ = jSONObject.toString();
        Credential credential = new Credential(str, r5u.LIZ, r5u.LIZIZ, null, r5u.LIZJ, null, null, null);
        final C34K c34k = new C34K();
        final C34K c34k2 = new C34K();
        InterfaceC67661Qgz interfaceC67661Qgz = new InterfaceC67661Qgz() { // from class: com.ss.android.ugc.aweme.services.SmartLockService$saveCredential$completeListener$1
            @Override // X.InterfaceC67661Qgz
            public final void onComplete(AbstractC67638Qgc<Void> task) {
                FXZ fxz;
                ETK etk;
                o.LJIIIZ(task, "task");
                if (C34K.this.element) {
                    return;
                }
                c34k.element = true;
                this.releaseTimeoutCheck();
                int i = 0;
                if (task.LJIILIIL()) {
                    SmartLockEventHelper.INSTANCE.onSaveCredentialSuccess$account_awemeaccount_release(this.scene, "auto");
                    int i2 = SmartLockSaveHelper.LIZLLL().getInt("save_error_times", 0);
                    Keva LIZLLL = SmartLockSaveHelper.LIZLLL();
                    int i3 = i2 - 1;
                    if (i3 >= 0) {
                        i = i3;
                    }
                    LIZLLL.storeInt("save_error_times", i);
                    String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
                    o.LJIIIIZZ(curUserId, "userService().curUserId");
                    SmartLockSaveHelper.LJFF(curUserId);
                    listener.onSuccess(account);
                    return;
                }
                if (!(task.LJIIIIZZ() instanceof FXZ)) {
                    if (z) {
                        Exception LJIIIIZZ = task.LJIIIIZZ();
                        if ((LJIIIIZZ instanceof ETK) && (etk = (ETK) LJIIIIZZ) != null && etk.getStatusCode() == 16) {
                            SmartLockEventHelper.INSTANCE.onSaveCredentialFail$account_awemeaccount_release(this.scene, "click_never");
                            String curUserId2 = ((RBX) HG3.LJIILL()).getCurUserId();
                            o.LJIIIIZZ(curUserId2, "userService().curUserId");
                            SmartLockSaveHelper.LJI(curUserId2, SmartLockSaveHelper.FrequencyData.LIZ(SmartLockSaveHelper.LIZJ(curUserId2), false, 0, 0L, 0L, 0, 0, true, 63));
                            SmartLockSaveHelper.LJ();
                            listener.onFailure(6);
                            return;
                        }
                    }
                    SmartLockEventHelper.INSTANCE.onSaveCredentialFail$account_awemeaccount_release(this.scene, "other");
                    SmartLockSaveHelper.LJ();
                    listener.onFailure(6);
                    return;
                }
                Activity activity2 = activity;
                if (activity2 == null) {
                    activity2 = C84763XOl.LJIIIIZZ();
                }
                if (!(activity2 instanceof ActivityC86117Xqz)) {
                    SmartLockEventHelper.INSTANCE.onSaveCredentialFail$account_awemeaccount_release(this.scene, "activity_not_match");
                    SmartLockSaveHelper.LJ();
                    listener.onFailure(6);
                    return;
                }
                InterfaceC86124Xr6 createSaveCredentialActivityCallback = this.createSaveCredentialActivityCallback(account, listener);
                ActivityC86117Xqz.Companion.getClass();
                C71426S1m.LIZ(createSaveCredentialActivityCallback);
                Exception LJIIIIZZ2 = task.LJIIIIZZ();
                if ((LJIIIIZZ2 instanceof FXZ) && (fxz = (FXZ) LJIIIIZZ2) != null) {
                    fxz.startResolutionForResult(activity2, 1);
                }
                String curUserId3 = ((RBX) HG3.LJIILL()).getCurUserId();
                o.LJIIIIZZ(curUserId3, "userService().curUserId");
                int i4 = this.scene;
                SmartLockSaveHelper.FrequencyData LIZJ = SmartLockSaveHelper.LIZJ(curUserId3);
                if (i4 != 2 && i4 != 3) {
                    SmartLockSaveHelper.LJI(curUserId3, SmartLockSaveHelper.FrequencyData.LIZ(LIZJ, false, 0, 0L, 0L, 0, LIZJ.fypShowTimes + 1, false, 95));
                } else {
                    SmartLockSaveHelper.LJI(curUserId3, SmartLockSaveHelper.FrequencyData.LIZ(LIZJ, false, LIZJ.profileAndInboxShowTimes + 1, System.currentTimeMillis(), 0L, 0, 0, false, 121));
                }
                listener.onDialogShow();
            }
        };
        C67792Qj6 c67792Qj6 = new C67792Qj6(EF7.LIZIZ(), C67925QlF.LJLJJI);
        C67735QiB c67735QiB = C67717Qht.LIZJ;
        C67727Qi3 c67727Qi3 = c67792Qj6.LJII;
        c67735QiB.getClass();
        QH7.LJIIIZ(c67727Qi3, "client must not be null");
        C67994QmM c67994QmM = new C67994QmM(c67727Qi3, credential);
        c67727Qi3.LJLJI.LIZJ(1, c67994QmM);
        C67697QhZ c67697QhZ = new C67697QhZ();
        C67649Qgn c67649Qgn = new C67649Qgn();
        c67994QmM.LIZJ(new C67746QiM(c67994QmM, c67649Qgn, c67697QhZ));
        c67649Qgn.LIZ.LIZIZ(interfaceC67661Qgz);
        handleTimeout(listener, new AqS158S0200000_11(c34k2, this, 7), new AqS161S0100000_11(c34k, 58));
    }

    @Override // com.ss.android.ugc.aweme.ISmartLockService
    public void tryShowAuthorityDialog(final Activity activity, final MLL account, final int i, final R5X listener) {
        o.LJIIIZ(account, "account");
        o.LJIIIZ(listener, "listener");
        this.scene = i;
        if (!checkGoogleService(listener) || AV1.LJIILLIIL() || C53262KvK.LIZIZ()) {
            return;
        }
        if (!shouldShow(i)) {
            listener.onFailure(6);
        } else if (SmartLockSaveHelper.LIZLLL().getInt("save_error_times", 0) > 15) {
            SmartLockEventHelper.INSTANCE.onEnableTokenFail$account_awemeaccount_release(i, "fail_many_times");
            listener.onFailure(6);
        } else {
            SmartLockEventHelper.INSTANCE.onEnableToken$account_awemeaccount_release(i);
            this.disposable = R5L.LIZIZ(false, R5M.SMART_LOCK).LJIJJ(T16.LIZ()).LJIIL(C73969T1h.LIZIZ()).LJIIZILJ(new InterfaceC64592gB() { // from class: com.ss.android.ugc.aweme.services.SmartLockService$tryShowAuthorityDialog$1
                @Override // X.InterfaceC64592gB
                public final void accept(C68922R3e c68922R3e) {
                    String token = c68922R3e.LJIILJJIL.optString("cloud_token");
                    if (token == null || token.length() == 0) {
                        SmartLockEventHelper.INSTANCE.onEnableTokenFail$account_awemeaccount_release(i, "token_empty");
                        listener.onFailure(0);
                        this.onComplete();
                        return;
                    }
                    MLL mll = account;
                    o.LJIIIIZZ(token, "token");
                    mll.getClass();
                    mll.LJ = token;
                    SmartLockEventHelper.INSTANCE.onEnableTokenSuccess$account_awemeaccount_release(i);
                    this.saveCredential(activity, account, true, listener);
                    this.onComplete();
                }
            }, new InterfaceC64592gB() { // from class: com.ss.android.ugc.aweme.services.SmartLockService$tryShowAuthorityDialog$2
                @Override // X.InterfaceC64592gB
                public final void accept(Throwable th) {
                    SmartLockEventHelper.INSTANCE.onEnableTokenFail$account_awemeaccount_release(i, "throw_exception");
                    listener.onFailure(4);
                    this.onComplete();
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.ISmartLockService
    public void smartLockAccountLogin(Activity activity, MLL mll, long j, String enterFrom, boolean z, R5Y smartLockLoginListener) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(smartLockLoginListener, "smartLockLoginListener");
        if (activity == null || mll == null || TextUtils.isEmpty(mll.LJ) || TextUtils.isEmpty(mll.LIZ)) {
            smartLockLoginListener.onFailure();
            return;
        }
        SmartLockEventHelper.INSTANCE.onLoginStart$account_awemeaccount_release(activity, mll, j, enterFrom);
        SmartLockService$smartLockAccountLogin$successAction$1 smartLockService$smartLockAccountLogin$successAction$1 = new SmartLockService$smartLockAccountLogin$successAction$1(this, smartLockLoginListener, activity, mll, z, j, enterFrom);
        realLoginBySmartLock(mll, smartLockService$smartLockAccountLogin$successAction$1, new SmartLockService$smartLockAccountLogin$retryAction$1(this, new SmartLockService$smartLockAccountLogin$failAction$1(activity, mll, j, enterFrom, smartLockLoginListener, this), mll, smartLockService$smartLockAccountLogin$successAction$1));
    }
}
