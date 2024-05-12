package X;

import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.user.AccountModifyUserNameComponent;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.user.AccountModifyUserNameComponent$showTTChangeUsernameBubble$1$2", f = "AccountModifyUserNameComponent.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2eT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63532eT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AccountModifyUserNameComponent LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63532eT(AccountModifyUserNameComponent accountModifyUserNameComponent, InterfaceC67352kd<? super C63532eT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = accountModifyUserNameComponent;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63532eT(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC82683Wch interfaceC82683Wch = this.LJLIL.LJLJLJ;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.show();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
