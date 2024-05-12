package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity;
import fjb.a;
import kotlin.jvm.internal.AqS0S2010000_4;
import kotlin.jvm.internal.AqS9S0010000_4;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity$setKeywordAutoReplyUI$1$1", f = "BaMessageSettingActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.9ZF, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9ZF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ BaMessageSettingActivity LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9ZF(BaMessageSettingActivity baMessageSettingActivity, boolean z, String str, String str2, InterfaceC67352kd<? super C9ZF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = baMessageSettingActivity;
        this.LJLILLLLZI = z;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C9ZF(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C25849ACn c25849ACn = this.LJLIL.LJLJLJ;
        if (c25849ACn != null) {
            c25849ACn.LJIIJ(new AqS9S0010000_4(this.LJLILLLLZI, 59));
            C25860ACy c25860ACy = this.LJLIL.LJLLI;
            if (c25860ACy != null) {
                c25860ACy.LJIIJ(new AqS0S2010000_4(this.LJLJI, this.LJLJJI, this.LJLILLLLZI, 1));
                return C76800UCe.LIZ;
            }
            o.LJIJI("autoReplySetting");
            throw null;
        }
        o.LJIJI("autoReplySwitch");
        throw null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
