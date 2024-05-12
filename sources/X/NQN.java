package X;

import java.util.ArrayList;

/* loaded from: classes11.dex */
public class NQN {
    public final boolean LIZ;
    public C60014Ngw LIZIZ;
    public C59753Ncj LIZJ;

    public NQN(O7E o7e) {
        NQQ nqq;
        this.LIZ = o7e.LJIILJJIL();
        if (o7e.LLILLJJLI == null) {
            return;
        }
        try {
            String LJII = EF7.LJII();
            C38891fp.LJI("Bytedance", "Name is null or empty");
            C38891fp.LJI(LJII, "Version is null or empty");
            C67996QmO c67996QmO = new C67996QmO("Bytedance", LJII);
            String LJIILLIIL = C62814Ol0.LJIILLIIL(EF7.LIZIZ());
            NRO nro = o7e.LLILLJJLI;
            ArrayList arrayList = new ArrayList();
            for (NSB nsb : nro.LIZ) {
                arrayList.add(NSD.LIZ(nsb.LIZ, new java.net.URL(nsb.LIZIZ), nsb.LIZJ));
            }
            C38891fp.LJFF(LJIILLIIL, "OM SDK JS script content is null");
            NR8 nr8 = new NR8(c67996QmO, LJIILLIIL, arrayList, null, NRL.NATIVE);
            if (o7e.LJIILJJIL()) {
                nqq = NQQ.VIDEO;
            } else {
                nqq = NQQ.NATIVE_DISPLAY;
            }
            NRB nrb = NRB.BEGIN_TO_RENDER;
            NRK nrk = NRK.NATIVE;
            this.LIZIZ = NQR.LIZIZ(NRJ.LIZ(nqq, nrb, nrk, nrk), nr8);
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
    }
}
