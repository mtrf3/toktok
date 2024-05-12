package X;

import Y.ACListenerS23S0201000_5;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS175S0200000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BFO extends AbstractC029409q<BFP> {
    public final List<Bitmap> LJLIL;
    public final InterfaceC88471Ynr<Bitmap, Integer, C76800UCe> LJLILLLLZI;
    public final LayoutInflater LJLJI;
    public int LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(BFP bfp, int i) {
        int i2;
        BFP holder = bfp;
        o.LJIIIZ(holder, "holder");
        holder.LJLIL.setImageBitmap((Bitmap) ListProtector.get(this.LJLIL, i));
        View view = holder.LJLILLLLZI;
        if (i == this.LJLJJI) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        C16880lQ.LJIILLIIL(holder.LJLIL, new ACListenerS23S0201000_5(i, this, holder, 0));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final BFP com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(this.LJLJI, R.layout.brc, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(\n      …         false,\n        )");
        BFP bfp = new BFP(LLLLIILL);
        C0AX.LIZ(parent, bfp.itemView, R.id.lj7);
        View view = bfp.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (bfp.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(BFP.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) bfp.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(bfp.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = BFP.class.getName();
        return bfp;
    }

    public BFO(Context context, List data, AqS175S0200000_13 aqS175S0200000_13) {
        o.LJIIIZ(data, "data");
        this.LJLIL = data;
        this.LJLILLLLZI = aqS175S0200000_13;
        this.LJLJI = C16880lQ.LLZIL(context);
    }
}
