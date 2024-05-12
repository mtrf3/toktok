package X;

import com.ss.android.ugc.asve.recorder.camera.VECameraController;
import java.util.Iterator;

/* renamed from: X.Wxa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83978Wxa extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C83976WxY LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83978Wxa(C83976WxY c83976WxY, int i, int i2, String str) {
        super(0);
        this.LJLIL = c83976WxY;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = str;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        InterfaceC83970WxS interfaceC83970WxS;
        VECameraController vECameraController = this.LJLIL.LIZJ;
        int i = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        String str = this.LJLJJI;
        InterfaceC88473Ynt<? super Integer, ? super Integer, ? super String, C76800UCe> interfaceC88473Ynt = vECameraController.LLIL;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke(Integer.valueOf(i), Integer.valueOf(i2), str);
        }
        if (i != 0) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 5 && (interfaceC83970WxS = vECameraController.LJLJLJ) != null) {
                        interfaceC83970WxS.LJIIIIZZ();
                    }
                } else {
                    InterfaceC83970WxS interfaceC83970WxS2 = vECameraController.LJLJLJ;
                    if (interfaceC83970WxS2 != null) {
                        interfaceC83970WxS2.LJFF();
                    }
                }
            } else {
                vECameraController.LJJJJL();
                vECameraController.LJIIIZ().LJI();
                vECameraController.LJZ.setSATZoomListener(new C78688UuS());
            }
        } else {
            InterfaceC83970WxS interfaceC83970WxS3 = vECameraController.LJLJLJ;
            if (interfaceC83970WxS3 != null) {
                interfaceC83970WxS3.LJIIIZ();
            }
            Iterator<InterfaceC83995Wxr> it = vECameraController.LJLILLLLZI.iterator();
            while (it.hasNext()) {
                it.next().LIZ();
            }
            vECameraController.LJZ.LJLLI.getISORange(new C83993Wxp(vECameraController));
        }
        return C76800UCe.LIZ;
    }
}
