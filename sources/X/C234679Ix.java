package X;

import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.ProfileAdvancedFeatureAddYoursAssem;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.ProfileAdvancedFeatureCollectionsAssem;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.ProfileAdvancedFeatureGetLeadsAssem;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.ProfileAdvancedFeatureLiveEventAssem;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.ProfileAdvancedFeatureOrderCenterAssem;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.ProfileAdvancedFeatureQAAssem;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.ProfileAdvancedFeatureShopAssem;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.ProfileAdvancedFeatureShowcaseAssem;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.ProfileAdvancedFeatureSocialAssem;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.ProfileAdvancedFeatureSubscribeAssem;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.ProfileAdvancedFeatureSupportingAssem;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.ProfileAdvancedFeatureTippingAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.9Ix, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C234679Ix extends AbstractC65781Prl implements InterfaceC88472Yns<C9J8<C9JT>, C76800UCe> {
    public static final C234679Ix LJLIL = new C234679Ix();

    public C234679Ix() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C9J8<C9JT> c9j8) {
        C9J8<C9JT> featureArea = c9j8;
        o.LJIIIZ(featureArea, "$this$featureArea");
        featureArea.LIZ(C9JT.ORDERCENTER, C65352Pkq.LIZ(ProfileAdvancedFeatureOrderCenterAssem.class));
        featureArea.LIZ(C9JT.SHOWCASE, C65352Pkq.LIZ(ProfileAdvancedFeatureShowcaseAssem.class));
        featureArea.LIZ(C9JT.SHOP, C65352Pkq.LIZ(ProfileAdvancedFeatureShopAssem.class));
        featureArea.LIZ(C9JT.LiveEvent, C65352Pkq.LIZ(ProfileAdvancedFeatureLiveEventAssem.class));
        featureArea.LIZ(C9JT.SOCIAL, C65352Pkq.LIZ(ProfileAdvancedFeatureSocialAssem.class));
        featureArea.LIZ(C9JT.QA, C65352Pkq.LIZ(ProfileAdvancedFeatureQAAssem.class));
        featureArea.LIZ(C9JT.SUBSCRIBE, C65352Pkq.LIZ(ProfileAdvancedFeatureSubscribeAssem.class));
        featureArea.LIZ(C9JT.ADDYOURS, C65352Pkq.LIZ(ProfileAdvancedFeatureAddYoursAssem.class));
        featureArea.LIZ(C9JT.GetLeads, C65352Pkq.LIZ(ProfileAdvancedFeatureGetLeadsAssem.class));
        featureArea.LIZ(C9JT.Supporting, C65352Pkq.LIZ(ProfileAdvancedFeatureSupportingAssem.class));
        featureArea.LIZ(C9JT.Tipping, C65352Pkq.LIZ(ProfileAdvancedFeatureTippingAssem.class));
        featureArea.LIZ(C9JT.COLLECTIONS, C65352Pkq.LIZ(ProfileAdvancedFeatureCollectionsAssem.class));
        return C76800UCe.LIZ;
    }
}
