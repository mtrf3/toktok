package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3eA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC88823eA extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final String LJLIL;

    public abstract int LJLLLLLL();

    public abstract RecyclerView.ViewHolder LJLZ(ViewGroup viewGroup);

    public abstract G35 LJZ(ViewGroup viewGroup);

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return LJLLLLLL() + 1;
    }

    public AbstractC88823eA(String str) {
        this.LJLIL = str;
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder LJLZ;
        o.LJIIIZ(parent, "parent");
        if (i == 0) {
            LJLZ = LJZ(parent);
        } else {
            LJLZ = LJLZ(parent);
        }
        C0AX.LIZ(parent, LJLZ.itemView, R.id.lj7);
        View view = LJLZ.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (LJLZ.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(LJLZ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) LJLZ.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(LJLZ.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = LJLZ.getClass().getName();
        return LJLZ;
    }
}
