package X;

import com.bytedance.helios.sdk.HeliosEnvImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.PxI, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66124PxI extends AbstractC66131PxP {
    public static int[] LIZIZ;
    public static final C66124PxI LIZJ;

    static {
        C66124PxI c66124PxI = new C66124PxI();
        LIZJ = c66124PxI;
        c66124PxI.LJI(C66177Py9.LIZIZ);
        c66124PxI.LJI(C65990Pv8.LIZIZ);
        c66124PxI.LJI(C65991Pv9.LIZIZ);
        c66124PxI.LJI(C65989Pv7.LIZIZ);
        c66124PxI.LJI(C66146Pxe.LIZJ);
        c66124PxI.LJI(C66181PyD.LIZIZ);
        c66124PxI.LJI(C66188PyK.LIZIZ);
        c66124PxI.LJI(C66180PyC.LIZIZ);
        c66124PxI.LJI(C66179PyB.LIZIZ);
    }

    @Override // X.AbstractC66131PxP
    public final int[] LIZLLL() {
        if (LIZIZ == null) {
            int size = this.LIZ.size();
            LIZIZ = new int[size];
            for (int i = 0; i < size; i++) {
                int[] iArr = LIZIZ;
                o.LJI(iArr);
                iArr[i] = this.LIZ.keyAt(i);
            }
        }
        int[] iArr2 = LIZIZ;
        o.LJI(iArr2);
        return iArr2;
    }

    @Override // X.AbstractC66131PxP
    public final void LJFF(C66120PxE event) {
        o.LJIIIZ(event, "event");
        if (event.LLI.getExtra().containsKey("permissionType")) {
            Object obj = event.LLI.getExtra().get("permissionType");
            if (obj != null) {
                event.LJLJJL = (String) obj;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        if (!event.LIZIZ()) {
            HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
            o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
            C66059PwF.LIZJ(event, heliosEnvImpl.LJIIJ.crpConfig.reportDelayedMills);
        }
    }

    public final void LJI(InterfaceC66178PyA interfaceC66178PyA) {
        String resourceId = interfaceC66178PyA.getResourceId();
        String LIZIZ2 = interfaceC66178PyA.LIZIZ();
        for (int i : interfaceC66178PyA.LIZJ()) {
            this.LIZ.put(i, new C66152Pxk(resourceId, LIZIZ2, i, 2));
        }
    }

    @Override // X.AbstractC66131PxP
    public final void LJ(C66120PxE event, Throwable th) {
        o.LJIIIZ(event, "event");
        C66152Pxk c66152Pxk = this.LIZ.get(event.LJLJI);
        String LJLLILLLL = C16880lQ.LJLLILLLL(C66124PxI.class);
        String str = event.LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        AbstractC66131PxP.LIZJ(LJLLILLLL, str, JBR.LJFF(LIZ, c66152Pxk.LIZLLL, ".kt", LIZ), th);
        event.LIZLLL(th);
        LJFF(event);
    }
}
