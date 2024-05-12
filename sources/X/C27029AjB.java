package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ViewItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ViewStyle;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AjB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27029AjB extends AbstractC029409q<AbstractViewOnClickListenerC27027Aj9> {
    public List<CandInputData> LJLIL;
    public ViewStyle LJLILLLLZI;
    public String LJLJI;
    public boolean LJLJJI;
    public InterfaceC27028AjA LJLJJL;

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        return i;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List<CandInputData> list = this.LJLIL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        CandInputData candInputData;
        List<ViewItem> list;
        List<CandInputData> list2 = this.LJLIL;
        if (list2 != null && (candInputData = (CandInputData) ListProtector.get(list2, i)) != null && (list = candInputData.viewItems) != null) {
            return list.size();
        }
        return 1;
    }

    public final View LJLLLLLL(int i, ViewGroup viewGroup) {
        return C28289B8j.LIZ(viewGroup, i, viewGroup, false);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(AbstractViewOnClickListenerC27027Aj9 abstractViewOnClickListenerC27027Aj9, int i) {
        CandInputData candInputData;
        AbstractViewOnClickListenerC27027Aj9 viewHolder = abstractViewOnClickListenerC27027Aj9;
        o.LJIIIZ(viewHolder, "viewHolder");
        List<CandInputData> list = this.LJLIL;
        if (list != null) {
            candInputData = (CandInputData) ListProtector.get(list, i);
        } else {
            candInputData = null;
        }
        viewHolder.L(candInputData, getItemCount(), this.LJLILLLLZI, this.LJLJI);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final AbstractViewOnClickListenerC27027Aj9 com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        AbstractViewOnClickListenerC27027Aj9 c27026Aj8;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (i != -2) {
            if (i != 1) {
                if (i != 2) {
                    View LJLLLLLL = LJLLLLLL(R.layout.wt, parent);
                    o.LJIIIIZZ(LJLLLLLL, "createView(parent, R.lay…ess_cand_item_singleview)");
                    c27026Aj8 = new C27031AjD(LJLLLLLL);
                } else {
                    View LJLLLLLL2 = LJLLLLLL(R.layout.wu, parent);
                    o.LJIIIIZZ(LJLLLLLL2, "createView(parent, R.lay…dress_cand_item_twinview)");
                    c27026Aj8 = new C27030AjC(LJLLLLLL2);
                }
            } else {
                View LJLLLLLL3 = LJLLLLLL(R.layout.wt, parent);
                o.LJIIIIZZ(LJLLLLLL3, "createView(parent, R.lay…ess_cand_item_singleview)");
                c27026Aj8 = new C27031AjD(LJLLLLLL3);
            }
        } else {
            View LJLLLLLL4 = LJLLLLLL(R.layout.ws, parent);
            o.LJIIIIZZ(LJLLLLLL4, "createView(parent, R.lay…ess_cand_item_headerview)");
            c27026Aj8 = new C27026Aj8(LJLLLLLL4);
        }
        c27026Aj8.LJLIL = this.LJLJJL;
        C0AX.LIZ(parent, c27026Aj8.itemView, R.id.lj7);
        View view = c27026Aj8.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c27026Aj8.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c27026Aj8.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c27026Aj8.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c27026Aj8.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c27026Aj8.getClass().getName();
        return c27026Aj8;
    }
}
