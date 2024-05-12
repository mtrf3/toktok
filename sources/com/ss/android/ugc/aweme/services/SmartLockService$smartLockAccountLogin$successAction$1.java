package com.ss.android.ugc.aweme.services;

import X.AbstractC65781Prl;
import X.C68922R3e;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.MLL;
import X.R5Y;
import android.app.Activity;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class SmartLockService$smartLockAccountLogin$successAction$1 extends AbstractC65781Prl implements InterfaceC88472Yns<C68922R3e, C76800UCe> {
    public final /* synthetic */ MLL $account;
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ String $enterFrom;
    public final /* synthetic */ boolean $keepActivity;
    public final /* synthetic */ R5Y $smartLockLoginListener;
    public final /* synthetic */ long $submitTime;
    public final /* synthetic */ SmartLockService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartLockService$smartLockAccountLogin$successAction$1(SmartLockService smartLockService, R5Y r5y, Activity activity, MLL mll, boolean z, long j, String str) {
        super(1);
        this.this$0 = smartLockService;
        this.$smartLockLoginListener = r5y;
        this.$activity = activity;
        this.$account = mll;
        this.$keepActivity = z;
        this.$submitTime = j;
        this.$enterFrom = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C68922R3e response) {
        o.LJIIIZ(response, "response");
        this.this$0.isLoginSuccessBySmartLock = true;
        this.$smartLockLoginListener.onSuccess();
        this.this$0.loginByToken(this.$activity, this.$account, response, this.$keepActivity);
        SmartLockEventHelper.INSTANCE.onLoginSuccess$account_awemeaccount_release(this.$activity, this.$account, this.$submitTime, this.$enterFrom);
        this.this$0.onComplete();
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ C76800UCe invoke(C68922R3e c68922R3e) {
        invoke2(c68922R3e);
        return C76800UCe.LIZ;
    }
}
