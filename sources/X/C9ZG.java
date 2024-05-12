package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity;
import fjb.a;
import kotlin.jvm.internal.AqS9S0010000_4;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity$setSuggestQuestionUI$1", f = "BaMessageSettingActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.9ZG, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9ZG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ BaMessageSettingActivity LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9ZG(BaMessageSettingActivity baMessageSettingActivity, boolean z, InterfaceC67352kd<? super C9ZG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = baMessageSettingActivity;
        this.LJLILLLLZI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C9ZG(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C25849ACn c25849ACn = this.LJLIL.LJLJLLL;
        if (c25849ACn != null) {
            c25849ACn.LJIIJ(new AqS9S0010000_4(this.LJLILLLLZI, 60));
            C25860ACy c25860ACy = this.LJLIL.LJLLILLLL;
            if (c25860ACy != null) {
                c25860ACy.LJIIJ(new AqS9S0010000_4(this.LJLILLLLZI, 61));
                return C76800UCe.LIZ;
            }
            o.LJIJI("suggestedSetting");
            throw null;
        }
        o.LJIJI("suggestedSwitch");
        throw null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
