package X;

import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileSingleFeatureAssem;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.ProfileAdvancedFeatureSocialAssem;

/* renamed from: X.9J0, reason: invalid class name */
/* loaded from: classes5.dex */
public final /* synthetic */ class C9J0 extends TBS implements InterfaceC88472Yns<Integer, C76800UCe> {
    public C9J0(ProfileAdvancedFeatureSocialAssem profileAdvancedFeatureSocialAssem) {
        super(1, profileAdvancedFeatureSocialAssem, ProfileAdvancedFeatureSocialAssem.class, "updateFeatureIconByID", "updateFeatureIconByID(I)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Integer num) {
        int intValue = num.intValue();
        ProfileSingleFeatureAssem profileSingleFeatureAssem = (ProfileSingleFeatureAssem) this.receiver;
        profileSingleFeatureAssem.H3().Dd(intValue, profileSingleFeatureAssem.x3());
        return C76800UCe.LIZ;
    }
}
