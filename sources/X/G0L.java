package X;

import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.OfferInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.PickYourAdPlanPage;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.ProductInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes7.dex */
public final class G0L extends G0C<C40785FzZ> {
    @Override // X.G04
    public final EnumC40761FzB type() {
        return EnumC40761FzB.JOURNEY_SUBSCRIPTION_ID;
    }

    @Override // X.G04
    public final boolean LIZIZ(C35656Dz2 c35656Dz2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("shouldHandle scene:");
        LIZ.append(this.LIZIZ.LIZ.type());
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
        if (c35656Dz2 == null || TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId())) {
            return false;
        }
        return a.LJIIJ().LJJI();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0L(G0D context, G15 flowEngine) {
        super(context, flowEngine);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(flowEngine, "flowEngine");
    }

    @Override // X.G0C, X.G04
    public final void LIZ(G0D context, C35656Dz2 c35656Dz2, InterfaceC88472Yns interfaceC88472Yns) {
        PickYourAdPlanPage pickYourAdPlanPage;
        OfferInfo offerInfo;
        ProductInfo productInfo;
        String productId;
        C40785FzZ c40785FzZ = (C40785FzZ) c35656Dz2;
        o.LJIIIZ(context, "context");
        super.LIZ(context, c40785FzZ, interfaceC88472Yns);
        G0D g0d = this.LIZ;
        InterfaceC40755Fz5 interfaceC40755Fz5 = (InterfaceC40755Fz5) g0d.LJLILLLLZI;
        if (TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId())) {
            LIZLLL();
        }
        IComplianceService LJIIJ = a.LJIIJ();
        if (c40785FzZ != null && (pickYourAdPlanPage = c40785FzZ.LIZIZ) != null) {
            List<OfferInfo> offerInfo2 = pickYourAdPlanPage.getOfferInfo();
            if (offerInfo2 == null || (offerInfo = (OfferInfo) ListProtector.get(offerInfo2, 1)) == null || (productInfo = offerInfo.getProductInfo()) == null || (productId = productInfo.getProductId()) == null) {
                LIZLLL();
                return;
            } else {
                LJIIJ.LJII(productId, new G0X(LJIIJ, pickYourAdPlanPage, interfaceC40755Fz5, g0d, this), interfaceC40755Fz5.LIZ());
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
        }
        LIZLLL();
    }
}
