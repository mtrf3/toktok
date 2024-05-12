package X;

import com.bytedance.effectcreatormobile.camera.impl.CameraRenderImpl;

/* renamed from: X.abA, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94076abA implements InterfaceC93942aZ0 {
    public final /* synthetic */ C94420agi LIZ;
    public final /* synthetic */ C93909aYT LIZIZ;

    @Override // X.InterfaceC93942aZ0
    public final void LIZ() {
        CameraRenderImpl LIZ = C93899aYJ.LIZ();
        if (LIZ != null) {
            LIZ.updateRenderMode(this.LIZ.LIZIZ);
        }
        C93909aYT c93909aYT = this.LIZIZ;
        if (c93909aYT != null) {
            c93909aYT.LIZ.invoke();
        }
    }

    public C94076abA(C94420agi c94420agi, C93909aYT c93909aYT) {
        this.LIZ = c94420agi;
        this.LIZIZ = c93909aYT;
    }
}
