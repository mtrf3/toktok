package X;

import Y.AfS64S0100000_12;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.strategy.SkuPanelFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Rj9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70343Rj9 {
    public final SkuPanelStarter.SkuEnterParams LIZ;
    public final Context LIZIZ;
    public final FragmentManager LIZJ;
    public final Bundle LIZLLL;
    public final Integer LJ;
    public final Integer LJFF;
    public final String LJI;
    public DialogC136315Wp LJII;

    public final void LIZ() {
        Context context = this.LIZIZ;
        FragmentManager preFragmentManager = this.LIZJ;
        Bundle extras = this.LIZLLL;
        Integer num = this.LJ;
        Integer num2 = this.LJFF;
        String str = this.LJI;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(preFragmentManager, "preFragmentManager");
        o.LJIIIZ(extras, "extras");
        if (str != null) {
            int value = EnumC70126Rfe.SKC.getValue();
            if (num2 == null || num2.intValue() != value) {
                SkuPanelFragment skuPanelFragment = new SkuPanelFragment();
                skuPanelFragment.LJLIL = num;
                skuPanelFragment.setArguments(extras);
                skuPanelFragment.show(preFragmentManager, "SkuPanelFragment");
            } else {
                MiniPdpPanelFragment miniPdpPanelFragment = new MiniPdpPanelFragment();
                miniPdpPanelFragment.LJLIL = num;
                miniPdpPanelFragment.setArguments(extras);
                miniPdpPanelFragment.show(preFragmentManager, "SkuPanelFragment");
            }
        }
        LIZIZ();
    }

    public final void LIZIZ() {
        Context context = this.LIZIZ;
        DialogC136315Wp dialogC136315Wp = this.LJII;
        if (dialogC136315Wp != null && dialogC136315Wp.isShowing() && LJ(context)) {
            try {
                DialogC136315Wp dialogC136315Wp2 = this.LJII;
                if (dialogC136315Wp2 != null) {
                    dialogC136315Wp2.dismiss();
                }
            } catch (Throwable unused) {
            }
        }
        this.LJII = null;
    }

    public final void LIZLLL() {
        DialogC136315Wp dialogC136315Wp;
        DialogC136315Wp dialogC136315Wp2;
        DialogC136315Wp dialogC136315Wp3;
        if (this.LIZ.getNeedRequest()) {
            Integer skuType = this.LIZ.getSkuType();
            int value = EnumC70126Rfe.SKC.getValue();
            if (skuType != null && skuType.intValue() == value && C70031Re7.LIZ(this.LIZ.getProductId()) == null) {
                Context context = this.LIZIZ;
                if ((this.LJII == null || !LJ(context) || (dialogC136315Wp3 = this.LJII) == null || !dialogC136315Wp3.isShowing()) && context != null) {
                    DialogC136315Wp dialogC136315Wp4 = new DialogC136315Wp(context);
                    this.LJII = dialogC136315Wp4;
                    Window window = dialogC136315Wp4.getWindow();
                    if (window != null) {
                        window.addFlags(8);
                    }
                    if (LJ(context) && (dialogC136315Wp = this.LJII) != null && !dialogC136315Wp.isShowing() && (dialogC136315Wp2 = this.LJII) != null && !new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/ecommerce/core/view/PdpLoadingDialog", "show", dialogC136315Wp2, new Object[0], "void", new C65300Pk0(false, "()V", "-8629921026280710323")).LIZ) {
                        dialogC136315Wp2.show();
                    }
                }
                if (this.LIZ.getProductId() == null) {
                    LIZJ(this.LIZIZ, new C70042ReI(Integer.valueOf(R.string.r_z), 1));
                    return;
                }
                if (this.LIZ.getNeedRequest()) {
                    InterfaceC70070Rek.LJJLIIIJLJLI.getClass();
                    C69991RdT.LIZ(C69995RdX.LJLILLLLZI, SkuPanelStarter.LIZIZ(this.LIZ), false, 0, true, Boolean.TRUE, null, 32).LIZJ.LJJJLIIL(new AfS64S0100000_12(this, 0), new AfS64S0100000_12(this, 1));
                }
                C70307RiZ.LIZ(this.LIZ);
                return;
            }
        }
        LIZ();
    }

    public static boolean LJ(Context context) {
        Activity LJIJJ;
        if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null && !LJIJJ.isFinishing()) {
            return true;
        }
        return false;
    }

    public static void LIZJ(Context context, C70042ReI c70042ReI) {
        String str = c70042ReI.LIZ;
        if ((str == null || str.length() == 0) && c70042ReI.LIZIZ == null) {
            return;
        }
        String str2 = c70042ReI.LIZ;
        if (str2 == null) {
            Integer num = c70042ReI.LIZIZ;
            if (num != null) {
                int intValue = num.intValue();
                Resources resources = context.getResources();
                if (resources != null) {
                    str2 = resources.getString(intValue);
                }
            }
            str2 = null;
        }
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            C26048AKe c26048AKe = new C26048AKe(LJIJJ);
            c26048AKe.LJI(str2);
            c26048AKe.LJII();
        }
    }

    public C70343Rj9(SkuPanelStarter.SkuEnterParams skuEnterParams, Context context, FragmentManager fragmentManager, Bundle bundle, Integer num, Integer num2, String str) {
        o.LJIIIZ(context, "context");
        this.LIZ = skuEnterParams;
        this.LIZIZ = context;
        this.LIZJ = fragmentManager;
        this.LIZLLL = bundle;
        this.LJ = num;
        this.LJFF = num2;
        this.LJI = str;
    }
}
