package X;

import com.bytedance.helios.apimonitor.CustomAnchorMonitorImpl;
import java.util.HashMap;

/* renamed from: X.PxN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66129PxN extends C66170Py2 {
    public static final C66129PxN LIZLLL = new C66129PxN();
    public static final HashMap<Integer, AbstractC66131PxP> LIZJ = new HashMap<>();

    static {
        C66037Pvt c66037Pvt = C66037Pvt.LIZIZ;
        c66037Pvt.LIZIZ(C66118PxC.LIZIZ);
        c66037Pvt.LIZIZ(C66080Pwa.LIZ);
        c66037Pvt.LIZIZ(new C66088Pwi());
        c66037Pvt.LIZIZ(new C66077PwX());
        c66037Pvt.LIZIZ(C66144Pxc.LIZ);
        c66037Pvt.LIZIZ(C66134PxS.LIZ);
        c66037Pvt.LIZIZ(C66145Pxd.LIZ);
        c66037Pvt.LIZIZ(C66135PxT.LIZ);
        c66037Pvt.LIZIZ(C66142Pxa.LIZIZ);
        LIZIZ(C66124PxI.LIZJ);
        C66132PxQ c66132PxQ = C66132PxQ.LJ;
        LIZIZ(c66132PxQ);
        C66130PxO c66130PxO = C66130PxO.LJ;
        LIZIZ(c66130PxO);
        CustomAnchorMonitorImpl customAnchorMonitorImpl = CustomAnchorMonitorImpl.INSTANCE;
        customAnchorMonitorImpl.attachActionDetector(c66130PxO);
        customAnchorMonitorImpl.attachActionDetector(c66132PxQ);
    }

    public static void LIZIZ(AbstractC66131PxP abstractC66131PxP) {
        for (int i : abstractC66131PxP.LIZLLL()) {
            LIZJ.put(Integer.valueOf(i), abstractC66131PxP);
        }
    }

    @Override // X.C66170Py2
    public final C66152Pxk LIZ(int i) {
        AbstractC66131PxP abstractC66131PxP = LIZJ.get(Integer.valueOf(i));
        if (abstractC66131PxP == null) {
            abstractC66131PxP = C66128PxM.LIZIZ;
        }
        return abstractC66131PxP.LIZ.get(i);
    }
}
