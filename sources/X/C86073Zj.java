package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.im.core.search.IMSearchEngine$doQuery$8", f = "IMSearchEngine.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Zj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86073Zj extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super List<? extends C86033Zf>>, Object> {
    public final /* synthetic */ InterfaceC88471Ynr<List<C86023Ze>, String, List<C86033Zf>> LJLIL;
    public final /* synthetic */ List<C86023Ze> LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C86073Zj(InterfaceC88471Ynr<? super List<C86023Ze>, ? super String, ? extends List<C86033Zf>> interfaceC88471Ynr, List<C86023Ze> list, String str, InterfaceC67352kd<? super C86073Zj> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLIL = interfaceC88471Ynr;
        this.LJLILLLLZI = list;
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C86073Zj(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super List<? extends C86033Zf>> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return this.LJLIL.invoke(this.LJLILLLLZI, this.LJLJI);
    }
}
