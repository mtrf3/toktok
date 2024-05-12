package X;

import Y.ACListenerS25S0101000_7;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.business.search.feedback.QuestionContent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GBM extends AbstractC029409q<GBN> {
    public final List<QuestionContent> LJLIL;
    public int LJLILLLLZI;
    public AqS173S0100000_7 LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public GBM(List<QuestionContent> data) {
        o.LJIIIZ(data, "data");
        this.LJLIL = data;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(GBN gbn, int i) {
        int i2;
        GBN holder = gbn;
        o.LJIIIZ(holder, "holder");
        QuestionContent questionContent = (QuestionContent) ListProtector.get(this.LJLIL, i);
        o.LJIIIZ(questionContent, "questionContent");
        TuxTextView tuxTextView = holder.LJLILLLLZI;
        tuxTextView.setText(questionContent.getValue());
        Context context = tuxTextView.getContext();
        o.LJIIIIZZ(context, "context");
        if (questionContent.getSelected()) {
            i2 = R.attr.go;
        } else {
            i2 = R.attr.gu;
        }
        Integer LJI = C79045V0n.LJI(i2, context);
        if (LJI != null) {
            tuxTextView.setTextColor(LJI.intValue());
        }
        tuxTextView.setSelected(questionContent.getSelected());
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS25S0101000_7(i, holder, 2));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final GBN com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.ag3, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        GBN gbn = new GBN(view, new AqS173S0100000_7(this, 224));
        C0AX.LIZ(viewGroup, gbn.itemView, R.id.lj7);
        View view2 = gbn.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (gbn.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(GBN.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) gbn.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(gbn.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = GBN.class.getName();
        return gbn;
    }
}
