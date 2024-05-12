package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.plugin.journey.TopicInterestCategoryItemStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G3G extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final List<TopicInterestCategoryItemStruct> LJLIL;
    public final InterfaceC88472Yns<Integer, C76800UCe> LJLILLLLZI;
    public final int LJLJI;
    public final HashSet<G2Y> LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List<TopicInterestCategoryItemStruct> list = this.LJLIL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        TopicInterestCategoryItemStruct topicInterestCategoryItemStruct;
        String str;
        TopicInterestCategoryItemStruct topicInterestCategoryItemStruct2;
        o.LJIIIZ(holder, "holder");
        if (holder instanceof G3F) {
            G3F g3f = (G3F) holder;
            int adapterPosition = g3f.getAdapterPosition();
            List<TopicInterestCategoryItemStruct> list = g3f.LJLJI.LJLIL;
            String str2 = null;
            if (list != null) {
                topicInterestCategoryItemStruct = (TopicInterestCategoryItemStruct) ListProtector.get(list, adapterPosition);
            } else {
                topicInterestCategoryItemStruct = null;
            }
            TextView textView = (TextView) g3f.itemView.findViewById(R.id.text);
            if (topicInterestCategoryItemStruct != null) {
                str2 = topicInterestCategoryItemStruct.text;
            }
            textView.setText(str2);
            G3G g3g = g3f.LJLJI;
            int i2 = g3g.LJLJI;
            List<TopicInterestCategoryItemStruct> list2 = g3g.LJLIL;
            if (list2 == null || (topicInterestCategoryItemStruct2 = (TopicInterestCategoryItemStruct) ListProtector.get(list2, adapterPosition)) == null || (str = topicInterestCategoryItemStruct2.id) == null) {
                str = "";
            }
            g3f.L(g3f.LJLJI.LJLJJI.contains(new G2Y(i2, str, adapterPosition)));
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        G3F g3f = new G3F(this, C1FL.LIZIZ(parent, R.layout.bf1, parent, false, "from(parent.context)\n   …em_select, parent, false)"));
        C0AX.LIZ(parent, g3f.itemView, R.id.lj7);
        View view = g3f.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (g3f.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(G3F.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) g3f.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(g3f.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = G3F.class.getName();
        return g3f;
    }

    public G3G(List list, InterfaceC88472Yns sizeListener, int i, HashSet finalSelectedInterestSet) {
        o.LJIIIZ(sizeListener, "sizeListener");
        o.LJIIIZ(finalSelectedInterestSet, "finalSelectedInterestSet");
        this.LJLIL = list;
        this.LJLILLLLZI = sizeListener;
        this.LJLJI = i;
        this.LJLJJI = finalSelectedInterestSet;
    }
}
