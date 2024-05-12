package X;

import Y.ACListenerS39S0200000_4;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.ProfileAdvancedFeatureSocialAssem;
import java.util.LinkedHashMap;

/* renamed from: X.9It, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C234639It extends AbstractC65781Prl implements InterfaceC88472Yns<C43I<? extends User>, C76800UCe> {
    public final /* synthetic */ ProfileAdvancedFeatureSocialAssem LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C234639It(ProfileAdvancedFeatureSocialAssem profileAdvancedFeatureSocialAssem) {
        super(1);
        this.LJLIL = profileAdvancedFeatureSocialAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C43I<? extends User> c43i) {
        User user;
        C43I<? extends User> c43i2 = c43i;
        if (c43i2 != null && (user = (User) c43i2.LIZ) != null) {
            ProfileAdvancedFeatureSocialAssem profileAdvancedFeatureSocialAssem = this.LJLIL;
            if (!user.isBlock) {
                if (C46104I7o.LJJJJL(user, profileAdvancedFeatureSocialAssem.K3())) {
                    java.util.Map<Integer, C243819hZ> LIZJ = C243799hX.LIZJ(user);
                    profileAdvancedFeatureSocialAssem.LJLJL = LIZJ;
                    C243799hX.LJII(((LinkedHashMap) LIZJ).keySet(), new C9J0(profileAdvancedFeatureSocialAssem), new C9J6(profileAdvancedFeatureSocialAssem));
                    profileAdvancedFeatureSocialAssem.L3(new ACListenerS39S0200000_4(user, profileAdvancedFeatureSocialAssem, 28));
                    profileAdvancedFeatureSocialAssem.requestShow();
                    C17J.LJIIZILJ(profileAdvancedFeatureSocialAssem, profileAdvancedFeatureSocialAssem.K3(), C9IL.INTERACTION, profileAdvancedFeatureSocialAssem.F3());
                } else {
                    profileAdvancedFeatureSocialAssem.requestHide();
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
