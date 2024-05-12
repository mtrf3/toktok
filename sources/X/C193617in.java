package X;

import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.nows.service.ProfileNowsServiceImpl;
import com.ss.android.ugc.aweme.service.IProfileNowsService;
import kotlin.jvm.internal.o;

/* renamed from: X.7in, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193617in implements IProfileNowsService {
    public static final C193617in LIZIZ = new C193617in();
    public final /* synthetic */ IProfileNowsService LIZ;

    @Override // com.ss.android.ugc.aweme.service.IProfileNowsService
    public final AbstractC73672Svk<Aweme> LIZ(String uid) {
        o.LJIIIZ(uid, "uid");
        return this.LIZ.LIZ(uid);
    }

    @Override // com.ss.android.ugc.aweme.service.IProfileNowsService
    public final ShareInfo getPersonInviteShareInfo() {
        return this.LIZ.getPersonInviteShareInfo();
    }

    public C193617in() {
        IProfileNowsService iProfileNowsService;
        Object LIZ = C58096Mr6.LIZ(IProfileNowsService.class, false);
        if (LIZ != null) {
            iProfileNowsService = (IProfileNowsService) LIZ;
        } else {
            if (C58096Mr6.G3 == null) {
                synchronized (IProfileNowsService.class) {
                    if (C58096Mr6.G3 == null) {
                        C58096Mr6.G3 = new ProfileNowsServiceImpl();
                    }
                }
            }
            iProfileNowsService = C58096Mr6.G3;
        }
        this.LIZ = iProfileNowsService;
    }
}
