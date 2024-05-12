package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A4T extends F9E implements Serializable {
    public final long LJLIL;
    public final List<A4Y> LJLILLLLZI;
    public final double LJLJI;
    public final long LJLJJI;
    public final boolean LJLJJL;

    public A4T() {
        this(0L, null, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 0L, false, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ A4T copy$default(A4T a4t, long j, List list, double d, long j2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = a4t.LJLIL;
        }
        if ((i & 2) != 0) {
            list = a4t.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            d = a4t.LJLJI;
        }
        if ((i & 8) != 0) {
            j2 = a4t.LJLJJI;
        }
        if ((i & 16) != 0) {
            z = a4t.LJLJJL;
        }
        return a4t.copy(j, list, d, j2, z);
    }

    public final A4T copy(long j, List<A4Y> list, double d, long j2, boolean z) {
        o.LJIIIZ(list, "list");
        return new A4T(j, list, d, j2, z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL), this.LJLILLLLZI, Double.valueOf(this.LJLJI), Long.valueOf(this.LJLJJI), Boolean.valueOf(this.LJLJJL)};
    }

    public final double getAverageReviewPoint() {
        return this.LJLJI;
    }

    public final boolean getCanReview() {
        return this.LJLJJL;
    }

    public final long getCollectionId() {
        return this.LJLIL;
    }

    public final List<A4Y> getList() {
        return this.LJLILLLLZI;
    }

    public final long getTotalReviews() {
        return this.LJLJJI;
    }

    public A4T(long j, List<A4Y> list, double d, long j2, boolean z) {
        o.LJIIIZ(list, "list");
        this.LJLIL = j;
        this.LJLILLLLZI = list;
        this.LJLJI = d;
        this.LJLJJI = j2;
        this.LJLJJL = z;
    }

    public A4T(long j, List list, double d, long j2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? C61878OQg.INSTANCE : list, (i & 4) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d, (i & 8) == 0 ? j2 : 0L, (i & 16) != 0 ? false : z);
    }
}
