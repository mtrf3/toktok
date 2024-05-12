package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.editSticker.text.effect.EffectEditText$initRes$1", f = "EffectEditText.kt", l = {107}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ETH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ WH4 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ETH(WH4 wh4, InterfaceC67352kd<? super ETH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = wh4;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new ETH(this.LJLILLLLZI, interfaceC67352kd);
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
            WH4 wh4 = this.LJLILLLLZI;
            this.LJLIL = 1;
            Object LJI = XKX.LJI(C78613UtF.LIZJ, new W3B(wh4.LJLJJLL, wh4, null), this);
            if (LJI != obj2) {
                LJI = C76800UCe.LIZ;
            }
            if (LJI == obj2) {
                return obj2;
            }
        }
        this.LJLILLLLZI.requestLayout();
        this.LJLILLLLZI.invalidate();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
