package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.im.core.search.IMSearchEngine$doQuery$5", f = "IMSearchEngine.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Zk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86083Zk extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super List<? extends C86023Ze>>, Object> {
    public final /* synthetic */ InterfaceC88472Yns<String, List<C86023Ze>> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86083Zk(String str, InterfaceC67352kd interfaceC67352kd, InterfaceC88472Yns interfaceC88472Yns) {
        super(1, interfaceC67352kd);
        this.LJLIL = interfaceC88472Yns;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C86083Zk(this.LJLILLLLZI, interfaceC67352kd, this.LJLIL);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super List<? extends C86023Ze>> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return this.LJLIL.invoke(this.LJLILLLLZI);
    }
}
