package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.stickpoint.StickPointData;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.H7q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43558H7q {
    public final List<VideoSegment> LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final AVMusic LJFF;
    public final StickPointData LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43558H7q)) {
            return false;
        }
        C43558H7q c43558H7q = (C43558H7q) obj;
        return o.LJ(this.LIZ, c43558H7q.LIZ) && this.LIZIZ == c43558H7q.LIZIZ && this.LIZJ == c43558H7q.LIZJ && this.LIZLLL == c43558H7q.LIZLLL && this.LJ == c43558H7q.LJ && o.LJ(this.LJFF, c43558H7q.LJFF) && o.LJ(this.LJI, c43558H7q.LJI);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CutStatusModel(videoSegments=");
        LIZ.append(this.LIZ);
        LIZ.append(", videoLength=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isMusicStickPointMode=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isMultiEditMode=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", hadChangeSpeed=");
        LIZ.append(this.LJ);
        LIZ.append(", stickPointMusic=");
        LIZ.append(this.LJFF);
        LIZ.append(", stickPointData=");
        LIZ.append(this.LJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        boolean z = this.LIZJ;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (LIZJ + i2) * 31;
        boolean z2 = this.LIZLLL;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        if (!this.LJ) {
            i = 0;
        }
        int i6 = (i5 + i) * 31;
        AVMusic aVMusic = this.LJFF;
        int i7 = 0;
        if (aVMusic == null) {
            hashCode = 0;
        } else {
            hashCode = aVMusic.hashCode();
        }
        int i8 = (i6 + hashCode) * 31;
        StickPointData stickPointData = this.LJI;
        if (stickPointData != null) {
            i7 = stickPointData.hashCode();
        }
        return i8 + i7;
    }

    public C43558H7q(List videoSegments, long j, boolean z, boolean z2, AVMusic aVMusic, StickPointData stickPointData) {
        o.LJIIIZ(videoSegments, "videoSegments");
        this.LIZ = videoSegments;
        this.LIZIZ = j;
        this.LIZJ = false;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = aVMusic;
        this.LJI = stickPointData;
    }
}
