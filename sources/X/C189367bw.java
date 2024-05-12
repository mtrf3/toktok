package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.model.StoryInsertUser;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7bw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189367bw {
    public final Aweme LIZ;
    public final List<StoryInsertUser> LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C189367bw)) {
            return false;
        }
        C189367bw c189367bw = (C189367bw) obj;
        return o.LJ(this.LIZ, c189367bw.LIZ) && o.LJ(this.LIZIZ, c189367bw.LIZIZ) && this.LIZJ == c189367bw.LIZJ && this.LIZLLL == c189367bw.LIZLLL && this.LJ == c189367bw.LJ && this.LJFF == c189367bw.LJFF && this.LJI == c189367bw.LJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        List<StoryInsertUser> list = this.LIZIZ;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.LIZLLL;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.LJ;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.LJFF;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        return ((i6 + i7) * 31) + (this.LJI ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SelectedStoryInfo(storyAweme=");
        LIZ.append(this.LIZ);
        LIZ.append(", insertUsers=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isFake=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isPublishing=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", isPublishingFailed=");
        LIZ.append(this.LJ);
        LIZ.append(", isUnderReview=");
        LIZ.append(this.LJFF);
        LIZ.append(", isViewListExpired=");
        return C48339Iy7.LIZJ(LIZ, this.LJI, ')', LIZ);
    }

    public static C189367bw LIZ(C189367bw c189367bw, boolean z, boolean z2) {
        Aweme storyAweme = c189367bw.LIZ;
        List<StoryInsertUser> list = c189367bw.LIZIZ;
        boolean z3 = c189367bw.LIZJ;
        boolean z4 = c189367bw.LJFF;
        boolean z5 = c189367bw.LJI;
        c189367bw.getClass();
        o.LJIIIZ(storyAweme, "storyAweme");
        return new C189367bw(storyAweme, list, z3, z, z2, z4, z5);
    }

    public C189367bw(Aweme storyAweme, List<StoryInsertUser> list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        o.LJIIIZ(storyAweme, "storyAweme");
        this.LIZ = storyAweme;
        this.LIZIZ = list;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = z4;
        this.LJI = z5;
    }
}
