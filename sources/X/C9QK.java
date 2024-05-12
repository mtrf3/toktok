package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.editprofile.pronouns.api.ProfileEditPronounsParams;
import kotlin.jvm.internal.o;

/* renamed from: X.9QK, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9QK extends AbstractC65781Prl implements InterfaceC65784Pro<ProfileEditPronounsParams> {
    public static final C9QK LJLIL = new C9QK();

    public C9QK() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final ProfileEditPronounsParams invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        ProfileEditPronounsParams profileEditPronounsParams = C9QJ.LIZIZ;
        Object LJIIIIZZ = LIZLLL.LJIIIIZZ("profile_pronouns_config", ProfileEditPronounsParams.class, profileEditPronounsParams);
        if (LJIIIIZZ == 0) {
            C9QJ.LIZ.getClass();
        } else {
            profileEditPronounsParams = LJIIIIZZ;
        }
        o.LJIIIIZZ(profileEditPronounsParams, "SettingsManager.getInsta…a)\n            ?: DEFAULT");
        return profileEditPronounsParams;
    }
}
