package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.summary.USOrderSummaryVH;
import com.ss.android.ugc.aweme.utils.Au2S10S0300000_4;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AiQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26982AiQ extends AbstractC28801Bc<C27051AjX, C26984AiS> {
    public List<C27051AjX> LJLIL;
    public final /* synthetic */ USOrderSummaryVH LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        int i2;
        C26984AiS holder = (C26984AiS) viewHolder;
        o.LJIIIZ(holder, "holder");
        C27051AjX item = getItem(i);
        USOrderSummaryVH uSOrderSummaryVH = this.LJLILLLLZI;
        TuxTextView tuxTextView = holder.LJLIL;
        tuxTextView.setText(item.LIZ);
        tuxTextView.setTextColorRes(C78685UuP.LJLI(item.LJI, null));
        TuxTextView tuxTextView2 = holder.LJLJI;
        tuxTextView2.setText(item.LIZIZ);
        tuxTextView2.setTuxFont(C78685UuP.LJLIIIL(item.LIZJ, null));
        tuxTextView2.setTextColorRes(C78685UuP.LJLI(item.LIZLLL, null));
        holder.LJLILLLLZI.setTintColorRes(C78685UuP.LJLI(item.LJI, null));
        TuxIconView tuxIconView = holder.LJLILLLLZI;
        ArrayList<BillItem> arrayList = item.LJIIIZ;
        if (arrayList != null && !arrayList.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        tuxIconView.setVisibility(i2);
        Integer num = item.LJII;
        if (num != null) {
            if (num.intValue() == 2) {
                holder.LJLILLLLZI.setVisibility(0);
                C78946Uyc.LJJIIJ(uSOrderSummaryVH.LJLIL, new C70918RsQ(0), C26988AiW.LJLIL);
                C16880lQ.LJIIJ(new Au2S10S0300000_4(uSOrderSummaryVH, holder, item, 6), holder.LJLILLLLZI);
                return;
            }
            if (num.intValue() == 16) {
                C78946Uyc.LJJIIJ(uSOrderSummaryVH.LJLIL, new C70918RsQ(0), C26989AiX.LJLIL);
                C16880lQ.LJIIJ(new Au2S10S0300000_4(uSOrderSummaryVH, holder, item, 7), holder.LJLILLLLZI);
                return;
            } else if (num.intValue() == 7) {
                C16880lQ.LJIIJ(new Au2S10S0300000_4(uSOrderSummaryVH, holder, item, 8), holder.LJLILLLLZI);
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
        C26984AiS c26984AiS = new C26984AiS(view);
        C0AX.LIZ(viewGroup, c26984AiS.itemView, R.id.lj7);
        View view2 = c26984AiS.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c26984AiS.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C26984AiS.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c26984AiS.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c26984AiS.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C26984AiS.class.getName();
        return c26984AiS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26982AiQ(USOrderSummaryVH uSOrderSummaryVH, C27043AjP summaryInfo, List<C27051AjX> dataList) {
        super(new C26992Aia());
        o.LJIIIZ(summaryInfo, "summaryInfo");
        o.LJIIIZ(dataList, "dataList");
        this.LJLILLLLZI = uSOrderSummaryVH;
        this.LJLIL = dataList;
    }
}
