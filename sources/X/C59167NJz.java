package X;

import Y.ARunnableS46S0100000_10;
import android.content.Context;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* renamed from: X.NJz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59167NJz implements NK0 {
    public long LIZ;
    public final ARunnableS46S0100000_10 LIZIZ = new ARunnableS46S0100000_10(this, 70);
    public final /* synthetic */ C59316NPs LIZJ;
    public final /* synthetic */ LinkData LIZLLL;

    @Override // X.NK0
    public final void LIZJ() {
        if (this.LIZ == 0) {
            return;
        }
        C226208uG LJ = LJ();
        LJ.LIZ = "show_over";
        LJ.LJFF = 0;
        LJ.LJI = System.currentTimeMillis() - this.LIZ;
        NN1.LJIJI(this.LIZJ.LJLLI, LJ.LIZ());
        this.LIZ = 0L;
        NRW nrw = this.LIZJ.LLILLJJLI;
        if (nrw != null) {
            nrw.removeCallbacks(this.LIZIZ);
        }
    }

    public final C226208uG LJ() {
        C226208uG c226208uG = new C226208uG();
        c226208uG.LIZIZ = this.LIZLLL;
        c226208uG.LIZJ = this.LIZJ.LJLJLJ;
        c226208uG.LIZLLL = false;
        return c226208uG;
    }

    @Override // X.C6YD
    public final void LIZ() {
        C226208uG LJ = LJ();
        LJ.LIZ = "close";
        LJ.LJFF = 0;
        NN1.LJIJI(this.LIZJ.LJLLI, LJ.LIZ());
        Aweme aweme = this.LIZJ.LJLJLJ;
        if (aweme != null && C63081OpJ.LJLIL(aweme)) {
            C59316NPs c59316NPs = this.LIZJ;
            NN1.LJIJJLI("link_click", c59316NPs.LJLLI, this.LIZLLL, c59316NPs.LJLJLJ, false, false);
        }
        LIZJ();
    }

    @Override // X.C6YD
    public final void LIZIZ() {
        AwemeCommerceStruct commerceVideoAuthInfo;
        AwemeRawAd awemeRawAd;
        C226208uG LJ = LJ();
        LJ.LIZ = "click";
        LJ.LJFF = 100;
        NN1.LJIJI(this.LIZJ.LJLLI, LJ.LIZ());
        C59316NPs c59316NPs = this.LIZJ;
        C59133NIr c59133NIr = ((C59132NIq) c59316NPs.LJLJJLL).LIZJ;
        Context context = c59316NPs.LJLLI;
        LinkData linkData = this.LIZLLL;
        Aweme aweme = c59316NPs.LJLJLJ;
        c59133NIr.getClass();
        NO5.LJIILIIL(context, linkData, aweme, false);
        Aweme aweme2 = this.LIZJ.LJLJLJ;
        if (aweme2 != null && C63081OpJ.LJLIL(aweme2)) {
            C59316NPs c59316NPs2 = this.LIZJ;
            NN1.LJIJJLI("link_click", c59316NPs2.LJLLI, this.LIZLLL, c59316NPs2.LJLJLJ, false, false);
        }
        Aweme aweme3 = this.LIZJ.LJLJLJ;
        if (aweme3 != null && (commerceVideoAuthInfo = aweme3.getCommerceVideoAuthInfo()) != null && commerceVideoAuthInfo.getAdSource() == 1) {
            C59316NPs c59316NPs3 = this.LIZJ;
            NN1.LJJIIZ(c59316NPs3.LJLLI, c59316NPs3.LJLJLJ, "common_link");
            Aweme aweme4 = this.LIZJ.LJLJLJ;
            if (aweme4 != null) {
                awemeRawAd = aweme4.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "otherclick", awemeRawAd);
            LIZLLL.LIZJ("common_link", "refer");
            LIZLLL.LJII();
        }
    }

    @Override // X.C6YD
    public final void LIZLLL() {
        C226208uG LJ = LJ();
        LJ.LIZ = "show";
        LJ.LJFF = 100;
        NN1.LJIJI(this.LIZJ.LJLLI, LJ.LIZ());
        this.LIZ = System.currentTimeMillis();
        NRW nrw = this.LIZJ.LLILLJJLI;
        if (nrw != null) {
            nrw.postDelayed(this.LIZIZ, 1000L);
        }
        N5W.LIZIZ.LIZ().LIZIZ(this.LIZJ.LJLJLJ, this.LIZLLL);
    }

    public C59167NJz(C59316NPs c59316NPs, LinkData linkData) {
        this.LIZJ = c59316NPs;
        this.LIZLLL = linkData;
    }
}
