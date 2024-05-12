package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.09k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C028809k {
    public boolean LIZ = true;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public List<RecyclerView.ViewHolder> LJIIJ;
    public boolean LJIIJJI;

    public final void LIZ(View view) {
        int viewLayoutPosition;
        int size = this.LJIIJ.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                View view3 = ((RecyclerView.ViewHolder) ListProtector.get(this.LJIIJ, i2)).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.isItemRemoved() && (viewLayoutPosition = (layoutParams.getViewLayoutPosition() - this.LIZLLL) * this.LJ) >= 0 && viewLayoutPosition < i) {
                    view2 = view3;
                    if (viewLayoutPosition == 0) {
                        break;
                    } else {
                        i = viewLayoutPosition;
                    }
                }
                i2++;
            } else if (view2 == null) {
                this.LIZLLL = -1;
                return;
            }
        }
        this.LIZLLL = ((RecyclerView.LayoutParams) view2.getLayoutParams()).getViewLayoutPosition();
    }

    public final View LIZIZ(C0A7 c0a7) {
        List<RecyclerView.ViewHolder> list = this.LJIIJ;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = ((RecyclerView.ViewHolder) ListProtector.get(this.LJIIJ, i)).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!layoutParams.isItemRemoved() && this.LIZLLL == layoutParams.getViewLayoutPosition()) {
                    LIZ(view);
                    return view;
                }
            }
            return null;
        }
        View LJFF = c0a7.LJFF(this.LIZLLL);
        this.LIZLLL += this.LJ;
        return LJFF;
    }
}
