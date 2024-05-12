package X;

import java.net.URLEncoder;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AL1 implements InterfaceC26061AKr {
    public final C26069AKz LIZ;
    public boolean LIZIZ;
    public final java.util.Set<String> LIZJ = new LinkedHashSet();

    @Override // X.InterfaceC26061AKr
    public final void LIZIZ() {
        if (this.LIZIZ) {
            return;
        }
        C60827Nu3 c60827Nu3 = C58310MuY.LIZIZ;
        ALE ale = new ALE();
        String str = this.LIZ.LJLIL;
        o.LJIIJ(str, "<set-?>");
        ale.LIZ = str;
        C26069AKz c26069AKz = this.LIZ;
        ale.LJIIJ = c26069AKz.LJLJJI;
        ale.LJIIJJI = c26069AKz.LJLJI;
        ale.LIZIZ(C67062kA.LJLIL);
        ale.LJIIL = AL2.LJLIL;
        ale.LJIILIIL = C47261Igj.LJJIJ(this.LIZ.LJLILLLLZI);
        c60827Nu3.getClass();
        C60827Nu3.LJIIJJI(ale, Boolean.FALSE);
        this.LIZIZ = true;
    }

    public AL1(C26069AKz c26069AKz) {
        this.LIZ = c26069AKz;
    }

    @Override // X.InterfaceC26061AKr
    public final void LIZ(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        if (this.LIZJ.contains(enterFrom)) {
            return;
        }
        C38281F0r c38281F0r = new C38281F0r(this.LIZ.LJLILLLLZI);
        c38281F0r.LIZLLL("enter_from", enterFrom);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme://webview?url=");
        LIZ.append(URLEncoder.encode(c38281F0r.LJ(), "ISO-8859-1"));
        LIZ.append("&use_spark=1&use_preload=1");
        C60827Nu3.LJIIIIZZ(C58310MuY.LIZIZ, X1D.LIZIZ(LIZ), this.LIZ.LJLIL, null, 12);
        this.LIZJ.add(enterFrom);
    }
}
