package X;

import Y.IDeS362S0100000_10;
import Y.IDfS25S0200000_10;
import android.widget.TextView;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v2.CommerceMusicSubstituteMusicListHeaderViewHolder$1$1", f = "CommerceMusicSubstituteMusicListHeaderViewHolder.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class NE6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ N5K LJLILLLLZI;
    public final /* synthetic */ TextView LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NE6(N5K n5k, TextView textView, InterfaceC67352kd<? super NE6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = n5k;
        this.LJLJI = textView;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new NE6(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            InterfaceC65462ha LJIIJJI = V1M.LJIIJJI(new IDeS362S0100000_10(this.LJLILLLLZI.LJLJI, 2));
            IDfS25S0200000_10 iDfS25S0200000_10 = new IDfS25S0200000_10(this.LJLJI, this.LJLILLLLZI, 2);
            this.LJLIL = 1;
            if (LJIIJJI.collect(iDfS25S0200000_10, this) == enumC58928NAu) {
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