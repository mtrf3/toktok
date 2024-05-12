package X;

import com.ss.android.ugc.aweme.live.alphaplayer.listener.IMonitor;

/* loaded from: classes15.dex */
public class VX8 implements IMonitor {
    public final /* synthetic */ VX7 LIZ;

    public VX8(VX7 vx7) {
        this.LIZ = vx7;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.IMonitor
    public final void monitorInit(String str, Exception exc) {
        StringBuilder LIZIZ = C25620zW.LIZIZ("create ", str, " failure, errorMsg: ");
        LIZIZ.append(exc.toString());
        C32444CoK.LIZLLL("LiveGiftPlay", X1D.LIZIZ(LIZIZ));
        InterfaceC32445CoL interfaceC32445CoL = C32245Cl7.LIZ;
        if (interfaceC32445CoL != null) {
            interfaceC32445CoL.e("LiveGiftPlay", null, exc);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.IMonitor
    public final void monitor(boolean z, String str, int i, int i2, String str2) {
        synchronized (this.LIZ.LJFF) {
            VXG vxg = this.LIZ.LJ;
            if (vxg != null) {
                vxg.LIZJ();
            }
        }
    }
}
