package X;

import Y.ACListenerS23S0101000_4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ABU extends AbstractC029409q<ABT> {
    public final Context LJLIL;
    public ArrayList<ABW> LJLILLLLZI;
    public final ABV LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        ArrayList<ABW> arrayList = this.LJLILLLLZI;
        if (arrayList != null) {
            o.LJI(arrayList);
            return arrayList.size();
        }
        return 0;
    }

    public ABU(Context context, ABV abv) {
        this.LJLIL = context;
        this.LJLJI = abv;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(ABT abt, int i) {
        int i2;
        ABT holder = abt;
        o.LJIIIZ(holder, "holder");
        if (getItemCount() == 0) {
            return;
        }
        ArrayList<ABW> arrayList = this.LJLILLLLZI;
        o.LJI(arrayList);
        Object obj = ListProtector.get(arrayList, i);
        o.LJIIIIZZ(obj, "mLanguageItems!![position]");
        ABW abw = (ABW) obj;
        TextView textView = holder.LJLIL;
        String LIZIZ = abw.LIZ.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "i18nItem.showName");
        textView.setText(LIZIZ);
        TuxIconView tuxIconView = holder.LJLILLLLZI;
        if (abw.LIZIZ) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxIconView.setVisibility(i2);
        C16880lQ.LJIIJ(new ACListenerS23S0101000_4(i, this, 4), holder.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final ABT com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        ABT abt = new ABT(AnonymousClass030.LIZLLL(this.LJLIL, R.layout.bf_, parent, false, "from(mContext).inflate(R…_language, parent, false)"));
        C0AX.LIZ(parent, abt.itemView, R.id.lj7);
        View view = abt.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (abt.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(ABT.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) abt.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(abt.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = ABT.class.getName();
        return abt;
    }
}
