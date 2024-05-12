package X;

import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;

/* loaded from: classes10.dex */
public final class M5D extends AbstractC65781Prl implements InterfaceC65784Pro<IProfileService> {
    public static final M5D LJLIL = new M5D();

    public M5D() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IProfileService invoke() {
        return ProfileServiceImpl.LIZ();
    }
}
