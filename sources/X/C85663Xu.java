package X;

import Y.ACListenerS21S0100000_1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.3Xu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85663Xu extends AbstractC029409q<C85673Xv> {
    public final ArrayList<C85683Xw> LJLIL = new ArrayList<>();

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C85673Xv holder, int i) {
        o.LJIIIZ(holder, "holder");
        Object obj = ListProtector.get(this.LJLIL, i);
        o.LJIIIIZZ(obj, "mData[position]");
        C85683Xw c85683Xw = (C85683Xw) obj;
        ((TextView) holder.itemView.findViewById(R.id.ev9)).setText(c85683Xw.LIZ);
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(c85683Xw, 194), holder.itemView);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, X.3Xv] */
    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C85673Xv com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        final View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.d9q, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        ?? r2 = new RecyclerView.ViewHolder(view) { // from class: X.3Xv
        };
        C0AX.LIZ(viewGroup, r2.itemView, R.id.lj7);
        View view2 = r2.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
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
                    stringBuffer.append(C85673Xv.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) r2.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(r2.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C85673Xv.class.getName();
        return r2;
    }
}
