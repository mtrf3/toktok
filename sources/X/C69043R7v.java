package X;

import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;

/* renamed from: X.R7v, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69043R7v<T> implements InterfaceC73518StG {
    public final /* synthetic */ InterfaceC69056R8i LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ EnumC69116RAq LIZJ;
    public final /* synthetic */ EnumC69113RAn LIZLLL;

    public C69043R7v(BaseI18nLoginFragment baseI18nLoginFragment, String str, EnumC69116RAq enumC69116RAq, EnumC69113RAn enumC69113RAn) {
        this.LIZ = baseI18nLoginFragment;
        this.LIZIZ = str;
        this.LIZJ = enumC69116RAq;
        this.LIZLLL = enumC69113RAn;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        R8H r8h = new R8H(c73516StE, this.LIZJ, this.LIZLLL);
        this.LIZ.bi(r8h);
        this.LIZ.r9().LIZ(this.LIZIZ, C113554cx.LJJJLIIL(), r8h);
    }
}
