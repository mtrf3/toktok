package X;

import Y.ACListenerS39S0200000_4;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* renamed from: X.9YP, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9YP extends AbstractC029409q<C9YQ> {
    public final Context LJLIL;
    public final List<G36> LJLILLLLZI;
    public final Dialog LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C9YQ c9yq, int i) {
        C9YQ c9yq2 = c9yq;
        G36 g36 = (G36) ListProtector.get(this.LJLILLLLZI, i);
        c9yq2.LJLIL.setText(g36.LIZIZ());
        C16880lQ.LJIIJ(new ACListenerS39S0200000_4(this, g36, 121), c9yq2.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C9YQ com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLIL), R.layout.ux, viewGroup, false);
        C78897Uxp.LJJJJJL(LLLLIILL, 0.0f);
        C9YQ c9yq = new C9YQ(LLLLIILL);
        C0AX.LIZ(viewGroup, c9yq.itemView, R.id.lj7);
        View view = c9yq.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c9yq.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C9YQ.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c9yq.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c9yq.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C9YQ.class.getName();
        return c9yq;
    }

    public C9YP(Context context, List<G36> list, Dialog dialog) {
        this.LJLIL = context;
        this.LJLILLLLZI = list;
        this.LJLJI = dialog;
    }
}
