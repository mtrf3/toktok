package X;

import com.ss.android.ugc.aweme.feed.model.survey.FeedSurveyConfig;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OMV {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final FeedSurveyConfig LIZLLL;
    public final int LJ;
    public final int LJFF;

    public OMV() {
        this(-1, 0, -1, null, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OMV)) {
            return false;
        }
        OMV omv = (OMV) obj;
        return this.LIZ == omv.LIZ && this.LIZIZ == omv.LIZIZ && this.LIZJ == omv.LIZJ && o.LJ(this.LIZLLL, omv.LIZLLL) && this.LJ == omv.LJ && this.LJFF == omv.LJFF;
    }

    public final int hashCode() {
        int i = ((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        FeedSurveyConfig feedSurveyConfig = this.LIZLLL;
        return ((((i + (feedSurveyConfig == null ? 0 : feedSurveyConfig.hashCode())) * 31) + this.LJ) * 31) + this.LJFF;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TurnsGroupData(turnsGroupId=");
        LIZ.append(this.LIZ);
        LIZ.append(", turnsGroupCount=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", surveyAppearPosition=");
        LIZ.append(this.LIZJ);
        LIZ.append(", feedSurveyConfig=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", start=");
        LIZ.append(this.LJ);
        LIZ.append(", end=");
        return b0.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public OMV(int i, int i2, int i3, FeedSurveyConfig feedSurveyConfig, int i4, int i5) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = feedSurveyConfig;
        this.LJ = i4;
        this.LJFF = i5;
    }
}
