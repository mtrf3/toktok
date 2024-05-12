package X;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;

/* loaded from: classes15.dex */
public final class VGQ extends VPG {
    public RenderNode LIZ;

    @Override // X.VPG
    public final boolean LIZLLL() {
        return this.LIZ.hasDisplayList();
    }

    @Override // X.VPG
    public final void LJ() {
        this.LIZ = new RenderNode("");
    }

    @Override // X.VPG
    public final void LIZIZ(Canvas canvas) {
        ((RecordingCanvas) canvas).drawRenderNode(this.LIZ);
    }

    @Override // X.VPG
    public final void LIZJ(Canvas canvas) {
        this.LIZ.endRecording();
    }

    @Override // X.VPG
    public final Canvas LIZ(int i, int i2) {
        return this.LIZ.beginRecording();
    }

    @Override // X.VPG
    public final void LJFF(int i, int i2, int i3, int i4) {
        this.LIZ.setPosition(i, i2, i3, i4);
    }
}
