package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SGF extends SR0<SGG> {
    public List<SGH> LJLILLLLZI = new ArrayList();

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.size();
    }

    @Override // X.SR0, X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        SGG holder = (SGG) viewHolder;
        o.LJIIIZ(holder, "holder");
        super.onBindViewHolder(holder, i);
        SGH sgh = (SGH) ListProtector.get(this.LJLILLLLZI, i);
        holder.LJLIL.setText(sgh.LIZ.getName());
        if (sgh.LIZIZ) {
            holder.LJLILLLLZI.setVisibility(0);
            holder.LJLJI.setVisibility(0);
            TextView textView = holder.LJLIL;
            textView.setTextColor(C78609UtB.LJJJ(R.attr.do, textView.getContext()));
            return;
        }
        holder.LJLILLLLZI.setVisibility(8);
        holder.LJLJI.setVisibility(8);
        TextView textView2 = holder.LJLIL;
        textView2.setTextColor(C78609UtB.LJJJ(R.attr.dj, textView2.getContext()));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View view = C16880lQ.LLLZIIL(R.layout.cpe, C16880lQ.LLZIL(parent.getContext()), null);
        o.LJIIIIZZ(view, "view");
        SGG sgg = new SGG(view);
        C0AX.LIZ(parent, sgg.itemView, R.id.lj7);
        View view2 = sgg.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (sgg.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(SGG.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) sgg.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(sgg.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = SGG.class.getName();
        return sgg;
    }
}
