package X;

import Y.IDCListenerS142S0200000_4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.AEa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25888AEa extends AbstractC029409q<C25889AEb> {
    public final Context LJLIL;
    public final List<C25890AEc> LJLILLLLZI = new ArrayList();

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        return i;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLILLLLZI).size();
    }

    public C25888AEa(ActivityC45651qj activityC45651qj) {
        this.LJLIL = activityC45651qj;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C25889AEb c25889AEb, int i) {
        C25889AEb holder = c25889AEb;
        o.LJIIIZ(holder, "holder");
        C25890AEc c25890AEc = (C25890AEc) ListProtector.get(this.LJLILLLLZI, i);
        holder.LJLIL.setTitle(c25890AEc.LIZJ);
        View findViewById = holder.LJLIL.findViewById(R.id.b86);
        o.LJIIIIZZ(findViewById, "holder.tuxCell.findViewB…out>(R.id.cell_container)");
        C26338AVi.LJIIIZ(findViewById, 0, null, 0, null, 26);
        if (C78685UuP.LJJJZ(c25890AEc.LIZ)) {
            holder.LJLIL.setIcon(new AqS167S0100000_1(c25890AEc, 302));
        } else if (c25890AEc.LIZIZ != null) {
            AI8 ai8 = holder.LJLIL;
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = c25890AEc.LIZIZ.intValue();
            c2068389v.LIZIZ = C7MY.LIZIZ(20);
            c2068389v.LIZJ = C7MY.LIZIZ(20);
            ai8.setIcon(c2068389v);
        }
        AI8 ai82 = holder.LJLIL;
        AI1 ai1 = new AI1(this.LJLIL);
        CompoundButton compoundButton = ai1.LIZIZ.LIZ;
        if (compoundButton instanceof C71897SJp) {
            ((C71897SJp) compoundButton).setShape(1);
        }
        ai1.LJIILIIL(false);
        ai1.LJIILL(new IDCListenerS142S0200000_4(c25890AEc, ai1, 4));
        ai82.setAccessory(ai1);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C25889AEb com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View view = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLIL), R.layout.bfu, parent, false);
        o.LJIIIIZZ(view, "view");
        C25889AEb c25889AEb = new C25889AEb(view);
        C0AX.LIZ(parent, c25889AEb.itemView, R.id.lj7);
        View view2 = c25889AEb.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c25889AEb.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C25889AEb.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c25889AEb.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c25889AEb.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C25889AEb.class.getName();
        return c25889AEb;
    }
}
