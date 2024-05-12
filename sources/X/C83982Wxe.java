package X;

import com.ss.android.ugc.asve.recorder.camera.VECameraController;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Wxe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83982Wxe extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C83980Wxc LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83982Wxe(C83980Wxc c83980Wxc, float f, int i, boolean z) {
        super(0);
        this.LJLIL = c83980Wxc;
        this.LJLILLLLZI = f;
        this.LJLJI = i;
        this.LJLJJI = z;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        VECameraController vECameraController = this.LJLIL.LIZ;
        vECameraController.LLII = this.LJLILLLLZI;
        Iterator it = ((ArrayList) vECameraController.LLIIZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC83991Wxn) it.next()).onChange(this.LJLJI, this.LJLILLLLZI, this.LJLJJI);
        }
        return C76800UCe.LIZ;
    }
}
