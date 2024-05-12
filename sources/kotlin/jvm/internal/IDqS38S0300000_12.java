package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C36636EZk;
import X.C70074Reo;
import X.C70122Rfa;
import X.C76800UCe;
import X.C78565UsT;
import X.InterfaceC88473Ynt;
import X.XKX;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.bundledeal.PdpBundleDealVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfo;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.utils.PdpButtonActionHelper;

/* loaded from: classes13.dex */
public class IDqS38S0300000_12 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS38S0300000_12(PdpBundleDealVH pdpBundleDealVH, BundleInfo bundleInfo, View view, int i) {
        super(3);
        this.$t = i;
        this.l0 = pdpBundleDealVH;
        this.l1 = bundleInfo;
        this.l2 = view;
    }

    public static final Object invoke$0(IDqS38S0300000_12 iDqS38S0300000_12, Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        String toastMsg = (String) obj2;
        o.LJIIIZ(toastMsg, "toastMsg");
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope((PdpBundleDealVH) iDqS38S0300000_12.l0), C36636EZk.LIZ, null, new C70122Rfa((PdpBundleDealVH) iDqS38S0300000_12.l0, (BundleInfo) iDqS38S0300000_12.l1, obj3, intValue, (View) iDqS38S0300000_12.l2, toastMsg, null), 2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS38S0300000_12 iDqS38S0300000_12, Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String toastMsg = (String) obj2;
        o.LJIIIZ(toastMsg, "toastMsg");
        PdpButtonActionHelper pdpButtonActionHelper = (PdpButtonActionHelper) iDqS38S0300000_12.l0;
        C78565UsT.LJJIJ(pdpButtonActionHelper.LJLIL, C36636EZk.LIZ, new C70074Reo(booleanValue, (View) iDqS38S0300000_12.l1, toastMsg, pdpButtonActionHelper, (Context) iDqS38S0300000_12.l2, obj3, null));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS38S0300000_12(PdpButtonActionHelper pdpButtonActionHelper, View view, Context context, int i) {
        super(3);
        this.$t = i;
        this.l0 = pdpButtonActionHelper;
        this.l1 = view;
        this.l2 = context;
    }
}
