package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMChatRoomAnalytics$enterChatV3$1", f = "IMChatRoomAnalytics.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.35v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C783935v extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C98593tv LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ java.util.Map<String, String> LJLJJI;
    public final /* synthetic */ C3Q9 LJLJJL;
    public final /* synthetic */ AbstractC90763hI LJLJJLL;
    public final /* synthetic */ InterfaceC75532xp LJLJL;
    public final /* synthetic */ boolean LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C783935v(C98593tv c98593tv, int i, String str, java.util.Map<String, String> map, C3Q9 c3q9, AbstractC90763hI abstractC90763hI, InterfaceC75532xp interfaceC75532xp, boolean z, InterfaceC67352kd<? super C783935v> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c98593tv;
        this.LJLILLLLZI = i;
        this.LJLJI = str;
        this.LJLJJI = map;
        this.LJLJJL = c3q9;
        this.LJLJJLL = abstractC90763hI;
        this.LJLJL = interfaceC75532xp;
        this.LJLJLJ = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C783935v(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C98583tu.LIZLLL(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
