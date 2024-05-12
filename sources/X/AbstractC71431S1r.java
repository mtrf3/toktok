package X;

import Y.ARunnableS31S0200000_12;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.S1r, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC71431S1r<T extends RecyclerView.ViewHolder> extends AbstractC029409q<T> {
    public boolean LJLIL;
    public Rect LJLILLLLZI;
    public C70777Rq9 LJLJI;
    public final boolean LJLJJI = true;
    public final float LJLJJL = 0.7f;

    public abstract void onDestroy();

    @Override // X.AbstractC029409q
    public void onViewAttachedToWindow(T holder) {
        C71510S4s c71510S4s;
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        View view = holder.itemView;
        if ((view instanceof C71510S4s) && (c71510S4s = (C71510S4s) view) != null) {
            c71510S4s.setDragTransitionEnabled(this.LJLJJI);
            c71510S4s.setMaxDragTransitionFactor(this.LJLJJL);
        }
        if (this.LJLIL) {
            this.LJLIL = false;
            Rect rect = this.LJLILLLLZI;
            if (rect != null) {
                View view2 = holder.itemView;
                o.LJII(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.galleryviewer.core.transition.TransitionLayout");
                C71510S4s c71510S4s2 = (C71510S4s) view2;
                if (!c71510S4s2.LJLJLLL.isRunning()) {
                    c71510S4s2.post(new ARunnableS31S0200000_12(rect, c71510S4s2, 0));
                }
            }
        }
        C70777Rq9 c70777Rq9 = this.LJLJI;
        if (c70777Rq9 != null) {
            View view3 = holder.itemView;
            o.LJII(view3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.galleryviewer.core.transition.TransitionLayout");
            ((C71510S4s) view3).LIZJ(c70777Rq9);
        }
    }

    @Override // X.AbstractC029409q
    public void onViewDetachedFromWindow(T holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        C70777Rq9 c70777Rq9 = this.LJLJI;
        if (c70777Rq9 != null) {
            View view = holder.itemView;
            o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.galleryviewer.core.transition.TransitionLayout");
            ((C71510S4s) view).LIZLLL(c70777Rq9);
        }
    }
}
