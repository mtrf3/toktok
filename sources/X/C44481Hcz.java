package X;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Hcz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44481Hcz {
    public final List<String> LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public List<Integer> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44481Hcz)) {
            return false;
        }
        C44481Hcz c44481Hcz = (C44481Hcz) obj;
        return o.LJ(this.LIZ, c44481Hcz.LIZ) && o.LJ(this.LIZIZ, c44481Hcz.LIZIZ) && o.LJ(this.LIZJ, c44481Hcz.LIZJ) && this.LIZLLL == c44481Hcz.LIZLLL && this.LJ == c44481Hcz.LJ && this.LJFF == c44481Hcz.LJFF && o.LJ(this.LJI, c44481Hcz.LJI);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        String str = this.LIZJ;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.LJI.hashCode() + ((((((((LJ + hashCode) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoEndingWatermarkData(endingEffectResources=");
        LIZ.append(this.LIZ);
        LIZ.append(", endingFrame=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", endingAudioPath=");
        LIZ.append(this.LIZJ);
        LIZ.append(", inputMediaDuration=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", endingWatermarkFadeInDuration=");
        LIZ.append(this.LJ);
        LIZ.append(", endingWatermarkRetentionDuration=");
        LIZ.append(this.LJFF);
        LIZ.append(", originalVideoSize=");
        return C1NE.LIZIZ(LIZ, this.LJI, ')', LIZ);
    }

    public C44481Hcz(List endingEffectResources, String endingFrame, String str, List list) {
        o.LJIIIZ(endingEffectResources, "endingEffectResources");
        o.LJIIIZ(endingFrame, "endingFrame");
        this.LIZ = endingEffectResources;
        this.LIZIZ = endingFrame;
        this.LIZJ = str;
        this.LIZLLL = 0;
        this.LJ = 1000;
        this.LJFF = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        this.LJI = list;
    }
}
