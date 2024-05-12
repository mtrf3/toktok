package X;

import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NN0 {
    public final String LIZ;
    public final LinkData LIZIZ;
    public final Aweme LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final long LJI;
    public final String LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NN0)) {
            return false;
        }
        NN0 nn0 = (NN0) obj;
        return o.LJ(this.LIZ, nn0.LIZ) && o.LJ(this.LIZIZ, nn0.LIZIZ) && o.LJ(this.LIZJ, nn0.LIZJ) && this.LIZLLL == nn0.LIZLLL && this.LJ == nn0.LJ && this.LJFF == nn0.LJFF && this.LJI == nn0.LJI && o.LJ(this.LJII, nn0.LJII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LIZ.hashCode() * 31;
        LinkData linkData = this.LIZIZ;
        int i = 0;
        if (linkData == null) {
            hashCode = 0;
        } else {
            hashCode = linkData.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Aweme aweme = this.LIZJ;
        if (aweme != null) {
            i = aweme.hashCode();
        }
        int i3 = (i2 + i) * 31;
        boolean z = this.LIZLLL;
        int i4 = 1;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int i6 = (i3 + i5) * 31;
        if (!this.LJ) {
            i4 = 0;
        }
        return this.LJII.hashCode() + JBR.LIZJ(this.LJI, (((i6 + i4) * 31) + this.LJFF) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdLinkLogParams(label=");
        LIZ.append(this.LIZ);
        LIZ.append(", linkData=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", aweme=");
        LIZ.append(this.LIZJ);
        LIZ.append(", fromCommentDialog=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", useLinkExtra=");
        LIZ.append(this.LJ);
        LIZ.append(", visibleRatio=");
        LIZ.append(this.LJFF);
        LIZ.append(", showDuration=");
        LIZ.append(this.LJI);
        LIZ.append(", refer=");
        return q.LIZIZ(LIZ, this.LJII, ')', LIZ);
    }

    public NN0(String label, LinkData linkData, Aweme aweme, boolean z, boolean z2, int i, long j, String refer) {
        o.LJIIIZ(label, "label");
        o.LJIIIZ(refer, "refer");
        this.LIZ = label;
        this.LIZIZ = linkData;
        this.LIZJ = aweme;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = i;
        this.LJI = j;
        this.LJII = refer;
    }
}
