package X;

import Y.ACListenerS28S0101000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ojb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62727Ojb extends AbstractC029409q<AbstractC62728Ojc> {
    public final C78963Uyt LJLIL = new C78963Uyt();
    public final ArrayList<InterfaceC62733Ojh> LJLILLLLZI;
    public final InterfaceC62734Oji LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.size();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return ((InterfaceC62733Ojh) ListProtector.get(this.LJLILLLLZI, i)).LIZ(this.LJLIL);
    }

    public C62727Ojb(ArrayList arrayList, C62527OgN c62527OgN) {
        this.LJLILLLLZI = arrayList;
        this.LJLJI = c62527OgN;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(AbstractC62728Ojc abstractC62728Ojc, int i) {
        AbstractC62728Ojc holder = abstractC62728Ojc;
        o.LJIIIZ(holder, "holder");
        C16880lQ.LJIIJ(new ACListenerS28S0101000_10(i, this, 3), holder.itemView);
        Object obj = ListProtector.get(this.LJLILLLLZI, i);
        o.LJIIIIZZ(obj, "models[position]");
        holder.L((InterfaceC62733Ojh) obj);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final AbstractC62728Ojc com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        AbstractC62728Ojc c62732Ojg;
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        View inflate = View.inflate(context, i, null);
        o.LJIIIIZZ(inflate, "View.inflate(context, viewType, null)");
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.LJLIL.getClass();
        if (i == R.layout.bm_) {
            c62732Ojg = new C62731Ojf(inflate);
        } else if (i == R.layout.bm8) {
            c62732Ojg = new C62729Ojd(inflate);
        } else if (i == R.layout.bm9) {
            c62732Ojg = new C62730Oje(inflate);
        } else {
            c62732Ojg = new C62732Ojg(inflate);
        }
        C0AX.LIZ(parent, c62732Ojg.itemView, R.id.lj7);
        View view = c62732Ojg.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c62732Ojg.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c62732Ojg.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c62732Ojg.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c62732Ojg.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c62732Ojg.getClass().getName();
        return c62732Ojg;
    }
}
