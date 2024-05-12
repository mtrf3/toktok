package X;

import Y.IDcS9S0200000_7;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.tools.draft.adapter.viewholder.NewDraftViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GNs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41428GNs extends AbstractC029409q<AbstractC41429GNt<? extends C41426GNq>> {
    public final GOK LJLIL;
    public final C13I LJLILLLLZI;
    public final InterfaceC65784Pro<C76800UCe> LJLJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJI;
    public List<C41426GNq> LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJJL.size();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DraftAdapter -> getItemViewType -> position = ");
        LIZ.append(i);
        H78.LIZ(X1D.LIZIZ(LIZ));
        if (ListProtector.get(this.LJLJJL, i) == null) {
            C78983UzD.LJIILL("draft item must not null");
            return 0;
        }
        return ((C41426GNq) ListProtector.get(this.LJLJJL, i)).LIZ();
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).LLJLILLLLZIIL(new IDcS9S0200000_7(layoutManager, this, 4));
        }
    }

    public final void setData(List<C41426GNq> list) {
        int i = 0;
        for (C41426GNq c41426GNq : list) {
            int i2 = i + 1;
            if (i >= 0) {
                if (c41426GNq == null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Draft list item must not be null; list.size = ");
                    LIZ.append(list.size());
                    LIZ.append(";current index = ");
                    LIZ.append(i);
                    C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        C03200Aq.LIZ(new C41427GNr(this.LJLJJL, list), true).LIZJ(this);
        this.LJLJJL = new ArrayList(list);
    }

    @Override // X.AbstractC029409q
    /* renamed from: LJLLLLLL, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(AbstractC41429GNt<? extends C41426GNq> holderDraft, int i) {
        o.LJIIIZ(holderDraft, "holderDraft");
        if (i == V1M.LJLJI) {
            List<C41426GNq> data = this.LJLJJL;
            o.LJIIIZ(data, "data");
            if (V1M.LJLJJI && i == V1M.LJLJI) {
                V1M.LJLJJI = false;
                V1M.LJLILLLLZI = System.currentTimeMillis();
                C145995oB c145995oB = new C145995oB();
                c145995oB.LIZIZ(V1M.LJLILLLLZI - V1M.LJLIL, "duration");
                FMX.LJIIL("load_drafts", c145995oB.LIZ);
            }
        }
        ((C41426GNq) ListProtector.get(this.LJLJJL, i)).LIZIZ = this.LJLJJLL;
        ((C41426GNq) ListProtector.get(this.LJLJJL, i)).LIZJ = this.LJLJL;
        holderDraft.L((C41426GNq) ListProtector.get(this.LJLJJL, i));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final AbstractC41429GNt<? extends C41426GNq> com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        AbstractC41429GNt<? extends C41426GNq> c41433GNx;
        o.LJIIIZ(parent, "parent");
        GOK listener = this.LJLIL;
        C13I draftCaches = this.LJLILLLLZI;
        InterfaceC65784Pro<C76800UCe> postedDraftEntranceClick = this.LJLJI;
        InterfaceC65784Pro<C76800UCe> postedDraftEntranceLongClick = this.LJLJJI;
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(draftCaches, "draftCaches");
        o.LJIIIZ(postedDraftEntranceClick, "postedDraftEntranceClick");
        o.LJIIIZ(postedDraftEntranceLongClick, "postedDraftEntranceLongClick");
        switch (i) {
            case 104:
                c41433GNx = new C41433GNx(C1FL.LIZIZ(parent, R.layout.bbr, parent, false, "from(view.context).infla…weme_footer, view, false)"));
                break;
            case 105:
                c41433GNx = new C41430GNu(C1FL.LIZIZ(parent, R.layout.bbs, parent, false, "from(view.context).infla…weme_header, view, false)"));
                break;
            case 106:
                c41433GNx = new NewDraftViewHolder(C1FL.LIZIZ(parent, R.layout.bbu, parent, false, "from(view.context).infla…m_draft_new, view, false)"), listener, draftCaches);
                break;
            case 107:
                c41433GNx = new C41432GNw(C1FL.LIZIZ(parent, R.layout.bbq, parent, false, "from(view.context).infla…aweme_blank, view, false)"));
                break;
            case 108:
                c41433GNx = new C41431GNv(C1FL.LIZIZ(parent, R.layout.bbt, parent, false, "from(view.context).infla…oading_more, view, false)"), listener);
                break;
            case 109:
                c41433GNx = new GOH(C1FL.LIZIZ(parent, R.layout.bbv, parent, false, "from(view.context).infla…raft_posted, view, false)"), draftCaches, postedDraftEntranceClick, postedDraftEntranceLongClick);
                break;
            default:
                throw new RuntimeException("wrong draft type");
        }
        C0AX.LIZ(parent, c41433GNx.itemView, R.id.lj7);
        View view = c41433GNx.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c41433GNx.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c41433GNx.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c41433GNx.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c41433GNx.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c41433GNx.getClass().getName();
        return c41433GNx;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(AbstractC41429GNt<? extends C41426GNq> abstractC41429GNt, int i, List payloads) {
        NewDraftViewHolder newDraftViewHolder;
        C41425GNp c41425GNp;
        AbstractC41429GNt<? extends C41426GNq> holder = abstractC41429GNt;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, i);
            return;
        }
        if (!o.LJ(ORZ.LJLLJ(payloads).toString(), "checked") || !(holder instanceof NewDraftViewHolder) || (c41425GNp = (newDraftViewHolder = (NewDraftViewHolder) holder).LJLLLL) == null) {
            return;
        }
        C71897SJp c71897SJp = newDraftViewHolder.LJLLJ;
        if (c71897SJp != null) {
            c71897SJp.setChecked(c41425GNp.LJIIIZ);
        } else {
            o.LJIJI("mCheckBox");
            throw null;
        }
    }

    public C41428GNs(GOK mListener, C13I draftCaches, GNB gnb, AqS157S0100000_7 aqS157S0100000_7) {
        o.LJIIIZ(mListener, "mListener");
        o.LJIIIZ(draftCaches, "draftCaches");
        this.LJLIL = mListener;
        this.LJLILLLLZI = draftCaches;
        this.LJLJI = gnb;
        this.LJLJJI = aqS157S0100000_7;
        this.LJLJJL = new ArrayList();
    }
}
