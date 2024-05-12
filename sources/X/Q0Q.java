package X;

import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q0Q implements InterfaceC66039Pvv {
    @Override // X.InterfaceC66039Pvv
    public final int LIZ() {
        return 0;
    }

    @Override // X.InterfaceC66039Pvv
    public final void LIZIZ(C66120PxE event) {
        Object LIZ;
        C66314Q0w c66314Q0w;
        String LIZIZ;
        boolean z;
        Throwable th;
        OHW ohw;
        String[] strArr;
        OHW ohw2;
        Cert cert;
        String certToken;
        o.LJIIIZ(event, "event");
        System.nanoTime();
        try {
            c66314Q0w = Q0S.LIZ.get();
            if (c66314Q0w != null && (ohw2 = c66314Q0w.LIZ) != null && (cert = ohw2.LIZIZ) != null && (certToken = cert.certToken()) != null) {
                event.LJLLLL.put("certToken", certToken);
                event.LLIL.put("certToken", certToken);
            }
            LIZIZ = Q0S.LIZIZ(event);
        } catch (Throwable th2) {
            LIZ = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ);
        }
        if (LIZIZ == null) {
            return;
        }
        if (c66314Q0w != null && (ohw = c66314Q0w.LIZ) != null && (strArr = ohw.LIZLLL) != null && ORY.LJJIJIIJIL(LIZIZ, strArr)) {
            z = true;
            th = null;
        } else {
            z = false;
            th = new Throwable();
        }
        C46432IKe.LIZ(new Q0R(c66314Q0w, z, th, LIZIZ, event));
        LIZ = C76800UCe.LIZ;
        C3C5.m7constructorimpl(LIZ);
        C3C5.m10exceptionOrNullimpl(LIZ);
        System.nanoTime();
    }
}
