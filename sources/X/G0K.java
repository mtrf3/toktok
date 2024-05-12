package X;

import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.OfferInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.PickYourAdPlanPage;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.ProductInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.PluginService;
import com.ss.android.ugc.aweme.plugin.journey.NewUserJourneyStep;
import com.ss.android.ugc.aweme.plugin.journey.OnboardingFlowData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes7.dex */
public final class G0K extends G0N<C76800UCe, G13> {
    @Override // X.InterfaceC40768FzI
    public final void LIZIZ(ComponentDependencies dependencies) {
        ArrayList arrayList;
        E4G e4g;
        OfferInfo offerInfo;
        ProductInfo productInfo;
        String productId;
        IPluginService.PluginDataWrapper value;
        OnboardingFlowData onboardingFlowData;
        List<NewUserJourneyStep> list;
        o.LJIIIZ(dependencies, "dependencies");
        ActivityC45651qj activityC45651qj = dependencies.LJJLL().invoke().get();
        if (activityC45651qj == null) {
            dependencies.LJJJJI().invoke();
            return;
        }
        Iterator<E4G> it = PluginService.createIPluginServicebyMonsterPlugin(false).getCurrentPluginList().iterator();
        while (true) {
            arrayList = null;
            if (it.hasNext()) {
                e4g = it.next();
                if (e4g.getType() == EnumC35839E4t.ON_BOARDING_FLOW_DATA) {
                    break;
                }
            } else {
                e4g = null;
                break;
            }
        }
        E4G e4g2 = e4g;
        if (e4g2 != null && (value = e4g2.getValue()) != null && (onboardingFlowData = value.onboardingFlowData) != null && (list = onboardingFlowData.steps) != null) {
            arrayList = new ArrayList();
            for (NewUserJourneyStep newUserJourneyStep : list) {
                if (newUserJourneyStep.id == EnumC40761FzB.JOURNEY_SUBSCRIPTION_ID.getId()) {
                    arrayList.add(newUserJourneyStep);
                }
            }
        }
        if (TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId())) {
            dependencies.LJJJJI().invoke();
        }
        IComplianceService LJIIJ = a.LJIIJ();
        PickYourAdPlanPage Gr = dependencies.Gr();
        if (Gr != null) {
            List<OfferInfo> offerInfo2 = Gr.getOfferInfo();
            if (offerInfo2 == null || (offerInfo = (OfferInfo) ListProtector.get(offerInfo2, 1)) == null || (productInfo = offerInfo.getProductInfo()) == null || (productId = productInfo.getProductId()) == null) {
                dependencies.LJJJJI().invoke();
                return;
            } else {
                LJIIJ.LJII(productId, new G0R(LJIIJ, Gr, arrayList, dependencies), activityC45651qj);
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
        }
        dependencies.LJJJJI().invoke();
    }

    @Override // X.InterfaceC40768FzI
    public final Object LIZLLL(ComponentDependencies dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC40768FzI
    public final boolean LJ(ComponentDependencies componentDependencies) {
        if (componentDependencies.Gr() == null || TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId())) {
            return false;
        }
        return a.LJIIJ().LJJI();
    }
}
