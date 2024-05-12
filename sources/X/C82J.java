package X;

import X.C82K;
import Y.ARunnableS6S0201000_3;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.82J, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C82J<VH extends C82K> extends PagerAdapter {
    public final SparseArray<LinkedList<VH>> LJLILLLLZI = new SparseArray<>(1);

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object object) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(object, "object");
        return view == object;
    }

    public abstract int LJJIII();

    public abstract C82N LJJIIJ(int i, ViewGroup viewGroup);

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return LJJIII();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        int i2;
        VH pollLast;
        o.LJIIIZ(container, "container");
        C82L c82l = (C82L) this;
        if (C78963Uyt.LJJIJ(c82l.LJLJJLL.Ig()) && i == c82l.LJLLILLLL.size() && c82l.LJLLILLLL.size() != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        LinkedList<VH> linkedList = this.LJLILLLLZI.get(i2);
        if (linkedList == null) {
            pollLast = LJJIIJ(i2, container);
            pollLast.LIZ.setTag(R.id.bpq, pollLast);
        } else {
            pollLast = linkedList.pollLast();
            if (pollLast == null) {
                pollLast = LJJIIJ(i2, container);
                pollLast.LIZ.setTag(R.id.bpq, pollLast);
            }
        }
        pollLast.LIZJ = i;
        pollLast.LIZIZ = i2;
        container.addView(pollLast.LIZ);
        C82N c82n = (C82N) pollLast;
        if (i < c82l.LJLLILLLL.size()) {
            if (!c82l.LJLJJLL.Vf()) {
                View view = c82n.LIZ;
                if (view != null) {
                    view.post(new ARunnableS6S0201000_3(i, c82l, c82n, 8));
                }
            } else {
                Object obj = ListProtector.get(c82l.LJLLILLLL, i);
                o.LJIIIIZZ(obj, "photosList[position]");
                c82n.LIZ(new C82I(i, (PhotoModeImageUrlModel) obj, c82l.LJLJJLL.Ig()));
            }
        }
        return pollLast.LIZ;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object object) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        View view = (View) object;
        C16880lQ.LJLLL(view, container);
        C82K c82k = (C82K) view.getTag(R.id.bpq);
        C82N holder = (C82N) c82k;
        o.LJIIIZ(holder, "holder");
        holder.LJIIJ();
        AnonymousClass818 anonymousClass818 = ((C82L) this).LJLLLLLL;
        if (anonymousClass818 != null) {
            anonymousClass818.pr(i);
        }
        o.LJI(c82k);
        int i2 = c82k.LIZIZ;
        LinkedList linkedList = this.LJLILLLLZI.get(i2);
        if (linkedList == null) {
            linkedList = new LinkedList();
            this.LJLILLLLZI.append(i2, linkedList);
        }
        linkedList.push(c82k);
    }
}
