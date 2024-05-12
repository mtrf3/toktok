package X;

import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7FR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7FR extends AbstractC029409q<C7FS> {
    public final Context LJLIL;
    public final List<C7FT> LJLILLLLZI = new ArrayList();

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLILLLLZI).size();
    }

    public C7FR(Context context) {
        this.LJLIL = context;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C7FS c7fs, int i) {
        C7FS holder = c7fs;
        o.LJIIIZ(holder, "holder");
        C7FT c7ft = (C7FT) ListProtector.get(this.LJLILLLLZI, i);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = c7ft.LIZ;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        holder.LJLIL.setTuxIcon(c2068389v);
        holder.LJLILLLLZI.setText(this.LJLIL.getString(c7ft.LIZIZ));
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(c7ft, 216), holder.itemView);
        C16880lQ.LJJJ(holder.LJLIL, new ACListenerS23S0100000_3(c7ft, 217));
        C16880lQ.LJIJI(holder.LJLILLLLZI, new ACListenerS23S0100000_3(c7ft, 218));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C7FS com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View view = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLIL), R.layout.bfs, parent, false);
        o.LJIIIIZZ(view, "view");
        C7FS c7fs = new C7FS(view);
        C0AX.LIZ(parent, c7fs.itemView, R.id.lj7);
        View view2 = c7fs.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c7fs.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C7FS.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c7fs.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c7fs.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C7FS.class.getName();
        return c7fs;
    }
}
