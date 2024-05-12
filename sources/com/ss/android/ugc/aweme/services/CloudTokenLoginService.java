package com.ss.android.ugc.aweme.services;

import X.C1DH;
import X.C53262KvK;
import X.C58096Mr6;
import X.C68517Qun;
import X.C68710Qxu;
import X.C68922R3e;
import X.C69084R9k;
import X.C73969T1h;
import X.C76800UCe;
import X.C78685UuP;
import X.C79004UzY;
import X.EnumC69116RAq;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC68422QtG;
import X.InterfaceC88472Yns;
import X.R41;
import X.R47;
import X.R5I;
import X.R5J;
import X.R5K;
import X.R5L;
import X.R5M;
import X.R5Q;
import X.T16;
import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.ICloudTokenLoginService;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS18S2100000_11;
import kotlin.jvm.internal.AqS193S0100000_11;
import kotlin.jvm.internal.AqS34S1000000_11;
import kotlin.jvm.internal.AqS49S1000000_11;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class CloudTokenLoginService implements ICloudTokenLoginService {
    public static final Companion Companion = new Companion();

    @Override // com.ss.android.ugc.aweme.ICloudTokenLoginService
    public boolean shouldShowOneClickLoginPanel() {
        List<BaseLoginMethod> LJ = C68517Qun.LIZ.LJ(R41.LIZIZ.LJFF().allUidList());
        if (C53262KvK.LIZIZ() && !C79004UzY.LJJIFFI(LJ)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ICloudTokenLoginService
    public void attemptRefreshTokenAfterLoginForCurrentUser() {
        boolean contains;
        String LIZLLL = R41.LIZLLL();
        synchronized (C68710Qxu.LIZ) {
            contains = C68710Qxu.LIZJ.contains(LIZLLL);
        }
        if (!C68517Qun.LIZ.LJIIJ() || !contains) {
            return;
        }
        enableCloudTokenForOneClickLogin(true, R5M.REFRESH, "background_refresh", null, new AqS49S1000000_11(LIZLLL, 0), new AqS34S1000000_11(LIZLLL, 0));
    }

    /* loaded from: classes11.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public static ICloudTokenLoginService createICloudTokenLoginServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(ICloudTokenLoginService.class, z);
        if (LIZ != null) {
            return (ICloudTokenLoginService) LIZ;
        }
        if (C58096Mr6.H5 == null) {
            synchronized (ICloudTokenLoginService.class) {
                if (C58096Mr6.H5 == null) {
                    C58096Mr6.H5 = new CloudTokenLoginService();
                }
            }
        }
        return C58096Mr6.H5;
    }

    public void enableCloudToken(R5M source, boolean z, final InterfaceC88472Yns<? super String, C76800UCe> onSuccess, final InterfaceC88472Yns<? super Integer, C76800UCe> onFailure) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(onSuccess, "onSuccess");
        o.LJIIIZ(onFailure, "onFailure");
        R5L.LIZIZ(z, source).LJIJJ(T16.LIZ()).LJIIL(C73969T1h.LIZIZ()).LJIIZILJ(new InterfaceC64592gB() { // from class: com.ss.android.ugc.aweme.services.CloudTokenLoginService$enableCloudToken$1
            @Override // X.InterfaceC64592gB
            public final void accept(C68922R3e c68922R3e) {
                String token = c68922R3e.LJIILJJIL.optString("cloud_token");
                if (C78685UuP.LJJJZ(token)) {
                    InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = onSuccess;
                    o.LJIIIIZZ(token, "token");
                    interfaceC88472Yns.invoke(token);
                }
            }
        }, new InterfaceC64592gB() { // from class: com.ss.android.ugc.aweme.services.CloudTokenLoginService$enableCloudToken$2
            @Override // X.InterfaceC64592gB
            public final void accept(Throwable th) {
                InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns = onFailure;
                o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
                interfaceC88472Yns.invoke(Integer.valueOf(((C69084R9k) th).getErrorCode()));
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ICloudTokenLoginService
    public void tryStartMandatoryOneClickLogin(final Activity activity, final Bundle bundle, final InterfaceC65784Pro<C76800UCe> successCallback, final InterfaceC65784Pro<C76800UCe> failureCallback) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(bundle, "bundle");
        o.LJIIIZ(successCallback, "successCallback");
        o.LJIIIZ(failureCallback, "failureCallback");
        if (C53262KvK.LIZIZ()) {
            C68517Qun c68517Qun = C68517Qun.LIZ;
            C68517Qun.LJIILIIL();
            final List<BaseLoginMethod> LJ = c68517Qun.LJ(R41.LIZIZ.LJFF().allUidList());
            activity.runOnUiThread(new Runnable() { // from class: com.ss.android.ugc.aweme.services.CloudTokenLoginService$tryStartMandatoryOneClickLogin$1
                public final void com_ss_android_ugc_aweme_services_CloudTokenLoginService$tryStartMandatoryOneClickLogin$1__run$___twin___() {
                    Activity activity2 = activity;
                    Bundle bundle2 = bundle;
                    if (bundle2.getSerializable("extra_param") == null) {
                        bundle2.putSerializable("extra_param", new HashMap());
                    }
                    bundle2.putBoolean("is_fullscreen_dialog", false);
                    bundle2.putBoolean("is_mandatory_ocl", true);
                    List<BaseLoginMethod> list = LJ;
                    final InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = successCallback;
                    final InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = failureCallback;
                    R5I.LIZ(activity2, bundle2, list, new R47() { // from class: com.ss.android.ugc.aweme.services.CloudTokenLoginService$tryStartMandatoryOneClickLogin$1.2
                        @Override // X.R47
                        public final void onResult(int i, int i2, Object obj) {
                            R41.LJIIJJI(10, 4);
                            if (i2 == 1) {
                                interfaceC65784Pro.invoke();
                                if (i == EnumC69116RAq.ONE_KEY_LOGIN.getValue()) {
                                    R41.LJIIL(1, 1, "");
                                    R41.LJIIIIZZ(R41.LIZJ());
                                    return;
                                }
                                return;
                            }
                            interfaceC65784Pro2.invoke();
                            C1DH.LJJIJIIJIL(200L, new Runnable() { // from class: com.ss.android.ugc.aweme.services.CloudTokenLoginService.tryStartMandatoryOneClickLogin.1.2.1
                                public final void com_ss_android_ugc_aweme_services_CloudTokenLoginService$tryStartMandatoryOneClickLogin$1$2$1__run$___twin___() {
                                    R41.LJIIL(1, 3, "");
                                    R41.LJIIIZ();
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    com_ss_android_ugc_aweme_services_CloudTokenLoginService$tryStartMandatoryOneClickLogin$1$2$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                                }

                                public static void com_ss_android_ugc_aweme_services_CloudTokenLoginService$tryStartMandatoryOneClickLogin$1$2$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                                    boolean LIZ;
                                    try {
                                        anonymousClass1.com_ss_android_ugc_aweme_services_CloudTokenLoginService$tryStartMandatoryOneClickLogin$1$2$1__run$___twin___();
                                    } finally {
                                        if (LIZ) {
                                        }
                                    }
                                }
                            });
                        }
                    });
                }

                @Override // java.lang.Runnable
                public final void run() {
                    com_ss_android_ugc_aweme_services_CloudTokenLoginService$tryStartMandatoryOneClickLogin$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public static void com_ss_android_ugc_aweme_services_CloudTokenLoginService$tryStartMandatoryOneClickLogin$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(CloudTokenLoginService$tryStartMandatoryOneClickLogin$1 cloudTokenLoginService$tryStartMandatoryOneClickLogin$1) {
                    boolean LIZ;
                    try {
                        cloudTokenLoginService$tryStartMandatoryOneClickLogin$1.com_ss_android_ugc_aweme_services_CloudTokenLoginService$tryStartMandatoryOneClickLogin$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
            return;
        }
        failureCallback.invoke();
    }

    public void cloudTokenLogin(String uid, String token, R5J scene, final InterfaceC88472Yns<? super C68922R3e, C76800UCe> onSuccess, final InterfaceC88472Yns<? super Throwable, C76800UCe> onFail) {
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(token, "token");
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(onSuccess, "onSuccess");
        o.LJIIIZ(onFail, "onFail");
        R5L.LIZJ(uid, token, scene, 16).LJIJJ(T16.LIZ()).LJIIL(C73969T1h.LIZIZ()).LJIIZILJ(new InterfaceC64592gB() { // from class: com.ss.android.ugc.aweme.services.CloudTokenLoginService$cloudTokenLogin$1
            @Override // X.InterfaceC64592gB
            public final void accept(C68922R3e it) {
                InterfaceC88472Yns<C68922R3e, C76800UCe> interfaceC88472Yns = onSuccess;
                o.LJIIIIZZ(it, "it");
                interfaceC88472Yns.invoke(it);
            }
        }, new InterfaceC64592gB() { // from class: com.ss.android.ugc.aweme.services.CloudTokenLoginService$cloudTokenLogin$2
            @Override // X.InterfaceC64592gB
            public final void accept(Throwable it) {
                InterfaceC88472Yns<Throwable, C76800UCe> interfaceC88472Yns = onFail;
                o.LJIIIIZZ(it, "it");
                interfaceC88472Yns.invoke(it);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ICloudTokenLoginService
    public void enableCloudTokenForOneClickLogin(boolean z, R5M source, String enterFrom, String str, InterfaceC65784Pro<C76800UCe> onSuccess, InterfaceC88472Yns<? super Integer, C76800UCe> onFailure) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(onSuccess, "onSuccess");
        o.LJIIIZ(onFailure, "onFailure");
        enableCloudToken(source, z, new AqS18S2100000_11((InterfaceC65784Pro) onSuccess, (InterfaceC65784Pro<C76800UCe>) enterFrom, str, (String) 0), new AqS18S2100000_11(enterFrom, str, (String) onFailure, (InterfaceC88472Yns<? super Integer, C76800UCe>) 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (r12 == null) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void cloudTokenLoginWithLoginSuccess(android.app.Activity r20, java.lang.String r21, java.lang.String r22, boolean r23, X.R5J r24, java.util.Map<java.lang.String, ? extends java.lang.Object> r25, X.InterfaceC88471Ynr<? super java.lang.String, ? super java.lang.String, X.C76800UCe> r26, X.InterfaceC88472Yns<? super java.lang.Integer, X.C76800UCe> r27) {
        /*
            r19 = this;
            java.lang.String r0 = "scene"
            r3 = r24
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "onSuccess"
            r10 = r26
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.String r1 = "onFailure"
            r0 = r27
            kotlin.jvm.internal.o.LJIIIZ(r0, r1)
            r8 = r20
            if (r8 == 0) goto L21
            if (r21 == 0) goto L21
            int r1 = r21.length()
            if (r1 != 0) goto L2a
        L21:
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.invoke(r1)
            return
        L2a:
            r11 = r22
            if (r11 == 0) goto L21
            int r1 = r11.length()
            if (r1 != 0) goto L35
            goto L21
        L35:
            r2 = r25
            if (r2 == 0) goto L41
            java.lang.String r1 = "platform"
            java.lang.Object r1 = r2.get(r1)
            if (r1 != 0) goto L43
        L41:
            java.lang.String r1 = ""
        L43:
            java.lang.String r5 = r1.toString()
            X.2mC r6 = new X.2mC
            r6.<init>()
            java.lang.String r1 = "MOB_PARAMS_PROVIDER"
            if (r2 == 0) goto L56
            java.lang.Object r12 = r2.get(r1)
            if (r12 != 0) goto L67
        L56:
            X.OoQ r12 = new X.OoQ
            java.lang.String r13 = ""
            java.lang.String r14 = ""
            java.lang.String r15 = ""
            java.lang.String r16 = ""
            java.lang.String r17 = ""
            r18 = 0
            r12.<init>(r13, r14, r15, r16, r17, r18)
        L67:
            r6.element = r12
            if (r2 == 0) goto L91
            java.util.Map r7 = X.C113554cx.LJJLIL(r2)
            r7.remove(r1)
        L72:
            com.ss.android.ugc.aweme.services.CloudTokenLoginService$cloudTokenLoginWithLoginSuccess$1$successCallback$1 r4 = new com.ss.android.ugc.aweme.services.CloudTokenLoginService$cloudTokenLoginWithLoginSuccess$1$successCallback$1
            r9 = r23
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            kotlin.jvm.internal.AqS33S1300000_11 r12 = new kotlin.jvm.internal.AqS33S1300000_11
            r17 = 0
            r13 = r5
            r14 = r6
            r15 = r7
            r16 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            r20 = r11
            r22 = r3
            r23 = r4
            r24 = r12
            r19.cloudTokenLogin(r20, r21, r22, r23, r24)
            return
        L91:
            r7 = 0
            goto L72
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.CloudTokenLoginService.cloudTokenLoginWithLoginSuccess(android.app.Activity, java.lang.String, java.lang.String, boolean, X.R5J, java.util.Map, X.Ynr, X.Yns):void");
    }

    @Override // com.ss.android.ugc.aweme.ICloudTokenLoginService
    public void disableTokenForOneClickLogin(String oneClickLoginToken, String uid, boolean z, R5K source, final String enterFrom, final String str, final InterfaceC65784Pro<C76800UCe> onSuccess, final InterfaceC88472Yns<? super Integer, C76800UCe> onFailure) {
        o.LJIIIZ(oneClickLoginToken, "oneClickLoginToken");
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(onSuccess, "onSuccess");
        o.LJIIIZ(onFailure, "onFailure");
        R5L.LIZ(uid, oneClickLoginToken, z ? 1 : 0, source).LJIJJ(T16.LIZ()).LJIIL(C73969T1h.LIZIZ()).LJIIZILJ(new InterfaceC64592gB() { // from class: com.ss.android.ugc.aweme.services.CloudTokenLoginService$disableTokenForOneClickLogin$1
            @Override // X.InterfaceC64592gB
            public final void accept(C68922R3e c68922R3e) {
                C68517Qun c68517Qun = C68517Qun.LIZ;
                final String str2 = enterFrom;
                final String str3 = str;
                InterfaceC68422QtG interfaceC68422QtG = new InterfaceC68422QtG() { // from class: com.ss.android.ugc.aweme.services.CloudTokenLoginService$disableTokenForOneClickLogin$1.1
                    @Override // X.InterfaceC68422QtG
                    public final void onSave(boolean z2, Integer num) {
                        R5Q.LJI(str2, str3, z2, Boolean.FALSE, num);
                    }
                };
                synchronized (c68517Qun) {
                    String currentUid = R41.LIZLLL();
                    if (C78685UuP.LJJJZ(currentUid)) {
                        o.LJIIIIZZ(currentUid, "currentUid");
                        c68517Qun.LIZIZ(currentUid);
                        c68517Qun.LIZJ(currentUid, interfaceC68422QtG);
                    }
                }
                onSuccess.invoke();
            }
        }, new InterfaceC64592gB() { // from class: com.ss.android.ugc.aweme.services.CloudTokenLoginService$disableTokenForOneClickLogin$2
            @Override // X.InterfaceC64592gB
            public final void accept(Throwable th) {
                o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
                int errorCode = ((C69084R9k) th).getErrorCode();
                onFailure.invoke(Integer.valueOf(errorCode));
                R5Q.LJI(enterFrom, str, false, Boolean.FALSE, Integer.valueOf(errorCode));
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ICloudTokenLoginService
    public void oneClickLogin(Activity activity, String str, String str2, boolean z, R5J scene, Map<String, ? extends Object> map, InterfaceC65784Pro<C76800UCe> onSuccess, InterfaceC88472Yns<? super Integer, C76800UCe> onFailure) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(onSuccess, "onSuccess");
        o.LJIIIZ(onFailure, "onFailure");
        cloudTokenLoginWithLoginSuccess(activity, str, str2, z, scene, map, new AqS193S0100000_11(onSuccess, (InterfaceC65784Pro<C76800UCe>) 5), onFailure);
    }
}
