package X;

import com.ss.android.ugc.asve.recorder.camera.VECameraController;
import java.util.Iterator;
import kotlin.jvm.internal.AqS112S0101000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WxY, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83976WxY implements InterfaceC84139X0l {
    public int LIZ = -9999;
    public String LIZIZ = "";
    public final /* synthetic */ VECameraController LIZJ;
    public final /* synthetic */ boolean LIZLLL;

    @Override // X.InterfaceC84140X0m
    public final void LIZ() {
        if (!this.LIZJ.LLIZ.invoke().booleanValue() && !this.LIZJ.LLILZ.LJIIJJI()) {
            LIZJ();
        }
    }

    public final void LIZJ() {
        C83964WxM c83964WxM = C83964WxM.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
        o.LJIIIIZZ(LLLLIIIILLL, "Thread.currentThread()");
        LIZ.append(LLLLIIIILLL.getName());
        LIZ.append("/ VECameraController.cameraOpenSuccess");
        c83964WxM.LIZ(X1D.LIZIZ(LIZ));
        InterfaceC83970WxS interfaceC83970WxS = this.LIZJ.LJLJLJ;
        if (interfaceC83970WxS != null) {
            interfaceC83970WxS.LJIILIIL();
        }
        if (!this.LIZLLL) {
            VECameraController vECameraController = this.LIZJ;
            InterfaceC83997Wxt interfaceC83997Wxt = vECameraController.LJLJL;
            if (interfaceC83997Wxt != null) {
                interfaceC83997Wxt.LIZ(vECameraController.LJLL, vECameraController.LJLLI);
            }
            synchronized (vECameraController.LJLLL) {
                vECameraController.LJLZ = true;
                if (vECameraController.LLIIL) {
                    vECameraController.LJJJJIZL();
                } else if (vECameraController.LJLLLL) {
                    vECameraController.LJJJJIZL();
                }
            }
        }
    }

    @Override // X.InterfaceC84140X0m
    public final void LIZIZ(int i) {
        if (this.LIZJ.LLIZ.invoke().booleanValue()) {
            return;
        }
        C43045Guv.LIZLLL(new AqS112S0101000_14(this, i, 10), 0L);
    }

    public C83976WxY(VECameraController vECameraController, boolean z) {
        this.LIZJ = vECameraController;
        this.LIZLLL = z;
    }

    @Override // X.InterfaceC84139X0l
    public final void onError(int i, String str) {
        InterfaceC83970WxS interfaceC83970WxS;
        if (this.LIZJ.LLIZ.invoke().booleanValue()) {
            return;
        }
        this.LIZ = i;
        if (str != null) {
            this.LIZIZ = str;
        }
        if ((i != -417 && i != -416) || (interfaceC83970WxS = this.LIZJ.LJLJLJ) == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        interfaceC83970WxS.LJIJJLI(i, str);
    }

    @Override // X.InterfaceC84139X0l
    public final void onInfo(int i, int i2, String str) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        if (this.LIZJ.LLIZ.invoke().booleanValue()) {
            return;
        }
        if (i == 2) {
            if (this.LIZJ.LLILZ.LJIIJJI()) {
                LIZJ();
            }
            VECameraController vECameraController = this.LIZJ;
            vECameraController.LJLLJ = i2;
            C83738Wti.LIZ = i2;
            vECameraController.LJLLILLLL = true;
            vECameraController.LLI = 0.0f;
            vECameraController.LLIFFJFJJ = 0.0f;
            vECameraController.LLII = 1.0f;
            Iterator<InterfaceC83737Wth> it = vECameraController.LJLJJL.iterator();
            while (it.hasNext()) {
                it.next().LIZIZ(vECameraController.LJLLJ);
            }
        } else if (i == 3) {
            InterfaceC83697Wt3 interfaceC83697Wt3 = this.LIZJ.LLIZLLLIL;
            if (interfaceC83697Wt3 != null) {
                interfaceC83697Wt3.LIZIZ("first_frame_captured_to_surface_created", "first_frame_captured_to_effect_first_frame", "first_frame_captured_to_first_frame_render");
            }
            VECameraController vECameraController2 = this.LIZJ;
            vECameraController2.LJJJJL();
            Iterator<InterfaceC83996Wxs> it2 = vECameraController2.LJLJJI.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ();
            }
        } else if (i == 5 && (interfaceC65784Pro = this.LIZJ.LJLJJLL) != null) {
            interfaceC65784Pro.invoke();
        }
        C43045Guv.LIZLLL(new C83978Wxa(this, i, i2, str), 0L);
    }
}
