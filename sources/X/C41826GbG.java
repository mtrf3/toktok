package X;

import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.services.story.forward.QuickForwardPublishLock;
import com.ss.android.ugc.aweme.services.story.forward.QuickForwardResult;
import kotlin.jvm.internal.o;

/* renamed from: X.GbG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41826GbG {
    public QuickForwardResult LIZ;
    public final QuickForwardPublishLock LIZIZ;
    public SmartImageView LIZJ = null;
    public boolean LIZLLL = false;
    public boolean LJ = false;
    public boolean LJFF = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41826GbG)) {
            return false;
        }
        C41826GbG c41826GbG = (C41826GbG) obj;
        return o.LJ(this.LIZ, c41826GbG.LIZ) && o.LJ(this.LIZIZ, c41826GbG.LIZIZ) && o.LJ(this.LIZJ, c41826GbG.LIZJ) && this.LIZLLL == c41826GbG.LIZLLL && this.LJ == c41826GbG.LJ && this.LJFF == c41826GbG.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31;
        SmartImageView smartImageView = this.LIZJ;
        int hashCode2 = (hashCode + (smartImageView == null ? 0 : smartImageView.hashCode())) * 31;
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.LJ;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        return ((i2 + i3) * 31) + (this.LJFF ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QuickForwardSession(forwardResult=");
        LIZ.append(this.LIZ);
        LIZ.append(", quickForwardPublishLock=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mCoverView=");
        LIZ.append(this.LIZJ);
        LIZ.append(", uploadingBarDurationTimerStarted=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", uploadingBarDurationExpired=");
        LIZ.append(this.LJ);
        LIZ.append(", pendingToCreateAweme=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public C41826GbG(QuickForwardResult quickForwardResult, QuickForwardPublishLock quickForwardPublishLock) {
        this.LIZ = quickForwardResult;
        this.LIZIZ = quickForwardPublishLock;
    }
}
