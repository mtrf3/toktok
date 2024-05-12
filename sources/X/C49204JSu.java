package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.JSu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49204JSu extends AbstractC029409q<JSH> implements JTX {
    public String LJLIL;
    public DynamicPatch LJLILLLLZI;
    public java.util.Map<String, String> LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        if (this.LJLILLLLZI == null) {
            return 0;
        }
        return 1;
    }

    @Override // X.JTX
    public final void LJLLLL(JTS bulletContext) {
        o.LJIIIZ(bulletContext, "bulletContext");
        this.LJLIL = bulletContext.LIZJ;
    }

    @Override // X.AbstractC029409q
    public final void onViewRecycled(JSH jsh) {
        JSH holder = jsh;
        o.LJIIIZ(holder, "holder");
        super.onViewRecycled(holder);
        holder.LJJJJIZL();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(JSH jsh, int i) {
        JSH holder = jsh;
        o.LJIIIZ(holder, "holder");
        JSP P = holder.P();
        if (P != null) {
            P.LJLIL.LJIILIIL = this;
        }
        JSP P2 = holder.P();
        if (P2 != null) {
            P2.LJLIL.getClass();
        }
        JSP P3 = holder.P();
        if (P3 != null) {
            P3.LJLIL.LJIIJ = true;
        }
        DynamicPatch dynamicPatch = this.LJLILLLLZI;
        o.LJI(dynamicPatch);
        JSH.M(holder, dynamicPatch, this.LJLJI, null, 28);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final JSH com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        JSH LIZ = JSI.LIZ(parent, null);
        C0AX.LIZ(parent, LIZ.itemView, R.id.lj7);
        View view = LIZ.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (LIZ.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(JSH.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) LIZ.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(LIZ.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = JSH.class.getName();
        return LIZ;
    }
}
