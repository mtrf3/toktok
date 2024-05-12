package X;

import android.os.Looper;
import com.lynx.tasm.ui.image.FlattenUIImage;

/* loaded from: classes15.dex */
public class VQM implements V9V {
    public final /* synthetic */ FlattenUIImage LIZ;

    @Override // X.V9V
    public final void LIZ() {
    }

    @Override // X.V9V
    public final void LIZIZ() {
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            this.LIZ.invalidate();
        } else {
            this.LIZ.postInvalidate();
        }
    }

    public VQM(FlattenUIImage flattenUIImage) {
        this.LIZ = flattenUIImage;
    }
}
