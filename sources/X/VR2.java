package X;

import android.graphics.Rect;
import android.view.animation.Animation;
import com.lynx.tasm.behavior.ui.LynxUI;

/* loaded from: classes15.dex */
public abstract class VR2 {
    public final C79713VQf LIZ = new C79713VQf();

    public abstract Animation LIZIZ(LynxUI lynxUI, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect, float f);

    public final boolean LIZJ() {
        C79713VQf c79713VQf = this.LIZ;
        if (c79713VQf != null && c79713VQf.LJLILLLLZI > 0) {
            return true;
        }
        return false;
    }

    public final Animation LIZ(LynxUI lynxUI, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect, float f) {
        if (!LIZJ()) {
            return null;
        }
        Animation LIZIZ = LIZIZ(lynxUI, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect, f);
        if (LIZIZ != null) {
            LIZIZ.setDuration(this.LIZ.LJLILLLLZI);
            LIZIZ.setStartOffset(this.LIZ.LJLJI);
            LIZIZ.setInterpolator(C79723VQp.LIZ(this.LIZ));
        }
        return LIZIZ;
    }
}
