package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9YL, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9YL extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final List<C85542Xhi> LJLIL = new ArrayList();

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLIL).size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        C9YM c9ym = (C9YM) holder;
        C85542Xhi loginItem = (C85542Xhi) ListProtector.get(this.LJLIL, i);
        o.LJIIIZ(loginItem, "loginItem");
        C16880lQ.LJIIJ(loginItem.LJIIIIZZ, c9ym.LJLILLLLZI);
        int i2 = loginItem.LIZIZ;
        if (i2 != 0) {
            c9ym.LJLJI.setIconRes(i2);
        } else {
            c9ym.LJLJI.setIconRes(loginItem.LIZ);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        if (i == 0) {
            C9YM c9ym = new C9YM(C1FL.LIZIZ(parent, R.layout.nt, parent, false, "from(parent.context).inf…rcle_item, parent, false)"));
            C0AX.LIZ(parent, c9ym.itemView, R.id.lj7);
            View view = c9ym.itemView;
            if (view != null) {
                view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
            }
            try {
                if (c9ym.itemView.getParent() != null) {
                    boolean z = true;
                    try {
                        SettingsManager.LIZLLL().getClass();
                        z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (z) {
                        StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                        stringBuffer.append(C9YM.class.getName());
                        stringBuffer.append(" parent ");
                        stringBuffer.append(parent.getClass().getName());
                        stringBuffer.append(" viewType ");
                        stringBuffer.append(i);
                        C78983UzD.LJIILL(stringBuffer.toString());
                        ViewGroup viewGroup = (ViewGroup) c9ym.itemView.getParent();
                        if (viewGroup != null) {
                            C16880lQ.LJLLL(c9ym.itemView, viewGroup);
                        }
                    }
                }
            } catch (Exception e) {
                C78946Uyc.LIZIZ(e);
                C36922EeM.LIZ(e);
            }
            C29127Bbv.LIZ = C9YM.class.getName();
            return c9ym;
        }
        throw new IllegalStateException(KMP.LJ("Unknown view type ", i));
    }
}
