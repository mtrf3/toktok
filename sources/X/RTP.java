package X;

import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviFeature;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviStaticImage;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RTP {
    public final String LIZ;
    public final String LIZIZ;
    public final List<ProfileNaviFeature> LIZJ;
    public final ProfileNaviStaticImage LIZLLL;

    public RTP() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RTP)) {
            return false;
        }
        RTP rtp = (RTP) obj;
        return o.LJ(this.LIZ, rtp.LIZ) && o.LJ(this.LIZIZ, rtp.LIZIZ) && o.LJ(this.LIZJ, rtp.LIZJ) && o.LJ(this.LIZLLL, rtp.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ProfileNaviFeature> list = this.LIZJ;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        ProfileNaviStaticImage profileNaviStaticImage = this.LIZLLL;
        return hashCode3 + (profileNaviStaticImage != null ? profileNaviStaticImage.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileNavi(naviId=");
        LIZ.append(this.LIZ);
        LIZ.append(", starterNaviId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", features=");
        LIZ.append(this.LIZJ);
        LIZ.append(", staticImage=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public RTP(String str, String str2, List list, ProfileNaviStaticImage profileNaviStaticImage, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = list;
        this.LIZLLL = profileNaviStaticImage;
    }
}
