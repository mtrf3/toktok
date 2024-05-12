package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.global.osp.module.summary.GlobalOrderSummaryVH;
import com.ss.android.ugc.aweme.utils.Au2S10S0300000_4;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AiR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26983AiR extends AbstractC28801Bc<C27051AjX, C26985AiT> {
    public List<C27051AjX> LJLIL;
    public final /* synthetic */ GlobalOrderSummaryVH LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C26985AiT holder = (C26985AiT) viewHolder;
        o.LJIIIZ(holder, "holder");
        C27051AjX item = getItem(i);
        GlobalOrderSummaryVH globalOrderSummaryVH = this.LJLILLLLZI;
        holder.LJLIL.setText(item.LIZ);
        TuxTextView tuxTextView = holder.LJLJI;
        tuxTextView.setText(item.LIZIZ);
        tuxTextView.setTuxFont(C78685UuP.LJLIIIL(item.LIZJ, null));
        tuxTextView.setTextColorRes(C78685UuP.LJLI(item.LIZLLL, null));
        Integer num = item.LJII;
        if (num != null) {
            if (num.intValue() == 2) {
                holder.LJLILLLLZI.setVisibility(0);
                C78946Uyc.LJJIIJ(globalOrderSummaryVH.LJLIL, new C70918RsQ(0), C26986AiU.LJLIL);
                C16880lQ.LJIIJ(new Au2S10S0300000_4(globalOrderSummaryVH, holder, item, 13), holder.LJLILLLLZI);
                return;
            }
            if (num.intValue() == 16) {
                holder.LJLILLLLZI.setVisibility(0);
                C78946Uyc.LJJIIJ(globalOrderSummaryVH.LJLIL, new C70918RsQ(0), C26987AiV.LJLIL);
                C16880lQ.LJIIJ(new Au2S10S0300000_4(globalOrderSummaryVH, holder, item, 14), holder.LJLILLLLZI);
                return;
            }
        }
        holder.LJLILLLLZI.setVisibility(8);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.z8, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        C26985AiT c26985AiT = new C26985AiT(view);
        C0AX.LIZ(viewGroup, c26985AiT.itemView, R.id.lj7);
        View view2 = c26985AiT.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c26985AiT.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C26985AiT.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c26985AiT.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c26985AiT.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C26985AiT.class.getName();
        return c26985AiT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26983AiR(GlobalOrderSummaryVH globalOrderSummaryVH, C27042AjO summaryInfo, List<C27051AjX> dataList) {
        super(new C26991AiZ());
        o.LJIIIZ(summaryInfo, "summaryInfo");
        o.LJIIIZ(dataList, "dataList");
        this.LJLILLLLZI = globalOrderSummaryVH;
        this.LJLIL = dataList;
    }
}
