package X;

import com.lynx.tasm.LynxViewClient;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.FpH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40147FpH extends LynxViewClient {
    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIL(C40154FpO c40154FpO) {
        VNS vns;
        String str = c40154FpO.LIZ;
        WeakReference<VNS> weakReference = c40154FpO.LIZIZ;
        if (weakReference != null) {
            vns = weakReference.get();
        } else {
            vns = null;
        }
        if (o.LJ(str, "tap")) {
            C40138Fp8 c40138Fp8 = C40138Fp8.LJLIL;
            if (vns == null) {
                return;
            }
            C18080nM.LIZ.getClass();
            C18090nN LIZLLL = C18080nM.LIZLLL(vns, null);
            if (LIZLLL != null && LIZLLL.LJJIIJ) {
                C18080nM.LIZLLL = LIZLLL;
            }
            c40138Fp8.getClass();
        }
    }
}
