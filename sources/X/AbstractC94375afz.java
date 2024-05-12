package X;

import X.C94389agD;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.afz, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public abstract class AbstractC94375afz<T, VH extends C94389agD> extends AbstractC029409q<VH> {
    public List<T> LJLIL;
    public C94007aa3 LJLILLLLZI;
    public Context LJLJI;
    public WeakReference<RecyclerView> LJLJJI;

    public abstract C94007aa3 LJLLLLLL(AbstractC94514aiE abstractC94514aiE);

    public abstract void LJLZ(VH vh, T t);

    public void LJZ(VH helper, T t, List<? extends Object> payloads) {
        o.LJIIIZ(helper, "helper");
        o.LJIIIZ(payloads, "payloads");
    }

    public abstract int LJZI(int i);

    public abstract C94389agD LLD(int i, ViewGroup viewGroup);

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        return i;
    }

    public final WeakReference<RecyclerView> LJZL() {
        WeakReference<RecyclerView> weakReference = this.LJLJJI;
        if (weakReference != null) {
            return weakReference;
        }
        o.LJIJI("weakRecyclerView");
        throw null;
    }

    public final Context getContext() {
        Context context = this.LJLJI;
        if (context != null) {
            return context;
        }
        o.LJIJI("context");
        throw null;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public AbstractC94375afz(List list) {
        this.LJLIL = list;
        if (this instanceof InterfaceC94008aa4) {
            this.LJLILLLLZI = LJLLLLLL((AbstractC94514aiE) this);
        }
        new LinkedHashSet();
        new LinkedHashSet();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        int size = this.LJLIL.size();
        if (i < size) {
            return LJZI(i);
        }
        if (i - size < 0) {
            return 268436275;
        }
        return 268436002;
    }

    @Override // X.AbstractC029409q
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.LJLJJI = new WeakReference<>(recyclerView);
        Context context = recyclerView.getContext();
        o.LJIIIIZZ(context, "recyclerView.context");
        this.LJLJI = context;
        C94007aa3 c94007aa3 = this.LJLILLLLZI;
        if (c94007aa3 != null) {
            C1C8 c1c8 = c94007aa3.LIZ;
            if (c1c8 != null) {
                c1c8.LJII(recyclerView);
            } else {
                o.LJIJI("itemTouchHelper");
                throw null;
            }
        }
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.LLJLILLLLZIIL(new C94374afy(this, layoutManager, gridLayoutManager.LLIILII));
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        int itemViewType = holder.getItemViewType();
        if (itemViewType == 268436821 || itemViewType == 268435729 || itemViewType == 268436275 || itemViewType == 268436002) {
            View view = holder.itemView;
            o.LJIIIIZZ(view, "holder.itemView");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C1BZ) {
                ((C1BZ) layoutParams).LJLILLLLZI = true;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    /* renamed from: LL, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(VH holder, int i) {
        o.LJIIIZ(holder, "holder");
        int itemViewType = holder.getItemViewType();
        if (itemViewType != 268435729 && itemViewType != 268436275 && itemViewType != 268436821) {
            LJLZ(holder, ListProtector.get(this.LJLIL, i));
        }
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        if (i != 268435729) {
            if (i != 268436275) {
                if (i != 268436821) {
                    C94389agD viewHolder = LLD(i, parent);
                    o.LJIIIZ(viewHolder, "viewHolder");
                    viewHolder.itemView.setTag(R.id.lj7, Integer.valueOf(parent.hashCode()));
                    View view = viewHolder.itemView;
                    if (view != null) {
                        view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
                    }
                    try {
                        if (viewHolder.itemView.getParent() != null) {
                            boolean z = true;
                            try {
                                SettingsManager.LIZLLL().getClass();
                                z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                            } catch (Exception unused) {
                            }
                            if (z) {
                                StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                stringBuffer.append(C94389agD.class.getName());
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
                    C29127Bbv.LIZ = C94389agD.class.getName();
                    return viewHolder;
                }
                o.LJIJI("mEmptyLayout");
                throw null;
            }
            o.LJIJI("mFooterLayout");
            throw null;
        }
        o.LJIJI("mHeaderLayout");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List payloads) {
        C94389agD holder = (C94389agD) viewHolder;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, i);
            return;
        }
        int itemViewType = holder.getItemViewType();
        if (itemViewType == 268435729 || itemViewType == 268436275 || itemViewType == 268436821) {
            return;
        }
        LJZ(holder, ListProtector.get(this.LJLIL, i), payloads);
    }
}
