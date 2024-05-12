package X;

import android.text.StaticLayout;
import com.ss.android.ugc.aweme.models.NowDiversionLimitInfo;
import com.ss.android.ugc.aweme.now.NowIntroductionVideoInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.7jm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194227jm {
    public final NowIntroductionVideoInfo LIZ;
    public final NowDiversionLimitInfo LIZIZ;
    public StaticLayout LIZJ;

    public C194227jm() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C194227jm)) {
            return false;
        }
        C194227jm c194227jm = (C194227jm) obj;
        return o.LJ(this.LIZ, c194227jm.LIZ) && o.LJ(this.LIZIZ, c194227jm.LIZIZ);
    }

    public final int hashCode() {
        NowIntroductionVideoInfo nowIntroductionVideoInfo = this.LIZ;
        int hashCode = (nowIntroductionVideoInfo == null ? 0 : nowIntroductionVideoInfo.hashCode()) * 31;
        NowDiversionLimitInfo nowDiversionLimitInfo = this.LIZIZ;
        return hashCode + (nowDiversionLimitInfo != null ? nowDiversionLimitInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowDiversionInfo(introductionVideoInfo=");
        LIZ.append(this.LIZ);
        LIZ.append(", limitInfo=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public static int LIZ() {
        int LIZLLL = C53947LFf.LIZLLL();
        if (LIZLLL > 485) {
            LIZLLL = 485;
        }
        return C47135Ieh.LIZ(64, C7MY.LIZIZ(LIZLLL));
    }

    public C194227jm(NowIntroductionVideoInfo nowIntroductionVideoInfo, NowDiversionLimitInfo nowDiversionLimitInfo) {
        this.LIZ = nowIntroductionVideoInfo;
        this.LIZIZ = nowDiversionLimitInfo;
    }
}
