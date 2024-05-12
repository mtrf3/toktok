package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3de, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88503de extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final List<InterfaceC73202u4> LJLIL;
    public final InterfaceC88543di LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        Object obj = ListProtector.get(this.LJLIL, i);
        if (obj instanceof C73192u3) {
            return 1;
        }
        if (obj instanceof C73182u2) {
            return 2;
        }
        if (obj instanceof C73212u5) {
            return 0;
        }
        throw new C162476Zf();
    }

    public C88503de(List dataSet, C3P9 c3p9) {
        o.LJIIIZ(dataSet, "dataSet");
        this.LJLIL = dataSet;
        this.LJLILLLLZI = c3p9;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00fb  */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r15, int r16) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88503de.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder c88513df;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    c88513df = new C88523dg(C1FL.LIZIZ(parent, R.layout.b6a, parent, false, "from(parent.context)\n   …t_sticker, parent, false)"));
                } else {
                    "viewType is unknown".toString();
                    throw new IllegalStateException("viewType is unknown");
                }
            } else {
                c88513df = new C88533dh(C1FL.LIZIZ(parent, R.layout.b6c, parent, false, "from(parent.context)\n   …o_sticker, parent, false)"));
            }
        } else {
            c88513df = new C88513df(C1FL.LIZIZ(parent, R.layout.b6b, parent, false, "from(parent.context)\n   …r_seemore, parent, false)"));
        }
        C0AX.LIZ(parent, c88513df.itemView, R.id.lj7);
        View view = c88513df.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c88513df.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c88513df.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c88513df.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c88513df.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c88513df.getClass().getName();
        return c88513df;
    }
}
