package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import java.util.LinkedList;

/* renamed from: X.JBe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC48746JBe extends PagerAdapter {
    public final LinkedList<View>[] LJLILLLLZI;
    public final Context LJLJI;
    public final int LJLJJI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object obj) {
        return view == obj;
    }

    public abstract int LJJIII(int i);

    public abstract int LJJIIJ(View view);

    public abstract View LJJIIZ(int i, View view, ViewGroup viewGroup);

    public void LJJIIZI(int i, View view) {
    }

    public abstract void LJJIJ(View view);

    public int LJJIIJZLJL(int i) {
        int LJJIII = LJJIII(i);
        if (LJJIII >= 0 && LJJIII < this.LJLJJI) {
            return LJJIII;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getItemViewType must return a number which is form 0 to ");
        LIZ.append(this.LJLJJI - 1);
        C36922EeM.LIZ(new Exception(X1D.LIZIZ(LIZ)));
        return 0;
    }

    public AbstractC48746JBe(Context context, int i) {
        this.LJLJI = context;
        this.LJLJJI = i;
        LinkedList<View>[] linkedListArr = new LinkedList[i];
        for (int i2 = 0; i2 < i; i2++) {
            linkedListArr[i2] = new LinkedList<>();
        }
        this.LJLILLLLZI = linkedListArr;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup viewGroup) {
        View view;
        int LJJIIJZLJL = LJJIIJZLJL(i);
        if (!this.LJLILLLLZI[LJJIIJZLJL].isEmpty()) {
            view = this.LJLILLLLZI[LJJIIJZLJL].removeFirst();
        } else {
            view = null;
        }
        View LJJIIZ = LJJIIZ(i, view, viewGroup);
        if (LJJIIZ.getParent() != null) {
            try {
                C16880lQ.LJLLL(LJJIIZ, (ViewGroup) LJJIIZ.getParent());
            } catch (Exception e) {
                PEH.LIZJ(e);
                C36922EeM.LIZ(e);
            }
        }
        if (LJJIIZ.getParent() != viewGroup) {
            viewGroup.addView(LJJIIZ);
        }
        LJJIIZI(LJJIIJZLJL, LJJIIZ);
        return LJJIIZ;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup viewGroup, Object obj) {
        if (obj == null) {
            return;
        }
        View view = (View) obj;
        try {
            C16880lQ.LJLLL(view, viewGroup);
            if (C187857Yv.LIZ >= 2) {
                C36922EeM.LIZLLL(3, "FeedNotOnRenderFirstFrameLog", "destroyItem removeView");
            }
        } catch (Exception e) {
            C36922EeM.LIZ(e);
        }
        this.LJLILLLLZI[LJJIIJ(view)].add(view);
        LJJIJ(view);
    }
}
