package X;

import com.ss.android.ugc.aweme.avatar.AvatarImageServiceImpl;
import com.ss.android.ugc.aweme.avatar.ui.p001default.IAvatarImageLoadService;

/* loaded from: classes5.dex */
public final class APS implements IAvatarImageLoadService {
    public static final APS LIZIZ = new APS();
    public final /* synthetic */ IAvatarImageLoadService LIZ;

    @Override // com.ss.android.ugc.aweme.avatar.ui.p001default.IAvatarImageLoadService
    public final APV LIZ(InterfaceC88472Yns<? super APY, C76800UCe> interfaceC88472Yns) {
        return this.LIZ.LIZ(interfaceC88472Yns);
    }

    public APS() {
        IAvatarImageLoadService iAvatarImageLoadService;
        Object LIZ = C58096Mr6.LIZ(IAvatarImageLoadService.class, false);
        if (LIZ != null) {
            iAvatarImageLoadService = (IAvatarImageLoadService) LIZ;
        } else {
            if (C58096Mr6.LLJI == null) {
                synchronized (IAvatarImageLoadService.class) {
                    if (C58096Mr6.LLJI == null) {
                        C58096Mr6.LLJI = new AvatarImageServiceImpl();
                    }
                }
            }
            iAvatarImageLoadService = C58096Mr6.LLJI;
        }
        this.LIZ = iAvatarImageLoadService;
    }
}
