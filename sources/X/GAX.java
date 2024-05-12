package X;

import Y.ACListenerS42S0200000_7;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GAX extends AbstractC029409q<GAZ> {
    public final Context LJLIL;
    public final boolean LJLILLLLZI;
    public List<TranslatedRegion> LJLJI;

    public final List<TranslatedRegion> getCurrentList() {
        return ORZ.LLJI(this.LJLJI);
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJI.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(GAZ gaz, int i) {
        GAZ holder = gaz;
        o.LJIIIZ(holder, "holder");
        TranslatedRegion translatedRegion = (TranslatedRegion) ListProtector.get(this.LJLJI, i);
        holder.LJLIL.setText(translatedRegion.getTranslation());
        if (this.LJLILLLLZI) {
            holder.LJLILLLLZI.setVisibility(8);
        } else {
            C16880lQ.LJIILLIIL(holder.LJLILLLLZI, new ACListenerS42S0200000_7(this, translatedRegion, 47));
        }
    }

    @Override // X.AbstractC029409q
    public final GAZ onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.bc7, viewGroup, false);
        o.LJIIIIZZ(itemView, "itemView");
        GAZ gaz = new GAZ(itemView);
        C0AX.LIZ(viewGroup, gaz.itemView, R.id.lj7);
        View view = gaz.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (gaz.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(GAZ.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) gaz.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(gaz.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = GAZ.class.getName();
        return gaz;
    }

    public GAX(Context context, List initialRegion, boolean z) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(initialRegion, "initialRegion");
        this.LJLIL = context;
        this.LJLILLLLZI = z;
        this.LJLJI = ORZ.LLJILJILJ(initialRegion);
    }
}
