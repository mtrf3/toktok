package X;

import Y.IDObserverS225S0100000;
import Y.IDObserverS9S0101000;
import android.database.Observable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1l4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC42141l4<T> extends AbstractC34621Xm<T, RecyclerView.ViewHolder> {
    public PagingViewModel<T> LJLILLLLZI;
    public final IDObserverS9S0101000 LJLJI;
    public final IDObserverS9S0101000 LJLJJI;
    public final IDObserverS225S0100000 LJLJJL;
    public final IDObserverS9S0101000 LJLJJLL;
    public final IDObserverS9S0101000 LJLJL;
    public final IDObserverS9S0101000 LJLJLJ;
    public EnumC06890Ov LJLJLLL;
    public EnumC06890Ov LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public final boolean LJLLL;
    public final boolean LJLLLL;
    public boolean LJLLLLLL;
    public final AbstractC42141l4<T>.c LJLZ;

    /* renamed from: X.1l4$c */
    /* loaded from: classes.dex */
    public class c extends Observable<AbstractC029609s> {
        public final void LIZ() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC029609s) ListProtector.get(((Observable) this).mObservers, size)).LIZJ();
            }
        }

        public c() {
        }

        public final void LIZIZ(int i, int i2) {
            AbstractC42141l4.this.getClass();
            AbstractC42141l4.this.getClass();
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC029609s) ListProtector.get(((Observable) this).mObservers, size)).LJI(i, i2);
            }
        }

        public final void LIZJ(int i, int i2) {
            AbstractC42141l4.this.getClass();
            int size = ((Observable) this).mObservers.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((AbstractC029609s) ListProtector.get(((Observable) this).mObservers, size)).LJ(i, i2, null);
                } else {
                    return;
                }
            }
        }

        public final void LIZLLL(int i, int i2) {
            AbstractC42141l4.this.getClass();
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC029609s) ListProtector.get(((Observable) this).mObservers, size)).LJFF(i, i2);
            }
        }

        public final void LJ(int i, int i2) {
            AbstractC42141l4.this.getClass();
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC029609s) ListProtector.get(((Observable) this).mObservers, size)).LJII(i, i2);
            }
        }
    }

    public abstract int LL(Object obj);

    public abstract void LLFF(RecyclerView.ViewHolder viewHolder);

    public abstract RecyclerView.ViewHolder LLIFFJFJJ(ViewGroup viewGroup);

    public abstract RecyclerView.ViewHolder LLII(int i, ViewGroup viewGroup);

    public final boolean LLD() {
        if (!this.LJLLJ && this.LJLLILLLL && this.LJLLLLLL) {
            return true;
        }
        return false;
    }

    public final int LJZL() {
        return super.getItemCount();
    }

    public final boolean LLF() {
        EnumC06890Ov enumC06890Ov;
        if (LLD() || !this.LJLLLL || (enumC06890Ov = this.LJLL) == null) {
            return false;
        }
        if (enumC06890Ov == EnumC06890Ov.SUCCESS) {
            EnumC06890Ov enumC06890Ov2 = this.LJLJLLL;
            if (enumC06890Ov2 != EnumC06890Ov.RUNNING && enumC06890Ov2 != EnumC06890Ov.FAILED) {
                return false;
            }
            return true;
        }
        EnumC06890Ov enumC06890Ov3 = EnumC06890Ov.FAILED;
        if (enumC06890Ov != enumC06890Ov3 || this.LJLJLLL != enumC06890Ov3) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC34621Xm, X.AbstractC029409q
    public final int getItemCount() {
        int i;
        boolean LLD = LLD();
        if (this.LJLLJ && LLIIIL()) {
            i = 1;
        } else {
            i = 0;
        }
        return super.getItemCount() + (LLD ? 1 : 0) + (LLF() ? 1 : 0) + i;
    }

    public boolean LLIIIL() {
        return this.LJLLL;
    }

    public AbstractC42141l4(AbstractC03160Am<T> abstractC03160Am) {
        super(abstractC03160Am);
        this.LJLJI = new IDObserverS9S0101000(0, this, 2);
        this.LJLJJI = new IDObserverS9S0101000(0, this, 3);
        this.LJLJJL = new IDObserverS225S0100000(this, 9);
        this.LJLJJLL = new IDObserverS9S0101000(0, this, 4);
        this.LJLJL = new IDObserverS9S0101000(0, this, 5);
        this.LJLJLJ = new IDObserverS9S0101000(0, this, 6);
        this.LJLJLLL = null;
        this.LJLL = null;
        this.LJLLI = false;
        this.LJLLL = true;
        this.LJLLLL = true;
        this.LJLLLLLL = true;
        AbstractC029609s abstractC029609s = new AbstractC029609s() { // from class: X.1Nb
            @Override // X.AbstractC029609s
            public final void LIZJ() {
                AbstractC42141l4.this.LJLZ.LIZ();
            }

            @Override // X.AbstractC029609s
            public final void LIZLLL(int i, int i2) {
                AbstractC42141l4.this.LJLZ.LIZJ(i, i2);
            }

            @Override // X.AbstractC029609s
            public final void LJFF(int i, int i2) {
                AbstractC42141l4.this.LJLZ.LIZLLL(i, i2);
            }

            @Override // X.AbstractC029609s
            public final void LJI(int i, int i2) {
                AbstractC42141l4.this.LJLZ.LIZIZ(i, i2);
            }

            @Override // X.AbstractC029609s
            public final void LJII(int i, int i2) {
                AbstractC42141l4.this.LJLZ.LJ(i, i2);
            }
        };
        this.LJLZ = new c();
        super.registerAdapterDataObserver(abstractC029609s);
    }

    public static final void LLIIII(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewHolder.itemView.getLayoutParams();
        if (layoutParams instanceof C1BZ) {
            ((C1BZ) layoutParams).LJLILLLLZI = true;
        }
    }

    public final T LJJIZ(int i) {
        if (i < 0 || i >= super.getItemCount()) {
            return null;
        }
        C18960om<T> c18960om = this.LJLIL;
        AbstractC19190p9<T> abstractC19190p9 = c18960om.LJFF;
        if (abstractC19190p9 == null) {
            AbstractC19190p9<T> abstractC19190p92 = c18960om.LJI;
            if (abstractC19190p92 != null) {
                return abstractC19190p92.get(i);
            }
            throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
        }
        abstractC19190p9.LJLJJLL = abstractC19190p9.LJLJJL.LJLJJI + i;
        abstractC19190p9.LJIJJLI(i);
        abstractC19190p9.LJLL = Math.min(abstractC19190p9.LJLL, i);
        abstractC19190p9.LJLLI = Math.max(abstractC19190p9.LJLLI, i);
        abstractC19190p9.LJJII(true);
        return c18960om.LJFF.get(i);
    }

    public RecyclerView.ViewHolder LJLZ(ViewGroup viewGroup) {
        final View LIZ = C28289B8j.LIZ(viewGroup, R.layout.cvd, viewGroup, false);
        return new RecyclerView.ViewHolder(LIZ) { // from class: X.1Nc
        };
    }

    public RecyclerView.ViewHolder LJZ(ViewGroup viewGroup) {
        throw new RuntimeException("create your header view holder");
    }

    public final void LLIIIILZ(EnumC06890Ov enumC06890Ov) {
        boolean z = this.LJLLI;
        this.LJLJLLL = enumC06890Ov;
        boolean LLF = LLF();
        int itemCount = super.getItemCount();
        if (!z) {
            if (LLF) {
                notifyItemInserted(itemCount);
            }
        } else if (!LLF) {
            notifyItemRemoved(getItemCount());
        } else {
            notifyItemRemoved(itemCount);
            notifyItemInserted(itemCount);
        }
        this.LJLLI = LLF;
    }

    public final void LLIIIJ(PagingViewModel<T> pagingViewModel) {
        PagingViewModel<T> pagingViewModel2 = this.LJLILLLLZI;
        if (pagingViewModel2 != null) {
            pagingViewModel2.LJLJLLL.removeObserver(this.LJLJI);
            this.LJLILLLLZI.LJLJJI.removeObserver(this.LJLJJI);
            this.LJLILLLLZI.LJLJJL.removeObserver(this.LJLJJL);
            this.LJLILLLLZI.LJLJL.removeObserver(this.LJLJJLL);
            this.LJLILLLLZI.LJLJJLL.removeObserver(this.LJLJL);
            this.LJLILLLLZI.LJLJLJ.removeObserver(this.LJLJLJ);
        }
        this.LJLILLLLZI = pagingViewModel;
        if (pagingViewModel == null) {
            return;
        }
        pagingViewModel.LJLJLLL.observeForever(this.LJLJI);
        pagingViewModel.LJLJJI.observeForever(this.LJLJJI);
        pagingViewModel.LJLJJL.observeForever(this.LJLJJL);
        pagingViewModel.LJLJL.observeForever(this.LJLJJLL);
        pagingViewModel.LJLJJLL.observeForever(this.LJLJL);
        pagingViewModel.LJLJLJ.observeForever(this.LJLJLJ);
    }

    public final T getItem(int i) {
        int itemCount = super.getItemCount();
        if (LLF() && i == itemCount) {
            return null;
        }
        if (LLD() && i == itemCount) {
            return null;
        }
        if (this.LJLLJ && LLIIIL() && i == itemCount) {
            return null;
        }
        return LJJIZ(i);
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        int itemCount = getItemCount() - 1;
        if (this.LJLLJ && LLIIIL() && i == 0) {
            return -1091641683;
        }
        if (LLF() && i == itemCount) {
            if (this.LJLJLLL == EnumC06890Ov.FAILED) {
                return -1091576149;
            }
            return -1091576148;
        }
        if (LLD() && i == itemCount) {
            return -559038737;
        }
        if (i >= super.getItemCount()) {
            return -8888;
        }
        return LL(LJJIZ(i));
    }

    @Override // X.AbstractC029409q
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof BNR) {
            ((BNR) viewHolder).onViewAttachedToWindow();
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof BNR) {
            ((BNR) viewHolder).onViewDetachedFromWindow();
        }
    }

    @Override // X.AbstractC029409q
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof BNR) {
            ((BNR) viewHolder).LJLILLLLZI.LIZLLL();
        } else if (viewHolder instanceof C31931Nd) {
            ((C31931Nd) viewHolder).M();
        } else {
            if (!(viewHolder instanceof AbstractC31901Na)) {
                return;
            }
            ((AbstractC31901Na) viewHolder).M();
        }
    }

    @Override // X.AbstractC029409q
    public final void registerAdapterDataObserver(AbstractC029609s abstractC029609s) {
        this.LJLZ.registerObserver(abstractC029609s);
    }

    @Override // X.AbstractC029409q
    public final void unregisterAdapterDataObserver(AbstractC029609s abstractC029609s) {
        this.LJLZ.unregisterObserver(abstractC029609s);
    }

    public RecyclerView.ViewHolder LJZI(int i, ViewGroup viewGroup) {
        if (i == -1091576148) {
            return new C31931Nd(C28289B8j.LIZ(viewGroup, R.layout.cvf, viewGroup, false));
        }
        if (i == -1091576149) {
            return new C42131l3(C28289B8j.LIZ(viewGroup, R.layout.cve, viewGroup, false), this.LJLILLLLZI);
        }
        throw new RuntimeException("unknown footer type");
    }

    public void LLFFF(RecyclerView.ViewHolder viewHolder, int i) {
        LLIIII(viewHolder);
    }

    public void LLFII(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        LLIIII(viewHolder);
        if (viewHolder instanceof C31931Nd) {
            ((C31931Nd) viewHolder).L();
            return;
        }
        if (!(viewHolder instanceof AbstractC31901Na)) {
            return;
        }
        AbstractC31901Na abstractC31901Na = (AbstractC31901Na) viewHolder;
        if (this.LJLLJ || super.getItemCount() == 0) {
            z = true;
        } else {
            z = false;
        }
        abstractC31901Na.L(z);
    }

    public void LLFZ(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof BNR) {
            T item = getItem(i);
            if (item instanceof C05150Id) {
                item.getClass();
                BNR bnr = (BNR) viewHolder;
                bnr.getClass();
                bnr.bind(null, i);
            } else {
                ((BNR) viewHolder).bind(item, i);
            }
            if (((BNR) viewHolder).L()) {
                LLIIII(viewHolder);
            }
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == -559038738) {
            LLIIII(viewHolder);
            return;
        }
        if (itemViewType == -559038737) {
            LLFFF(viewHolder, i);
            return;
        }
        if (itemViewType == -1091576148 || itemViewType == -1091576149) {
            LLFII(viewHolder, i);
        } else if (itemViewType == -1091641683) {
            LLFF(viewHolder);
        } else {
            LLFZ(viewHolder, i);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder LJZI;
        if (i == -559038738) {
            LJZI = LJZ(viewGroup);
        } else if (i == -559038737) {
            LJZI = LJLZ(viewGroup);
        } else if (i == -1091576148 || i == -1091576149) {
            LJZI = LJZI(i, viewGroup);
        } else if (i == -1091641683) {
            LJZI = LLIFFJFJJ(viewGroup);
        } else {
            LJZI = LLII(i, viewGroup);
        }
        C0AX.LIZ(viewGroup, LJZI.itemView, R.id.lj7);
        View view = LJZI.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (LJZI.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(LJZI.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) LJZI.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(LJZI.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = LJZI.getClass().getName();
        return LJZI;
    }
}
