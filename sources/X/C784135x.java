package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.analytics.IMChatListAnalytics$trackStrangerChat$1", f = "IMChatListAnalytics.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.35x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C784135x extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C3L4 LJLIL;
    public final /* synthetic */ C3Q9 LJLILLLLZI;
    public final /* synthetic */ InterfaceC75532xp LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C784135x(C3L4 c3l4, C3Q9 c3q9, InterfaceC75532xp interfaceC75532xp, InterfaceC67352kd<? super C784135x> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c3l4;
        this.LJLILLLLZI = c3q9;
        this.LJLJI = interfaceC75532xp;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C784135x(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C3TV c3tv = C3TV.LIZ;
        C3L4 c3l4 = this.LJLIL;
        C3Q9 c3q9 = this.LJLILLLLZI;
        InterfaceC75532xp interfaceC75532xp = this.LJLJI;
        c3tv.getClass();
        C3TV.LJ(c3q9, interfaceC75532xp, c3l4);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
