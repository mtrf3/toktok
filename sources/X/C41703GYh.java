package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.story.forward.ForwardConfig;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GYh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41703GYh {
    public final CreativeInfo LIZ;
    public final ForwardMedia LIZIZ;
    public final ForwardConfig LIZJ;
    public final OSZ<Integer, Integer> LIZLLL;
    public final List<String> LJ;
    public final boolean LJFF;

    public C41703GYh() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LIZIZ = AnonymousClass391.LIZIZ(this.LJ, (this.LIZLLL.hashCode() + ((this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31)) * 31)) * 31, 31);
        boolean z = this.LJFF;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return LIZIZ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ForwardImageDataWrapper(creativeInfo=");
        LIZ.append(this.LIZ);
        LIZ.append(", sourceMedia=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", forwardConfig=");
        LIZ.append(this.LIZJ);
        LIZ.append(", screenSize=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", imagePath=");
        LIZ.append(this.LJ);
        LIZ.append(", isQuickForward=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41703GYh)) {
            return false;
        }
        C41703GYh c41703GYh = (C41703GYh) obj;
        if (o.LJ(this.LIZ, c41703GYh.LIZ) && o.LJ(this.LIZIZ, c41703GYh.LIZIZ) && o.LJ(this.LIZJ, c41703GYh.LIZJ) && o.LJ(this.LIZLLL, c41703GYh.LIZLLL) && o.LJ(this.LJ, c41703GYh.LJ) && this.LJFF == c41703GYh.LJFF) {
            return true;
        }
        return false;
    }

    public C41703GYh(CreativeInfo creativeInfo, ForwardMedia sourceMedia, ForwardConfig forwardConfig, OSZ osz, List list) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(sourceMedia, "sourceMedia");
        o.LJIIIZ(forwardConfig, "forwardConfig");
        this.LIZ = creativeInfo;
        this.LIZIZ = sourceMedia;
        this.LIZJ = forwardConfig;
        this.LIZLLL = osz;
        this.LJ = list;
        this.LJFF = false;
    }
}
