package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.UaX, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77453UaX {
    public final DataChannel LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;

    public C77453UaX() {
        this(0, 0L, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77453UaX)) {
            return false;
        }
        C77453UaX c77453UaX = (C77453UaX) obj;
        return o.LJ(this.LIZ, c77453UaX.LIZ) && this.LIZIZ == c77453UaX.LIZIZ && this.LIZJ == c77453UaX.LIZJ && o.LJ(this.LIZLLL, c77453UaX.LIZLLL);
    }

    public final int hashCode() {
        int hashCode;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel == null) {
            hashCode = 0;
        } else {
            hashCode = dataChannel.hashCode();
        }
        return this.LIZLLL.hashCode() + JBR.LIZJ(this.LIZJ, ((hashCode * 31) + this.LIZIZ) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveExchangeParam(dataChannel=");
        LIZ.append(this.LIZ);
        LIZ.append(", giftDiamondCount=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", giftId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", giftSource=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C77453UaX(int r7, long r8, int r10) {
        /*
            r6 = this;
            r1 = r7
            r2 = r8
            r4 = 0
            r0 = r10 & 2
            if (r0 == 0) goto L8
            r1 = 0
        L8:
            r0 = r10 & 4
            if (r0 == 0) goto Le
            r2 = 0
        Le:
            r0 = r10 & 8
            if (r0 == 0) goto L19
            java.lang.String r5 = ""
        L14:
            r0 = r6
            r0.<init>(r1, r2, r4, r5)
            return
        L19:
            r5 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77453UaX.<init>(int, long, int):void");
    }

    public C77453UaX(int i, long j, DataChannel dataChannel, String giftSource) {
        o.LJIIIZ(giftSource, "giftSource");
        this.LIZ = dataChannel;
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = giftSource;
    }
}
