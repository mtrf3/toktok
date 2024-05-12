package X;

import android.opengl.EGLContext;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.vesdk.VERecorder;

/* renamed from: X.P6m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63912P6m implements VERecorder.OnFrameAvailableListenerExt {
    public final /* synthetic */ InterfaceC63914P6o LIZ;
    public final /* synthetic */ VERecorder LIZIZ;

    @Override // com.ss.android.vesdk.VERecorder.OnFrameAvailableListenerExt
    public final C63913P6n config() {
        C63913P6n c63913P6n = new C63913P6n();
        c63913P6n.LIZ = P6Z.TEPixFmt_OpenGL_RGBA8;
        InterfaceC63914P6o interfaceC63914P6o = this.LIZ;
        if (interfaceC63914P6o != null) {
            interfaceC63914P6o.LIZIZ();
        }
        return c63913P6n;
    }

    @Override // com.ss.android.vesdk.VERecorder.OnFrameAvailableListenerExt
    public final void OnFrameAvailable(VEFrame vEFrame) {
        long j;
        if (this.LIZ == null) {
            return;
        }
        if (vEFrame != null && vEFrame.getFormat() == P6Z.TEPixFmt_OpenGL_RGBA8) {
            VEFrame.TextureFrame textureFrame = (VEFrame.TextureFrame) vEFrame.getFrame();
            InterfaceC63914P6o interfaceC63914P6o = this.LIZ;
            EGLContext eGLContext = textureFrame.context;
            int i = textureFrame.texID;
            int width = vEFrame.getWidth();
            int height = vEFrame.getHeight();
            long timeStamp = vEFrame.getTimeStamp();
            AbstractC84025WyL abstractC84025WyL = this.LIZIZ.LIZIZ;
            if (abstractC84025WyL != null) {
                j = abstractC84025WyL.getSegmentFrameTimeUS();
            } else {
                j = 0;
            }
            interfaceC63914P6o.LIZJ(eGLContext, i, 10, width, height, timeStamp, j);
            return;
        }
        this.LIZ.LIZJ(null, 0, 10, 0, 0, 0L, 0L);
    }

    public C63912P6m(VERecorder vERecorder, InterfaceC63914P6o interfaceC63914P6o) {
        this.LIZIZ = vERecorder;
        this.LIZ = interfaceC63914P6o;
    }
}
