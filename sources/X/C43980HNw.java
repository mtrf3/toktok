package X;

import android.graphics.Canvas;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.HNw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43980HNw extends C0B4 {
    public final AbstractC43973HNp LIZLLL;
    public boolean LJ;

    @Override // X.C0B4
    public final void LJIILL(RecyclerView.ViewHolder p0) {
        o.LJIIIZ(p0, "p0");
    }

    public C43980HNw(AbstractC43973HNp abstractC43973HNp) {
        this.LIZLLL = abstractC43973HNp;
    }

    @Override // X.C0B4
    public final void LIZIZ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        InterfaceC43977HNt interfaceC43977HNt;
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(viewHolder, "viewHolder");
        AbstractC43973HNp abstractC43973HNp = this.LIZLLL;
        abstractC43973HNp.getClass();
        if (abstractC43973HNp.LJLJI != -1) {
            C43976HNs c43976HNs = (C43976HNs) viewHolder;
            FrameLayout frameLayout = c43976HNs.LJLLILLLL;
            if (frameLayout != null) {
                frameLayout.setScaleY(1.0f);
                c43976HNs.LJLLILLLL.setScaleX(1.0f);
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            int i = abstractC43973HNp.LJLJI;
            if (adapterPosition != i && (interfaceC43977HNt = abstractC43973HNp.LJLJJLL) != null) {
                interfaceC43977HNt.LJFF(i, adapterPosition);
            }
            abstractC43973HNp.LJLJI = -1;
        }
        super.LIZIZ(recyclerView, viewHolder);
    }

    @Override // X.C0B4
    public final int LJ(RecyclerView p0, RecyclerView.ViewHolder p1) {
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        return C0B4.LJIIIZ(15, 0);
    }

    @Override // X.C0B4
    public final void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i) {
        if (i != 0) {
            if (viewHolder != null) {
                C82848WfM.LIZLLL(100, C60903NvH.LJ);
                AbstractC43973HNp abstractC43973HNp = this.LIZLLL;
                abstractC43973HNp.getClass();
                C43976HNs c43976HNs = (C43976HNs) viewHolder;
                FrameLayout frameLayout = c43976HNs.LJLLILLLL;
                if (frameLayout != null) {
                    frameLayout.setScaleX(1.0f);
                    c43976HNs.LJLLILLLL.setScaleY(1.0f);
                }
                abstractC43973HNp.LJLJI = viewHolder.getAdapterPosition();
                return;
            }
            return;
        }
        if (viewHolder != null) {
        }
    }

    @Override // X.C0B4
    public final boolean LJIIL(RecyclerView p0, RecyclerView.ViewHolder p1, RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        C82848WfM.LIZLLL(50, C60903NvH.LJ);
        this.LIZLLL.LJL(p1, viewHolder);
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
            f3 = (float) (recyclerView.getHeight() - (r8.getBottom() + height));
        }
        if (i == 2 && !z) {
            if (this.LJ) {
                this.LJ = false;
                this.LIZLLL.getClass();
                ViewPropertyAnimator scaleY = viewHolder.itemView.animate().scaleX(1.0f).scaleY(1.0f);
                o.LJIIIIZZ(scaleY, "holder.itemView.animate(…scaleX(1.0f).scaleY(1.0f)");
                scaleY.translationX(0.0f).translationY(0.0f).setDuration(C0B4.LIZJ(recyclerView, 8)).start();
                return;
            }
            return;
        }
        super.LJIIJ(c, recyclerView, viewHolder, f, f3, i, z);
        this.LJ = true;
    }
}
