package X;

import android.graphics.Rect;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8r3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224218r3 {
    public final AbstractC48820JEa LIZ;
    public final String LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public List<C224228r4> LJI;
    public List<Rect> LJII;
    public String LJIIIIZZ;
    public boolean LJIIIZ;
    public double LJIIJ;
    public double LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;

    public final double LIZLLL() {
        return (1 - LIZJ()) / 2;
    }

    public final double LIZJ() {
        return ((this.LJ / this.LJFF) / (this.LIZJ / this.LIZLLL)) * this.LJIIJ;
    }

    public final boolean LJ() {
        if (((Rect) ListProtector.get(this.LJII, 0)).width() == 0 || ((Rect) ListProtector.get(this.LJII, 0)).height() == 0 || ((Rect) ListProtector.get(this.LJII, 1)).width() == 0 || ((Rect) ListProtector.get(this.LJII, 1)).height() == 0 || ((Rect) ListProtector.get(this.LJII, 3)).width() == 0 || ((Rect) ListProtector.get(this.LJII, 3)).height() == 0) {
            return false;
        }
        return true;
    }

    public final void LJI() {
        List<C224228r4> list = this.LJI;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                C224228r4 c224228r4 = (C224228r4) it.next();
                if (c224228r4.LJI()) {
                    this.LJIIL = true;
                }
                if (c224228r4.LJFF()) {
                    this.LJIILIIL = true;
                }
                if (c224228r4.LJ()) {
                    this.LJIILJJIL = true;
                }
                if (c224228r4.LJIIIIZZ() || c224228r4.LJII()) {
                    this.LJIILL = true;
                }
            }
        }
    }

    public C224218r3(C224198r1 logs) {
        o.LJIIIZ(logs, "logs");
        this.LIZ = logs;
        this.LIZIZ = "VideoAdaption";
        this.LIZJ = -1;
        this.LIZLLL = -1;
        this.LJ = -1;
        this.LJFF = -1;
        this.LJII = C47261Igj.LJJIJIIJI(new Rect(), new Rect(), new Rect(), new Rect());
        this.LJIIIIZZ = "";
    }

    public final boolean LIZ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        AbstractC48820JEa abstractC48820JEa = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[canAdapt] aweme old ");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(" new ");
        LIZ.append(aweme.getAid());
        LIZ.append(' ');
        abstractC48820JEa.LIZ(null, X1D.LIZIZ(LIZ));
        if (!TextUtils.equals(aweme.getAid(), this.LJIIIIZZ)) {
            this.LJIIIZ = false;
            this.LJI = null;
            this.LJII = C47261Igj.LJJIJIIJI(new Rect(), new Rect(), new Rect(), new Rect());
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
            this.LJIIIIZZ = aid;
        }
        int awemeType = aweme.getAwemeType();
        if (!C224258r7.LIZIZ || C79004UzY.LJJIJIIJIL(aweme) || aweme.getIsTikTokStory() || awemeType == 40 || awemeType == 2 || awemeType == 101 || aweme.isAd()) {
            return false;
        }
        return true;
    }

    public final void LIZIZ(String str) {
        AbstractC48820JEa abstractC48820JEa = this.LIZ;
        String str2 = this.LIZIZ;
        StringBuilder LIZIZ = C25620zW.LIZIZ("[doScaleAndTransAdaption] finish, ", str, "containerHeight");
        LIZIZ.append(this.LIZJ);
        LIZIZ.append(", containerWidth");
        LIZIZ.append(this.LIZLLL);
        LIZIZ.append(", height");
        LIZIZ.append(this.LJ);
        LIZIZ.append("->");
        LIZIZ.append((int) (LIZJ() * this.LIZJ));
        LIZIZ.append(", width");
        LIZIZ.append(this.LJFF);
        LIZIZ.append("->");
        LIZIZ.append((int) (this.LJIIJ * this.LIZLLL));
        LIZIZ.append(", translationX");
        LIZIZ.append((int) (this.LIZLLL * LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX));
        LIZIZ.append(", translationY");
        LIZIZ.append((int) (this.LJIIJJI * this.LIZJ));
        abstractC48820JEa.LIZIZ(str2, null, X1D.LIZIZ(LIZIZ));
        LJI();
    }

    public final void LJFF(List occlusions) {
        o.LJIIIZ(occlusions, "occlusions");
        if (!LJ()) {
            this.LJIIIZ = false;
            AbstractC48820JEa abstractC48820JEa = this.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[setOcclusions] loc");
            LIZ.append(C27739Aud.LJI(occlusions));
            abstractC48820JEa.LIZLLL(X1D.LIZIZ(LIZ));
            this.LJII = occlusions;
        }
    }
}
