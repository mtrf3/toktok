package X;

import Y.ACListenerS36S0200000_1;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.SessionListViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3X0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3X0 extends AbstractC28801Bc<C3L4, RecyclerView.ViewHolder> {
    public static final C3SD LJLJL = new Object() { // from class: X.3SD
    };
    public final C3SR LJLIL;
    public final InterfaceC83713Qh LJLILLLLZI;
    public final SparseArray<C96533qb> LJLJI;
    public boolean LJLJJI;
    public C3SW LJLJJL;
    public final List<SessionListViewHolder> LJLJJLL;

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        return getItem(i).hashCode();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        C3L4 item = getItem(i);
        if (item instanceof C83033Nr) {
            return 0;
        }
        if (item instanceof C3OK) {
            return 2;
        }
        return 1;
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        List<C3L4> currentList;
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (!this.LJLJJI) {
            C3SW c3sw = this.LJLJJL;
            if (c3sw != null) {
                c3sw.LIZ();
            }
            this.LJLJJI = true;
        }
        if (holder instanceof SessionListViewHolder) {
            ((SessionListViewHolder) holder).N();
            ((ArrayList) this.LJLJJLL).add(holder);
            int layoutPosition = holder.getLayoutPosition();
            if (layoutPosition <= 0 || (currentList = getCurrentList()) == null || currentList.isEmpty() || getCurrentList().size() - layoutPosition > 20) {
                return;
            }
            if (C3TX.LIZIZ()) {
                C3K3.LIZ().LJIIJJI();
            } else {
                C82253Kr.LJJI(C37O.LIZIZ());
            }
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        if (holder instanceof SessionListViewHolder) {
            ((SessionListViewHolder) holder).U();
            ((ArrayList) this.LJLJJLL).remove(holder);
        }
    }

    @Override // X.AbstractC28801Bc
    public final void submitList(List<C3L4> list) {
        super.submitList(list);
    }

    public C3X0(C3SR c3sr, C3OA c3oa) {
        super(new AbstractC03160Am<C3L4>() { // from class: X.3X2
            @Override // X.AbstractC03160Am
            public final boolean LIZ(C3L4 c3l4, C3L4 c3l42) {
                C3L4 c3l43 = c3l4;
                C3L4 c3l44 = c3l42;
                if ((c3l43 instanceof C83033Nr) && (c3l44 instanceof C83033Nr)) {
                    if (c3l43.LJLLILLLL == c3l44.LJLLILLLL && c3l43.LJLLJ == c3l44.LJLLJ) {
                        return true;
                    }
                    return false;
                }
                return o.LJ(c3l43, c3l44);
            }

            @Override // X.AbstractC03160Am
            public final boolean LIZIZ(C3L4 c3l4, C3L4 c3l42) {
                return o.LJ(c3l4.LJFF(), c3l42.LJFF());
            }
        });
        this.LJLIL = c3sr;
        this.LJLILLLLZI = c3oa;
        this.LJLJI = new SparseArray<>();
        setHasStableIds(true);
        this.LJLJJLL = new ArrayList();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        if (holder instanceof SessionListViewHolder) {
            C3L4 item = getItem(i);
            o.LJIIIIZZ(item, "getItem(position)");
            ((SessionListViewHolder) holder).P(item, i);
            return;
        }
        if (!(holder instanceof C85443Wy)) {
            return;
        }
        C85443Wy c85443Wy = (C85443Wy) holder;
        C3L4 item2 = getItem(i);
        o.LJII(item2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.showprevious.ShowPreviousMessageSession");
        C83033Nr c83033Nr = (C83033Nr) item2;
        C16880lQ.LJIIJ(new ACListenerS36S0200000_1(c83033Nr, c85443Wy, 100), c85443Wy.itemView);
        if (c83033Nr.LJLLILLLL > 0) {
            c85443Wy.LJLJI.setCount(c83033Nr.LJLLILLLL);
            c85443Wy.LJLJI.setVisibility(0);
            c85443Wy.LJLILLLLZI.setVisibility(8);
        } else if (c83033Nr.LJLLJ) {
            c85443Wy.LJLJI.setVisibility(8);
            c85443Wy.LJLILLLLZI.setVisibility(0);
        } else {
            c85443Wy.LJLILLLLZI.setVisibility(8);
            c85443Wy.LJLJI.setVisibility(8);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder c85443Wy;
        C3X3 c3x3;
        o.LJIIIZ(parent, "parent");
        if (i != 0) {
            if (i != 2) {
                View view = C28289B8j.LIZ(parent, R.layout.b5v, parent, false);
                o.LJIIIIZZ(view, "view");
                c85443Wy = new SessionListViewHolder(view, this.LJLILLLLZI);
            } else {
                c85443Wy = new C3X5(parent);
            }
        } else {
            C3SR viewModel = this.LJLIL;
            o.LJIIIZ(viewModel, "viewModel");
            View itemView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.b5y, parent, false);
            o.LJIIIIZZ(itemView, "itemView");
            c85443Wy = new C85443Wy(itemView, viewModel);
        }
        C96533qb c96533qb = this.LJLJI.get(i);
        if (c96533qb != null && (c85443Wy instanceof C3X3) && (c3x3 = (C3X3) c85443Wy) != null) {
            c3x3.LLL(c96533qb);
        }
        C0AX.LIZ(parent, c85443Wy.itemView, R.id.lj7);
        View view2 = c85443Wy.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c85443Wy.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c85443Wy.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c85443Wy.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c85443Wy.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c85443Wy.getClass().getName();
        return c85443Wy;
    }
}
