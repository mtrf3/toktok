package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public final class VQ5 implements Drawable.Callback {
    public final List<VR1> LJLIL = new ArrayList();
    public final List<VQD> LJLILLLLZI = new ArrayList();
    public final List<Integer> LJLJI = new ArrayList();
    public final List<Integer> LJLJJI = new ArrayList();
    public final List<VQI> LJLJJL = new ArrayList();
    public final List<VQE> LJLJJLL = new ArrayList();
    public final VNU LJLJL;
    public final BackgroundDrawable LJLJLJ;
    public Bitmap.Config LJLJLLL;
    public boolean LJLL;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public final int LIZ() {
        if (((ArrayList) this.LJLJJI).isEmpty()) {
            return 1;
        }
        List<Integer> list = this.LJLJJI;
        return ((Integer) U26.LIZIZ((ArrayList) list, 1, list)).intValue();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.LJLJLJ.invalidateSelf();
    }

    public VQ5(VNU vnu, BackgroundDrawable backgroundDrawable) {
        this.LJLJL = vnu;
        this.LJLJLJ = backgroundDrawable;
    }
}
