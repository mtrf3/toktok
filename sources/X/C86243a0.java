package X;

import fjb.a;
import java.util.List;

/* JADX INFO: Add missing generic type declarations: [SEARCH_RESULT] */
@InterfaceC65848Psq(c = "com.bytedance.im.core.search.IMSearchEngine$doQuery$11", f = "IMSearchEngine.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3a0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86243a0<SEARCH_RESULT> extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super List<? extends SEARCH_RESULT>>, Object> {
    public final /* synthetic */ C86233Zz<SEARCH_RESULT> LJLIL;
    public final /* synthetic */ List<C86033Zf> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86243a0(C86233Zz<SEARCH_RESULT> c86233Zz, List<C86033Zf> list, InterfaceC67352kd<? super C86243a0> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLIL = c86233Zz;
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C86243a0(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        return ((a) create((InterfaceC67352kd) obj)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return this.LJLIL.LIZIZ.LIZ(this.LJLILLLLZI);
    }
}