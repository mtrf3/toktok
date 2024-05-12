package X;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JPW extends AbstractC49155JQx {
    public final InterfaceC48907JHj LIZLLL;
    public int LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;

    @Override // X.AbstractC49155JQx
    public final void LIZLLL() {
    }

    @Override // X.AbstractC49155JQx
    public final Rect LIZIZ() {
        View LJJIJIL = this.LIZLLL.LJJIJIL();
        if (LJJIJIL != null) {
            LJJIJIL.getLocationOnScreen(LJI());
            ((Rect) this.LJI.getValue()).set(LJI()[0], LJI()[1], LJJIJIL.getWidth() + LJI()[0], LJJIJIL.getHeight() + LJI()[1]);
        }
        return (Rect) this.LJI.getValue();
    }

    @Override // X.AbstractC49155JQx
    public final void LIZJ() {
        this.LIZLLL.LLLLLJLJLL();
    }

    public final int[] LJI() {
        return (int[]) this.LJFF.getValue();
    }

    @Override // X.AbstractC49155JQx
    public final int LIZ() {
        return this.LJ;
    }

    public JPW(JPV videoView) {
        o.LJIIIZ(videoView, "videoView");
        this.LIZLLL = videoView;
        this.LJFF = C221108m2.LIZIZ(JPY.LJLIL);
        this.LJI = C221108m2.LIZIZ(JPX.LJLIL);
    }

    @Override // X.AbstractC49155JQx
    public final void LJ(int i) {
        if (i != 0 && i != 1) {
            return;
        }
        this.LIZLLL.LLLJIL();
    }

    @Override // X.AbstractC49155JQx
    public final void LJFF(int i) {
        if (i != 0 && i != 1) {
            return;
        }
        this.LIZLLL.LLLJIL();
    }
}
