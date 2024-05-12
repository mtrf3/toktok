package X;

import com.ss.android.ugc.aweme.account.login.v2.network.SetPasswordMobHelper;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RB2 implements InterfaceC116954iR<EnumC71789SFl> {
    public final /* synthetic */ SetPasswordMobHelper LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ InterfaceC68974R5e LJLJLJ;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(EnumC71789SFl enumC71789SFl) {
        EnumC71789SFl complexity = enumC71789SFl;
        o.LJIIIZ(complexity, "complexity");
        C68972R5c.LJIIJJI(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, complexity.getEtValue());
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
        this.LJLIL.LJLILLLLZI.LIZ(d);
    }

    public RB2(SetPasswordMobHelper setPasswordMobHelper, boolean z, String str, String str2, String str3, String str4, int i, InterfaceC68974R5e interfaceC68974R5e) {
        this.LJLIL = setPasswordMobHelper;
        this.LJLILLLLZI = z;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = str4;
        this.LJLJL = i;
        this.LJLJLJ = interfaceC68974R5e;
    }
}
