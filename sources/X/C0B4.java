package X;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* renamed from: X.0B4, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0B4 {
    public static final C0B2 LIZIZ = new C0B2();
    public static final C0B3 LIZJ = new C0B3();
    public int LIZ = -1;

    public static int LJIIIZ(int i, int i2) {
        return (i << 16) | (i2 << 8) | ((i2 | i) << 0);
    }

    public float LIZLLL(RecyclerView.ViewHolder viewHolder) {
        return 0.5f;
    }

    public abstract int LJ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder);

    public float LJFF(RecyclerView.ViewHolder viewHolder) {
        return 0.5f;
    }

    public boolean LJII() {
        return !(this instanceof U2X);
    }

    public boolean LJIIIIZZ() {
        return !(this instanceof U2X);
    }

    public abstract boolean LJIIL(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2);

    public abstract void LJIILL(RecyclerView.ViewHolder viewHolder);

    public static long LIZJ(RecyclerView recyclerView, int i) {
        AbstractC030109x itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator == null) {
            if (i == 8) {
                return 200L;
            }
            return 250L;
        }
        if (i == 8) {
            return itemAnimator.LJIIL();
        }
        return itemAnimator.LJIILIIL();
    }

    public void LIZIZ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        Object tag = view.getTag(R.id.evb);
        if (tag instanceof Float) {
            C16360ka.LJIJ(view, ((Float) tag).floatValue());
        }
        view.setTag(R.id.evb, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i) {
    }

    public RecyclerView.ViewHolder LIZ(RecyclerView.ViewHolder viewHolder, List<RecyclerView.ViewHolder> list, int i, int i2) {
        int left;
        int abs;
        int bottom;
        int abs2;
        int abs3;
        int abs4;
        int width = viewHolder.itemView.getWidth() + i;
        int height = viewHolder.itemView.getHeight() + i2;
        int left2 = i - viewHolder.itemView.getLeft();
        int top = i2 - viewHolder.itemView.getTop();
        int size = list.size();
        RecyclerView.ViewHolder viewHolder2 = null;
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.ViewHolder viewHolder3 = (RecyclerView.ViewHolder) ListProtector.get(list, i4);
            if (left2 > 0) {
                int right = viewHolder3.itemView.getRight() - width;
                if (right < 0 && viewHolder3.itemView.getRight() > viewHolder.itemView.getRight() && (abs4 = Math.abs(right)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs4;
                }
            } else if (left2 < 0 && (left = viewHolder3.itemView.getLeft() - i) > 0 && viewHolder3.itemView.getLeft() < viewHolder.itemView.getLeft() && (abs = Math.abs(left)) > i3) {
                viewHolder2 = viewHolder3;
                i3 = abs;
            }
            if (top < 0) {
                int top2 = viewHolder3.itemView.getTop() - i2;
                if (top2 > 0 && viewHolder3.itemView.getTop() < viewHolder.itemView.getTop() && (abs3 = Math.abs(top2)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs3;
                }
            } else if (top > 0 && (bottom = viewHolder3.itemView.getBottom() - height) < 0 && viewHolder3.itemView.getBottom() > viewHolder.itemView.getBottom() && (abs2 = Math.abs(bottom)) > i3) {
                viewHolder2 = viewHolder3;
                i3 = abs2;
            }
        }
        return viewHolder2;
    }

    public int LJI(RecyclerView recyclerView, int i, int i2, int i3, long j) {
        if (this.LIZ == -1) {
            this.LIZ = recyclerView.getResources().getDimensionPixelSize(R.dimen.vv);
        }
        int i4 = this.LIZ;
        int abs = Math.abs(i2);
        int signum = (int) Math.signum(i2);
        float f = abs;
        float f2 = 1.0f;
        int interpolation = (int) (LIZJ.getInterpolation(Math.min(1.0f, (f * 1.0f) / i)) * signum * i4);
        if (j <= 2000) {
            f2 = ((float) j) / 2000.0f;
        }
        int interpolation2 = (int) (LIZIZ.getInterpolation(f2) * interpolation);
        if (interpolation2 == 0) {
            if (i2 <= 0) {
                return -1;
            }
            return 1;
        }
        return interpolation2;
    }

    public void LJIIJ(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        View view = viewHolder.itemView;
        if (z && view.getTag(R.id.evb) == null) {
            Float valueOf = Float.valueOf(C16360ka.LJIIIIZZ(view));
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    float LJIIIIZZ = C16360ka.LJIIIIZZ(childAt);
                    if (LJIIIIZZ > f3) {
                        f3 = LJIIIIZZ;
                    }
                }
            }
            C16360ka.LJIJ(view, f3 + 1.0f);
            view.setTag(R.id.evb, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LJIILIIL(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof C0B7) {
            ((C0B7) layoutManager).LIZJ(viewHolder.itemView, viewHolder2.itemView);
            return;
        }
        if (layoutManager.LJIJJLI()) {
            if (layoutManager.LJJJJJ(viewHolder2.itemView) <= recyclerView.getPaddingLeft()) {
                recyclerView.LJLI(i2);
            }
            if (layoutManager.LJJJJLI(viewHolder2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                recyclerView.LJLI(i2);
            }
        }
        if (layoutManager.LJIL()) {
            if (layoutManager.LJJJJLL(viewHolder2.itemView) <= recyclerView.getPaddingTop()) {
                recyclerView.LJLI(i2);
            }
            if (layoutManager.LJJJJIZL(viewHolder2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                recyclerView.LJLI(i2);
            }
        }
    }

    public void LJIIJJI(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
    }
}
