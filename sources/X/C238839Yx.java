package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity$deleteKeywordMessage$1$1$1$1", f = "BaAutoReplyEditActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.9Yx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238839Yx extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ BaAutoReplyEditActivity LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C238839Yx(BaAutoReplyEditActivity baAutoReplyEditActivity, InterfaceC67352kd<? super C238839Yx> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = baAutoReplyEditActivity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C238839Yx(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
        c26045AKb.LIZ(true);
        c26045AKb.LJIIIIZZ(R.string.egl);
        c26045AKb.LJIIJ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
