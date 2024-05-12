package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ifs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47208Ifs extends C47153Iez {
    public final /* synthetic */ C47197Ifh LJLIL;

    public C47208Ifs(C47197Ifh c47197Ifh) {
        this.LJLIL = c47197Ifh;
    }

    @Override // X.C47153Iez, X.InterfaceC46540IOi
    public final void onCompleteLoaded(String str, boolean z) {
        List<C47227IgB> LIZ;
        C16880lQ.LLLZ("onCompleteLoaded: sourceid:%s, isDash:%s", new Object[]{str, Boolean.valueOf(z)});
        if (!this.LJLIL.LJFF.LIZLLL(str)) {
            return;
        }
        C47231IgF c47231IgF = this.LJLIL.LJIILIIL;
        if (c47231IgF != null) {
            C47204Ifo c47204Ifo = c47231IgF.LIZ.LJ;
            c47204Ifo.LJFF.getClass();
            c47204Ifo.LJIILIIL(3, true);
        }
        C1JX.LJIIIIZZ("onCompleteLoaded trigger preload, key:", str);
        C47197Ifh c47197Ifh = this.LJLIL;
        c47197Ifh.getClass();
        ArrayList arrayList = new ArrayList();
        InterfaceC47225Ig9 interfaceC47225Ig9 = c47197Ifh.LJI;
        if (interfaceC47225Ig9 != null && (LIZ = interfaceC47225Ig9.LIZ()) != null && LIZ.size() > 0) {
            arrayList.addAll(LIZ);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C47197Ifh c47197Ifh2 = this.LJLIL;
        c47197Ifh2.LJIIL = str;
        c47197Ifh2.LJIILIIL(arrayList);
    }
}
