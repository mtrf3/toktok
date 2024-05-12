package X;

import com.bytedance.android.livesdk.model.GiftsBoxInfoForSend;
import kotlin.jvm.internal.o;

/* renamed from: X.0jv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15950jv {
    public final long LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final GiftsBoxInfoForSend LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15950jv)) {
            return false;
        }
        C15950jv c15950jv = (C15950jv) obj;
        return this.LIZ == c15950jv.LIZ && this.LIZIZ == c15950jv.LIZIZ && this.LIZJ == c15950jv.LIZJ && o.LJ(this.LIZLLL, c15950jv.LIZLLL) && o.LJ(this.LJ, c15950jv.LJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SendGiftSuccessEventData(giftId=");
        LIZ.append(this.LIZ);
        LIZ.append(", count=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", diamondCount=");
        LIZ.append(this.LIZJ);
        LIZ.append(", logId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", giftBoxInfoForSend=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZLLL, ((((C16880lQ.LLJIJIL(this.LIZ) * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31, 31);
        GiftsBoxInfoForSend giftsBoxInfoForSend = this.LJ;
        if (giftsBoxInfoForSend == null) {
            hashCode = 0;
        } else {
            hashCode = giftsBoxInfoForSend.hashCode();
        }
        return LJ + hashCode;
    }

    public C15950jv(long j, int i, int i2, String logId, GiftsBoxInfoForSend giftsBoxInfoForSend) {
        o.LJIIIZ(logId, "logId");
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = logId;
        this.LJ = giftsBoxInfoForSend;
    }
}
