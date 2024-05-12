package X;

import android.widget.FrameLayout;
import com.bytedance.android.livesdk.sei.SeiDsl;

/* renamed from: X.TuB, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76123TuB {
    public final /* synthetic */ C76120Tu8 LIZ;

    public final void LIZIZ() {
        long currentTimeMillis = System.currentTimeMillis();
        C76120Tu8 c76120Tu8 = this.LIZ;
        if (currentTimeMillis - c76120Tu8.LJLLI > 5000) {
            if (c76120Tu8.LJIILIIL() == 4 || c76120Tu8.LJLLILLLL == 2) {
                c76120Tu8.LJIIL();
            }
        }
    }

    public C76123TuB(C76120Tu8 c76120Tu8) {
        this.LIZ = c76120Tu8;
    }

    public static final boolean LIZ(InterfaceC75804Tp2 interfaceC75804Tp2) {
        if (interfaceC75804Tp2.LIZ() != 16) {
            return true;
        }
        return false;
    }

    public final void LIZJ(InterfaceC75804Tp2 interfaceC75804Tp2) {
        int i;
        C76120Tu8 c76120Tu8 = this.LIZ;
        SeiDsl LJI = interfaceC75804Tp2.LJI();
        if (LJI != null) {
            i = LJI.scene;
        } else {
            i = 0;
        }
        InterfaceC76125TuD LJIILLIIL = c76120Tu8.LJIILLIIL(i, this.LIZ.LJLJJI);
        if (LJIILLIIL != null) {
            C76120Tu8 c76120Tu82 = this.LIZ;
            LJIILLIIL.LJJLIIIJJI(interfaceC75804Tp2);
            FrameLayout frameLayout = c76120Tu82.LJLJLJ;
            if (frameLayout != null) {
                LJIILLIIL.LLILLL(frameLayout, c76120Tu82.LJZL);
            }
        }
    }

    public final void LIZLLL(InterfaceC75804Tp2 interfaceC75804Tp2) {
        boolean z;
        SeiDsl LJI;
        SeiDsl LJI2;
        this.LIZ.LJLLI = System.currentTimeMillis();
        boolean z2 = true;
        int i = 0;
        if (this.LIZ.LJLLILLLL == 4 && (LJI2 = interfaceC75804Tp2.LJI()) != null && LJI2.scene == 2) {
            z = true;
        } else {
            z = false;
        }
        if (this.LIZ.LJLLILLLL != 2 || (LJI = interfaceC75804Tp2.LJI()) == null || LJI.scene != 4) {
            z2 = false;
        }
        if (z | z2) {
            InterfaceC76125TuD interfaceC76125TuD = this.LIZ.LJLIL;
            if (interfaceC76125TuD != null) {
                interfaceC76125TuD.release();
            }
            this.LIZ.LJLIL = null;
        }
        C76120Tu8 c76120Tu8 = this.LIZ;
        SeiDsl LJI3 = interfaceC75804Tp2.LJI();
        if (LJI3 != null) {
            i = LJI3.scene;
        }
        c76120Tu8.LJLLILLLL = i;
        if (interfaceC75804Tp2.LIZ() == 2) {
            C76120Tu8 c76120Tu82 = this.LIZ;
            if (c76120Tu82.LJIILIIL() == 4) {
                c76120Tu82.LJIIL();
            }
        }
    }
}
