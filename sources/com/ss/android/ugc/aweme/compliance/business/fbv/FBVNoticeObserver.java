package com.ss.android.ugc.aweme.compliance.business.fbv;

import X.C09G;
import X.C188727au;
import X.C221108m2;
import X.C254839zL;
import X.C26227ARb;
import X.C26231ARf;
import X.C34067DYp;
import X.C62822Ol8;
import X.C62897OmL;
import X.C62902OmQ;
import X.C62904OmS;
import X.C63014OoE;
import X.C6FL;
import X.C77117UOj;
import X.FMX;
import X.H7B;
import X.HG3;
import X.InterfaceC63015OoF;
import X.InterfaceC70422pa;
import X.RBY;
import X.UC0;
import X.X1D;
import X.XKQ;
import X.XKX;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes11.dex */
public final class FBVNoticeObserver implements GenericLifecycleObserver, C6FL {
    public final Context LJLIL;
    public final int LJLILLLLZI;
    public final C62902OmQ LJLJI;
    public final C62904OmS LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public final InterfaceC63015OoF LJLJLJ;
    public final IAccountService LJLJLLL;
    public final C62822Ol8 LJLL;
    public XKQ LJLLI;
    public C26231ARf LJLLILLLL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C09G.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C09G.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C09G.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C09G.LJFF(this, lifecycleOwner);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC67352kd<? super X.C76800UCe> r12) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.fbv.FBVNoticeObserver.LIZ(X.2kd):java.lang.Object");
    }

    public final void LIZIZ(FBVCheckResponse fBVCheckResponse) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("checkResponseHandle response status handle ");
        LIZ.append(fBVCheckResponse.status);
        H7B.LIZIZ("FBVNoticeObserver", X1D.LIZIZ(LIZ));
        int i = fBVCheckResponse.status;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                C62902OmQ c62902OmQ = this.LJLJI;
                c62902OmQ.LIZ().storeLong(c62902OmQ.LIZJ, fBVCheckResponse.timestampToCheckAgain);
                InterfaceC63015OoF interfaceC63015OoF = this.LJLJLJ;
                if (interfaceC63015OoF == null) {
                    return;
                }
                interfaceC63015OoF.LIZ();
                return;
            }
            if (this.LJLLILLLL == null && C34067DYp.LIZ) {
                C26227ARb c26227ARb = new C26227ARb(this.LJLIL);
                c26227ARb.LIZIZ(this.LJLIL.getString(R.string.g0j));
                c26227ARb.LJ(this.LJLILLLLZI);
                c26227ARb.LJII = false;
                UC0.LIZJ(c26227ARb, new AqS176S0100000_10(this, 99));
                c26227ARb.LJI = new C63014OoE(this);
                C77117UOj.LJIL(c26227ARb, this.LJLIL.getString(R.string.g0o), new AqS170S0100000_4(this, 917));
                C26231ARf c26231ARf = new C26231ARf(c26227ARb);
                this.LJLLILLLL = c26231ARf;
                c26231ARf.LIZLLL();
                LIZLLL("fbv_consent_popup_show");
                return;
            }
            InterfaceC63015OoF interfaceC63015OoF2 = this.LJLJLJ;
            if (interfaceC63015OoF2 == null) {
                return;
            }
            interfaceC63015OoF2.LIZ();
            return;
        }
        C62902OmQ c62902OmQ2 = this.LJLJI;
        c62902OmQ2.LIZ().storeBoolean(c62902OmQ2.LIZIZ, true);
        c62902OmQ2.LIZ().storeBoolean(c62902OmQ2.LIZLLL, false);
        InterfaceC63015OoF interfaceC63015OoF3 = this.LJLJLJ;
        if (interfaceC63015OoF3 == null) {
            return;
        }
        interfaceC63015OoF3.LIZ();
    }

    public final void LIZJ(boolean z) {
        String curUserId = this.LJLJLLL.LJFF().getCurUserId();
        String deviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        C62902OmQ c62902OmQ = this.LJLJI;
        c62902OmQ.LIZ().storeBoolean(c62902OmQ.LIZIZ, true);
        c62902OmQ.LIZ().storeBoolean(c62902OmQ.LIZLLL, false);
        if (!z) {
            LIZLLL("fbv_consent_popup_click_ok");
        }
        C62904OmS c62904OmS = this.LJLJJI;
        o.LJIIIIZZ(deviceId, "deviceId");
        AqS160S0100000_10 aqS160S0100000_10 = new AqS160S0100000_10(this, 147);
        AqS160S0100000_10 aqS160S0100000_102 = new AqS160S0100000_10(this, 148);
        c62904OmS.getClass();
        IPolicyNoticeService LJIIL = a.LJIIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{\"operation\": 2,\"approve_type\": \"user_id\", \"user_id\": ");
        LIZ.append(curUserId);
        LIZ.append(", \"device_id\": ");
        LIZ.append(deviceId);
        LIZ.append('}');
        LJIIL.LIZ("effect_fbv_policy_US_IL", "v20230328", "pop", X1D.LIZIZ(LIZ), 2, null, Boolean.FALSE, new AqS160S0100000_10(aqS160S0100000_10, 424), new AqS160S0100000_10(aqS160S0100000_102, 425));
    }

    public final void LIZLLL(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LJLJJLL);
        c188727au.LJIIIZ("shoot_way", this.LJLJJL);
        c188727au.LJIIIZ("creation_id", this.LJLJL);
        FMX.LJIIL(str, c188727au.LIZ);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onPause(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C09G.LIZJ(this, owner);
        C26231ARf c26231ARf = this.LJLLILLLL;
        if (c26231ARf != null) {
            c26231ARf.cancel();
        }
        owner.getLifecycle().removeObserver(this);
        XKQ xkq = this.LJLLI;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onResume(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        H7B.LIZIZ("FBVNoticeObserver", "onResume is executing");
        C09G.LIZLLL(this, owner);
        if (!((RBY) HG3.LJIILL()).isChildrenMode()) {
            this.LJLLI = XKX.LIZLLL((InterfaceC70422pa) this.LJLL.getValue(), null, null, new C254839zL(this, null), 3);
            return;
        }
        InterfaceC63015OoF interfaceC63015OoF = this.LJLJLJ;
        if (interfaceC63015OoF == null) {
            return;
        }
        interfaceC63015OoF.LIZ();
    }

    public FBVNoticeObserver(Context context, int i, C62902OmQ fbvCacheRepo, C62904OmS service, String str, String str2, String str3, InterfaceC63015OoF interfaceC63015OoF) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(fbvCacheRepo, "fbvCacheRepo");
        o.LJIIIZ(service, "service");
        this.LJLIL = context;
        this.LJLILLLLZI = i;
        this.LJLJI = fbvCacheRepo;
        this.LJLJJI = service;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = str3;
        this.LJLJLJ = interfaceC63015OoF;
        this.LJLJLLL = AccountService.LJIJ();
        this.LJLL = C221108m2.LIZIZ(C62897OmL.LJLIL);
    }
}
