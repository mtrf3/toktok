package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.story.forward.ForwardConfig;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import kotlin.jvm.internal.o;

/* renamed from: X.GYf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41701GYf {
    public final CreativeInfo LIZ;
    public final ForwardMedia LIZIZ;
    public final ForwardConfig LIZJ;
    public final OSZ<Integer, Integer> LIZLLL;
    public final String LJ;
    public final boolean LJFF;

    public C41701GYf() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LJ = C79062V1e.LJ(this.LJ, (this.LIZLLL.hashCode() + ((this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31)) * 31)) * 31, 31);
        boolean z = this.LJFF;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return LJ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ForwardVideoDataWrapper(creativeInfo=");
        LIZ.append(this.LIZ);
        LIZ.append(", sourceMedia=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", forwardConfig=");
        LIZ.append(this.LIZJ);
        LIZ.append(", screenSize=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", videoPath=");
        LIZ.append(this.LJ);
        LIZ.append(", isQuickForward=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41701GYf)) {
            return false;
        }
        C41701GYf c41701GYf = (C41701GYf) obj;
        if (o.LJ(this.LIZ, c41701GYf.LIZ) && o.LJ(this.LIZIZ, c41701GYf.LIZIZ) && o.LJ(this.LIZJ, c41701GYf.LIZJ) && o.LJ(this.LIZLLL, c41701GYf.LIZLLL) && o.LJ(this.LJ, c41701GYf.LJ) && this.LJFF == c41701GYf.LJFF) {
            return true;
        }
        return false;
    }

    public C41701GYf(CreativeInfo creativeInfo, ForwardMedia sourceMedia, ForwardConfig forwardConfig, OSZ osz, String videoPath) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(sourceMedia, "sourceMedia");
        o.LJIIIZ(forwardConfig, "forwardConfig");
        o.LJIIIZ(videoPath, "videoPath");
        this.LIZ = creativeInfo;
        this.LIZIZ = sourceMedia;
        this.LIZJ = forwardConfig;
        this.LIZLLL = osz;
        this.LJ = videoPath;
        this.LJFF = false;
    }
}
