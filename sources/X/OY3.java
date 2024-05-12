package X;

import com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage;

/* loaded from: classes11.dex */
public final class OY3<T> implements InterfaceC73518StG {
    public final /* synthetic */ C68322mC<String> LIZ;
    public final /* synthetic */ LinkDefaultSharePackage LIZIZ;
    public final /* synthetic */ String LIZJ;

    public OY3(C68322mC<String> c68322mC, LinkDefaultSharePackage linkDefaultSharePackage, String str) {
        this.LIZ = c68322mC;
        this.LIZIZ = linkDefaultSharePackage;
        this.LIZJ = str;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        c73516StE.onSuccess(new OYP(this.LIZ.element, this.LIZIZ.title, this.LIZJ));
    }
}
