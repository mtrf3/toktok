package X;

import com.ss.android.ugc.aweme.profile.model.User;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.common.observer.AccountObserver$onAccountResult$1", f = "AccountObserver.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2oD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69572oD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ User LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69572oD(User user, InterfaceC67352kd<? super C69572oD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = user;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69572oD(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String curUserId;
        C141335gf.LIZJ(obj);
        User user = this.LJLIL;
        if ((user == null || (curUserId = user.getUid()) == null) && (curUserId = ((RBX) HG3.LJIILL()).getCurUserId()) == null) {
            curUserId = "";
        }
        if (!o.LJ(C69582oE.LIZ(), curUserId)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("new user login: ");
            LIZ.append(C69582oE.LIZ());
            LIZ.append(" -> ");
            LIZ.append(curUserId);
            C69542oA.LIZIZ("AccountObserver", X1D.LIZIZ(LIZ));
            C69582oE.LJLILLLLZI.setValue(curUserId);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
