package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.qnasearch.vm.QnaSearchViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.T7s, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74136T7s extends AbstractC28801Bc<C74125T7h, T8F> {
    public final T84 LJLIL;
    public final T8G LJLILLLLZI;
    public final C38491fB LJLJI;
    public final C74127T7j LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return getItem(i).LIZ;
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C74133T7p c74133T7p;
        T8F holder = (T8F) viewHolder;
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if ((holder instanceof C74133T7p) && (c74133T7p = (C74133T7p) holder) != null) {
            C74141T7x c74141T7x = c74133T7p.LJLJJLL;
            this.LJLJI.LIZIZ(c74141T7x, null);
            this.LJLJJI.LIZIZ(c74141T7x);
        }
    }

    public C74136T7s(C74102T6k c74102T6k, QnaSearchViewModel qnaSearchViewModel) {
        super(T8N.LIZ);
        this.LJLIL = c74102T6k;
        this.LJLILLLLZI = qnaSearchViewModel;
        this.LJLJI = new C38491fB(3);
        this.LJLJJI = new C74127T7j(1);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        T8F holder = (T8F) viewHolder;
        o.LJIIIZ(holder, "holder");
        C74125T7h item = getItem(i);
        o.LJIIIIZZ(item, "getItem(position)");
        holder.L(item);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder t8i;
        o.LJIIIZ(parent, "parent");
        switch (i) {
            case 8:
                T8G qnaSearchDelegate = this.LJLILLLLZI;
                o.LJIIIZ(qnaSearchDelegate, "qnaSearchDelegate");
                View searchLayout = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.c9s, parent, false);
                o.LJIIIIZZ(searchLayout, "searchLayout");
                t8i = new T8I(searchLayout, qnaSearchDelegate);
                break;
            case 9:
                T84 qnaViewHolderClickDelegate = this.LJLIL;
                T8G qnaSearchDelegate2 = this.LJLILLLLZI;
                o.LJIIIZ(qnaViewHolderClickDelegate, "qnaViewHolderClickDelegate");
                o.LJIIIZ(qnaSearchDelegate2, "qnaSearchDelegate");
                View searchLayout2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.c9u, parent, false);
                o.LJIIIIZZ(searchLayout2, "searchLayout");
                t8i = new T82(searchLayout2, qnaViewHolderClickDelegate, qnaSearchDelegate2);
                break;
            case 10:
                T8G qnaSearchDelegate3 = this.LJLILLLLZI;
                o.LJIIIZ(qnaSearchDelegate3, "qnaSearchDelegate");
                View searchLayout3 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.c9r, parent, false);
                o.LJIIIIZZ(searchLayout3, "searchLayout");
                t8i = new T8D(searchLayout3, qnaSearchDelegate3);
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                View searchLayout4 = C28289B8j.LIZ(parent, R.layout.c9t, parent, false);
                o.LJIIIIZZ(searchLayout4, "searchLayout");
                t8i = new C74138T7u(searchLayout4);
                break;
            default:
                t8i = T8E.LIZ(parent);
                break;
        }
        C0AX.LIZ(parent, t8i.itemView, R.id.lj7);
        View view = t8i.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (t8i.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(t8i.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) t8i.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(t8i.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = t8i.getClass().getName();
        return t8i;
    }
}
