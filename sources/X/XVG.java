package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;

/* loaded from: classes16.dex */
public final class XVG {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public final String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public boolean LJII;
    public LogPbBean LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public long LJIIJJI;
    public Integer LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL = "";
    public String LJIILL;

    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final XVG clone() {
        XVG xvg = new XVG(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
        xvg.LIZIZ(this.LJ);
        xvg.LJI = this.LJI;
        xvg.LJII = this.LJII;
        xvg.LJFF = this.LJFF;
        xvg.LJIIIZ = this.LJIIIZ;
        xvg.LJIIJJI = this.LJIIJJI;
        xvg.LJIIL = this.LJIIL;
        xvg.LJIILIIL = this.LJIILIIL;
        return xvg;
    }

    public final void LIZIZ(String str) {
        this.LJ = str;
        if (TextUtils.equals(str, "recommend_mc_id")) {
            this.LIZIZ = "recommend";
        }
    }

    public XVG(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
