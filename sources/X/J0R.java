package X;

import com.lynx.canvas.CanvasManager;
import java.lang.reflect.Constructor;

/* loaded from: classes9.dex */
public final class J0R extends J0P {
    public final /* synthetic */ Constructor LIZ;
    public final /* synthetic */ CanvasManager LIZIZ;

    @Override // X.J0P
    public final J0O LIZ(java.util.Map<String, String> map) {
        try {
            return (J0O) this.LIZ.newInstance(this.LIZIZ.mContext, map);
        } catch (Exception unused) {
            O5Y.LJIILIIL("CanvasManager", "reflect find service for LynxCanvasTTPlayer construct error");
            return null;
        }
    }

    public J0R(CanvasManager canvasManager, Constructor constructor) {
        this.LIZIZ = canvasManager;
        this.LIZ = constructor;
    }
}
