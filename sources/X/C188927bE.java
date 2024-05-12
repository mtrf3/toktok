package X;

import Y.ACListenerS21S0201000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.7bE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188927bE extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final Context LJLIL;
    public final ArrayList<C188947bG> LJLILLLLZI;
    public int LJLJI;
    public C8L7 LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.size();
    }

    public C188927bE(Context context, ArrayList<C188947bG> arrayList) {
        this.LJLIL = context;
        this.LJLILLLLZI = arrayList;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        if (!(holder instanceof C188937bF)) {
            return;
        }
        C16880lQ.LJIIJ(new ACListenerS21S0201000_3(i, this, holder, 2), holder.itemView);
        C188937bF c188937bF = (C188937bF) holder;
        c188937bF.LJLIL.setText(((C188947bG) ListProtector.get(this.LJLILLLLZI, i)).LJLIL);
        if (((C188947bG) ListProtector.get(this.LJLILLLLZI, i)).LJLILLLLZI) {
            c188937bF.LJLIL.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, this.LJLIL));
            if (i == 0) {
                c188937bF.LJLIL.setBackgroundResource(R.drawable.bn6);
                return;
            } else if (i == getItemCount() - 1) {
                c188937bF.LJLIL.setBackgroundResource(R.drawable.bn7);
                return;
            } else {
                c188937bF.LJLIL.setBackgroundResource(R.drawable.bn5);
                return;
            }
        }
        c188937bF.LJLIL.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dk, this.LJLIL));
        c188937bF.LJLIL.setBackgroundResource(R.drawable.bn4);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View LIZLLL = AnonymousClass030.LIZLLL(this.LJLIL, R.layout.bh2, parent, false, "from(context)\n          …em_layout, parent, false)");
        if (this.LJLJI > 0) {
            LIZLLL.getLayoutParams().height = this.LJLJI / getItemCount();
        }
        C188937bF c188937bF = new C188937bF(LIZLLL);
        C0AX.LIZ(parent, c188937bF.itemView, R.id.lj7);
        View view = c188937bF.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c188937bF.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C188937bF.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c188937bF.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c188937bF.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C188937bF.class.getName();
        return c188937bF;
    }
}
