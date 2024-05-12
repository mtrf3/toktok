package X;

/* renamed from: X.CEz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31009CEz {
    public final long LIZ;
    public final long LIZIZ;

    public C31009CEz() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31009CEz)) {
            return false;
        }
        C31009CEz c31009CEz = (C31009CEz) obj;
        return this.LIZ == c31009CEz.LIZ && this.LIZIZ == c31009CEz.LIZIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZIZ) + (C16880lQ.LLJIJIL(this.LIZ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MaxShowItem(waitingCount=");
        LIZ.append(this.LIZ);
        LIZ.append(", viewerCount=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C31009CEz(int r5) {
        /*
            r4 = this;
            com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOutViewerFriendSetting r1 = com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOutViewerFriendSetting.INSTANCE
            com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOutViewerFriendConfig r0 = r1.getValue()
            long r2 = r0.initCount
            com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOutViewerFriendConfig r0 = r1.getValue()
            long r0 = r0.initCount
            r4.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31009CEz.<init>(int):void");
    }

    public C31009CEz(long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
    }
}
