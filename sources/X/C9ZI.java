package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity$onResume$2", f = "BaMessageSettingActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.9ZI, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9ZI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ BaMessageSettingActivity LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9ZI(BaMessageSettingActivity baMessageSettingActivity, InterfaceC67352kd<? super C9ZI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = baMessageSettingActivity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C9ZI(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C25849ACn c25849ACn = this.LJLIL.LJLJL;
        if (c25849ACn != null) {
            c25849ACn.LJIIJ(C9ZJ.LJLIL);
            C25860ACy c25860ACy = this.LJLIL.LJLL;
            if (c25860ACy != null) {
                c25860ACy.LJIIJ(C9ZK.LJLIL);
                C25849ACn c25849ACn2 = this.LJLIL.LJLJLJ;
                if (c25849ACn2 != null) {
                    c25849ACn2.LJIIJ(C9ZL.LJLIL);
                    C25860ACy c25860ACy2 = this.LJLIL.LJLLI;
                    if (c25860ACy2 != null) {
                        c25860ACy2.LJIIJ(C9ZM.LJLIL);
                        return C76800UCe.LIZ;
                    }
                    o.LJIJI("autoReplySetting");
                    throw null;
                }
                o.LJIJI("autoReplySwitch");
                throw null;
            }
            o.LJIJI("welcomeSetting");
            throw null;
        }
        o.LJIJI("welcomeSwitch");
        throw null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
