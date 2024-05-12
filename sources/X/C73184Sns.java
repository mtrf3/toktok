package X;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Sns, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C73184Sns extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final AbstractC029409q<RecyclerView.ViewHolder> LJLIL;
    public final C73198So6 LJLILLLLZI;
    public final C73197So5 LJLJI;
    public final C73182Snq LJLJJI;
    public final C73183Snr LJLJJL;
    public final AbstractC73196So4[] LJLJJLL;
    public final ViewOnAttachStateChangeListenerC73199So7 LJLJL;
    public boolean LJLJLJ;
    public final C73195So3 LJLJLLL;

    public static boolean LJZI(int i) {
        return 15990784 <= i && 16252928 >= i;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIJ(holder, "holder");
    }

    public final int LJLLLLLL() {
        return this.LJLJI.isEnable() ? 1 : 0;
    }

    public final int LJLZ() {
        return this.LJLILLLLZI.isEnable() ? 1 : 0;
    }

    public final int LJZ() {
        return this.LJLIL.getItemCount();
    }

    public final void LL() {
        RecyclerView recyclerView;
        C0A2 layoutManager;
        if (!this.LJLJLJ && (recyclerView = this.LJLJL.LJLIL) != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            this.LJLJLJ = true;
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                gridLayoutManager.LLJLILLLLZIIL(new C73186Snu(this, layoutManager, gridLayoutManager.LLIILII));
            }
            C73182Snq c73182Snq = this.LJLJJI;
            c73182Snq.getClass();
            C73185Snt c73185Snt = c73182Snq.LJIIJJI;
            c73185Snt.getClass();
            ViewOnAttachStateChangeListenerC73199So7 viewOnAttachStateChangeListenerC73199So7 = c73185Snt.LJLIL;
            viewOnAttachStateChangeListenerC73199So7.getClass();
            viewOnAttachStateChangeListenerC73199So7.LJLIL = recyclerView;
            recyclerView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC73199So7);
            ViewConfiguration viewConfiguration = ViewConfiguration.get(recyclerView.getContext());
            o.LJFF(viewConfiguration, "ViewConfiguration.get(recyclerView.context)");
            c73185Snt.LJLJJI = viewConfiguration.getScaledTouchSlop();
            C0A2 layoutManager2 = recyclerView.getLayoutManager();
            boolean z = false;
            if (layoutManager2 instanceof LinearLayoutManager) {
                if (((LinearLayoutManager) layoutManager2).LJLZ == 1) {
                    z = true;
                }
                c73185Snt.LJLJJL = z;
            } else if (layoutManager2 instanceof StaggeredGridLayoutManager) {
                if (((StaggeredGridLayoutManager) layoutManager2).LL == 1) {
                    z = true;
                }
                c73185Snt.LJLJJL = z;
            }
            int i = c73185Snt.LJLJLJ.LJIIIIZZ;
            if ((i == 243 || i == 244) && !c73185Snt.LJLJJLL.get()) {
                recyclerView.LJIIJ(c73185Snt);
                c73185Snt.LJLJJLL.set(true);
            }
        }
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        if (LJZ() == 0) {
            return this.LJLJJL.LIZLLL();
        }
        return LJLLLLLL() + LJLZ() + LJZ() + (this.LJLJJI.isEnable() ? 1 : 0);
    }

    public C73184Sns(SQT sqt) {
        this.LJLIL = sqt;
        C73198So6 c73198So6 = new C73198So6();
        this.LJLILLLLZI = c73198So6;
        C73197So5 c73197So5 = new C73197So5();
        this.LJLJI = c73197So5;
        C73182Snq c73182Snq = new C73182Snq();
        this.LJLJJI = c73182Snq;
        C73183Snr c73183Snr = new C73183Snr(c73198So6, c73197So5);
        this.LJLJJL = c73183Snr;
        this.LJLJJLL = new AbstractC73196So4[]{c73198So6, c73197So5, c73182Snq, c73183Snr};
        this.LJLJL = new ViewOnAttachStateChangeListenerC73199So7(0);
        setHasStableIds(sqt.mHasStableIds);
        this.LJLJLLL = new C73195So3((C73201So9) this);
    }

    public final void LJZL(int i) {
        C73182Snq c73182Snq = this.LJLJJI;
        if (c73182Snq.LJIIIIZZ == i) {
            return;
        }
        boolean isEnable = c73182Snq.isEnable();
        C73182Snq c73182Snq2 = this.LJLJJI;
        c73182Snq2.LJIIIIZZ = i;
        C73185Snt c73185Snt = c73182Snq2.LJIIJJI;
        c73185Snt.getClass();
        if (i != 241 && i != 242) {
            RecyclerView recyclerView = c73185Snt.LJLIL.LJLIL;
            if (recyclerView != null && !c73185Snt.LJLJJLL.get()) {
                recyclerView.LJIIJ(c73185Snt);
                c73185Snt.LJLJJLL.set(true);
            }
        } else {
            RecyclerView recyclerView2 = c73185Snt.LJLIL.LJLIL;
            if (recyclerView2 != null && c73185Snt.LJLJJLL.get()) {
                recyclerView2.LJJLJLI(c73185Snt);
                c73185Snt.LJLJJLL.set(false);
            }
        }
        boolean isEnable2 = this.LJLJJI.isEnable();
        this.LJLJJI.LJII(241);
        if (this.LJLJL.LJLIL != null) {
            if (isEnable) {
                if (!isEnable2) {
                    notifyItemRemoved(LJLLLLLL() + LJLZ() + LJZ());
                    return;
                }
                return;
            }
            if (!isEnable2 || isEnable) {
                return;
            }
            notifyItemInserted(LJLLLLLL() + LJLZ() + LJZ());
        }
    }

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        if (LJZI(getItemViewType(i))) {
            return super.getItemId(i);
        }
        return this.LJLIL.getItemId(i);
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (LJZ() == 0 && this.LJLJJL.isEnable()) {
            C73183Snr c73183Snr = this.LJLJJL;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return c73183Snr.LJIIJ.LIZ();
                    }
                } else if (c73183Snr.LJIIIIZZ == 241 || (c73183Snr.LJII & 1) != 1 || !c73183Snr.LJIIIZ.isEnable() || (c73183Snr.LJII & 2) != 2) {
                    if (c73183Snr.LJIIIIZZ != 241 && (c73183Snr.LJII & 1) == 1 && (!c73183Snr.LJIIIZ.isEnable() || (c73183Snr.LJII & 2) != 2)) {
                        return c73183Snr.LJIIJ.LIZ();
                    }
                } else {
                    return c73183Snr.LIZLLL;
                }
            } else {
                if (c73183Snr.LJIIIZ.isEnable() && (c73183Snr.LJII & 2) == 2) {
                    return c73183Snr.LJIIIZ.LIZ();
                }
                if (c73183Snr.LJIIIIZZ == 241 || (c73183Snr.LJII & 1) != 1) {
                    if (c73183Snr.LJIIJ.isEnable() && (c73183Snr.LJII & 4) == 4) {
                        return c73183Snr.LJIIJ.LIZ();
                    }
                } else {
                    return c73183Snr.LIZLLL;
                }
            }
            return c73183Snr.LIZLLL;
        }
        if (i == 0 && this.LJLILLLLZI.isEnable()) {
            return this.LJLILLLLZI.LIZLLL;
        }
        int LJLZ = LJLZ() + LJZ();
        if (i == LJLZ && this.LJLJI.isEnable()) {
            return this.LJLJI.LIZLLL;
        }
        if (i == LJLLLLLL() + LJLZ && this.LJLJJI.isEnable()) {
            return this.LJLJJI.LIZLLL;
        }
        return this.LJLIL.getItemViewType(i - LJLZ());
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIJ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        ViewOnAttachStateChangeListenerC73199So7 viewOnAttachStateChangeListenerC73199So7 = this.LJLJL;
        viewOnAttachStateChangeListenerC73199So7.getClass();
        viewOnAttachStateChangeListenerC73199So7.LJLIL = recyclerView;
        recyclerView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC73199So7);
        LL();
        this.LJLIL.onAttachedToRecyclerView(recyclerView);
    }

    @Override // X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        o.LJIIJ(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        ViewOnAttachStateChangeListenerC73199So7 viewOnAttachStateChangeListenerC73199So7 = this.LJLJL;
        viewOnAttachStateChangeListenerC73199So7.getClass();
        viewOnAttachStateChangeListenerC73199So7.LJLIL = null;
        recyclerView.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC73199So7);
        if (this.LJLJLJ) {
            C73182Snq c73182Snq = this.LJLJJI;
            c73182Snq.getClass();
            C73185Snt c73185Snt = c73182Snq.LJIIJJI;
            c73185Snt.getClass();
            ViewOnAttachStateChangeListenerC73199So7 viewOnAttachStateChangeListenerC73199So72 = c73185Snt.LJLIL;
            viewOnAttachStateChangeListenerC73199So72.getClass();
            viewOnAttachStateChangeListenerC73199So72.LJLIL = null;
            recyclerView.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC73199So72);
            if (c73185Snt.LJLJJLL.get()) {
                recyclerView.LJJLJLI(c73185Snt);
                c73185Snt.LJLJJLL.set(false);
            }
        }
        this.LJLJLJ = false;
        this.LJLIL.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // X.AbstractC029409q
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder holder) {
        o.LJIIJ(holder, "holder");
        if (LJZI(holder.getItemViewType())) {
            return super.onFailedToRecycleView(holder);
        }
        return this.LJLIL.onFailedToRecycleView(holder);
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        RecyclerView.ViewHolder viewHolder;
        View view;
        o.LJIIJ(holder, "holder");
        AbstractC73196So4[] abstractC73196So4Arr = this.LJLJJLL;
        int length = abstractC73196So4Arr.length;
        int i = 0;
        while (true) {
            ViewGroup.LayoutParams layoutParams = null;
            if (i < length) {
                AbstractC73196So4 abstractC73196So4 = abstractC73196So4Arr[i];
                if (abstractC73196So4.LIZ() == holder.getItemViewType()) {
                    super.onViewAttachedToWindow(holder);
                    if (abstractC73196So4.LIZ || (viewHolder = abstractC73196So4.LIZJ) == null || (view = viewHolder.itemView) == null) {
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 instanceof C1BZ) {
                        layoutParams = layoutParams2;
                    }
                    C1BZ c1bz = (C1BZ) layoutParams;
                    if (c1bz == null) {
                        return;
                    }
                    c1bz.LJLILLLLZI = true;
                    abstractC73196So4.LIZ = true;
                    return;
                }
                i++;
            } else {
                this.LJLIL.onViewAttachedToWindow(holder);
                return;
            }
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        o.LJIIJ(holder, "holder");
        if (LJZI(holder.getItemViewType())) {
            super.onViewDetachedFromWindow(holder);
        } else {
            this.LJLIL.onViewDetachedFromWindow(holder);
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        o.LJIIJ(holder, "holder");
        if (LJZI(holder.getItemViewType())) {
            super.onViewRecycled(holder);
        } else {
            this.LJLIL.onViewRecycled(holder);
        }
    }

    @Override // X.AbstractC029409q
    public final void registerAdapterDataObserver(AbstractC029609s observer) {
        o.LJIIJ(observer, "observer");
        super.registerAdapterDataObserver(observer);
        this.LJLIL.registerAdapterDataObserver(this.LJLJLLL);
    }

    @Override // X.AbstractC029409q
    public final void unregisterAdapterDataObserver(AbstractC029609s observer) {
        o.LJIIJ(observer, "observer");
        super.unregisterAdapterDataObserver(observer);
        this.LJLIL.unregisterAdapterDataObserver(this.LJLJLLL);
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        boolean z;
        AbstractC73196So4 abstractC73196So4;
        RecyclerView.ViewHolder onCreateViewHolder;
        boolean z2;
        o.LJIIJ(parent, "parent");
        LL();
        AbstractC73196So4[] abstractC73196So4Arr = this.LJLJJLL;
        int length = abstractC73196So4Arr.length;
        int i2 = 0;
        while (true) {
            z = true;
            if (i2 < length) {
                abstractC73196So4 = abstractC73196So4Arr[i2];
                if (abstractC73196So4.LIZ() == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    break;
                }
                i2++;
            } else {
                abstractC73196So4 = null;
                break;
            }
        }
        if (abstractC73196So4 == null || (onCreateViewHolder = abstractC73196So4.LIZIZ(parent)) == null) {
            onCreateViewHolder = this.LJLIL.onCreateViewHolder(parent, i);
            o.LJFF(onCreateViewHolder, "realAdapter.onCreateViewHolder(parent, viewType)");
        }
        C0AX.LIZ(parent, onCreateViewHolder.itemView, R.id.lj7);
        View view = onCreateViewHolder.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (onCreateViewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook,");
                    stringBuffer.append(" holder ");
                    stringBuffer.append(onCreateViewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) onCreateViewHolder.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(onCreateViewHolder.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = onCreateViewHolder.getClass().getName();
        return onCreateViewHolder;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i, List<Object> payloads) {
        o.LJIIJ(holder, "holder");
        o.LJIIJ(payloads, "payloads");
        if (LJZ() != 0 && this.LJLJJI.isEnable() && i == getItemCount() - 2) {
            C73182Snq c73182Snq = this.LJLJJI;
            int i2 = c73182Snq.LJIIIIZZ;
            if (i2 == 242 || i2 == 244) {
                c73182Snq.LJI(241);
            } else if (i2 == 243) {
                c73182Snq.LJIIJJI.LJLJL = true;
            }
        }
        if (!LJZI(holder.getItemViewType())) {
            this.LJLIL.onBindViewHolder(holder, i - LJLZ(), payloads);
        }
    }
}
