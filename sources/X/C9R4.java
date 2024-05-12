package X;

import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import com.ss.android.ugc.aweme.topic.trendingtopic.api.BillboardInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9R4, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9R4 implements C33Q {
    public final C43I<VideoTrendingTopic> LJLIL;
    public final C43I<Boolean> LJLILLLLZI;
    public final C43I<List<BillboardInfo>> LJLJI;

    public C9R4() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9R4)) {
            return false;
        }
        C9R4 c9r4 = (C9R4) obj;
        return o.LJ(this.LJLIL, c9r4.LJLIL) && o.LJ(this.LJLILLLLZI, c9r4.LJLILLLLZI) && o.LJ(this.LJLJI, c9r4.LJLJI);
    }

    public final int hashCode() {
        C43I<VideoTrendingTopic> c43i = this.LJLIL;
        int hashCode = (c43i == null ? 0 : c43i.hashCode()) * 31;
        C43I<Boolean> c43i2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (c43i2 == null ? 0 : c43i2.hashCode())) * 31;
        C43I<List<BillboardInfo>> c43i3 = this.LJLJI;
        return hashCode2 + (c43i3 != null ? c43i3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TopicSelectState(selectTopic=");
        LIZ.append(this.LJLIL);
        LIZ.append(", networkStatus=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", topicBoards=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9R4(C43I<VideoTrendingTopic> c43i, C43I<Boolean> c43i2, C43I<? extends List<BillboardInfo>> c43i3) {
        this.LJLIL = c43i;
        this.LJLILLLLZI = c43i2;
        this.LJLJI = c43i3;
    }

    public static C9R4 LIZ(C9R4 c9r4, C43I c43i, C43I c43i2, C43I c43i3, int i) {
        if ((i & 1) != 0) {
            c43i = c9r4.LJLIL;
        }
        if ((i & 2) != 0) {
            c43i2 = c9r4.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i3 = c9r4.LJLJI;
        }
        c9r4.getClass();
        return new C9R4(c43i, c43i2, c43i3);
    }
}
