package X;

import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Ta3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74875Ta3 {
    public final LinkPlayerInfo LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74875Ta3)) {
            return false;
        }
        C74875Ta3 c74875Ta3 = (C74875Ta3) obj;
        return o.LJ(this.LIZ, c74875Ta3.LIZ) && this.LIZIZ == c74875Ta3.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkPlayerInfoDiffData(linkPlayerInfo=");
        LIZ.append(this.LIZ);
        LIZ.append(", isInOldList=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C74875Ta3(LinkPlayerInfo linkPlayerInfo, boolean z) {
        o.LJIIIZ(linkPlayerInfo, "linkPlayerInfo");
        this.LIZ = linkPlayerInfo;
        this.LIZIZ = z;
    }
}
