package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.GHc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41256GHc extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final /* synthetic */ C81993WFx LJLIL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return 1;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        o.LJIIIZ(viewHolder, "viewHolder");
    }

    public C41256GHc(C81993WFx c81993WFx) {
        this.LJLIL = c81993WFx;
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        o.LJIIIZ(viewGroup, "viewGroup");
        C81991WFv c81991WFv = this.LJLIL.LLLF;
        if (c81991WFv != null) {
            C41257GHd c41257GHd = new C41257GHd(c81991WFv);
            C0AX.LIZ(viewGroup, c41257GHd.itemView, R.id.lj7);
            View view = c41257GHd.itemView;
            if (view != null) {
                view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
            }
            try {
                if (c41257GHd.itemView.getParent() != null) {
                    boolean z = true;
                    try {
                        SettingsManager.LIZLLL().getClass();
                        z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (z) {
                        StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                        stringBuffer.append(C41257GHd.class.getName());
                        stringBuffer.append(" parent ");
                        stringBuffer.append(viewGroup.getClass().getName());
                        stringBuffer.append(" viewType ");
                        stringBuffer.append(i);
                        C78983UzD.LJIILL(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) c41257GHd.itemView.getParent();
                        if (viewGroup2 != null) {
                            C16880lQ.LJLLL(c41257GHd.itemView, viewGroup2);
                        }
                    }
                }
            } catch (Exception e) {
                C78946Uyc.LIZIZ(e);
                C36922EeM.LIZ(e);
            }
            C29127Bbv.LIZ = C41257GHd.class.getName();
            return c41257GHd;
        }
        o.LJIJI("cutMusicView");
        throw null;
    }
}
