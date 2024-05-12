package X;

import com.ss.android.ugc.aweme.notice.api.services.IActivityAdapterService;
import com.ss.android.ugc.aweme.notification.service.ActivityAdapterServiceImp;

/* renamed from: X.L7u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53754L7u implements IActivityAdapterService {
    public static final C53754L7u LIZIZ = new C53754L7u();
    public final /* synthetic */ IActivityAdapterService LIZ;

    @Override // com.ss.android.ugc.aweme.notice.api.services.IActivityAdapterService
    public final void LIZ(ActivityC45651qj activityC45651qj) {
        this.LIZ.LIZ(activityC45651qj);
    }

    public C53754L7u() {
        IActivityAdapterService iActivityAdapterService;
        Object LIZ = C58096Mr6.LIZ(IActivityAdapterService.class, false);
        if (LIZ != null) {
            iActivityAdapterService = (IActivityAdapterService) LIZ;
        } else {
            if (C58096Mr6.q3 == null) {
                synchronized (IActivityAdapterService.class) {
                    if (C58096Mr6.q3 == null) {
                        C58096Mr6.q3 = new ActivityAdapterServiceImp();
                    }
                }
            }
            iActivityAdapterService = C58096Mr6.q3;
        }
        this.LIZ = iActivityAdapterService;
    }
}
