package com.ss.android.ugc.aweme.services;

import X.AbstractC65781Prl;
import X.C69084R9k;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.MLL;
import X.R5Y;
import android.app.Activity;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class SmartLockService$smartLockAccountLogin$failAction$1 extends AbstractC65781Prl implements InterfaceC88472Yns<Throwable, C76800UCe> {
    public final /* synthetic */ MLL $account;
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ String $enterFrom;
    public final /* synthetic */ R5Y $smartLockLoginListener;
    public final /* synthetic */ long $submitTime;
    public final /* synthetic */ SmartLockService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartLockService$smartLockAccountLogin$failAction$1(Activity activity, MLL mll, long j, String str, R5Y r5y, SmartLockService smartLockService) {
        super(1);
        this.$activity = activity;
        this.$account = mll;
        this.$submitTime = j;
        this.$enterFrom = str;
        this.$smartLockLoginListener = r5y;
        this.this$0 = smartLockService;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable exception) {
        int i;
        o.LJIIIZ(exception, "exception");
        if (exception instanceof C69084R9k) {
            i = ((C69084R9k) exception).getErrorCode();
        } else {
            i = 0;
        }
        SmartLockEventHelper.INSTANCE.onLoginFail$account_awemeaccount_release(this.$activity, this.$account, this.$submitTime, this.$enterFrom, i);
        this.$smartLockLoginListener.onFailure();
        this.this$0.onComplete();
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ C76800UCe invoke(Throwable th) {
        invoke2(th);
        return C76800UCe.LIZ;
    }
}
