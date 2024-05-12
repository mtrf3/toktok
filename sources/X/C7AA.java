package X;

import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import kotlin.jvm.internal.o;

/* renamed from: X.7AA, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7AA implements C33Q {
    public final long LJLIL;
    public final NowFeedMobHierarchyData LJLILLLLZI;

    public C7AA() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7AA)) {
            return false;
        }
        C7AA c7aa = (C7AA) obj;
        return this.LJLIL == c7aa.LJLIL && o.LJ(this.LJLILLLLZI, c7aa.LJLILLLLZI);
    }

    public final int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.LJLIL) * 31;
        NowFeedMobHierarchyData nowFeedMobHierarchyData = this.LJLILLLLZI;
        return LLJIJIL + (nowFeedMobHierarchyData == null ? 0 : nowFeedMobHierarchyData.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowCommentState(commentCount=");
        LIZ.append(this.LJLIL);
        LIZ.append(", nowFeedMobHierarchyData=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C7AA(int i) {
        this(0L, null);
    }

    public C7AA(long j, NowFeedMobHierarchyData nowFeedMobHierarchyData) {
        this.LJLIL = j;
        this.LJLILLLLZI = nowFeedMobHierarchyData;
    }

    public static C7AA LIZ(C7AA c7aa, long j, NowFeedMobHierarchyData nowFeedMobHierarchyData, int i) {
        if ((i & 1) != 0) {
            j = c7aa.LJLIL;
        }
        if ((i & 2) != 0) {
            nowFeedMobHierarchyData = c7aa.LJLILLLLZI;
        }
        c7aa.getClass();
        return new C7AA(j, nowFeedMobHierarchyData);
    }
}
