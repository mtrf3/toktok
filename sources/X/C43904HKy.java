package X;

import com.ss.bduploader.BDNetworkSpeedTestListener;

/* renamed from: X.HKy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43904HKy implements BDNetworkSpeedTestListener {
    public final /* synthetic */ HL0 LIZ;

    public C43904HKy(HL9 hl9) {
        this.LIZ = hl9;
    }

    @Override // com.ss.bduploader.BDNetworkSpeedTestListener
    public final int speedTestCheckNetState(int i, int i2) {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.bduploader.BDNetworkSpeedTestListener
    public final void onSpeedTestContext(int i, int i2, String str) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            HL0 hl0 = this.LIZ;
            if (str == null) {
                str = "";
            }
            hl0.onSpeedTestContext(2, i2, str);
            return;
        }
        HL0 hl02 = this.LIZ;
        if (str == null) {
            str = "";
        }
        hl02.onSpeedTestContext(0, i2, str);
    }
}
