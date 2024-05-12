package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import defpackage.b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LY3 {
    public final List<FollowingInterestUser> LIZ;
    public final List<Aweme> LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final int LJI;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LY3() {
        /*
            r2 = this;
            r1 = 0
            r0 = 127(0x7f, float:1.78E-43)
            r2.<init>(r1, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LY3.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LY3)) {
            return false;
        }
        LY3 ly3 = (LY3) obj;
        return o.LJ(this.LIZ, ly3.LIZ) && o.LJ(this.LIZIZ, ly3.LIZIZ) && this.LIZJ == ly3.LIZJ && this.LIZLLL == ly3.LIZLLL && this.LJ == ly3.LJ && this.LJFF == ly3.LJFF && this.LJI == ly3.LJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        List<FollowingInterestUser> list = this.LIZ;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = hashCode * 31;
        List<Aweme> list2 = this.LIZIZ;
        if (list2 != null) {
            i = list2.hashCode();
        }
        int i3 = (i2 + i) * 31;
        boolean z = this.LIZJ;
        int i4 = 1;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int i6 = (i3 + i5) * 31;
        if (!this.LIZLLL) {
            i4 = 0;
        }
        return JBR.LIZJ(this.LJFF, JBR.LIZJ(this.LJ, (i6 + i4) * 31, 31), 31) + this.LJI;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FollowingFeedSkyLightDataSource(followingInterestUsers=");
        LIZ.append(this.LIZ);
        LIZ.append(", story=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", myStoryInvalid=");
        LIZ.append(this.LIZJ);
        LIZ.append(", storyHasMore=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", storyCursor=");
        LIZ.append(this.LJ);
        LIZ.append(", storyTotalCount=");
        LIZ.append(this.LJFF);
        LIZ.append(", storyUnreadCount=");
        return b0.LIZJ(LIZ, this.LJI, ')', LIZ);
    }

    public /* synthetic */ LY3(List list, List list2, int i) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2, false, false, 0L, 0L, 0);
    }

    public static LY3 LIZ(LY3 ly3, List list, List list2, int i, int i2) {
        boolean z;
        boolean z2;
        long j;
        int i3 = i;
        List list3 = list;
        List list4 = list2;
        if ((i2 & 1) != 0) {
            list3 = ly3.LIZ;
        }
        if ((i2 & 2) != 0) {
            list4 = ly3.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            z = ly3.LIZJ;
        } else {
            z = false;
        }
        if ((i2 & 8) != 0) {
            z2 = ly3.LIZLLL;
        } else {
            z2 = false;
        }
        long j2 = 0;
        if ((i2 & 16) != 0) {
            j = ly3.LJ;
        } else {
            j = 0;
        }
        if ((i2 & 32) != 0) {
            j2 = ly3.LJFF;
        }
        if ((i2 & 64) != 0) {
            i3 = ly3.LJI;
        }
        ly3.getClass();
        return new LY3(list3, list4, z, z2, j, j2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LY3(List<FollowingInterestUser> list, List<? extends Aweme> list2, boolean z, boolean z2, long j, long j2, int i) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = j;
        this.LJFF = j2;
        this.LJI = i;
    }
}
