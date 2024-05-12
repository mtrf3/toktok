package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity;
import fjb.a;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity$initSuggestedQuestion$3$1", f = "BaMessageSettingActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.9ZC, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9ZC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ BaMessageSettingActivity LJLIL;
    public final /* synthetic */ C238889Zc LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9ZC(BaMessageSettingActivity baMessageSettingActivity, C238889Zc c238889Zc, InterfaceC67352kd<? super C9ZC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = baMessageSettingActivity;
        this.LJLILLLLZI = c238889Zc;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C9ZC(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        BaMessageSettingActivity baMessageSettingActivity = this.LJLIL;
        C25860ACy c25860ACy = baMessageSettingActivity.LJLLILLLL;
        if (c25860ACy != null) {
            c25860ACy.LJIIJ(new AqS135S0200000_4(baMessageSettingActivity, this.LJLILLLLZI, 267));
            return C76800UCe.LIZ;
        }
        o.LJIJI("suggestedSetting");
        throw null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
