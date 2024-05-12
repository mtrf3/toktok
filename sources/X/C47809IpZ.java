package X;

import com.ss.ttvideoengine.utils.TTVideoEngineLog;

/* renamed from: X.IpZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47809IpZ implements InterfaceC47635Iml {
    public final /* synthetic */ C47801IpR LIZ;

    public C47809IpZ(C47801IpR c47801IpR) {
        this.LIZ = c47801IpR;
    }

    @Override // X.InterfaceC47635Iml
    public final void LIZ(boolean z, boolean z2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onHeadsetStateChanged: ");
        LIZ.append(z);
        LIZ.append(", ");
        LIZ.append(z2);
        TTVideoEngineLog.d("PlayDurationManager", X1D.LIZIZ(LIZ));
        if (!z) {
            this.LIZ.LIZIZ.LIZJ();
            this.LIZ.LIZJ.LIZJ();
        } else if (z2) {
            if (this.LIZ.LJ) {
                this.LIZ.LIZJ.LIZIZ();
                this.LIZ.LIZIZ.LIZJ();
            }
        } else if (this.LIZ.LJ) {
            this.LIZ.LIZIZ.LIZIZ();
            this.LIZ.LIZJ.LIZJ();
        }
        TTVideoEngineLog.d("PlayDurationManager", C16880lQ.LLLZ("wiredDuration: %s, wirelessDuration: %s", new Object[]{Integer.valueOf(this.LIZ.LIZIZ.LIZ()), Integer.valueOf(this.LIZ.LIZJ.LIZ())}));
    }
}
