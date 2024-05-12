package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.GHa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41254GHa extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final /* synthetic */ WG7 LJLIL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return 1;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        o.LJIIIZ(viewHolder, "viewHolder");
    }

    public C41254GHa(WG7 wg7) {
        this.LJLIL = wg7;
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        o.LJIIIZ(viewGroup, "viewGroup");
        WG9 wg9 = this.LJLIL.LLLF;
        if (wg9 != null) {
            C41255GHb c41255GHb = new C41255GHb(wg9);
            C0AX.LIZ(viewGroup, c41255GHb.itemView, R.id.lj7);
            View view = c41255GHb.itemView;
            if (view != null) {
                view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
            }
            try {
                if (c41255GHb.itemView.getParent() != null) {
                    boolean z = true;
                    try {
                        SettingsManager.LIZLLL().getClass();
                        z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (z) {
                        StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                        stringBuffer.append(C41255GHb.class.getName());
                        stringBuffer.append(" parent ");
                        stringBuffer.append(viewGroup.getClass().getName());
                        stringBuffer.append(" viewType ");
                        stringBuffer.append(i);
                        C78983UzD.LJIILL(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) c41255GHb.itemView.getParent();
                        if (viewGroup2 != null) {
                            C16880lQ.LJLLL(c41255GHb.itemView, viewGroup2);
                        }
                    }
                }
            } catch (Exception e) {
                C78946Uyc.LIZIZ(e);
                C36922EeM.LIZ(e);
            }
            C29127Bbv.LIZ = C41255GHb.class.getName();
            return c41255GHb;
        }
        o.LJIJI("cutMusicView");
        throw null;
    }
}
