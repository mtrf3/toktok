package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.services.apm.api.IEnsure;
import com.ss.android.ugc.aweme.dsp.playpage.card.DspItemViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Zvi, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91506Zvi extends AbstractC91394Ztu {
    public final ArrayList<C91400Zu0> LJLILLLLZI = new ArrayList<>();
    public final ArrayList<DspItemViewHolder> LJLJI = new ArrayList<>();
    public List<C91395Ztv> LJLJJI = new ArrayList();
    public final C91396Ztw LJLJJL = new C91396Ztw(this);
    public final LinkedList<InterfaceC65784Pro<C76800UCe>> LJLJJLL = new LinkedList<>();

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return 3;
    }

    @Override // X.AbstractC91394Ztu
    public final AbstractC91320Zsi LJJIII() {
        Object obj = ListProtector.get(this.LJLILLLLZI, 1);
        o.LJIIIIZZ(obj, "mContainerViews[CURRENT_VIEW_POSITION]");
        return (AbstractC91320Zsi) obj;
    }

    @Override // X.AbstractC91394Ztu
    public final List<C91395Ztv> LJJIIJ() {
        return this.LJLJJI;
    }

    public C91506Zvi(Context context) {
        int i = 0;
        do {
            C91400Zu0 c91400Zu0 = new C91400Zu0(context);
            c91400Zu0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.LJLILLLLZI.add(c91400Zu0);
            i++;
        } while (i < 3);
    }

    @Override // X.AbstractC91394Ztu
    public final int LJI(String str) {
        Iterator<C91395Ztv> it = this.LJLJJI.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (o.LJ(it.next().LJLJJL, str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // X.AbstractC91394Ztu
    public final void LJJIIJZLJL(C8W0 parentAssem) {
        o.LJIIIZ(parentAssem, "parentAssem");
        int i = 0;
        do {
            C91396Ztw c91396Ztw = this.LJLJJL;
            Object obj = ListProtector.get(this.LJLILLLLZI, i);
            o.LJIIIIZZ(obj, "mContainerViews[idx]");
            DspItemViewHolder dspItemViewHolder = new DspItemViewHolder(new C91397Ztx(parentAssem, c91396Ztw, (View) obj, new C91398Zty(i)));
            this.LJLJI.add(dspItemViewHolder);
            Object obj2 = ListProtector.get(this.LJLILLLLZI, i);
            o.LJIIIIZZ(obj2, "mContainerViews[idx]");
            dspItemViewHolder.LJJLL(dspItemViewHolder.LJLIIL(), (View) obj2, dspItemViewHolder);
            i++;
        } while (i < 3);
        while (!this.LJLJJLL.isEmpty()) {
            this.LJLJJLL.removeFirst().invoke();
        }
    }

    public final void LJJIIZ(int i) {
        DspItemViewHolder dspItemViewHolder;
        try {
            C91395Ztv c91395Ztv = (C91395Ztv) ORZ.LJLLLLLL(i, this.LJLJJI);
            if (c91395Ztv != null && (dspItemViewHolder = (DspItemViewHolder) ORZ.LJLLLLLL(i, this.LJLJI)) != null) {
                dspItemViewHolder.LJJZ(i, c91395Ztv);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("bind error: ");
            LIZ.append(e.getMessage());
            X1D.LIZIZ(LIZ);
            IEnsure iEnsure = C78983UzD.LJLLLL;
            if (iEnsure == null) {
                return;
            }
            iEnsure.ensureNotNull(e);
        }
    }

    public final void LJJIIZI(int i) {
        try {
            DspItemViewHolder dspItemViewHolder = (DspItemViewHolder) ORZ.LJLLLLLL(i, this.LJLJI);
            if (dspItemViewHolder != null) {
                dspItemViewHolder.LJLIIIL();
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("unBind error: ");
            LIZ.append(e.getMessage());
            X1D.LIZIZ(LIZ);
            IEnsure iEnsure = C78983UzD.LJLLLL;
            if (iEnsure == null) {
                return;
            }
            iEnsure.ensureNotNull(e);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        o.LJIIIZ(container, "container");
        Object obj = ListProtector.get(this.LJLILLLLZI, i);
        o.LJIIIIZZ(obj, "mContainerViews[position]");
        View view = (View) obj;
        if (view.getParent() != null) {
            ViewParent parent = view.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            C16880lQ.LJLLL(view, (ViewGroup) parent);
        }
        container.addView(view);
        return view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object object) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(object, "object");
        return o.LJ(view, object);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object object) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        C16880lQ.LJLLL((View) object, container);
    }
}
