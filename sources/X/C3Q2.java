package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.search.data.searchcontent.GroupSearchContentUpdateEngine$fullUpdate$overallCost$1$1", f = "GroupSearchContentUpdateEngine.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Q2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Q2 extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super List<? extends C63120Opw>>, Object> {
    public final /* synthetic */ C83593Pv LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3Q2(C83593Pv c83593Pv, InterfaceC67352kd<? super C3Q2> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLIL = c83593Pv;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3Q2(this.LJLIL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super List<? extends C63120Opw>> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return this.LJLIL.LJFF.LJ();
    }
}
