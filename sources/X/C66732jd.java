package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.improve.UrlShorter$fetchShortenUrl$1$1", f = "UrlShorter.kt", l = {33}, m = "invokeSuspend")
/* renamed from: X.2jd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66732jd extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C68322mC<String> LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ C68322mC<String> LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66732jd(C68322mC<String> c68322mC, String str, String str2, C68322mC<String> c68322mC2, boolean z, InterfaceC67352kd<? super C66732jd> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = c68322mC2;
        this.LJLJJLL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66732jd(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            XKQ LIZLLL = XKX.LIZLLL(C780334l.LJLIL, null, null, new C66742je(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, null), 3);
            this.LJLIL = 1;
            if (LIZLLL.LJJJJ(this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
