package X;

import com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EQ3 {
    public final EffectPackageDataWrapper LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public String LJFF;
    public final String LJI;
    public final String LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EQ3)) {
            return false;
        }
        EQ3 eq3 = (EQ3) obj;
        return o.LJ(this.LIZ, eq3.LIZ) && this.LIZIZ == eq3.LIZIZ && o.LJ(this.LIZJ, eq3.LIZJ) && this.LIZLLL == eq3.LIZLLL && o.LJ(this.LJ, eq3.LJ) && o.LJ(this.LJFF, eq3.LJFF) && o.LJ(this.LJI, eq3.LJI) && o.LJ(this.LJII, eq3.LJII);
    }

    public final int hashCode() {
        int hashCode;
        EffectPackageDataWrapper effectPackageDataWrapper = this.LIZ;
        if (effectPackageDataWrapper == null) {
            hashCode = 0;
        } else {
            hashCode = effectPackageDataWrapper.hashCode();
        }
        return this.LJII.hashCode() + C79062V1e.LJ(this.LJI, C79062V1e.LJ(this.LJFF, C79062V1e.LJ(this.LJ, JBR.LIZJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, JBR.LIZJ(this.LIZIZ, hashCode * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PublishResultTrackingData(publishData=");
        LIZ.append(this.LIZ);
        LIZ.append(", uploadStartTime=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", effectId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", zipFileSize=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LJ);
        LIZ.append(", ttepEffectId=");
        LIZ.append(this.LJFF);
        LIZ.append(", publishMethod=");
        LIZ.append(this.LJI);
        LIZ.append(", publishSource=");
        return q.LIZIZ(LIZ, this.LJII, ')', LIZ);
    }

    public EQ3(EffectPackageDataWrapper effectPackageDataWrapper, long j, String effectId, long j2, String enterFrom, String ttepEffectId, String publishMethod, String publishSource) {
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(ttepEffectId, "ttepEffectId");
        o.LJIIIZ(publishMethod, "publishMethod");
        o.LJIIIZ(publishSource, "publishSource");
        this.LIZ = effectPackageDataWrapper;
        this.LIZIZ = j;
        this.LIZJ = effectId;
        this.LIZLLL = j2;
        this.LJ = enterFrom;
        this.LJFF = ttepEffectId;
        this.LJI = publishMethod;
        this.LJII = publishSource;
    }
}
