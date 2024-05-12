package X;

import android.content.Context;
import android.view.ViewTreeObserver;
import android.view.Window;

/* loaded from: classes9.dex */
public final class JF9 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Window LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ int[] LJLJI;
    public final /* synthetic */ JF8 LJLJJI;

    public JF9(Window window, Context context, int[] iArr, C60562Npm c60562Npm) {
        this.LJLIL = window;
        this.LJLILLLLZI = context;
        this.LJLJI = iArr;
        this.LJLJJI = c60562Npm;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int LIZ = JF7.LIZ(this.LJLILLLLZI, this.LJLIL);
        if (this.LJLJI[0] != LIZ) {
            this.LJLJJI.LIZ(LIZ);
            this.LJLJI[0] = LIZ;
        }
    }
}
