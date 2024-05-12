package X;

import Y.ACListenerS25S0201000_8;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.model.SurveyQuestionOption;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.KTl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51769KTl extends C61799ONf<SurveyQuestionOption> {
    public final Context LJLJJL;
    public final ArrayList<SurveyQuestionOption> LJLJJLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJJLL.size();
    }

    public C51769KTl(Context context, ArrayList<SurveyQuestionOption> arrayList) {
        super(context, arrayList);
        this.LJLJJL = context;
        this.LJLJJLL = arrayList;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        boolean z;
        o.LJIIIZ(holder, "holder");
        if (!(holder instanceof C51770KTm)) {
            return;
        }
        if (this.LJLILLLLZI) {
            C16880lQ.LJIIJ(new ACListenerS25S0201000_8(i, this, holder, 4), holder.itemView);
        }
        C51770KTm c51770KTm = (C51770KTm) holder;
        c51770KTm.LJLIL.setText(((SurveyQuestionOption) ListProtector.get(this.LJLJJLL, i)).optionText);
        TuxTextView tuxTextView = c51770KTm.LJLIL;
        if (this.LJLIL == i) {
            z = true;
        } else {
            z = false;
        }
        tuxTextView.setSelected(z);
        if (c51770KTm.LJLIL.isSelected()) {
            c51770KTm.LJLIL.setTextColorRes(R.attr.dj);
        } else {
            c51770KTm.LJLIL.setTextColorRes(R.attr.dl);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C51770KTm c51770KTm = new C51770KTm(AnonymousClass030.LIZLLL(this.LJLJJL, R.layout.a_p, parent, false, "from(context)\n          …ey_choice, parent, false)"));
        C0AX.LIZ(parent, c51770KTm.itemView, R.id.lj7);
        View view = c51770KTm.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c51770KTm.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C51770KTm.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c51770KTm.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c51770KTm.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C51770KTm.class.getName();
        return c51770KTm;
    }
}
