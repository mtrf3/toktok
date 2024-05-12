package X;

import com.bytedance.ies.uikit.base.AbsFragment;
import com.ss.android.ugc.aweme.notification.creator.service.INotificationFragmentService;
import com.ss.android.ugc.aweme.notification.creator.service.NotificationFragmentServiceImpl;

/* loaded from: classes5.dex */
public final class AXK implements INotificationFragmentService {
    public static final AXK LIZIZ = new AXK();
    public final /* synthetic */ INotificationFragmentService LIZ;

    @Override // com.ss.android.ugc.aweme.notification.creator.service.INotificationFragmentService
    public final AbsFragment LIZ() {
        return this.LIZ.LIZ();
    }

    public AXK() {
        INotificationFragmentService iNotificationFragmentService;
        Object LIZ = C58096Mr6.LIZ(INotificationFragmentService.class, false);
        if (LIZ != null) {
            iNotificationFragmentService = (INotificationFragmentService) LIZ;
        } else {
            if (C58096Mr6.p3 == null) {
                synchronized (INotificationFragmentService.class) {
                    if (C58096Mr6.p3 == null) {
                        C58096Mr6.p3 = new NotificationFragmentServiceImpl();
                    }
                }
            }
            iNotificationFragmentService = C58096Mr6.p3;
        }
        this.LIZ = iNotificationFragmentService;
    }
}
