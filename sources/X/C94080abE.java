package X;

import com.bytedance.effectcreatormobile.camera.impl.CameraRenderImpl;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.abE, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94080abE implements InterfaceC93942aZ0 {
    public final /* synthetic */ CameraRenderImpl LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ AtomicInteger LIZJ;
    public final /* synthetic */ InterfaceC93942aZ0 LIZLLL;

    @Override // X.InterfaceC93942aZ0
    public final void LIZ() {
        if (this.LIZJ.get() >= this.LIZIZ) {
            this.LIZ.unregAlgorithmFrameCallBack(this);
            return;
        }
        if (this.LIZJ.get() == this.LIZIZ - 1 && this.LIZJ.get() > 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IFrameCallback = invoke = ");
            LIZ.append(this.LIZJ.get());
            C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ));
            InterfaceC93942aZ0 interfaceC93942aZ0 = this.LIZLLL;
            if (interfaceC93942aZ0 != null) {
                interfaceC93942aZ0.LIZ();
            }
        }
        this.LIZJ.getAndAdd(1);
    }

    public C94080abE(CameraRenderImpl cameraRenderImpl, int i, AtomicInteger atomicInteger, InterfaceC93942aZ0 interfaceC93942aZ0) {
        this.LIZ = cameraRenderImpl;
        this.LIZIZ = i;
        this.LIZJ = atomicInteger;
        this.LIZLLL = interfaceC93942aZ0;
    }
}
