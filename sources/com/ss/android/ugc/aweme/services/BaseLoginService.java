package com.ss.android.ugc.aweme.services;

import X.C16880lQ;
import X.C198517qh;
import X.C38995FSd;
import X.C40535FvX;
import X.C40926G4k;
import X.C58725N2z;
import X.C67737QiD;
import X.C78451Uqd;
import X.F9J;
import X.GBL;
import X.InterfaceC65892PtY;
import X.InterfaceC65895Ptb;
import X.Q13;
import X.R2X;
import X.R41;
import X.R46;
import X.R47;
import X.R4B;
import Y.IDRunnableS6S0101000;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class BaseLoginService implements GenericLifecycleObserver, InterfaceC65895Ptb {
    public boolean mKeepCallback;
    public C78451Uqd mLoginParam;
    public C78451Uqd mPlatformParam;

    public static /* synthetic */ void LIZ(BaseLoginService baseLoginService) {
        baseLoginService.lambda$computeNumOfUidsOnDevice$0();
    }

    @Override // X.InterfaceC65895Ptb
    public abstract /* synthetic */ void checkin();

    @Override // X.InterfaceC65895Ptb
    public abstract /* synthetic */ Class<? extends Activity> getPushLoginActivityClass();

    @Override // X.InterfaceC65895Ptb
    public abstract /* synthetic */ boolean isEnableMultiAccountLogin();

    public abstract /* synthetic */ boolean isLoginActivity(Activity activity);

    public InterfaceC65895Ptb keepCallback() {
        this.mKeepCallback = true;
        return this;
    }

    public abstract /* synthetic */ void onShowLoginPanel();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.InterfaceC65895Ptb
    public abstract /* synthetic */ void openCountryListActivity(Activity activity, GBL gbl);

    public abstract /* synthetic */ void openFeedback(Activity activity, String str, String str2);

    public abstract /* synthetic */ void openPrivacyPolicy(Activity activity);

    @Override // X.InterfaceC65895Ptb
    public abstract /* synthetic */ void saveDTicket(String str, String str2);

    @Override // X.InterfaceC65895Ptb
    public abstract /* synthetic */ void showFTCCreateAccountView(Activity activity, boolean z);

    @Override // X.InterfaceC65895Ptb
    public abstract /* synthetic */ void switchAccount(SignificantUserInfo significantUserInfo, Bundle bundle, R4B r4b);

    @Override // X.InterfaceC65895Ptb
    public abstract /* synthetic */ boolean toRecoverDeletedAccount(String str);

    @Override // X.InterfaceC65895Ptb
    public abstract /* synthetic */ void tryUpdateStoredLoginPlatform();

    @Override // X.InterfaceC65895Ptb
    public abstract /* synthetic */ void uploadAccountNum(boolean z);

    public /* synthetic */ void lambda$computeNumOfUidsOnDevice$0() {
        Keva repo = KevaImpl.getRepo("uid_recorder", 0);
        String[] stringArray = repo.getStringArray("logged_in_uids", new String[20]);
        int i = repo.getInt("num_of_logged_in_uids", 0);
        try {
            String secUid = R41.LIZJ().getSecUid();
            if (!TextUtils.isEmpty(secUid) && !containsInArray(stringArray, Math.min(i, 20), secUid)) {
                stringArray[i % 20] = secUid;
                repo.storeStringArray("logged_in_uids", stringArray);
                repo.storeInt("num_of_logged_in_uids", i + 1);
            }
        } catch (NullPointerException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC65895Ptb
    public List<C40926G4k> getAllSupportedLoginPlatform() {
        return Collections.singletonList(new C40926G4k("Phone", "mobile"));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C78451Uqd c78451Uqd = this.mLoginParam;
        if (c78451Uqd != null) {
            ComponentCallbacks2 componentCallbacks2 = c78451Uqd.LIZ;
            if (componentCallbacks2 instanceof LifecycleOwner) {
                ((LifecycleOwner) componentCallbacks2).getLifecycle().removeObserver(this);
            }
        }
        this.mLoginParam = null;
        this.mPlatformParam = null;
    }

    private void computeNumOfUidsOnDevice() {
        C38995FSd.LIZIZ().execute(new IDRunnableS6S0101000(4, this, 27));
    }

    public String getLoginMobEnterFrom() {
        return R46.LIZIZ;
    }

    @Override // X.InterfaceC65895Ptb
    public String getLoginMobEnterMethod() {
        return R46.LIZ;
    }

    public C78451Uqd getLoginParam() {
        return this.mLoginParam;
    }

    @Override // X.InterfaceC65895Ptb
    public void showLoginAndRegisterView(C78451Uqd c78451Uqd) {
        this.mLoginParam = c78451Uqd;
        if (!c78451Uqd.LIZLLL.getBoolean("is_multi_account", false) && !F9J.LIZIZ(C58725N2z.LIZ, 0, "aweme_account_terminal_relative_sp").getBoolean("account_terminal_app_has_logged_out", true)) {
            C40535FvX.LIZIZ(true);
            String str = C67737QiD.LIZ;
            C198517qh c198517qh = new C198517qh();
            c198517qh.LIZLLL("type", "auto_logout");
            if (!TextUtils.isEmpty(str)) {
                c198517qh.LIZLLL("error_desc", str);
            }
            JSONObject LJ = c198517qh.LJ();
            o.LJIIIIZZ(LJ, "eventJsonBuilder.build()");
            Q13.LIZIZ("monitor_account_business", 1, LJ);
        }
        if (!this.mKeepCallback) {
            ComponentCallbacks2 componentCallbacks2 = c78451Uqd.LIZ;
            if (componentCallbacks2 instanceof LifecycleOwner) {
                ((LifecycleOwner) componentCallbacks2).getLifecycle().addObserver(this);
            }
        }
        this.mKeepCallback = false;
    }

    @Override // X.InterfaceC65895Ptb
    public void showLoginView(C78451Uqd c78451Uqd) {
        this.mLoginParam = c78451Uqd;
        R46.LIZ = c78451Uqd.LIZLLL.getString("enter_method", "");
        R46.LIZIZ = c78451Uqd.LIZLLL.getString("enter_from", "");
        R46.LIZJ = c78451Uqd.LIZLLL.getString("login_panel_type", "");
        if (!this.mKeepCallback) {
            ComponentCallbacks2 componentCallbacks2 = c78451Uqd.LIZ;
            if (componentCallbacks2 instanceof LifecycleOwner) {
                ((LifecycleOwner) componentCallbacks2).getLifecycle().addObserver(this);
            }
        }
        this.mKeepCallback = false;
    }

    @Override // X.InterfaceC65895Ptb
    public void loginByPlatform(C78451Uqd c78451Uqd, C40926G4k c40926G4k) {
        this.mPlatformParam = c78451Uqd;
        R46.LIZ = c78451Uqd.LIZLLL.getString("enter_method", "");
        R46.LIZIZ = c78451Uqd.LIZLLL.getString("enter_from", "");
        R46.LIZJ = c78451Uqd.LIZLLL.getString("login_panel_type", "");
        if (!this.mKeepCallback) {
            ComponentCallbacks2 componentCallbacks2 = c78451Uqd.LIZ;
            if (componentCallbacks2 instanceof LifecycleOwner) {
                ((LifecycleOwner) componentCallbacks2).getLifecycle().addObserver(this);
            }
        }
        this.mKeepCallback = false;
    }

    @Override // X.InterfaceC65895Ptb
    public void logout(String str, String str2) {
        logout(str, str2, null);
    }

    private boolean containsInArray(String[] strArr, int i, String str) {
        for (int i2 = 0; i2 < i; i2++) {
            if (TextUtils.equals(strArr[i2], str)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC65895Ptb
    public void logout(String str, String str2, InterfaceC65892PtY interfaceC65892PtY) {
        logout(str, str2, null, interfaceC65892PtY);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r9 == 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
    
        if (r8 != 10) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void notifyProgress(int r8, int r9, java.lang.String r10) {
        /*
            r7 = this;
            X.Uqd r0 = r7.mLoginParam
            if (r0 == 0) goto L23
            X.JJ5 r6 = r0.LJFF
            if (r6 == 0) goto L23
            X.JJ6 r6 = (X.JJ6) r6
            r6.getClass()
            r0 = 9
            r5 = 1
            if (r8 != r0) goto L24
            if (r9 != r5) goto L77
            X.IGg r0 = X.IWF.LJJLIIIIJ()
            r0.LJIILJJIL()
        L1b:
            X.2Iq r0 = new X.2Iq
            r0.<init>(r5)
            X.C2U8.LIZ(r0)
        L23:
            return
        L24:
            r1 = 4
            if (r8 != r5) goto L59
            r2 = 500(0x1f4, double:2.47E-321)
            if (r9 != r5) goto L44
            X.IGg r0 = X.IWF.LJJLIIIIJ()
            boolean r0 = r0.isPlaying()
            if (r0 == 0) goto L1b
            android.os.Handler r4 = r6.LIZ
            Y.ARunnableS1S0001000_6 r1 = new Y.ARunnableS1S0001000_6
            r0 = 20
            r1.<init>(r5, r0)
            r4.postDelayed(r1, r2)
            r6.LIZIZ = r5
            goto L1b
        L44:
            if (r9 != r1) goto L62
            boolean r0 = r6.LIZIZ
            if (r0 != 0) goto L4b
            goto L64
        L4b:
            android.os.Handler r5 = r6.LIZ
            Y.IDRunnableS6S0101000 r4 = new Y.IDRunnableS6S0101000
            r1 = 6
            r0 = 34
            r4.<init>(r1, r6, r0)
            r5.postDelayed(r4, r2)
            goto L64
        L59:
            if (r8 == r5) goto L62
            r0 = 7
            if (r8 == r0) goto L62
            r0 = 10
            if (r8 != r0) goto L77
        L62:
            if (r9 != r1) goto L77
        L64:
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            Y.ARunnableS1S0001000_6 r2 = new Y.ARunnableS1S0001000_6
            r1 = 0
            r0 = 23
            r2.<init>(r1, r0)
            r0 = 200(0xc8, double:9.9E-322)
            r3.postDelayed(r2, r0)
            goto L23
        L77:
            if (r9 != r5) goto L23
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.BaseLoginService.notifyProgress(int, int, java.lang.String):void");
    }

    public void returnResult(int i, int i2, Object obj) {
        R47 r47;
        R47 r472;
        C78451Uqd c78451Uqd = this.mLoginParam;
        if (c78451Uqd != null && (r472 = c78451Uqd.LJ) != null) {
            r472.onResult(i, i2, obj);
            this.mLoginParam = null;
        }
        C78451Uqd c78451Uqd2 = this.mPlatformParam;
        if (c78451Uqd2 != null && (r47 = c78451Uqd2.LJ) != null) {
            r47.onResult(i, i2, obj);
            this.mPlatformParam = null;
        }
    }

    @Override // X.InterfaceC65895Ptb
    public void logout(String str, String str2, Bundle bundle, InterfaceC65892PtY interfaceC65892PtY) {
        computeNumOfUidsOnDevice();
        if (R2X.LIZLLL == null) {
            synchronized (R2X.class) {
                if (R2X.LIZLLL == null) {
                    R2X.LIZLLL = new R2X();
                }
            }
        }
        R2X.LIZLLL.LIZIZ(str, str2, bundle, interfaceC65892PtY);
    }
}
