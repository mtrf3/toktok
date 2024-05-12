package X;

import com.ss.android.ugc.aweme.service.ISocInteractionAvatarService;
import com.ss.android.ugc.aweme.service.SocInteractionAvatarServiceImpl;

/* renamed from: X.KzS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53518KzS implements ISocInteractionAvatarService {
    public static final C53518KzS LIZIZ = new C53518KzS();
    public final /* synthetic */ ISocInteractionAvatarService LIZ;

    @Override // com.ss.android.ugc.aweme.service.ISocInteractionAvatarService
    public final AbstractC53585L1h<?, ?> LIZ() {
        return this.LIZ.LIZ();
    }

    public C53518KzS() {
        ISocInteractionAvatarService iSocInteractionAvatarService;
        Object LIZ = C58096Mr6.LIZ(ISocInteractionAvatarService.class, false);
        if (LIZ != null) {
            iSocInteractionAvatarService = (ISocInteractionAvatarService) LIZ;
        } else {
            if (C58096Mr6.j5 == null) {
                synchronized (ISocInteractionAvatarService.class) {
                    if (C58096Mr6.j5 == null) {
                        C58096Mr6.j5 = new SocInteractionAvatarServiceImpl();
                    }
                }
            }
            iSocInteractionAvatarService = C58096Mr6.j5;
        }
        this.LIZ = iSocInteractionAvatarService;
    }
}
