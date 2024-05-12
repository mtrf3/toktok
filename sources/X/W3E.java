package X;

import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel$1", f = "EffectInfoViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class W3E extends AbstractC65782Prm implements InterfaceC88471Ynr<W27, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ EffectInfoViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W3E(EffectInfoViewModel effectInfoViewModel, InterfaceC67352kd<? super W3E> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = effectInfoViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        W3E w3e = new W3E(this.LJLILLLLZI, interfaceC67352kd);
        w3e.LJLIL = obj;
        return w3e;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLILLLLZI.aw0((W27) this.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(W27 w27, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(w27, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
