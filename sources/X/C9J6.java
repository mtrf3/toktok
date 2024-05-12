package X;

import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileSingleFeatureAssem;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.ProfileAdvancedFeatureSocialAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.9J6, reason: invalid class name */
/* loaded from: classes5.dex */
public final /* synthetic */ class C9J6 extends TBS implements InterfaceC88472Yns<String, C76800UCe> {
    public C9J6(ProfileAdvancedFeatureSocialAssem profileAdvancedFeatureSocialAssem) {
        super(1, profileAdvancedFeatureSocialAssem, ProfileAdvancedFeatureSocialAssem.class, "updateFeatureText", "updateFeatureText(Ljava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        String p0 = str;
        o.LJIIIZ(p0, "p0");
        ((ProfileSingleFeatureAssem) this.receiver).M3(p0);
        return C76800UCe.LIZ;
    }
}
