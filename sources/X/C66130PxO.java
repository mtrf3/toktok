package X;

import android.hardware.camera2.CameraCaptureSession;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.PxO, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66130PxO extends AbstractC66121PxF {
    public static final C66130PxO LJ;

    static {
        C66130PxO c66130PxO = new C66130PxO();
        LJ = c66130PxO;
        c66130PxO.LJI(C66173Py5.LIZJ);
    }

    @Override // X.AbstractC66131PxP
    public final int[] LIZLLL() {
        return C66173Py5.LIZ;
    }

    @Override // X.AbstractC66121PxF
    public final String LJIIIZ() {
        return "cr";
    }

    @Override // X.AbstractC66131PxP
    public final void LJFF(C66120PxE event) {
        o.LJIIIZ(event, "event");
        C66152Pxk c66152Pxk = this.LIZ.get(event.LJLJI);
        if (c66152Pxk.LIZIZ == 3) {
            int i = c66152Pxk.LIZJ;
            if (i != 100101 && i != 100201) {
                return;
            }
            LJIILJJIL(event);
            return;
        }
        int i2 = c66152Pxk.LIZJ;
        if ((i2 == 100100 || i2 == 100200) && LJIIJ(event) != 0) {
            C66150Pxi.LIZ("cr", event);
            LIZIZ();
        }
        LJIIL(c66152Pxk, event);
    }

    @Override // X.AbstractC66121PxF
    public final List<Integer> LJIIIIZZ(int i) {
        switch (i) {
            case 100103:
                return C47261Igj.LJJIJ(100102);
            case 100105:
                return C47261Igj.LJJIJ(100104);
            case 100106:
                return C47261Igj.LJJIJ(100100);
            case 100204:
                return C47261Igj.LJJIJIIJI(100202, 100203);
            case 100205:
                return C47261Igj.LJJIJIIJI(100200, 100202, 100203);
            default:
                return C61878OQg.INSTANCE;
        }
    }

    @Override // X.AbstractC66121PxF
    public final long LJIIJ(C66120PxE event) {
        Object result;
        o.LJIIIZ(event, "event");
        int i = event.LJLJI;
        int i2 = 0;
        if (i != 100100) {
            switch (i) {
                case 100200:
                    Object[] parameters = event.LLI.getParameters();
                    if (parameters != null) {
                        result = parameters[0];
                        break;
                    }
                    break;
                case 100201:
                case 100205:
                    result = event.LLI.getThisOrClass();
                    break;
                case 100202:
                case 100203:
                case 100204:
                    CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) event.LLI.getThisOrClass();
                    if (cameraCaptureSession != null) {
                        result = cameraCaptureSession.getDevice();
                        break;
                    }
                    break;
                default:
                    result = event.LLI.getThisOrClass();
                    break;
            }
            return i2;
        }
        result = event.LLI.getResult();
        if (result != null) {
            i2 = result.hashCode();
        }
        return i2;
    }
}
