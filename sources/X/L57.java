package X;

import com.ss.android.ugc.aweme.avatar.AvatarInternalServiceImpl;
import com.ss.android.ugc.aweme.avatar.internalonly.IAvatarInternalService;

/* loaded from: classes10.dex */
public final class L57 implements IAvatarInternalService {
    public static final L57 LIZIZ = new L57();
    public final /* synthetic */ IAvatarInternalService LIZ;

    @Override // com.ss.android.ugc.aweme.avatar.internalonly.IAvatarInternalService
    public final L6A LIZ() {
        return this.LIZ.LIZ();
    }

    public L57() {
        IAvatarInternalService iAvatarInternalService;
        Object LIZ = C58096Mr6.LIZ(IAvatarInternalService.class, false);
        if (LIZ != null) {
            iAvatarInternalService = (IAvatarInternalService) LIZ;
        } else {
            if (C58096Mr6.LLJIJIL == null) {
                synchronized (IAvatarInternalService.class) {
                    if (C58096Mr6.LLJIJIL == null) {
                        C58096Mr6.LLJIJIL = new AvatarInternalServiceImpl();
                    }
                }
            }
            iAvatarInternalService = C58096Mr6.LLJIJIL;
        }
        this.LIZ = iAvatarInternalService;
    }
}
