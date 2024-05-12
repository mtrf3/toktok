package X;

import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.model.FeedItem;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BLb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28619BLb {
    public final List<FeedItem> LIZ;
    public final FeedExtra LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28619BLb)) {
            return false;
        }
        C28619BLb c28619BLb = (C28619BLb) obj;
        return o.LJ(this.LIZ, c28619BLb.LIZ) && o.LJ(this.LIZIZ, c28619BLb.LIZIZ);
    }

    public final int hashCode() {
        List<FeedItem> list = this.LIZ;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        FeedExtra feedExtra = this.LIZIZ;
        return hashCode + (feedExtra != null ? feedExtra.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedData(feedItems=");
        LIZ.append(this.LIZ);
        LIZ.append(", feedExtra=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C28619BLb(List<FeedItem> list, FeedExtra feedExtra) {
        this.LIZ = list;
        this.LIZIZ = feedExtra;
    }
}
