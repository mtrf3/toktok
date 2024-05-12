package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.IMUserRepository$getLocalUserWithDBAsync$1$3", f = "IMUserRepository.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3EZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3EZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C3EU LJLIL;
    public final /* synthetic */ IMUser LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3EZ(C3EU c3eu, IMUser iMUser, InterfaceC67352kd<? super C3EZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c3eu;
        this.LJLILLLLZI = iMUser;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3EZ(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C3EU c3eu = this.LJLIL;
        if (c3eu != null) {
            c3eu.LIZ(this.LJLILLLLZI);
            return C76800UCe.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
