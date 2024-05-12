package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import java.util.LinkedList;

/* renamed from: X.BdZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC29229BdZ extends PagerAdapter {
    public final /* synthetic */ int LJLILLLLZI;
    public final LinkedList LJLJI;
    public final LayoutInflater LJLJJI;
    public final Context LJLJJL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean LJIIZILJ(View view, Object obj) {
        switch (this.LJLILLLLZI) {
            case 0:
                return view == obj;
            default:
                return view == obj;
        }
    }

    public abstract View LJJIII(int i, View view, ViewGroup viewGroup);

    public void LJJIIJ(View view) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup viewGroup) {
        View view = null;
        switch (this.LJLILLLLZI) {
            case 0:
                if (!this.LJLJI.isEmpty()) {
                    view = (View) this.LJLJI.removeFirst();
                }
                View LJJIII = LJJIII(i, view, viewGroup);
                viewGroup.addView(LJJIII);
                return LJJIII;
            default:
                if (!this.LJLJI.isEmpty()) {
                    view = (View) this.LJLJI.removeFirst();
                }
                View LJJIII2 = LJJIII(i, view, viewGroup);
                viewGroup.addView(LJJIII2);
                return LJJIII2;
        }
    }

    public AbstractC29229BdZ(Context context, LayoutInflater layoutInflater, int i) {
        this.LJLILLLLZI = i;
        if (i != 1) {
            this.LJLJI = new LinkedList();
            this.LJLJJI = layoutInflater;
            this.LJLJJL = context;
        } else {
            this.LJLJI = new LinkedList();
            this.LJLJJI = layoutInflater;
            this.LJLJJL = context;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void LJIIIZ(int i, ViewGroup viewGroup, Object obj) {
        switch (this.LJLILLLLZI) {
            case 0:
                if (obj == null) {
                    return;
                }
                View view = (View) obj;
                C16880lQ.LJLLL(view, viewGroup);
                this.LJLJI.add(view);
                LJJIIJ(view);
                return;
            default:
                if (obj == null) {
                    return;
                }
                View view2 = (View) obj;
                C16880lQ.LJLLL(view2, viewGroup);
                this.LJLJI.add(view2);
                LJJIIJ(view2);
                return;
        }
    }
}
