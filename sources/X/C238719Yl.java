package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.utils.Au2S0S1101000_4;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.9Yl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238719Yl extends AbstractC029409q<C238729Ym> {
    public ArrayList<String> LJLIL = new ArrayList<>();

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C238729Ym c238729Ym, int i) {
        C238729Ym holder = c238729Ym;
        o.LJIIIZ(holder, "holder");
        if (i < getItemCount()) {
            Object obj = ListProtector.get(this.LJLIL, i);
            o.LJIIIIZZ(obj, "zipList[position]");
            String str = (String) obj;
            ((TextView) holder.itemView.findViewById(R.id.nkt)).setText(str);
            View findViewById = holder.itemView.findViewById(R.id.nkt);
            o.LJIIIIZZ(findViewById, "itemView.zipcode");
            C16880lQ.LJIIJ(new Au2S0S1101000_4(holder, str, i, 1), findViewById);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, X.9Ym] */
    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C238729Ym com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        ?? r2 = new RecyclerView.ViewHolder(C72545SdZ.LIZJ(parent, "parent.context", R.layout.xi, parent, false)) { // from class: X.9Ym
        };
        C0AX.LIZ(parent, r2.itemView, R.id.lj7);
        View view = r2.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (r2.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C238729Ym.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) r2.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(r2.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C238729Ym.class.getName();
        return r2;
    }
}
