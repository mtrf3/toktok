package X;

import kotlin.jvm.internal.o;

/* renamed from: X.R9v, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69095R9v<T> implements InterfaceC64592gB {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ InterfaceC69056R8i LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ EnumC69113RAn LJLJL;

    public C69095R9v(int i, InterfaceC69056R8i interfaceC69056R8i, String str, String str2, String str3, String str4, EnumC69113RAn enumC69113RAn) {
        this.LJLIL = i;
        this.LJLILLLLZI = interfaceC69056R8i;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = str4;
        this.LJLJL = enumC69113RAn;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C69084R9k c69084R9k = (C69084R9k) th;
        C69099R9z.LIZIZ(1, this.LJLIL, c69084R9k.getErrorCode(), c69084R9k.getErrorMsg(), null);
        C68972R5c.LJIIJ(this.LJLILLLLZI.q9().LJJLIIIJJI(), this.LJLILLLLZI.q9().LJJLIIIJLLLLLLLZ(), this.LJLILLLLZI.q9().LLZZ(), c69084R9k.getErrorCode(), this.LJLJI, this.LJLIL, "text", c69084R9k.getErrorMsg(), this.LJLJJI, this.LJLILLLLZI.Hg(), this.LJLJJL, this.LJLJJLL, null, C69093R9t.LJIJ(this.LJLJL), 12288);
    }
}
