package X;

import android.view.SurfaceHolder;
import com.ss.android.vesdk.VEEditor;
import java.util.Locale;

/* loaded from: classes12.dex */
public class P5Q implements SurfaceHolder.Callback2 {
    public final /* synthetic */ VEEditor LJLIL;

    public P5Q(VEEditor vEEditor) {
        this.LJLIL = vEEditor;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.LJLIL.LJJIIJZLJL(surfaceHolder.getSurface());
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.LJLIL.LLF.get()) {
            P4Q.LJII("VEEditor", "surfaceDestroyed, is destroying, just return");
        } else {
            this.LJLIL.LJJIIZ();
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        P4Q.LIZ("VEEditor", "surfaceRedrawNeeded...");
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        P4Q.LIZ("VEEditor", C16880lQ.LLLZI(Locale.US, "surfaceChanged: pixel format [%d], size [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}));
        VEEditor vEEditor = this.LJLIL;
        vEEditor.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSurfaceChanged... ");
        LIZ.append(i2);
        LIZ.append(", ");
        LIZ.append(i3);
        P4Q.LJFF("VEEditor", X1D.LIZIZ(LIZ));
        vEEditor.LLFFF = i2;
        vEEditor.LLFII = i3;
        vEEditor.LJJJJJL();
        if (i2 == 0 || i3 == 0) {
            return;
        }
        vEEditor.LLIIII.setSurfaceSize(i2, i3);
    }
}
