package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.account.login.passkey.PasskeyService;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.account.login.passkey.PasskeyService$getSavedCredentials$1", f = "PasskeyService.kt", l = {362}, m = "invokeSuspend")
/* renamed from: X.XlC, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85758XlC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;
    public final /* synthetic */ List<AbstractC22370uH> LJLJI;
    public final /* synthetic */ InterfaceC85767XlL LJLJJI;
    public final /* synthetic */ PasskeyService LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85758XlC(Activity activity, List<AbstractC22370uH> list, InterfaceC85767XlL interfaceC85767XlL, PasskeyService passkeyService, String str, InterfaceC67352kd<? super C85758XlC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = activity;
        this.LJLJI = list;
        this.LJLJJI = interfaceC85767XlL;
        this.LJLJJL = passkeyService;
        this.LJLJJLL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C85758XlC(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a1, code lost:
    
        if (X.AbstractC73635Sv9.LJ(new X.R9V("/passport/fido2/finish_discoverable_user_login/", r2)).LJIIZILJ(new Y.AfS60S0200000_11(r8, r7, 0), new Y.AfS67S0100000_15(r7, 18)) == null) goto L24;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85758XlC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
