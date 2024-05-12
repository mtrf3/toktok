package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.b0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class A9K extends AbstractC48746JBe {
    public final Activity LJLJJL;
    public final List<A9J> LJLJJLL;
    public final java.util.Map<Integer, View> LJLJL;
    public final List<View> LJLJLJ;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJJLL.size();
    }

    @Override // X.AbstractC48746JBe
    public final int LJJIII(int i) {
        return ((A9J) ListProtector.get(this.LJLJJLL, i)).LIZ;
    }

    @Override // X.AbstractC48746JBe
    public final int LJJIIJ(View view) {
        Object obj;
        if (view != null) {
            obj = view.getTag(R.id.k4g);
        } else {
            obj = null;
        }
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        C36922EeM.LIZ(new RuntimeException(b0.LIZIZ("expect tag is type int,but no:", obj)));
        return 0;
    }

    @Override // X.AbstractC48746JBe
    public final void LJJIJ(View view) {
        A9L a9l;
        Object obj = null;
        if (view != null) {
            obj = view.getTag(R.id.k4f);
        }
        if ((obj instanceof A9L) && (a9l = (A9L) obj) != null) {
            a9l.LIZIZ();
        }
    }

    public A9K(ActivityC45651qj activityC45651qj, List list) {
        super(activityC45651qj, 2);
        this.LJLJJL = activityC45651qj;
        this.LJLJJLL = list;
        this.LJLJL = new LinkedHashMap();
        this.LJLJLJ = new ArrayList();
    }

    @Override // X.AbstractC48746JBe
    public final View LJJIIZ(int i, View view, ViewGroup viewGroup) {
        int i2;
        A9L a9m;
        View remove;
        A9L a9m2;
        int LJJIII = LJJIII(i);
        if (this.LJLJL.containsKey(Integer.valueOf(i)) && (remove = this.LJLJL.remove(Integer.valueOf(i))) != null) {
            int LJJIII2 = LJJIII(i);
            if (LJJIII2 != 0) {
                if (LJJIII2 != 1) {
                    a9m2 = new A9M();
                } else {
                    a9m2 = new A9I();
                }
            } else {
                a9m2 = new A9M();
            }
            remove.setTag(R.id.k4f, a9m2);
            remove.setTag(R.id.k4g, Integer.valueOf(LJJIII));
            a9m2.LJFF(remove);
            ((ArrayList) this.LJLJLJ).add(remove);
            return remove;
        }
        if (view == null || !Objects.equals(Integer.valueOf(LJJIII), view.getTag(R.id.k4g))) {
            Activity activity = this.LJLJJL;
            if (LJJIII(i) != 1) {
                i2 = R.layout.aem;
            } else {
                i2 = R.layout.ael;
            }
            view = C16970lZ.LIZLLL(activity, i2);
        }
        int LJJIII3 = LJJIII(i);
        if (LJJIII3 != 0) {
            if (LJJIII3 != 1) {
                a9m = new A9M();
            } else {
                a9m = new A9I();
            }
        } else {
            a9m = new A9M();
        }
        view.setTag(R.id.k4f, a9m);
        view.setTag(R.id.k4g, Integer.valueOf(LJJIII));
        a9m.LJFF(view);
        ((ArrayList) this.LJLJLJ).add(view);
        return view;
    }
}
