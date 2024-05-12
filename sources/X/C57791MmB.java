package X;

import com.ss.android.ugc.aweme.relation.fragment.muflist.MufUserCell;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.fragment.muflist.MufUserCell$onBindItemView$5", f = "MufUserCell.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.MmB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57791MmB extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ MufUserCell LJLIL;
    public final /* synthetic */ C57792MmC LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57791MmB(MufUserCell mufUserCell, C57792MmC c57792MmC, InterfaceC67352kd<? super C57791MmB> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLIL = mufUserCell;
        this.LJLILLLLZI = c57792MmC;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57791MmB(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.N(this.LJLILLLLZI, EnumC57793MmD.MESSAGE_BUTTON);
        return Boolean.FALSE;
    }
}
