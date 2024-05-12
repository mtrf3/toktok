package X;

import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import kotlin.jvm.internal.o;

/* renamed from: X.0Ia, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05120Ia {
    public final long LIZ;
    public final BannerInRoomCollection LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C05120Ia)) {
            return false;
        }
        C05120Ia c05120Ia = (C05120Ia) obj;
        return this.LIZ == c05120Ia.LIZ && o.LJ(this.LIZIZ, c05120Ia.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (C16880lQ.LLJIJIL(this.LIZ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Data(roomId=");
        LIZ.append(this.LIZ);
        LIZ.append(", data=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C05120Ia(long j, BannerInRoomCollection bannerInRoomCollection) {
        this.LIZ = j;
        this.LIZIZ = bannerInRoomCollection;
    }
}
