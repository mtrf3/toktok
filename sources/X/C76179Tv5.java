package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Tv5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76179Tv5 {
    public final long LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final long LJ;
    public final BizApplyParams LJFF;
    public final java.util.Map<String, Object> LJI;

    public C76179Tv5() {
        this(0L, 0L, 0, 0L, null, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76179Tv5)) {
            return false;
        }
        C76179Tv5 c76179Tv5 = (C76179Tv5) obj;
        return this.LIZ == c76179Tv5.LIZ && this.LIZIZ == c76179Tv5.LIZIZ && this.LIZJ == c76179Tv5.LIZJ && this.LIZLLL == c76179Tv5.LIZLLL && this.LJ == c76179Tv5.LJ && o.LJ(this.LJFF, c76179Tv5.LJFF) && o.LJ(this.LJI, c76179Tv5.LJI);
    }

    public final int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.LJ, (((JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31) + this.LIZJ) * 31) + this.LIZLLL) * 31, 31);
        BizApplyParams bizApplyParams = this.LJFF;
        int i = 0;
        if (bizApplyParams == null) {
            hashCode = 0;
        } else {
            hashCode = bizApplyParams.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        java.util.Map<String, Object> map = this.LJI;
        if (map != null) {
            i = map.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ApplyParam(roomId=");
        LIZ.append(this.LIZ);
        LIZ.append(", userId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", strategy=");
        LIZ.append(this.LIZJ);
        LIZ.append(", position=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", expireTimeInSeconds=");
        LIZ.append(this.LJ);
        LIZ.append(", bizApplyParams=");
        LIZ.append(this.LJFF);
        LIZ.append(", custom=");
        return C15890jp.LIZ(LIZ, this.LJI, ')', LIZ);
    }

    public C76179Tv5(long j, long j2, int i, long j3, BizApplyParams bizApplyParams, java.util.Map map, int i2) {
        j = (i2 & 1) != 0 ? -1L : j;
        j2 = (i2 & 2) != 0 ? -1L : j2;
        i = (i2 & 8) != 0 ? 0 : i;
        j3 = (i2 & 16) != 0 ? 0L : j3;
        bizApplyParams = (i2 & 32) != 0 ? null : bizApplyParams;
        map = (i2 & 64) != 0 ? null : map;
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = 0;
        this.LIZLLL = i;
        this.LJ = j3;
        this.LJFF = bizApplyParams;
        this.LJI = map;
    }
}
