package X;

import android.hardware.Camera;
import android.os.SystemClock;

/* renamed from: X.Y5x, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86829Y5x implements Camera.PreviewCallback {
    public InterfaceC86828Y5w LIZ;
    public Y64 LIZIZ;
    public final /* synthetic */ C86830Y5y LIZJ;

    public C86829Y5x(C86830Y5y c86830Y5y) {
        this.LIZJ = c86830Y5y;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        Y64 y64 = this.LIZIZ;
        InterfaceC86828Y5w interfaceC86828Y5w = this.LIZ;
        if (y64 != null) {
            if (interfaceC86828Y5w != null) {
                try {
                    if (bArr != null) {
                        interfaceC86828Y5w.LIZ(new C86824Y5s(bArr, y64.LJLIL, y64.LJLILLLLZI));
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        C86830Y5y c86830Y5y = this.LIZJ;
                        if (elapsedRealtime - c86830Y5y.LJIIJ < 200) {
                            return;
                        }
                        c86830Y5y.LJIIJ = elapsedRealtime;
                        return;
                    }
                    throw new NullPointerException("No preview data received");
                } catch (Throwable unused) {
                    interfaceC86828Y5w.LIZIZ(new Exception("parse data error"));
                    return;
                }
            }
            return;
        }
        if (interfaceC86828Y5w != null) {
            interfaceC86828Y5w.LIZIZ(new Exception("No resolution available"));
        }
    }
}
