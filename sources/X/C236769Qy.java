package X;

import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9Qy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C236769Qy implements C33Q {
    public final C43I<List<VideoTrendingTopic>> LJLIL;
    public final C43I<Boolean> LJLILLLLZI;

    public C236769Qy() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C236769Qy)) {
            return false;
        }
        C236769Qy c236769Qy = (C236769Qy) obj;
        return o.LJ(this.LJLIL, c236769Qy.LJLIL) && o.LJ(this.LJLILLLLZI, c236769Qy.LJLILLLLZI);
    }

    public final int hashCode() {
        C43I<List<VideoTrendingTopic>> c43i = this.LJLIL;
        int hashCode = (c43i == null ? 0 : c43i.hashCode()) * 31;
        C43I<Boolean> c43i2 = this.LJLILLLLZI;
        return hashCode + (c43i2 != null ? c43i2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchState(searchResult=");
        LIZ.append(this.LJLIL);
        LIZ.append(", networkState=");
        return C61845OOz.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C236769Qy(C43I<? extends List<VideoTrendingTopic>> c43i, C43I<Boolean> c43i2) {
        this.LJLIL = c43i;
        this.LJLILLLLZI = c43i2;
    }
}
