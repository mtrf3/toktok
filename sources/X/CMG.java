package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CMG extends PagerAdapter implements InterfaceC80719Vm7 {
    public final /* synthetic */ ArrayList<View> LJLILLLLZI;
    public final /* synthetic */ String[] LJLJI;
    public final /* synthetic */ ArrayList<C47121t6> LJLJJI;
    public final /* synthetic */ MultiLiveAsAnchorListDialogV2 LJLJJL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object object) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(object, "object");
        return view == object;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLILLLLZI.size();
    }

    @Override // X.InterfaceC80719Vm7
    public final C47121t6 LIZJ(int i) {
        int i2;
        Object obj = ListProtector.get(this.LJLJJI, i);
        o.LJIIIIZZ(obj, "textList[position]");
        C47121t6 c47121t6 = (C47121t6) obj;
        ViewPager viewPager = this.LJLJJL.LJLLLLLL;
        if (viewPager != null) {
            if (i == viewPager.getCurrentItem()) {
                i2 = R.color.a02;
            } else {
                i2 = R.color.cu;
            }
            c47121t6.setTextColor(C15380j0.LIZIZ(i2));
            return c47121t6;
        }
        o.LJIJI("viewPager");
        throw null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        return this.LJLJI[i];
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        o.LJIIIZ(container, "container");
        Object obj = ListProtector.get(this.LJLILLLLZI, i);
        o.LJIIIIZZ(obj, "viewList[position]");
        View view = (View) obj;
        container.addView(view);
        return view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object object) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        C16880lQ.LJLLL((View) object, container);
    }

    public CMG(ArrayList<View> arrayList, String[] strArr, ArrayList<C47121t6> arrayList2, MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2) {
        this.LJLILLLLZI = arrayList;
        this.LJLJI = strArr;
        this.LJLJJI = arrayList2;
        this.LJLJJL = multiLiveAsAnchorListDialogV2;
    }
}
