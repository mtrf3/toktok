package X;

import Y.IDfS125S0100000;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.sticker.list.FavoriteStickerListView$observeViewModel$1", f = "FavoriteStickerListView.kt", l = {121}, m = "invokeSuspend")
/* renamed from: X.29x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C539729x extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C29581Ec LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C539729x(C29581Ec c29581Ec, InterfaceC67352kd<? super C539729x> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c29581Ec;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C539729x(this.LJLILLLLZI, interfaceC67352kd);
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
            C29581Ec c29581Ec = this.LJLILLLLZI;
            XLL xll = c29581Ec.LJIILJJIL.LJLJI;
            IDfS125S0100000 iDfS125S0100000 = new IDfS125S0100000(c29581Ec, 7);
            this.LJLIL = 1;
            if (xll.collect(iDfS125S0100000, this) == enumC58928NAu) {
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
