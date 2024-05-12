package X;

import Y.ACListenerS23S0101000_4;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ASC extends AbstractC029409q<ASD> {
    public final ASH LJLIL;
    public List<AS4> LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.size();
    }

    public ASC(ASH listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL = listener;
        this.LJLILLLLZI = C61878OQg.INSTANCE;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(ASD asd, int i) {
        ASD holder = asd;
        o.LJIIIZ(holder, "holder");
        holder.LJLILLLLZI.setText(((AS4) ListProtector.get(this.LJLILLLLZI, i)).LIZ.LIZIZ);
        C26338AVi.LJI(holder.LJLILLLLZI, null, AnonymousClass391.LIZJ(17), null, null, false, 29);
        if (i != this.LJLILLLLZI.size() - 1) {
            holder.LJLJI.setVisibility(0);
            C26338AVi.LJI(holder.LJLJI, null, AnonymousClass391.LIZJ(16), null, null, false, 29);
        } else {
            holder.LJLJI.setVisibility(4);
            C26338AVi.LJI(holder.LJLJI, null, AnonymousClass391.LIZJ(20), null, null, false, 29);
        }
        holder.LJLILLLLZI.setTuxFont(42);
        C16880lQ.LJIIJ(new ACListenerS23S0101000_4(i, this, 2), holder.LJLIL);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final ASD com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View itemView = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.bj1, viewGroup, false);
        o.LJIIIIZZ(itemView, "itemView");
        ASD asd = new ASD(itemView);
        C0AX.LIZ(viewGroup, asd.itemView, R.id.lj7);
        View view = asd.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (asd.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(ASD.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) asd.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(asd.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = ASD.class.getName();
        return asd;
    }
}
