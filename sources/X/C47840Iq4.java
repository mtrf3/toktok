package X;

import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;

/* renamed from: X.Iq4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47840Iq4 implements InterfaceC47844Iq8 {
    public final WeakReference<C47835Ipz> LIZ;
    public final /* synthetic */ C47835Ipz LIZIZ;

    @Override // X.InterfaceC47844Iq8
    public final void LIZ(C47789IpF c47789IpF) {
    }

    @Override // X.InterfaceC47844Iq8
    public final void LIZIZ(String str) {
    }

    public C47840Iq4(C47835Ipz c47835Ipz, C47835Ipz c47835Ipz2) {
        this.LIZIZ = c47835Ipz;
        this.LIZ = new WeakReference<>(c47835Ipz2);
    }

    @Override // X.InterfaceC47844Iq8
    public final void LIZJ(C47164IfA c47164IfA, C47789IpF c47789IpF) {
        C47835Ipz c47835Ipz = this.LIZ.get();
        if (c47835Ipz == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("did fetch video modeo, videoId is ");
        LIZ.append(c47835Ipz.LJIIL);
        TTVideoEngineLog.d("TTVideoEngine.DownloadVidTask", X1D.LIZIZ(LIZ));
        int i = c47835Ipz.LJFF;
        if (i == 4 || i == 5) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("but state is canceled. videoId = ");
            LIZ2.append(c47835Ipz.LJIIL);
            TTVideoEngineLog.d("TTVideoEngine.DownloadVidTask", X1D.LIZIZ(LIZ2));
            return;
        }
        if (c47164IfA != null) {
            c47835Ipz.LJIILIIL(c47164IfA);
            if (c47835Ipz.LJFF == 3) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("but state is suspended. videoId = ");
                LIZ3.append(c47835Ipz.LJIIL);
                TTVideoEngineLog.d("TTVideoEngine.DownloadVidTask", X1D.LIZIZ(LIZ3));
                return;
            }
            c47835Ipz.LJIIJJI(c47164IfA);
            return;
        }
        if (c47789IpF != null) {
            c47835Ipz.LJI(c47789IpF);
        }
    }

    @Override // X.InterfaceC47844Iq8
    public final void LIZLLL(int i, String str) {
        C47835Ipz c47835Ipz = this.LIZ.get();
        if (c47835Ipz == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("error info: apiString = ");
        LIZ.append(this.LIZIZ.LJJIIZI);
        LIZ.append(" authString = ");
        this.LIZIZ.getClass();
        LIZ.append((String) null);
        LIZ.append(" apiVersion = ");
        LIZ.append(this.LIZIZ.LJJIII);
        LIZ.append(" state = ");
        LIZ.append(i);
        c47835Ipz.LJI(new C47789IpF("kTTVideoErrorDomainFetchingInfo", -9996, i, X1D.LIZIZ(LIZ)));
    }
}
