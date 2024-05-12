package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.76i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1804476i extends AbstractC029409q<C83338WnG> {
    public final List<String> LJLIL = new ArrayList();
    public final C62822Ol8 LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLIL).size();
    }

    public C1804476i(AqS196S0100000_14 aqS196S0100000_14) {
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS150S0200000_3(aqS196S0100000_14, this, 94));
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C83338WnG holder, int i) {
        o.LJIIIZ(holder, "holder");
        String hint = (String) ListProtector.get(this.LJLIL, i);
        o.LJIIIZ(hint, "hint");
        ((TextView) holder.itemView.findViewById(R.id.mbf)).setText(hint);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C83338WnG com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View itemView = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.cb8, viewGroup, false);
        o.LJIIIIZZ(itemView, "itemView");
        C83338WnG c83338WnG = new C83338WnG(itemView, (InterfaceC83334WnC) this.LJLILLLLZI.getValue());
        C0AX.LIZ(viewGroup, c83338WnG.itemView, R.id.lj7);
        View view = c83338WnG.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c83338WnG.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C83338WnG.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c83338WnG.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c83338WnG.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C83338WnG.class.getName();
        return c83338WnG;
    }
}
