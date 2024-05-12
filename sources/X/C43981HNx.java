package X;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.HNx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43981HNx extends C0B4 {
    public final InterfaceC43983HNz LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    @Override // X.C0B4
    public final void LJIILL(RecyclerView.ViewHolder p0) {
        o.LJIIIZ(p0, "p0");
    }

    public C43981HNx(C46048I5k c46048I5k) {
        this.LIZLLL = c46048I5k;
    }

    @Override // X.C0B4
    public final void LIZIZ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(viewHolder, "viewHolder");
        this.LIZLLL.LJJJJJ(viewHolder, this.LJ);
        super.LIZIZ(recyclerView, viewHolder);
        this.LJ = false;
    }

    @Override // X.C0B4
    public int LJ(RecyclerView p0, RecyclerView.ViewHolder p1) {
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        return C0B4.LJIIIZ(15, 0);
    }

    @Override // X.C0B4
    public final void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i) {
        if (i != 0) {
            if (viewHolder != null) {
                C82848WfM.LIZLLL(100, C60903NvH.LJ);
                this.LIZLLL.LJJLL(viewHolder);
                return;
            }
            return;
        }
        if (viewHolder != null) {
        }
    }

    @Override // X.C0B4
    public boolean LJIIL(RecyclerView p0, RecyclerView.ViewHolder p1, RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        C82848WfM.LIZLLL(50, C60903NvH.LJ);
        this.LIZLLL.LJL(p1, viewHolder);
        this.LJ = true;
        return true;
    }

    @Override // X.C0B4
    public final void LJIIJ(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        float f3 = f2;
        o.LJIIIZ(c, "c");
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(viewHolder, "viewHolder");
        o.LJIIIIZZ(viewHolder.itemView, "viewHolder.itemView");
        double height = (r8.getHeight() * 0.25d) / 2;
        double top = (viewHolder.itemView.getTop() - height) + f3;
        double height2 = (viewHolder.itemView.getHeight() * 1.25f) + top;
        if (top < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            f3 = -((float) (viewHolder.itemView.getTop() - height));
        } else if (height2 > recyclerView.getHeight()) {
            f3 = (float) (recyclerView.getBottom() - (r8.getBottom() + height));
        }
        if (i == 2 && !z) {
            if (this.LJFF) {
                this.LJFF = false;
                this.LIZLLL.LJJLJ(viewHolder).translationX(0.0f).translationY(0.0f).setDuration(C0B4.LIZJ(recyclerView, 8)).start();
                return;
            }
            return;
        }
        super.LJIIJ(c, recyclerView, viewHolder, f, f3, i, z);
        this.LJFF = true;
    }
}
