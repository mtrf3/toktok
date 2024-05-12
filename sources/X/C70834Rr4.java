package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.review.OptionV1;
import com.ss.android.ugc.aweme.utils.Au2S3S0201000_12;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rr4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70834Rr4 extends AbstractC029409q<GB9> {
    public final List<OptionV1> LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public IDqS436S0100000_12 LJLJJI;
    public AqS178S0100000_12 LJLJJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public C70834Rr4(List<OptionV1> list) {
        this.LJLIL = list;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(GB9 holder, int i) {
        o.LJIIIZ(holder, "holder");
        boolean z = true;
        if (i >= 0 && i <= this.LJLIL.size()) {
            OptionV1 optionV1 = (OptionV1) ListProtector.get(this.LJLIL, i);
            optionV1.isSelected = o.LJ(optionV1.filter.filterId, this.LJLILLLLZI);
            optionV1.isDefaultSelected = o.LJ(optionV1.filter.filterId, this.LJLJI);
            TextView textView = (TextView) holder.itemView.findViewById(R.id.mo6);
            textView.setText(optionV1.filter.name);
            textView.setEnabled(optionV1.isEnabled);
            TextView bind$lambda$1 = (TextView) holder.itemView.findViewById(R.id.mlr);
            if (optionV1.optionType == 1 && C78685UuP.LJJJZ(optionV1.subText)) {
                o.LJIIIIZZ(bind$lambda$1, "bind$lambda$1");
                bind$lambda$1.setVisibility(0);
                bind$lambda$1.setText(optionV1.subText);
            } else {
                o.LJIIIIZZ(bind$lambda$1, "bind$lambda$1");
                bind$lambda$1.setVisibility(8);
            }
            C63044Ooi c63044Ooi = (C63044Ooi) holder.itemView.findViewById(R.id.mfs);
            c63044Ooi.setEnabled(optionV1.isEnabled);
            if (!optionV1.isEnabled || (!optionV1.isSelected && !optionV1.isDefaultSelected)) {
                z = false;
            }
            c63044Ooi.setChecked(z);
            View view = holder.itemView;
            o.LJIIIIZZ(view, "holder.itemView");
            C16880lQ.LJIIJ(new Au2S3S0201000_12(optionV1, this, i, 6), view);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final GB9 com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        GB9 gb9 = new GB9(parent);
        C0AX.LIZ(parent, gb9.itemView, R.id.lj7);
        View view = gb9.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (gb9.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(GB9.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) gb9.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(gb9.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = GB9.class.getName();
        return gb9;
    }
}
