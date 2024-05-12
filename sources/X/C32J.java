package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.typingindicator.analysis.TypingStatusAnalytics$reportOnTypingIndicatorShown$1", f = "TypingStatusAnalytics.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.32J, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C32J extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ InterfaceC75532xp LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32J(int i, InterfaceC75532xp interfaceC75532xp, String str, String str2, InterfaceC67352kd<? super C32J> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = i;
        this.LJLILLLLZI = interfaceC75532xp;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C32J(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLIL == 2 && (!C98693u5.LIZLLL.isEmpty())) {
            return C76800UCe.LIZ;
        }
        InterfaceC75532xp interfaceC75532xp = this.LJLILLLLZI;
        String LIZ = C80763Ey.LIZ(false);
        LIZ.toString();
        interfaceC75532xp.LIZIZ("dm_show_typing_bubble", C113554cx.LJJL(new OSZ("position", String.valueOf(this.LJLIL)), new OSZ("chat_type", this.LJLJI), new OSZ("typing_indicator_user_id", String.valueOf(C81273Gx.LIZLLL(this.LJLJJI))), new OSZ("typing_indicator_viewer_user_id", LIZ), new OSZ("conversation_id", this.LJLJJI)));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
