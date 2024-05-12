package X;

import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.sticker.question.QaStickerPresenter$handlerAddYoursClickEvent$1$1", f = "QaStickerPresenter.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.8n6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221768n6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C223618q5 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C221768n6(C223618q5 c223618q5, InterfaceC67352kd<? super C221768n6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c223618q5;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C221768n6(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C223618q5 c223618q5 = this.LJLIL;
        c223618q5.getClass();
        C26045AKb c26045AKb = new C26045AKb(c223618q5.LJLJI);
        c26045AKb.LJIIIIZZ(R.string.pqk);
        c26045AKb.LJIIJ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
