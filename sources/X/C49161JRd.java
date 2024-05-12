package X;

import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui.SearchHorizontalInnerContainer;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;

/* renamed from: X.JRd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49161JRd implements InterfaceC50104JlU {
    public final /* synthetic */ C49160JRc LIZ;

    @Override // X.InterfaceC50104JlU
    public final void LIZIZ(String str) {
    }

    @Override // X.InterfaceC50104JlU
    public final void LIZJ(Throwable th) {
    }

    @Override // X.InterfaceC50104JlU
    public final void LIZ() {
        JSL LJFF;
        C49189JSf c49189JSf;
        C49172JRo c49172JRo = this.LIZ.LJLLJ;
        if (c49172JRo != null) {
            JR2 jr2 = c49172JRo.LIZ.LJIIL().LJLLL;
            if (jr2 != null) {
                boolean z = false;
                Taco LIZ = C49218JTi.LIZ(c49172JRo.LIZ.LJIIJJI(), false);
                if (LIZ == null || (LJFF = LIZ.LJFF(17)) == null) {
                    return;
                }
                if (LJFF instanceof C49178JRu) {
                    JLH.LIZ(LJFF, c49172JRo.LIZ.LJIIJJI(), jr2, false, 12);
                    ((C49178JRu) LJFF).LIZJ = c49172JRo.LIZIZ.LJLLI;
                    return;
                }
                if (C49163JRf.LIZIZ(c49172JRo.LIZ.LJLLLLLL.LJLL)) {
                    if (!(LJFF instanceof C49189JSf) || (c49189JSf = (C49189JSf) LJFF) == null) {
                        return;
                    }
                    SearchHorizontalInnerContainer searchHorizontalInnerContainer = c49172JRo.LIZIZ;
                    JRB jrb = c49172JRo.LIZ;
                    c49189JSf.LJIIJ = searchHorizontalInnerContainer;
                    c49189JSf.LIZLLL = jrb.LJIIJJI();
                    return;
                }
                if (!(LJFF instanceof C49189JSf)) {
                    return;
                }
                InterfaceC49148JQq LIZLLL = LIZ.LIZLLL();
                if (LIZLLL != null && (LIZLLL instanceof JSO) && ((JSO) LIZLLL).q() == 17) {
                    z = true;
                }
                JLH.LIZ(LJFF, c49172JRo.LIZ.LJIIJJI(), jr2, z, 4);
                ((C49189JSf) LJFF).LJIIJ = c49172JRo.LIZIZ;
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public C49161JRd(C49160JRc c49160JRc) {
        this.LIZ = c49160JRc;
    }
}
