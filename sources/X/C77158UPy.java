package X;

import Y.IDfS133S0100000_13;
import fjb.a;
import kotlin.jvm.internal.AqS144S0200000_13;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.controller.ContactsInvitePanelController$newAuthFlow$1", f = "ContactsInvitePanelController.kt", l = {233}, m = "invokeSuspend")
/* renamed from: X.UPy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77158UPy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C63804P2i LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77158UPy(C63804P2i c63804P2i, InterfaceC67352kd<? super C77158UPy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c63804P2i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C77158UPy c77158UPy = new C77158UPy(this.LJLJI, interfaceC67352kd);
        c77158UPy.LJLILLLLZI = obj;
        return c77158UPy;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            C63804P2i c63804P2i = this.LJLJI;
            C3C3 LIZ = ((USE) C77125UOr.LJII(c63804P2i.LIZ, new AqS144S0200000_13(interfaceC70422pa, c63804P2i, 63))).LIZ();
            IDfS133S0100000_13 iDfS133S0100000_13 = new IDfS133S0100000_13(this.LJLJI, 2);
            this.LJLIL = 1;
            if (LIZ.collect(iDfS133S0100000_13, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
