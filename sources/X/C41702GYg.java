package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.story.forward.ForwardConfig;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import kotlin.jvm.internal.o;

/* renamed from: X.GYg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41702GYg {
    public final CreativeInfo LIZ;
    public final ForwardMedia LIZIZ;
    public final ForwardConfig LIZJ;
    public final GYE LIZLLL;
    public final C163166am LJ;
    public final OSZ<Integer, Integer> LJFF;
    public final int LJI;
    public final boolean LJII;

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.LIZLLL.hashCode() + ((this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31)) * 31)) * 31;
        C163166am c163166am = this.LJ;
        if (c163166am == null) {
            hashCode = 0;
        } else {
            hashCode = c163166am.hashCode();
        }
        int hashCode3 = (((this.LJFF.hashCode() + ((hashCode2 + hashCode) * 31)) * 31) + this.LJI) * 31;
        boolean z = this.LJII;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ForwardCanvasDataWrapper(creativeInfo=");
        LIZ.append(this.LIZ);
        LIZ.append(", sourceMedia=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", forwardConfig=");
        LIZ.append(this.LIZJ);
        LIZ.append(", canvasMediaInfo=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", styleConfig=");
        LIZ.append(this.LJ);
        LIZ.append(", screenSize=");
        LIZ.append(this.LJFF);
        LIZ.append(", originVideoAIGCLabelType=");
        LIZ.append(this.LJI);
        LIZ.append(", isQuickForward=");
        return C48339Iy7.LIZJ(LIZ, this.LJII, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41702GYg)) {
            return false;
        }
        C41702GYg c41702GYg = (C41702GYg) obj;
        if (o.LJ(this.LIZ, c41702GYg.LIZ) && o.LJ(this.LIZIZ, c41702GYg.LIZIZ) && o.LJ(this.LIZJ, c41702GYg.LIZJ) && o.LJ(this.LIZLLL, c41702GYg.LIZLLL) && o.LJ(this.LJ, c41702GYg.LJ) && o.LJ(this.LJFF, c41702GYg.LJFF) && this.LJI == c41702GYg.LJI && this.LJII == c41702GYg.LJII) {
            return true;
        }
        return false;
    }

    public C41702GYg(CreativeInfo creativeInfo, ForwardMedia sourceMedia, ForwardConfig forwardConfig, GYE canvasMediaInfo, C163166am c163166am, OSZ<Integer, Integer> osz, int i, boolean z) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(sourceMedia, "sourceMedia");
        o.LJIIIZ(forwardConfig, "forwardConfig");
        o.LJIIIZ(canvasMediaInfo, "canvasMediaInfo");
        this.LIZ = creativeInfo;
        this.LIZIZ = sourceMedia;
        this.LIZJ = forwardConfig;
        this.LIZLLL = canvasMediaInfo;
        this.LJ = c163166am;
        this.LJFF = osz;
        this.LJI = i;
        this.LJII = z;
    }

    public /* synthetic */ C41702GYg(CreativeInfo creativeInfo, ForwardMedia forwardMedia, ForwardConfig forwardConfig, GYE gye, C163166am c163166am, OSZ osz, int i, int i2) {
        this(creativeInfo, forwardMedia, forwardConfig, gye, c163166am, (OSZ<Integer, Integer>) osz, (i2 & 64) != 0 ? 0 : i, false);
    }
}
