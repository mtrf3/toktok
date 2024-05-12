package X;

import android.graphics.Canvas;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;

/* loaded from: classes15.dex */
public final class VGP extends VPG {
    public RenderNode LIZ;

    @Override // X.VPG
    public final boolean LIZLLL() {
        return this.LIZ.isValid();
    }

    @Override // X.VPG
    public final void LJ() {
        this.LIZ = RenderNode.create("", (View) null);
    }

    @Override // X.VPG
    public final void LIZIZ(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.LIZ);
    }

    @Override // X.VPG
    public final void LIZJ(Canvas canvas) {
        this.LIZ.end((DisplayListCanvas) canvas);
    }

    @Override // X.VPG
    /* renamed from: LJI, reason: merged with bridge method [inline-methods] */
    public final DisplayListCanvas LIZ(int i, int i2) {
        return this.LIZ.start(i, i2);
    }

    @Override // X.VPG
    public final void LJFF(int i, int i2, int i3, int i4) {
        this.LIZ.setLeftTopRightBottom(i, i2, i3, i4);
    }
}
