package X;

import com.ss.android.ugc.aweme.experiment.ProfileThumbnailToFullPageVariant;

/* renamed from: X.81V, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C81V extends AbstractC65781Prl implements InterfaceC65784Pro<ProfileThumbnailToFullPageVariant> {
    public static final C81V LJLIL = new C81V();

    public C81V() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ProfileThumbnailToFullPageVariant invoke() {
        int LIZ = C00F.LIZ(31744, 0, "photo_mode_enable_full_page_from_profile", true);
        if (LIZ != 1) {
            if (LIZ != 2) {
                if (LIZ != 3) {
                    if (LIZ != 4) {
                        return ProfileThumbnailToFullPageVariant.CONTROL;
                    }
                    return ProfileThumbnailToFullPageVariant.TAP_SELF_AND_OTHER_PROFILE;
                }
                return ProfileThumbnailToFullPageVariant.TAP_SELF_AND_OTHER_PROFILE;
            }
            return ProfileThumbnailToFullPageVariant.TAP_OTHER_PROFILE;
        }
        return ProfileThumbnailToFullPageVariant.TAP_OTHER_PROFILE;
    }
}
