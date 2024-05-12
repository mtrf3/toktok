package X;

import com.ss.android.ugc.aweme.relation.avatar.FollowAvatarServiceImpl;
import com.ss.android.ugc.aweme.relation.spi.IFollowAvatarService;

/* renamed from: X.KzR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53517KzR implements IFollowAvatarService {
    public static final C53517KzR LIZIZ = new C53517KzR();
    public final /* synthetic */ IFollowAvatarService LIZ;

    @Override // com.ss.android.ugc.aweme.relation.spi.IFollowAvatarService
    public final AbstractC53585L1h<?, ?> LIZ() {
        return this.LIZ.LIZ();
    }

    public C53517KzR() {
        IFollowAvatarService iFollowAvatarService;
        Object LIZ = C58096Mr6.LIZ(IFollowAvatarService.class, false);
        if (LIZ != null) {
            iFollowAvatarService = (IFollowAvatarService) LIZ;
        } else {
            if (C58096Mr6.s4 == null) {
                synchronized (IFollowAvatarService.class) {
                    if (C58096Mr6.s4 == null) {
                        C58096Mr6.s4 = new FollowAvatarServiceImpl();
                    }
                }
            }
            iFollowAvatarService = C58096Mr6.s4;
        }
        this.LIZ = iFollowAvatarService;
    }
}
