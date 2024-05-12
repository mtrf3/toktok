package X;

import Y.AObjectS129S0200000_14;
import Y.AObjectS57S0101000_14;
import com.ss.android.ugc.aweme.shortvideo.record.CameraModule;

/* renamed from: X.WsX, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83665WsX {
    public final CameraModule LIZ;
    public final InterfaceC83852WvY LIZIZ;
    public final boolean LIZJ;
    public final InterfaceC65784Pro<CameraModule> LIZLLL;
    public final InterfaceC65784Pro<InterfaceC83852WvY> LJ;

    public final CameraModule LIZ() {
        CameraModule cameraModule = this.LIZ;
        if (cameraModule != null) {
            return cameraModule;
        }
        "CameraModule must not be null!".toString();
        throw new IllegalArgumentException("CameraModule must not be null!");
    }

    public final InterfaceC83852WvY LIZIZ() {
        InterfaceC83852WvY interfaceC83852WvY = this.LIZIZ;
        if (interfaceC83852WvY != null) {
            return interfaceC83852WvY;
        }
        "ICaptureSessionService must not be null!".toString();
        throw new IllegalArgumentException("ICaptureSessionService must not be null!");
    }

    public C83665WsX(AObjectS129S0200000_14 aObjectS129S0200000_14, AObjectS57S0101000_14 aObjectS57S0101000_14, boolean z) {
        CameraModule cameraModule;
        this.LIZJ = z;
        this.LIZLLL = aObjectS129S0200000_14;
        this.LJ = aObjectS57S0101000_14;
        if (!z) {
            cameraModule = (CameraModule) aObjectS129S0200000_14.invoke();
        } else {
            cameraModule = null;
        }
        this.LIZ = cameraModule;
        this.LIZIZ = z ? (InterfaceC83852WvY) aObjectS57S0101000_14.invoke() : null;
    }
}
