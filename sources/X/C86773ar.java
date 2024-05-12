package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3ar, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86773ar extends AbstractC029409q<C88383dS> {
    public final /* synthetic */ C88393dT LJLIL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        int i;
        C88393dT c88393dT = this.LJLIL;
        synchronized (c88393dT) {
            List<String> list = c88393dT.LIZLLL;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
        }
        return i;
    }

    public C86773ar(C88393dT c88393dT) {
        this.LJLIL = c88393dT;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C88383dS c88383dS, int i) {
        String str;
        boolean z;
        C88383dS holder = c88383dS;
        o.LJIIIZ(holder, "holder");
        C88393dT c88393dT = this.LJLIL;
        synchronized (c88393dT) {
            List<String> list = c88393dT.LIZLLL;
            if (list != null && (str = (String) ORZ.LJLLLLLL(i, list)) != null) {
                if (c88393dT.LJI == i) {
                    z = true;
                } else {
                    z = false;
                }
                holder.L(str, z);
            }
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C88383dS com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        C88383dS c88383dS;
        o.LJIIIZ(parent, "parent");
        if (i == 0) {
            View LIZ = C28289B8j.LIZ(parent, R.layout.nc, parent, false);
            C88393dT c88393dT = this.LJLIL;
            o.LJII(LIZ, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
            c88383dS = new C88383dS(c88393dT, (TuxTextView) LIZ);
        } else {
            View LIZ2 = C28289B8j.LIZ(parent, R.layout.n4, parent, false);
            C88393dT c88393dT2 = this.LJLIL;
            o.LJII(LIZ2, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
            c88383dS = new C88383dS(c88393dT2, (TuxTextView) LIZ2);
        }
        C0AX.LIZ(parent, c88383dS.itemView, R.id.lj7);
        View view = c88383dS.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c88383dS.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C88383dS.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c88383dS.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c88383dS.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C88383dS.class.getName();
        return c88383dS;
    }
}
