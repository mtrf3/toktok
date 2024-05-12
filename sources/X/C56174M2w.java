package X;

import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.placediscovery2.model.MapCenter;
import kotlin.jvm.internal.o;

/* renamed from: X.M2w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56174M2w {
    public static final /* synthetic */ int LIZLLL = 0;
    public final M3A LIZ;
    public final MapBounds LIZIZ;
    public final MapCenter LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56174M2w)) {
            return false;
        }
        C56174M2w c56174M2w = (C56174M2w) obj;
        return this.LIZ == c56174M2w.LIZ && o.LJ(this.LIZIZ, c56174M2w.LIZIZ) && o.LJ(this.LIZJ, c56174M2w.LIZJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        MapBounds mapBounds = this.LIZIZ;
        int hashCode2 = (hashCode + (mapBounds == null ? 0 : mapBounds.hashCode())) * 31;
        MapCenter mapCenter = this.LIZJ;
        return hashCode2 + (mapCenter != null ? mapCenter.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DiscoveryCardFeedApiRequest(key=");
        LIZ.append(this.LIZ);
        LIZ.append(", mapBound=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mapCenter=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C56174M2w(M3A key, MapBounds mapBounds, MapCenter mapCenter, int i) {
        mapBounds = (i & 2) != 0 ? null : mapBounds;
        mapCenter = (i & 4) != 0 ? null : mapCenter;
        o.LJIIIZ(key, "key");
        this.LIZ = key;
        this.LIZIZ = mapBounds;
        this.LIZJ = mapCenter;
    }
}
