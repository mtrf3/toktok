package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel;
import com.bytedance.android.livesdk.survey.model.SurveySecondQuestion;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SFr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71795SFr extends AbstractC029409q<C71796SFs> {
    public final SurveyViewModel LJLIL;
    public final List<SurveySecondQuestion> LJLILLLLZI;
    public final InterfaceC71797SFt LJLJI;
    public final LayoutInflater LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r0.contains(r3) == true) goto L12;
     */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C71796SFs r5, int r6) {
        /*
            r4 = this;
            X.SFs r5 = (X.C71796SFs) r5
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            if (r6 < 0) goto L50
            java.util.List<com.bytedance.android.livesdk.survey.model.SurveySecondQuestion> r0 = r4.LJLILLLLZI
            int r0 = r0.size()
            if (r0 <= r6) goto L50
            java.util.List<com.bytedance.android.livesdk.survey.model.SurveySecondQuestion> r0 = r4.LJLILLLLZI
            java.lang.Object r3 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            com.bytedance.android.livesdk.survey.model.SurveySecondQuestion r3 = (com.bytedance.android.livesdk.survey.model.SurveySecondQuestion) r3
            com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel r0 = r4.LJLIL
            if (r0 == 0) goto L51
            java.util.HashSet<com.bytedance.android.livesdk.survey.model.SurveySecondQuestion> r0 = r0.LJLJJI
            if (r0 == 0) goto L51
            boolean r0 = r0.contains(r3)
            r2 = 1
            if (r0 != r2) goto L51
        L28:
            java.lang.String r0 = "option"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            r5.LJLIL = r3
            android.view.View r1 = r5.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            boolean r0 = r1 instanceof X.C47121t6
            if (r0 == 0) goto L41
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = r3.content
            r1.setText(r0)
        L41:
            r5.L(r2)
            android.view.View r2 = r5.itemView
            Y.ACListenerS46S0200000_12 r1 = new Y.ACListenerS46S0200000_12
            r0 = 25
            r1.<init>(r4, r5, r0)
            X.C16880lQ.LJIIJ(r1, r2)
        L50:
            return
        L51:
            r2 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71795SFr.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C71796SFs com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View itemView = C16880lQ.LLLLIILL(this.LJLJJI, R.layout.dia, parent, false);
        o.LJIIIIZZ(itemView, "itemView");
        C71796SFs c71796SFs = new C71796SFs(itemView);
        C0AX.LIZ(parent, c71796SFs.itemView, R.id.lj7);
        View view = c71796SFs.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c71796SFs.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C71796SFs.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c71796SFs.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c71796SFs.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C71796SFs.class.getName();
        return c71796SFs;
    }

    public C71795SFr(Context context, SurveyViewModel surveyViewModel, List list, C73387Sr9 c73387Sr9) {
        this.LJLIL = surveyViewModel;
        this.LJLILLLLZI = list;
        this.LJLJI = c73387Sr9;
        this.LJLJJI = C16880lQ.LLZIL(context);
    }
}
