package X;

import fjb.a;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {123}, m = "invokeSuspend")
/* renamed from: X.3Bb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79753Bb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC64672gJ<T> LJLJI;
    public final /* synthetic */ AbstractC79813Bh<T> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79753Bb(AbstractC79813Bh abstractC79813Bh, InterfaceC64672gJ interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC64672gJ;
        this.LJLJJI = abstractC79813Bh;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C79753Bb c79753Bb = new C79753Bb(this.LJLJJI, this.LJLJI, interfaceC67352kd);
        c79753Bb.LJLILLLLZI = obj;
        return c79753Bb;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
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
            InterfaceC64672gJ<T> interfaceC64672gJ = this.LJLJI;
            XKM produceImpl = this.LJLJJI.produceImpl(interfaceC70422pa);
            this.LJLIL = 1;
            Object LIZIZ = C79943Bu.LIZIZ(interfaceC64672gJ, produceImpl, true, this);
            if (LIZIZ != obj2) {
                LIZIZ = C76800UCe.LIZ;
            }
            if (LIZIZ == obj2) {
                return obj2;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
