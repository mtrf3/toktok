package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$dealCategoryEffectsOperate$1$1$1$1$3", f = "DefaultStickerSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class TJ7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ TJ6 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TJ7(TJ6 tj6, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = tj6;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new TJ7(this.LJLIL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        TJ6 tj6 = this.LJLIL;
        ((C74418TIo) tj6.LJLJJI.l0).LJIILLIIL(tj6.LJLJI.LIZIZ()).setValue(C74413TIj.LIZJ(this.LJLIL.LJLILLLLZI));
        return C76800UCe.LIZ;
    }
}
