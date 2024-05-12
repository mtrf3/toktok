package X;

import Y.ACListenerS32S0101000_15;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.inference.AdInferenceActivity;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.inference.model.LabelData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XhI, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85516XhI extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final InterfaceC85518XhK LJLIL;
    public List<LabelData> LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public final String LJLJLJ;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.size();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        int labelType = ((LabelData) ListProtector.get(this.LJLILLLLZI, i)).getLabelType();
        if (labelType != 0) {
            if (labelType == 1) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    public C85516XhI(Context context, AdInferenceActivity itemListener) {
        o.LJIIIZ(itemListener, "itemListener");
        this.LJLIL = itemListener;
        this.LJLILLLLZI = new ArrayList();
        String string = context.getString(R.string.qzg);
        o.LJIIIIZZ(string, "this.context.getString(R…_granular_control_gender)");
        this.LJLJI = string;
        String string2 = context.getString(R.string.qzp);
        o.LJIIIIZZ(string2, "this.context.getString(R…ranular_control_interest)");
        this.LJLJJI = string2;
        String string3 = context.getString(R.string.qzt);
        o.LJIIIIZZ(string3, "this.context.getString(R…control_interest_removed)");
        this.LJLJJL = string3;
        String string4 = context.getString(R.string.qzl);
        o.LJIIIIZZ(string4, "this.context.getString(R…ar_control_gender_female)");
        this.LJLJJLL = string4;
        String string5 = context.getString(R.string.qzn);
        o.LJIIIIZZ(string5, "this.context.getString(R…ular_control_gender_male)");
        this.LJLJL = string5;
        String string6 = context.getString(R.string.qzo);
        o.LJIIIIZZ(string6, "this.context.getString(R…r_control_gender_unknown)");
        this.LJLJLJ = string6;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        Integer valueOf;
        o.LJIIIZ(holder, "holder");
        C85517XhJ c85517XhJ = (C85517XhJ) holder;
        if (((LabelData) ListProtector.get(this.LJLILLLLZI, i)).getLabelType() == 0) {
            String interestTagId = ((LabelData) ListProtector.get(this.LJLILLLLZI, i)).getInterestTagId();
            if (interestTagId != null && (valueOf = Integer.valueOf(CastIntegerProtector.parseInt(interestTagId))) != null) {
                if (valueOf.intValue() == 0) {
                    c85517XhJ.LJLILLLLZI.setText(this.LJLJJLL);
                } else if (valueOf.intValue() == 1) {
                    c85517XhJ.LJLILLLLZI.setText(this.LJLJL);
                } else if (valueOf.intValue() == 2) {
                    c85517XhJ.LJLILLLLZI.setText(((LabelData) ListProtector.get(this.LJLILLLLZI, i)).getInterestTagValue());
                } else if (valueOf.intValue() == 3) {
                    c85517XhJ.LJLILLLLZI.setText(this.LJLJLJ);
                }
            }
        } else {
            c85517XhJ.LJLILLLLZI.setText(((LabelData) ListProtector.get(this.LJLILLLLZI, i)).getInterestTagValue());
        }
        if (i == 0 || ((LabelData) ListProtector.get(this.LJLILLLLZI, i)).getLabelType() != ((LabelData) ListProtector.get(this.LJLILLLLZI, i - 1)).getLabelType()) {
            c85517XhJ.LJLIL.setVisibility(0);
            int itemViewType = c85517XhJ.getItemViewType();
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType == 2) {
                        c85517XhJ.LJLIL.setText(this.LJLJJL);
                    }
                } else {
                    c85517XhJ.LJLIL.setText(this.LJLJJI);
                }
            } else {
                c85517XhJ.LJLIL.setText(this.LJLJI);
            }
        } else {
            c85517XhJ.LJLIL.setVisibility(8);
        }
        C16880lQ.LJIJ(c85517XhJ.LJLJI, new ACListenerS32S0101000_15(i, this, 6));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.bbf, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        C85517XhJ c85517XhJ = new C85517XhJ(view);
        C0AX.LIZ(viewGroup, c85517XhJ.itemView, R.id.lj7);
        View view2 = c85517XhJ.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c85517XhJ.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C85517XhJ.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c85517XhJ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c85517XhJ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C85517XhJ.class.getName();
        return c85517XhJ;
    }
}
