package X;

import com.bytedance.android.live.broadcast.BroadcastSettingResponse;
import com.bytedance.android.live.broadcast.model.LivePermissionApplyResponse;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.BaA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29018BaA {
    public final C28467BFf<RoomCreateInfo> LIZ;
    public final C28467BFf<LivePermissionApplyResponse> LIZIZ;
    public final C28467BFf<BroadcastSettingResponse> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29018BaA)) {
            return false;
        }
        C29018BaA c29018BaA = (C29018BaA) obj;
        return o.LJ(this.LIZ, c29018BaA.LIZ) && o.LJ(this.LIZIZ, c29018BaA.LIZIZ) && o.LJ(this.LIZJ, c29018BaA.LIZJ);
    }

    public final int hashCode() {
        C28467BFf<RoomCreateInfo> c28467BFf = this.LIZ;
        int hashCode = (c28467BFf == null ? 0 : c28467BFf.hashCode()) * 31;
        C28467BFf<LivePermissionApplyResponse> c28467BFf2 = this.LIZIZ;
        int hashCode2 = (hashCode + (c28467BFf2 == null ? 0 : c28467BFf2.hashCode())) * 31;
        C28467BFf<BroadcastSettingResponse> c28467BFf3 = this.LIZJ;
        return hashCode2 + (c28467BFf3 != null ? c28467BFf3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ZippedResponse(roomCreateInfoRsp=");
        LIZ.append(this.LIZ);
        LIZ.append(", livePermissionApplyRsp=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", broadcastSettingRsp=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C29018BaA(C28467BFf<RoomCreateInfo> c28467BFf, C28467BFf<LivePermissionApplyResponse> c28467BFf2, C28467BFf<BroadcastSettingResponse> c28467BFf3) {
        this.LIZ = c28467BFf;
        this.LIZIZ = c28467BFf2;
        this.LIZJ = c28467BFf3;
    }
}
