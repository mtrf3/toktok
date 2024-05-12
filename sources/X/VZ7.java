package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.behavior.ui.LynxUI;
import e32.c;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes15.dex */
public class VZ7 extends PagerAdapter {
    public final /* synthetic */ c LJLILLLLZI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object obj) {
        return view == obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        c cVar = this.LJLILLLLZI;
        if (cVar.LJLLLL) {
            return cVar.LJLIL;
        }
        return ((CopyOnWriteArrayList) cVar.LLIIIILZ).size();
    }

    public VZ7(c cVar) {
        this.LJLILLLLZI = cVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final float LJIILJJIL(int i) {
        if (this.LJLILLLLZI.LJLLJ.equals("multi-pages")) {
            int i2 = this.LJLILLLLZI.LLFFF;
            if (i2 == 0) {
                return 1.0f;
            }
            return r0.LJLLILLLL / i2;
        }
        if (!this.LJLILLLLZI.LJLLJ.equals("carousel")) {
            return 1.0f;
        }
        return 0.8f;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup viewGroup) {
        boolean z;
        View view;
        int LJIIIZ = this.LJLILLLLZI.LJIIIZ(i);
        c cVar = this.LJLILLLLZI;
        if (((CopyOnWriteArrayList) cVar.LLIIIILZ).size() == 0) {
            view = new View(cVar.getContext());
        } else {
            LynxUI lynxUI = (LynxUI) ListProtector.get(cVar.LLIIIILZ, LJIIIZ);
            View view2 = lynxUI.mView;
            FrameLayout frameLayout = new FrameLayout(cVar.getContext());
            if (view2 instanceof ViewGroup) {
                if (lynxUI.getOverflow() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                frameLayout.setClipChildren(z);
            }
            if (view2.getParent() instanceof ViewGroup) {
                C16880lQ.LJLLL(view2, (ViewGroup) view2.getParent());
            }
            if (cVar.LLIIII) {
                view2.setTag("swiper_lynx_view_tag");
            }
            frameLayout.addView(view2);
            View view3 = new View(cVar.getContext());
            frameLayout.addView(view3, new FrameLayout.LayoutParams(-1, -1));
            if (!cVar.LJZ) {
                view3.setBackgroundColor(cVar.LJZL);
                view3.setTag("swiper_item_mask_tag");
            }
            view = frameLayout;
            if (cVar.LLIIII) {
                frameLayout.setTag(Integer.valueOf(i));
                view = frameLayout;
            }
        }
        viewGroup.addView(view);
        return view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup viewGroup, Object obj) {
        C16880lQ.LJLLL((View) obj, viewGroup);
    }
}
