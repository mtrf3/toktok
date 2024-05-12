package X;

import Y.IDRunnableS1S0201000_24;
import android.text.TextUtils;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.SourceMonitorUtils;
import com.byted.cast.common.bean.DeviceInfo;
import com.byted.cast.common.source.ServiceInfo;

/* renamed from: X.Ze9, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class RunnableC90417Ze9 implements Runnable {
    public final /* synthetic */ ServiceInfo LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ C90416Ze8 LJLJI;

    public final void LIZ() {
        ServiceInfo serviceInfo;
        if (this.LJLJI.LJ == null || (serviceInfo = this.LJLIL) == null || !serviceInfo.isSupportDetect()) {
            CastLogger castLogger = this.LJLJI.LIZJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("checkService serviceInfo: ");
            LIZ.append(this.LJLIL);
            castLogger.w("BDLinkServiceDiskCacheHelper", X1D.LIZIZ(LIZ));
            return;
        }
        String privateChannel = this.LJLIL.getPrivateChannel();
        CastLogger castLogger2 = this.LJLJI.LIZJ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("type is ");
        LIZ2.append(privateChannel);
        LIZ2.append(",  mPrivateChannel is ");
        LIZ2.append(this.LJLJI.LJII);
        castLogger2.i("BDLinkServiceDiskCacheHelper", X1D.LIZIZ(LIZ2));
        if (TextUtils.isEmpty(privateChannel) || !TextUtils.equals(privateChannel, this.LJLJI.LJII)) {
            this.LJLJI.LIZJ.w("BDLinkServiceDiskCacheHelper", "checkService serviceInfo type error ");
            return;
        }
        int[] iArr = this.LJLJI.LJIIJ;
        int length = iArr.length;
        boolean z = false;
        int i = 3530;
        DeviceInfo deviceInfo = null;
        for (int i2 = 0; i2 < length; i2++) {
            i = iArr[i2];
            long j = this.LJLILLLLZI;
            C90416Ze8 c90416Ze8 = this.LJLJI;
            if (j != c90416Ze8.LJIIIZ) {
                CastLogger castLogger3 = c90416Ze8.LIZJ;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("before handle task expired, ignore this task, port is ");
                LIZ3.append(i);
                castLogger3.i("BDLinkServiceDiskCacheHelper", X1D.LIZIZ(LIZ3));
                return;
            }
            deviceInfo = c90416Ze8.LJ.getSinkDeviceInfo(this.LJLIL.ip, i);
            if (deviceInfo != null) {
                break;
            }
        }
        SourceMonitorUtils sourceMonitor = this.LJLJI.LIZLLL.getSourceMonitor();
        if (deviceInfo != null) {
            z = true;
        }
        sourceMonitor.trackBDLinkDiskCacheCheckResult(z);
        CastLogger castLogger4 = this.LJLJI.LIZJ;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("checkService result deviceInfo: ");
        LIZ4.append(deviceInfo);
        castLogger4.i("BDLinkServiceDiskCacheHelper", X1D.LIZIZ(LIZ4));
        this.LJLJI.LJFF.post(new IDRunnableS1S0201000_24(this, deviceInfo, i, 0));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC90417Ze9(C90416Ze8 c90416Ze8, ServiceInfo serviceInfo, long j) {
        this.LJLJI = c90416Ze8;
        this.LJLIL = serviceInfo;
        this.LJLILLLLZI = j;
    }
}
