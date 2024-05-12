package X;

import com.lynx.canvas.CanvasManager;

/* loaded from: classes12.dex */
public final class P5K extends P5J {
    public final /* synthetic */ CanvasManager LIZ;

    @Override // X.P5J
    public final P5E LIZ() {
        P5E p5e = new P5E();
        String temporaryDirectory = this.LIZ.getTemporaryDirectory();
        synchronized (p5e) {
            p5e.LIZLLL = temporaryDirectory;
        }
        return p5e;
    }

    public P5K(CanvasManager canvasManager) {
        this.LIZ = canvasManager;
    }
}
