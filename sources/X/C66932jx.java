package X;

import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardContainerSharedVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardContainerSharedVM$getProtocols$1", f = "SearchCardProtocolManager.kt", l = {168}, m = "invokeSuspend")
/* renamed from: X.2jx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66932jx extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SearchCardContainerSharedVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66932jx(SearchCardContainerSharedVM searchCardContainerSharedVM, InterfaceC67352kd<? super C66932jx> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = searchCardContainerSharedVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66932jx(this.LJLILLLLZI, interfaceC67352kd);
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
            XKQ xkq = this.LJLILLLLZI.LJLJI;
            if (xkq != null) {
                this.LJLIL = 1;
                if (xkq.LJJJJ(this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                return null;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
