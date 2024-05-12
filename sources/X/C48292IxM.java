package X;

import android.content.Context;
import com.ss.texturerender.VideoSurface;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.IxM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48292IxM {
    public static volatile C48292IxM LIZIZ;
    public Object LIZ;

    public final boolean LJ() {
        InterfaceC47825Ipp interfaceC47825Ipp = (InterfaceC47825Ipp) ((HashMap) this.LIZ).get(1);
        if (interfaceC47825Ipp != null) {
            return interfaceC47825Ipp.LJ();
        }
        return false;
    }

    public final void LJII() {
        PKP pkp = (PKP) this.LIZ;
        if (pkp.LIZJ) {
            return;
        }
        pkp.LIZ = new PLD(pkp);
        if (!PIX.LIZ) {
            PIX.LIZ = true;
        }
        pkp.LIZLLL = PK0.LIZJ;
        pkp.LIZJ = true;
    }

    public C48292IxM(int i) {
        if (i != 4) {
            if (i != 5) {
                if (i != 6) {
                    return;
                }
                this.LIZ = new LinkedHashSet();
                return;
            }
            this.LIZ = new HashMap();
            return;
        }
        this.LIZ = new C139085d2();
    }

    public static C48292IxM LIZJ(Context context) {
        if (LIZIZ == null) {
            synchronized (C48292IxM.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C48292IxM(context);
                }
            }
        }
        return LIZIZ;
    }

    public final synchronized void LIZ(C64562PVm c64562PVm) {
        ((java.util.Set) this.LIZ).remove(c64562PVm);
    }

    public final C13L LIZLLL(int i) {
        return ((C13L[]) this.LIZ)[i];
    }

    public /* synthetic */ C48292IxM(C1QP state) {
        o.LJIIIZ(state, "state");
        this.LIZ = state;
    }

    public /* synthetic */ C48292IxM(Context context) {
        this.LIZ = new PKP(context);
    }

    public /* synthetic */ C48292IxM(int i, int i2) {
        C13L[] c13lArr = new C13L[i];
        for (int i3 = 0; i3 < i; i3++) {
            c13lArr[i3] = new C13L(i2);
        }
        this.LIZ = c13lArr;
    }

    public final float LIZIZ(int i, int i2) {
        return ((C13L[]) this.LIZ)[i].LIZIZ[i2].floatValue();
    }

    public final void LJFF(VideoSurface videoSurface, boolean z) {
        Iterator it = ((HashMap) this.LIZ).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC47825Ipp) it.next()).LIZJ(videoSurface, z);
        }
    }

    public final void LJI(float f, int i, int i2) {
        ((C13L[]) this.LIZ)[i].LIZIZ[i2] = Float.valueOf(f);
    }
}
