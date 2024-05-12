package com.ss.android.ugc.aweme.services;

import X.AbstractC65781Prl;
import X.C68922R3e;
import X.C69084R9k;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.MLL;
import android.os.Handler;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class SmartLockService$smartLockAccountLogin$retryAction$1 extends AbstractC65781Prl implements InterfaceC88472Yns<Throwable, C76800UCe> {
    public final /* synthetic */ MLL $account;
    public final /* synthetic */ InterfaceC88472Yns<Throwable, C76800UCe> $failAction;
    public final /* synthetic */ InterfaceC88472Yns<C68922R3e, C76800UCe> $successAction;
    public final /* synthetic */ SmartLockService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SmartLockService$smartLockAccountLogin$retryAction$1(SmartLockService smartLockService, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, MLL mll, InterfaceC88472Yns<? super C68922R3e, C76800UCe> interfaceC88472Yns2) {
        super(1);
        this.this$0 = smartLockService;
        this.$failAction = interfaceC88472Yns;
        this.$account = mll;
        this.$successAction = interfaceC88472Yns2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable exception) {
        int errorCode;
        o.LJIIIZ(exception, "exception");
        if (!(exception instanceof C69084R9k) || ((errorCode = ((C69084R9k) exception).getErrorCode()) != 17 && errorCode != 2035)) {
            this.$failAction.invoke(exception);
            return;
        }
        final SmartLockService smartLockService = this.this$0;
        Handler handler = smartLockService.handler;
        final MLL mll = this.$account;
        final InterfaceC88472Yns<C68922R3e, C76800UCe> interfaceC88472Yns = this.$successAction;
        final InterfaceC88472Yns<Throwable, C76800UCe> interfaceC88472Yns2 = this.$failAction;
        handler.postDelayed(new Runnable() { // from class: com.ss.android.ugc.aweme.services.SmartLockService$smartLockAccountLogin$retryAction$1.1
            @Override // java.lang.Runnable
            public final void run() {
                com_ss_android_ugc_aweme_services_SmartLockService$smartLockAccountLogin$retryAction$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public final void com_ss_android_ugc_aweme_services_SmartLockService$smartLockAccountLogin$retryAction$1$1__run$___twin___() {
                SmartLockService.this.realLoginBySmartLock(mll, interfaceC88472Yns, interfaceC88472Yns2);
            }

            public static void com_ss_android_ugc_aweme_services_SmartLockService$smartLockAccountLogin$retryAction$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_android_ugc_aweme_services_SmartLockService$smartLockAccountLogin$retryAction$1$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }, 600L);
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ C76800UCe invoke(Throwable th) {
        invoke2(th);
        return C76800UCe.LIZ;
    }
}
