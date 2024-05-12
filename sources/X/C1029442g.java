package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter.AbsMessageAdapter$submitListDelegate$newJob$1", f = "AbsMessageAdapter.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.42g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1029442g extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ AbstractC1029742j LJLILLLLZI;
    public final /* synthetic */ List<C109544Rq> LJLJI;
    public final /* synthetic */ Runnable LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1029442g(AbstractC1029742j abstractC1029742j, List<? extends C109544Rq> list, Runnable runnable, InterfaceC67352kd<? super C1029442g> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = abstractC1029742j;
        this.LJLJI = list;
        this.LJLJJI = runnable;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C1029442g c1029442g = new C1029442g(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c1029442g.LJLIL = obj;
        return c1029442g;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLIL;
        C3Y6 c3y6 = new C3Y6(0);
        C84683Ua c84683Ua = C84683Ua.LJFF;
        c84683Ua.LIZIZ(c3y6, true);
        List list = (List) this.LJLILLLLZI.LJLJLJ.invoke(this.LJLJI);
        C79146V4k.LJJIIJ(interfaceC70422pa.getCoroutineContext());
        this.LJLILLLLZI.submitList(list, this.LJLJJI);
        c84683Ua.LIZ(c3y6, C46B.LIZLLL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
