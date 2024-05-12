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

/* renamed from: X.KTj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51767KTj extends C61799ONf<SurveyQuestionOption> {
    public final Context LJLJJL;
    public final ArrayList<SurveyQuestionOption> LJLJJLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJJLL.size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51767KTj(Context context, ArrayList<SurveyQuestionOption> arrayList) {
        super(context, arrayList);
        o.LJIIIZ(context, "context");
        this.LJLJJL = context;
        this.LJLJJLL = arrayList;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        boolean z;
        o.LJIIIZ(holder, "holder");
        if (!(holder instanceof C51768KTk)) {
            return;
        }
        if (this.LJLILLLLZI) {
            C16880lQ.LJIIJ(new ACListenerS25S0201000_8(i, this, holder, 3), holder.itemView);
        }
        C51768KTk c51768KTk = (C51768KTk) holder;
        c51768KTk.LJLIL.setText(((SurveyQuestionOption) ListProtector.get(this.LJLJJLL, i)).optionText);
        TuxTextView tuxTextView = c51768KTk.LJLIL;
        if (this.LJLIL == i) {
            z = true;
        } else {
            z = false;
        }
        tuxTextView.setSelected(z);
        if (c51768KTk.LJLIL.isSelected()) {
            c51768KTk.LJLIL.setTextColorRes(R.attr.dj);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C51768KTk c51768KTk = new C51768KTk(AnonymousClass030.LIZLLL(this.LJLJJL, R.layout.a_q, parent, false, "from(context)\n          …ey_choice, parent, false)"));
        C0AX.LIZ(parent, c51768KTk.itemView, R.id.lj7);
        View view = c51768KTk.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c51768KTk.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C51768KTk.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c51768KTk.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c51768KTk.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C51768KTk.class.getName();
        return c51768KTk;
    }
}
