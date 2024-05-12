package X;

import com.ss.ugc.effectplatform.model.Effect;
import kotlin.jvm.internal.AqS197S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XBV implements XB8 {
    public final /* synthetic */ XBH LIZ;
    public final /* synthetic */ String LIZIZ;

    public XBV(XBH xbh, String str) {
        this.LIZ = xbh;
        this.LIZIZ = str;
    }

    @Override // X.XB8
    public final String LIZ(C84426XBm c84426XBm, long j, XB7 xb7) {
        String LJII = XBM.LJII(this.LIZ.LJIIJ.getZipPath());
        if (LJII != null) {
            InterfaceC84458XCs LIZ = C84395XAh.LIZ(LJII);
            if (LIZ instanceof XBJ) {
                XBJ xbj = (XBJ) LIZ;
                Effect effect = this.LIZ.LJIIJ;
                String expectMD5 = this.LIZIZ;
                AqS197S0100000_15 aqS197S0100000_15 = new AqS197S0100000_15(xb7, 40);
                xbj.getClass();
                o.LJIIJ(effect, "effect");
                o.LJIIJ(expectMD5, "expectMD5");
                return xbj.LJIIJJI(effect, c84426XBm, expectMD5, j, true, aqS197S0100000_15);
            }
            XBQ xbq = XBL.LJIJJ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(this.LIZIZ);
            LIZ2.append(".zip");
            String LIZIZ = X1D.LIZIZ(LIZ2);
            xbq.getClass();
            String LIZJ = XBQ.LIZJ(LIZIZ);
            if (LIZ != null) {
                LIZ.LIZJ(LIZJ, c84426XBm);
            }
            return this.LIZ.LJIIJ.getZipPath();
        }
        return null;
    }
}
