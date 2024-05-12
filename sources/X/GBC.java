package X;

import Y.ACListenerS42S0200000_7;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes8.dex */
public final class GBC extends AbstractC029409q<GBD> {
    public final List<C86804Y4y> LJLIL;
    public final int LJLILLLLZI = R.layout.n5;
    public Context LJLJI;
    public GBE LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public GBC(List list) {
        this.LJLIL = list;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(GBD gbd, int i) {
        GBD gbd2 = gbd;
        C86804Y4y c86804Y4y = (C86804Y4y) ListProtector.get(this.LJLIL, i);
        if (i == 0 || !TextUtils.equals(((C86804Y4y) ListProtector.get(this.LJLIL, i - 1)).LJLILLLLZI, c86804Y4y.LJLILLLLZI)) {
            gbd2.LJLIL.setVisibility(0);
            gbd2.LJLIL.setText(c86804Y4y.LJLILLLLZI);
        } else {
            gbd2.LJLIL.setVisibility(8);
        }
        if (!TextUtils.isEmpty(c86804Y4y.LJLJJL)) {
            gbd2.LJLILLLLZI.setText(c86804Y4y.LJLJJL);
        } else {
            Context context = this.LJLJI;
            if (context != null && !TextUtils.isEmpty(context.getResources().getString(c86804Y4y.LJLIL))) {
                gbd2.LJLILLLLZI.setText(this.LJLJI.getResources().getString(c86804Y4y.LJLIL));
            }
        }
        gbd2.LJLJI.setText(c86804Y4y.LJLJJI);
        C16880lQ.LJIIJ(new ACListenerS42S0200000_7(this, c86804Y4y, 57), gbd2.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final GBD com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View LLLZIIL = C16880lQ.LLLZIIL(this.LJLILLLLZI, C16880lQ.LLZIL(viewGroup.getContext()), null);
        this.LJLJI = viewGroup.getContext();
        GBD gbd = new GBD(LLLZIIL);
        C0AX.LIZ(viewGroup, gbd.itemView, R.id.lj7);
        View view = gbd.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (gbd.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(GBD.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) gbd.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(gbd.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = GBD.class.getName();
        return gbd;
    }
}
