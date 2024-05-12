package X;

import androidx.lifecycle.LiveData;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$postPanelInfoDataUpdate$2$1", f = "DefaultStickerSource.kt", l = {379}, m = "invokeSuspend")
/* renamed from: X.TIx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74427TIx extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C74426TIw LJLILLLLZI;
    public final /* synthetic */ C68322mC LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74427TIx(C74426TIw c74426TIw, C68322mC c68322mC, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c74426TIw;
        this.LJLJI = c68322mC;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C74427TIx(this.LJLILLLLZI, this.LJLJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            InterfaceC68342mE interfaceC68342mE = (InterfaceC68342mE) this.LJLJI.element;
            this.LJLIL = 1;
            if (interfaceC68342mE.LJI(this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C74426TIw c74426TIw = this.LJLILLLLZI;
        c74426TIw.LJLJI.LJIIIZ.setValue(c74426TIw.LJLJJI.getUrlPrefix());
        ((LiveData) this.LJLILLLLZI.LJLJI.LJIIJJI.getValue()).setValue(this.LJLILLLLZI.LJLJJL);
        return C76800UCe.LIZ;
    }
}
