package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.57Z, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C57Z extends C1BD {
    public final Context LJLJLJ;
    public final ArrayList<Fragment> LJLJLLL;
    public final List<C1288653y> LJLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLL.size();
    }

    @Override // X.C1BD
    public final Fragment LJJIII(int i) {
        if (i >= 0 && i < this.LJLL.size()) {
            Object obj = ListProtector.get(this.LJLJLLL, i);
            o.LJIIIIZZ(obj, "fragmentList[p0]");
            return (Fragment) obj;
        }
        return new Fragment();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57Z(FragmentManager fragmentManager, Context context, ArrayList<Fragment> fragmentList, List<C1288653y> categoryList) {
        super(fragmentManager, 0);
        o.LJIIIZ(fragmentManager, "fragmentManager");
        o.LJIIIZ(fragmentList, "fragmentList");
        o.LJIIIZ(categoryList, "categoryList");
        this.LJLJLJ = context;
        this.LJLJLLL = fragmentList;
        this.LJLL = categoryList;
    }
}
