package X;

import Y.ACListenerS23S0101000_4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ABQ extends AbstractC029409q<ABR> {
    public final Context LJLIL;
    public final ABS LJLILLLLZI;
    public ArrayList<ABA> LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        ArrayList<ABA> arrayList = this.LJLJI;
        if (arrayList != null) {
            o.LJI(arrayList);
            return arrayList.size();
        }
        return 0;
    }

    public ABQ(Context context, ABS abs) {
        this.LJLIL = context;
        this.LJLILLLLZI = abs;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(ABR abr, int i) {
        ABR holder = abr;
        o.LJIIIZ(holder, "holder");
        if (getItemCount() == 0) {
            return;
        }
        ArrayList<ABA> arrayList = this.LJLJI;
        o.LJI(arrayList);
        Object obj = ListProtector.get(arrayList, i);
        o.LJIIIIZZ(obj, "data!![position]");
        ABA aba = (ABA) obj;
        holder.LJLIL.setText(aba.LIZIZ.LIZIZ());
        if (aba.LIZ) {
            holder.LJLILLLLZI.setVisibility(0);
            holder.LJLILLLLZI.setImageResource(R.drawable.b12);
        } else {
            holder.LJLILLLLZI.setVisibility(8);
        }
        C16880lQ.LJIIJ(new ACListenerS23S0101000_4(i, this, 3), holder.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final ABR com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        ABR abr = new ABR(AnonymousClass030.LIZLLL(this.LJLIL, R.layout.bca, parent, false, "from(mContext).inflate(R…_language, parent, false)"));
        C0AX.LIZ(parent, abr.itemView, R.id.lj7);
        View view = abr.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (abr.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(ABR.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) abr.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(abr.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = ABR.class.getName();
        return abr;
    }
}
