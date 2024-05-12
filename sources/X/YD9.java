package X;

import android.view.SurfaceHolder;

/* loaded from: classes16.dex */
public final class YD9 implements SurfaceHolder.Callback {
    public final /* synthetic */ YD8 LJLIL;

    public YD9(YD8 yd8) {
        this.LJLIL = yd8;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        YDA yda = this.LJLIL.LJLIL;
        if (yda != null) {
            ((YS2) yda).LJIJI();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        YDA yda = this.LJLIL.LJLIL;
        if (yda != null) {
            ((YS2) yda).LJIJJ();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        YD8 yd8 = this.LJLIL;
        if (yd8.LJLIL != null) {
            if (yd8.getHolder() != null && i2 > 0 && i3 > 0) {
                this.LJLIL.getHolder().setFixedSize(i2, i3);
                this.LJLIL.requestLayout();
            }
            ((YS2) this.LJLIL.LJLIL).LJIJ();
        }
    }
}
