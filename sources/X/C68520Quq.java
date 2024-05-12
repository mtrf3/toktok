package X;

import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;

/* renamed from: X.Quq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68520Quq extends AbstractC65781Prl implements InterfaceC88472Yns<BaseLoginMethod, Boolean> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68520Quq(boolean z, boolean z2) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0074, code lost:
    
        if (r5.isExpired() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        if (r0.isUsernameAvailable() == true) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        if (r5.isHistoryLogin() != false) goto L14;
     */
    @Override // X.InterfaceC88472Yns
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke(com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod r5 = (com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod) r5
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.Boolean r0 = r5.isHistoryOff()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            kotlin.jvm.internal.o.LJ(r0, r1)
            boolean r0 = r4.LJLIL
            r3 = 0
            r2 = 1
            if (r0 != 0) goto L1a
            boolean r0 = r4.LJLILLLLZI
            if (r0 == 0) goto L64
        L1a:
            boolean r0 = r4.LJLILLLLZI
            if (r0 == 0) goto L36
            boolean r0 = r5.m102isOneClickLogin()
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.account.login.model.CommonUserInfo r0 = r5.getCommonUserInfo()
            if (r0 == 0) goto L31
            boolean r0 = r0.isUsernameAvailable()
            if (r0 != r2) goto L31
        L30:
            r3 = 1
        L31:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L36:
            java.lang.Boolean r0 = r5.isFromReInstallNet()
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 == 0) goto L49
            java.lang.Boolean r0 = r5.isTransToNormal()
            boolean r3 = kotlin.jvm.internal.o.LJ(r0, r1)
            goto L31
        L49:
            com.ss.android.ugc.aweme.account.login.model.LoginMethodName r1 = r5.getLoginMethodName()
            com.ss.android.ugc.aweme.account.login.model.LoginMethodName r0 = com.ss.android.ugc.aweme.account.login.model.LoginMethodName.DEFAULT
            if (r1 == r0) goto L31
            com.ss.android.ugc.aweme.account.login.model.CommonUserInfo r0 = r5.getCommonUserInfo()
            if (r0 == 0) goto L31
            boolean r0 = r0.isCommonInfoAvailable()
            if (r0 != r2) goto L31
            boolean r0 = r5.isHistoryLogin()
            if (r0 == 0) goto L31
            goto L30
        L64:
            X.QWD r0 = X.R41.LIZIZ
            com.ss.android.ugc.aweme.services.LoginMethodService r0 = r0.LJIIIZ()
            boolean r0 = r0.isTrustedEnvLoginFreshInstallEnable()
            if (r0 == 0) goto L31
            boolean r0 = r5.isExpired()
            if (r0 != 0) goto L31
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68520Quq.invoke(java.lang.Object):java.lang.Object");
    }
}
