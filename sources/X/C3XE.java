package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3XE, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3XE extends AbstractC029409q<C3XF> {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final int LJLIL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return 1;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return R.layout.atf;
    }

    public C3XE(int i) {
        this.LJLIL = i;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C3XF c3xf, int i) {
        C3XF holder = c3xf;
        o.LJIIIZ(holder, "holder");
        holder.LJLIL.setText(this.LJLIL);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C3XF com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.atf, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        C3XF c3xf = new C3XF(view);
        C0AX.LIZ(viewGroup, c3xf.itemView, R.id.lj7);
        View view2 = c3xf.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c3xf.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C3XF.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c3xf.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c3xf.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C3XF.class.getName();
        return c3xf;
    }
}
