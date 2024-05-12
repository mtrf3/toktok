package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity$submitWelcomeMessage$1$1$1$1", f = "BaWelcomeMessageEditActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.9ZP, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9ZP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ BaWelcomeMessageEditActivity LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9ZP(BaWelcomeMessageEditActivity baWelcomeMessageEditActivity, InterfaceC67352kd<? super C9ZP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = baWelcomeMessageEditActivity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C9ZP(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ((SY4) this.LJLIL._$_findCachedViewById(R.id.b2e)).setEnabled(true);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
