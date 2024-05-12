package X;

import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurveyConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OMW {
    public final String LIZ;
    public final int LIZIZ;
    public final FeedSurvey LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final long LJFF;
    public final java.util.Map<String, Long> LJI;
    public final FeedSurveyConfig LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OMW)) {
            return false;
        }
        OMW omw = (OMW) obj;
        return o.LJ(this.LIZ, omw.LIZ) && this.LIZIZ == omw.LIZIZ && o.LJ(this.LIZJ, omw.LIZJ) && this.LIZLLL == omw.LIZLLL && this.LJ == omw.LJ && this.LJFF == omw.LJFF && o.LJ(this.LJI, omw.LJI) && o.LJ(this.LJII, omw.LJII);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SurveyModel(key=");
        LIZ.append(this.LIZ);
        LIZ.append(", type=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", survey=");
        LIZ.append(this.LIZJ);
        LIZ.append(", style=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", bgd=");
        LIZ.append(this.LJ);
        LIZ.append(", intervalTime=");
        LIZ.append(this.LJFF);
        LIZ.append(", relations=");
        LIZ.append(this.LJI);
        LIZ.append(", config=");
        LIZ.append(this.LJII);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        FeedSurvey feedSurvey = this.LIZJ;
        int i = 0;
        if (feedSurvey == null) {
            hashCode = 0;
        } else {
            hashCode = feedSurvey.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LJFF, (((((hashCode2 + hashCode) * 31) + this.LIZLLL) * 31) + this.LJ) * 31, 31);
        java.util.Map<String, Long> map = this.LJI;
        if (map != null) {
            i = map.hashCode();
        }
        return this.LJII.hashCode() + ((LIZJ + i) * 31);
    }

    public OMW(String key, int i, FeedSurvey feedSurvey, int i2, int i3, long j, java.util.Map<String, Long> map, FeedSurveyConfig feedSurveyConfig) {
        o.LJIIIZ(key, "key");
        this.LIZ = key;
        this.LIZIZ = i;
        this.LIZJ = feedSurvey;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = j;
        this.LJI = map;
        this.LJII = feedSurveyConfig;
    }
}
