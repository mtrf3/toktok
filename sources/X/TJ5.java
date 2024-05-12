package X;

import androidx.lifecycle.LiveData;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$postRecommendWords$1$1", f = "DefaultStickerSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class TJ5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ TJ3 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TJ5(TJ3 tj3, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = tj3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new TJ5(this.LJLIL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ((LiveData) this.LJLIL.LJLILLLLZI.LJIILJJIL.getValue()).setValue(this.LJLIL.LJLJI);
        return C76800UCe.LIZ;
    }
}
