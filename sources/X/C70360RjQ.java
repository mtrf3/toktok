package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.RjQ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70360RjQ extends FrameLayout {
    public InstallmentPlan LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final boolean LIZJ() {
        return LIZ(R.id.epi).isSelected();
    }

    public final InstallmentPlan getInstallmentPlan() {
        return this.LJLIL;
    }

    public C70360RjQ(Context context) {
        super(context, null, 0);
        OUP.LJIL(R.layout.a1p, this, true);
    }

    public final void LIZIZ(InstallmentPlan installmentPlan) {
        o.LJIIIZ(installmentPlan, "installmentPlan");
        this.LJLIL = installmentPlan;
        ((TextView) LIZ(R.id.lx7)).setText(installmentPlan.planDescription);
        if (!TextUtils.isEmpty(installmentPlan.extraDescription)) {
            View tvPlanExtraDesc = LIZ(R.id.lx8);
            o.LJIIIIZZ(tvPlanExtraDesc, "tvPlanExtraDesc");
            OUP.LJJLIIIJ(tvPlanExtraDesc);
            ((TextView) LIZ(R.id.lx8)).setText(installmentPlan.extraDescription);
        } else {
            View tvPlanExtraDesc2 = LIZ(R.id.lx8);
            o.LJIIIIZZ(tvPlanExtraDesc2, "tvPlanExtraDesc");
            OUP.LJIJJLI(tvPlanExtraDesc2);
        }
        if (!TextUtils.isEmpty(installmentPlan.promoText)) {
            View tvPromo = LIZ(R.id.lxd);
            o.LJIIIIZZ(tvPromo, "tvPromo");
            OUP.LJJLIIIJ(tvPromo);
            ((TextView) LIZ(R.id.lxd)).setText(installmentPlan.promoText);
        } else {
            View tvPromo2 = LIZ(R.id.lxd);
            o.LJIIIIZZ(tvPromo2, "tvPromo");
            OUP.LJIJJLI(tvPromo2);
        }
        if (!TextUtils.isEmpty(installmentPlan.totalFeeText)) {
            View tvFee = LIZ(R.id.lwh);
            o.LJIIIIZZ(tvFee, "tvFee");
            OUP.LJJLIIIJ(tvFee);
            ((TextView) LIZ(R.id.lwh)).setText(installmentPlan.totalFeeText);
        } else {
            View tvFee2 = LIZ(R.id.lwh);
            o.LJIIIIZZ(tvFee2, "tvFee");
            OUP.LJIJJLI(tvFee2);
        }
        setChecked$ecommerce_transaction_release(false);
    }

    public final void setChecked$ecommerce_transaction_release(boolean z) {
        if (LIZ(R.id.epi).isSelected() == z) {
            return;
        }
        LIZ(R.id.epi).setSelected(z);
    }

    public final void setInstallmentPlan(InstallmentPlan installmentPlan) {
        this.LJLIL = installmentPlan;
    }
}
