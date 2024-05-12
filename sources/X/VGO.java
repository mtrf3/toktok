package X;

import android.graphics.Canvas;
import android.view.HardwareCanvas;
import android.view.RenderNode;
import android.view.View;
import java.lang.reflect.Method;

/* loaded from: classes15.dex */
public final class VGO extends VPG {
    public static Method LIZIZ;
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
        ((HardwareCanvas) canvas).drawRenderNode(this.LIZ);
    }

    @Override // X.VPG
    public final void LIZJ(Canvas canvas) {
        this.LIZ.end((HardwareCanvas) canvas);
    }

    @Override // X.VPG
    /* renamed from: LJI, reason: merged with bridge method [inline-methods] */
    public final HardwareCanvas LIZ(int i, int i2) {
        try {
            if (LIZIZ == null) {
                Class cls = Integer.TYPE;
                Method declaredMethod = RenderNode.class.getDeclaredMethod("start", cls, cls);
                LIZIZ = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            return (HardwareCanvas) LIZIZ.invoke(this.LIZ, Integer.valueOf(i), Integer.valueOf(i2));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // X.VPG
    public final void LJFF(int i, int i2, int i3, int i4) {
        this.LIZ.setLeftTopRightBottom(i, i2, i3, i4);
    }
}
