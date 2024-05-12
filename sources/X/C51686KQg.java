package X;

import com.ss.android.ugc.aweme.feed.landscape.LandscapeFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.KQg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51686KQg implements JJ4 {
    public final /* synthetic */ LandscapeFragmentPanel LIZ;
    public final /* synthetic */ Aweme LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ C50420Jqa LJ;
    public final /* synthetic */ String LJFF;
    public final /* synthetic */ int LJI;

    public C51686KQg(LandscapeFragmentPanel landscapeFragmentPanel, Aweme aweme, String str, int i, C50420Jqa c50420Jqa, String str2, int i2) {
        this.LIZ = landscapeFragmentPanel;
        this.LIZIZ = aweme;
        this.LIZJ = str;
        this.LIZLLL = i;
        this.LJ = c50420Jqa;
        this.LJFF = str2;
        this.LJI = i2;
    }

    @Override // X.JJ4
    public final /* synthetic */ void LIZIZ() {
    }

    @Override // X.JJ4
    public final void LIZ() {
        InterfaceC51691KQl interfaceC51691KQl = this.LIZ.LJLJL;
        boolean z = false;
        if (interfaceC51691KQl != null && interfaceC51691KQl.LJIL()) {
            this.LIZ.LJIILL(this.LIZIZ, this.LIZJ, true, this.LIZLLL, this.LJ);
            InterfaceC51691KQl interfaceC51691KQl2 = this.LIZ.LJLJL;
            if (interfaceC51691KQl2 != null) {
                ALX alx = new ALX();
                alx.LIZJ(this.LIZJ);
                alx.LIZIZ(this.LJFF);
                if (this.LIZIZ.getAuthor().isSecret() || this.LIZIZ.getAuthor().isPrivateAccount()) {
                    z = true;
                }
                C57285Me1 c57285Me1 = alx.LIZ;
                c57285Me1.LJIIL = z;
                c57285Me1.LIZJ = 1;
                alx.LIZ.LJFF = this.LIZ.getEventType();
                String LJIIL = C78996UzQ.LJIIL(this.LIZ.getCurrentAweme());
                C57285Me1 c57285Me12 = alx.LIZ;
                c57285Me12.LJI = LJIIL;
                c57285Me12.LJII = this.LIZIZ;
                c57285Me12.LJIIIIZZ = this.LJ.LJLJJI;
                M89 m89 = this.LIZ.LJLLLLLL;
                if (m89 != null) {
                    alx.LIZ.LJ = C56202M3y.LIZ(m89.getEventType());
                    M89 m892 = this.LIZ.LJLLLLLL;
                    if (m892 != null) {
                        int LIZIZ = C56202M3y.LIZIZ(this.LIZIZ, m892.getEventType());
                        C57285Me1 c57285Me13 = alx.LIZ;
                        c57285Me13.LIZLLL = LIZIZ;
                        c57285Me13.LJIIJ = this.LJI;
                        alx.LIZ.LJIILL = this.LIZIZ.getAuthor().getAccurateRecType();
                        interfaceC51691KQl2.LJIJJ(alx.LIZ());
                        return;
                    }
                    o.LJIJI("param");
                    throw null;
                }
                o.LJIJI("param");
                throw null;
            }
        }
    }
}
