package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.notification.vh.MTNewFansNotificationHolder$bind$1$3", f = "MTNewFansNotificationHolder.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.MVu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56926MVu extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ C56916MVk LJLIL;
    public final /* synthetic */ BaseNotice LJLILLLLZI;
    public final /* synthetic */ User LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56926MVu(C56916MVk c56916MVk, BaseNotice baseNotice, User user, InterfaceC67352kd<? super C56926MVu> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLIL = c56916MVk;
        this.LJLILLLLZI = baseNotice;
        this.LJLJI = user;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C56926MVu(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C56916MVk c56916MVk = this.LJLIL;
        String accountType = this.LJLILLLLZI.getAccountType();
        if (accountType == null) {
            accountType = "";
        }
        BaseNotice baseNotice = this.LJLILLLLZI;
        int i = baseNotice.clientOrder;
        C56916MVk c56916MVk2 = this.LJLIL;
        String str = c56916MVk2.LJLLI;
        String str2 = c56916MVk2.LJLL;
        boolean z = baseNotice.hasRead;
        c56916MVk.logNotificationAction("click", accountType, i, baseNotice, true, "", str, str2, z ? 1 : 0, this.LJLJI, 0, c56916MVk2.N(), this.LJLIL.P());
        return Boolean.FALSE;
    }
}
