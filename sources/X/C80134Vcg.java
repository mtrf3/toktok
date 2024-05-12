package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.google.android.flexbox.FlexItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vcg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80134Vcg {
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public int LIZ = Integer.MAX_VALUE;
    public int LIZIZ = Integer.MAX_VALUE;
    public int LIZJ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LIZLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public final List<Integer> LJIILIIL = new ArrayList();

    public final void LIZ(View view, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.LIZ = Math.min(this.LIZ, (view.getLeft() - flexItem.getMarginLeft()) - i);
        this.LIZIZ = Math.min(this.LIZIZ, (view.getTop() - flexItem.getMarginTop()) - i2);
        this.LIZJ = Math.max(this.LIZJ, view.getRight() + flexItem.getMarginRight() + i3);
        this.LIZLLL = Math.max(this.LIZLLL, view.getBottom() + flexItem.getMarginBottom() + i4);
    }
}
