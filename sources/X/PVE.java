package X;

import Y.IDComparatorS39S0000000_11;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes12.dex */
public final class PVE {
    public final List<PVF> LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    public PVE(List<PVF> list) {
        this.LIZ = list;
    }

    public final PVF LIZ(SSLSocket sSLSocket) {
        boolean z;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int size = this.LIZ.size();
        for (int i = this.LIZIZ; i < size; i++) {
            PVF pvf = (PVF) ListProtector.get(this.LIZ, i);
            if (pvf.LIZ(sSLSocket)) {
                this.LIZIZ = i + 1;
                int i2 = this.LIZIZ;
                while (true) {
                    if (i2 < this.LIZ.size()) {
                        if (((PVF) ListProtector.get(this.LIZ, i2)).LIZ(sSLSocket)) {
                            z = true;
                            break;
                        }
                        i2++;
                    } else {
                        z = false;
                        break;
                    }
                }
                this.LIZJ = z;
                C64586PWk c64586PWk = AbstractC64554PVe.LIZ;
                boolean z2 = this.LIZLLL;
                c64586PWk.getClass();
                if (pvf.LIZJ != null) {
                    enabledCipherSuites = PVA.LJIILL(PVG.LIZIZ, sSLSocket.getEnabledCipherSuites(), pvf.LIZJ);
                } else {
                    enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                }
                if (pvf.LIZLLL != null) {
                    enabledProtocols = PVA.LJIILL(PVA.LJIILJJIL, sSLSocket.getEnabledProtocols(), pvf.LIZLLL);
                } else {
                    enabledProtocols = sSLSocket.getEnabledProtocols();
                }
                String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                IDComparatorS39S0000000_11 iDComparatorS39S0000000_11 = PVG.LIZIZ;
                int length = supportedCipherSuites.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        if (iDComparatorS39S0000000_11.compare(supportedCipherSuites[i3], "TLS_FALLBACK_SCSV") == 0) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                if (z2 && i3 != -1) {
                    String str = supportedCipherSuites[i3];
                    int length2 = enabledCipherSuites.length + 1;
                    String[] strArr = new String[length2];
                    System.arraycopy(enabledCipherSuites, 0, strArr, 0, enabledCipherSuites.length);
                    strArr[length2 - 1] = str;
                    enabledCipherSuites = strArr;
                }
                PVH pvh = new PVH(pvf);
                pvh.LIZ(enabledCipherSuites);
                pvh.LIZJ(enabledProtocols);
                PVF pvf2 = new PVF(pvh);
                String[] strArr2 = pvf2.LIZLLL;
                if (strArr2 != null) {
                    sSLSocket.setEnabledProtocols(strArr2);
                }
                String[] strArr3 = pvf2.LIZJ;
                if (strArr3 != null) {
                    sSLSocket.setEnabledCipherSuites(strArr3);
                }
                return pvf;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Unable to find acceptable protocols. isFallback=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", modes=");
        LIZ.append(this.LIZ);
        LIZ.append(", supported protocols=");
        LIZ.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(X1D.LIZIZ(LIZ));
    }
}
