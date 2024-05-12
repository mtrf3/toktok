package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.IDqS5S0201000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.adz, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94251adz extends AbstractC029409q<C94250ady> {
    public InterfaceC93786aWU LJLIL;
    public final Context LJLILLLLZI;
    public final List<C94252ae0> LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJI.size();
    }

    public C94251adz(Context context, List<C94252ae0> dataList) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dataList, "dataList");
        this.LJLILLLLZI = context;
        this.LJLJI = dataList;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C94250ady c94250ady, int i) {
        C94250ady holder = c94250ady;
        o.LJIIIZ(holder, "holder");
        C94252ae0 c94252ae0 = (C94252ae0) ListProtector.get(this.LJLJI, i);
        String str = c94252ae0.LJLIL;
        if (str != null) {
            TextView textView = holder.LJLIL;
            o.LJIIIIZZ(textView, "holder.functionName");
            textView.setText(str);
            C93729aVZ.LJI(holder.LJLIL);
        } else {
            C93729aVZ.LIZJ(holder.LJLIL);
        }
        Integer num = c94252ae0.LJLILLLLZI;
        if (num != null) {
            holder.LJLILLLLZI.setImageDrawable(this.LJLILLLLZI.getDrawable(num.intValue()));
            C93729aVZ.LJI(holder.LJLILLLLZI);
        } else {
            C93729aVZ.LIZJ(holder.LJLILLLLZI);
        }
        if (i == this.LJLJI.size() - 1) {
            C93729aVZ.LIZLLL(holder.LJLJI);
        } else {
            C93729aVZ.LJI(holder.LJLJI);
        }
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        C93750aVu.LIZIZ(view, new IDqS5S0201000_42(this, c94252ae0, i, 2));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C94250ady com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View itemView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.dvx, parent, false);
        o.LJIIIIZZ(itemView, "itemView");
        C94250ady c94250ady = new C94250ady(itemView);
        c94250ady.itemView.setTag(R.id.lj7, Integer.valueOf(parent.hashCode()));
        View view = c94250ady.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c94250ady.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C94250ady.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c94250ady.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c94250ady.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C94250ady.class.getName();
        return c94250ady;
    }
}
