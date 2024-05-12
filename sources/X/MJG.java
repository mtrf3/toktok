package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.ui.BaseDiscoverTabFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MJG extends C1BD {
    public final Context LJLJLJ;
    public final List<BaseDiscoverTabFragment> LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LJLJLLL).size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        BaseDiscoverTabFragment LJJIIJ = LJJIIJ(i);
        o.LJI(LJJIIJ);
        if (LJJIIJ.wl() != 0) {
            Context context = this.LJLJLJ;
            BaseDiscoverTabFragment LJJIIJ2 = LJJIIJ(i);
            o.LJI(LJJIIJ2);
            String string = context.getString(LJJIIJ2.wl());
            o.LJIIIIZZ(string, "{\n            context.ge…!!.tabTitleRes)\n        }");
            return string;
        }
        o.LJI(LJJIIJ(i));
        return "null";
    }

    @Override // X.C1BD
    public final Fragment LJJIII(int i) {
        BaseDiscoverTabFragment LJJIIJ = LJJIIJ(i);
        o.LJI(LJJIIJ);
        return LJJIIJ;
    }

    public final BaseDiscoverTabFragment LJJIIJ(int i) {
        return (BaseDiscoverTabFragment) ListProtector.get(this.LJLJLLL, i);
    }

    public MJG(Context context, FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.LJLJLJ = context;
        this.LJLJLLL = new ArrayList();
        this.LJLL = -1;
        this.LJLLI = -1;
        this.LJLLILLLL = -1;
    }

    public final void LJJIIJZLJL(BaseDiscoverTabFragment baseDiscoverTabFragment, boolean z) {
        String str;
        String vl = baseDiscoverTabFragment.vl();
        if (z) {
            C56632Kd.LIZ(vl, "default_landing_page", "default_landing_page");
            return;
        }
        BaseDiscoverTabFragment LJJIIJ = LJJIIJ(this.LJLL);
        if (LJJIIJ == null) {
            return;
        }
        String vl2 = LJJIIJ.vl();
        if (this.LJLLI == this.LJLLILLLL) {
            str = "click";
        } else {
            this.LJLLILLLL = -1;
            str = "slide";
        }
        C56632Kd.LIZ(vl, vl2, str);
    }

    @Override // X.C1BD, androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object object) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        super.LJIIIZ(i, container, object);
        ListProtector.remove(this.LJLJLLL, i);
        notifyDataSetChanged();
    }
}
