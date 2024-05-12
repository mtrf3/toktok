package X;

import fjb.a;

@InterfaceC65848Psq(c = "tiktok.compose.paging.ComposeLoader$refresh$1", f = "ComposeLoader.kt", l = {113}, m = "invokeSuspend")
/* renamed from: X.SZo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72312SZo extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C72309SZl<T> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72312SZo(C72309SZl<T> c72309SZl, InterfaceC67352kd<? super C72312SZo> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c72309SZl;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72312SZo(this.LJLILLLLZI, interfaceC67352kd);
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
            C72309SZl<T> c72309SZl = this.LJLILLLLZI;
            this.LJLIL = 1;
            XKS xks = new XKS(1, C78555UsJ.LJJII(this));
            xks.LJIIL();
            c72309SZl.LJLILLLLZI = xks;
            c72309SZl.LJLIL.onRefresh(xks);
            obj = xks.LJIIJJI();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        A2G a2g = (A2G) obj;
        if (a2g instanceof A2V) {
            A2V a2v = (A2V) a2g;
            this.LJLILLLLZI.LJLJI = new OSZ<>(a2v.LIZJ, a2v.LIZIZ);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
