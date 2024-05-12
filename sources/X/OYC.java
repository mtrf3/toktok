package X;

import com.ss.android.ugc.aweme.model.LinkDefaultSharePackageV2;

/* loaded from: classes11.dex */
public final class OYC<T> implements InterfaceC73518StG {
    public final /* synthetic */ C68322mC<String> LIZ;
    public final /* synthetic */ LinkDefaultSharePackageV2 LIZIZ;
    public final /* synthetic */ String LIZJ;

    public OYC(C68322mC<String> c68322mC, LinkDefaultSharePackageV2 linkDefaultSharePackageV2, String str) {
        this.LIZ = c68322mC;
        this.LIZIZ = linkDefaultSharePackageV2;
        this.LIZJ = str;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        c73516StE.onSuccess(new OYP(this.LIZ.element, this.LIZIZ.title, this.LIZJ));
    }
}
