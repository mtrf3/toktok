package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JJV extends AbstractC71431S1r<JJW> {
    public final Object LJLJJLL;
    public List<? extends JJZ> LJLJL;
    public final LinkedList<C48924JIa> LJLJLJ;
    public final LinkedList<JIZ> LJLJLLL;
    public boolean LJLL;
    public int LJLLI;
    public SH9 LJLLILLLL;
    public JJY LJLLJ;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List<? extends JJZ> list = this.LJLJL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // X.AbstractC71431S1r
    public final void onDestroy() {
        Iterator<C48924JIa> it = this.LJLJLJ.iterator();
        while (it.hasNext()) {
            it.next().LJLILLLLZI.LJFF(true);
        }
        Iterator<JIZ> it2 = this.LJLJLLL.iterator();
        while (it2.hasNext()) {
            JIZ next = it2.next();
            next.LJLILLLLZI.LJFF(false);
            IQ9 iq9 = next.LJLJI;
            if (iq9 != null) {
                C73044Slc uiPlayListener = next.LJLILLLLZI;
                o.LJIIIZ(uiPlayListener, "uiPlayListener");
                if (iq9.LJ().contains(uiPlayListener)) {
                    iq9.LJ().remove(uiPlayListener);
                }
            } else {
                o.LJIJI("playerController");
                throw null;
            }
        }
    }

    public JJV(DialogC70776Rq8 container) {
        o.LJIIIZ(container, "container");
        this.LJLJJLL = container;
        this.LJLJLJ = new LinkedList<>();
        this.LJLJLLL = new LinkedList<>();
        this.LJLL = true;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        int i2;
        JJZ jjz;
        EnumC48951JJb LIZ;
        List<? extends JJZ> list = this.LJLJL;
        if (list == null || (jjz = (JJZ) ListProtector.get(list, i)) == null || (LIZ = jjz.LIZ()) == null) {
            i2 = -1;
        } else {
            i2 = C48950JJa.LIZ[LIZ.ordinal()];
        }
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                return 1;
            }
            return 3;
        }
        return 2;
    }

    @Override // X.AbstractC71431S1r, X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C51553KLd c51553KLd;
        JJW holder = (JJW) viewHolder;
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        holder.onViewAttachedToWindow();
        if ((holder instanceof C51553KLd) && (c51553KLd = (C51553KLd) holder) != null) {
            c51553KLd.LJLIL.setOnScaleChangeListener(this.LJLLILLLL);
        }
    }

    @Override // X.AbstractC71431S1r, X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C51553KLd c51553KLd;
        JJW holder = (JJW) viewHolder;
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        holder.onViewDetachedFromWindow();
        if ((holder instanceof C51553KLd) && (c51553KLd = (C51553KLd) holder) != null) {
            c51553KLd.LJLIL.setOnScaleChangeListener(null);
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        JJZ jjz;
        JJW holder = (JJW) viewHolder;
        o.LJIIIZ(holder, "holder");
        List<? extends JJZ> list = this.LJLJL;
        if (list == null || (jjz = (JJZ) ListProtector.get(list, i)) == null) {
            return;
        }
        C45804HyK.LJJLIIIJ(this.LJLLI, holder.itemView);
        holder.L(jjz);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder viewHolder;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.aog, parent, false);
                    o.LJII(LLLLIILL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.galleryviewer.core.transition.TransitionLayout");
                    C51553KLd c51553KLd = new C51553KLd((C71510S4s) LLLLIILL, this.LJLL);
                    c51553KLd.LJLILLLLZI = this.LJLLJ;
                    viewHolder = c51553KLd;
                } else {
                    View LLLLIILL2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.aoh, parent, false);
                    o.LJII(LLLLIILL2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.galleryviewer.core.transition.TransitionLayout");
                    JIZ jiz = new JIZ((C71510S4s) LLLLIILL2, this.LJLJJLL);
                    this.LJLJLLL.add(jiz);
                    viewHolder = jiz;
                }
            } else {
                View LLLLIILL3 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.aoh, parent, false);
                o.LJII(LLLLIILL3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.galleryviewer.core.transition.TransitionLayout");
                C48924JIa c48924JIa = new C48924JIa((C71510S4s) LLLLIILL3, this.LJLJJLL);
                this.LJLJLJ.add(c48924JIa);
                viewHolder = c48924JIa;
            }
        } else {
            View LLLLIILL4 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.aog, parent, false);
            o.LJII(LLLLIILL4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.galleryviewer.core.transition.TransitionLayout");
            C51553KLd c51553KLd2 = new C51553KLd((C71510S4s) LLLLIILL4, this.LJLL);
            c51553KLd2.LJLILLLLZI = this.LJLLJ;
            viewHolder = c51553KLd2;
        }
        C0AX.LIZ(parent, viewHolder.itemView, R.id.lj7);
        View view = viewHolder.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(viewHolder.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = viewHolder.getClass().getName();
        return viewHolder;
    }
}
