package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9YR, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9YR extends AbstractC029409q<C9YS> {
    public List<String> LJLIL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public C9YR(List list) {
        this.LJLIL = list;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C9YS c9ys, int i) {
        C9YS holder = c9ys;
        o.LJIIIZ(holder, "holder");
        C47121t6 c47121t6 = holder.LJLILLLLZI;
        if (c47121t6 != null) {
            c47121t6.setText((CharSequence) ListProtector.get(this.LJLIL, i));
        }
        C47121t6 c47121t62 = holder.LJLJI;
        if (c47121t62 != null) {
            BEA.LIZ.getClass();
            c47121t62.setText(BEA.LJIIZILJ);
        }
        if (o.LJ(ListProtector.get(this.LJLIL, i), "")) {
            holder.itemView.setVisibility(4);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C9YS com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.d75, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        C9YS c9ys = new C9YS(view);
        C0AX.LIZ(viewGroup, c9ys.itemView, R.id.lj7);
        View view2 = c9ys.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c9ys.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C9YS.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c9ys.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c9ys.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C9YS.class.getName();
        return c9ys;
    }
}
