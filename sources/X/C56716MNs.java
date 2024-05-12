package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.inbox.service.IInboxService;
import com.ss.android.ugc.aweme.inbox.service.InboxServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.MNs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56716MNs implements IInboxService {
    public static final C56716MNs LIZIZ = new C56716MNs();
    public final /* synthetic */ IInboxService LIZ;

    @Override // com.ss.android.ugc.aweme.inbox.service.IInboxService
    public final String LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.inbox.service.IInboxService
    public final View LIZIZ(ViewGroup parent, boolean z) {
        o.LJIIIZ(parent, "parent");
        return this.LIZ.LIZIZ(parent, z);
    }

    public C56716MNs() {
        IInboxService iInboxService;
        Object LIZ = C58096Mr6.LIZ(IInboxService.class, false);
        if (LIZ != null) {
            iInboxService = (IInboxService) LIZ;
        } else {
            if (C58096Mr6.t1 == null) {
                synchronized (IInboxService.class) {
                    if (C58096Mr6.t1 == null) {
                        C58096Mr6.t1 = new InboxServiceImpl();
                    }
                }
            }
            iInboxService = C58096Mr6.t1;
        }
        this.LIZ = iInboxService;
    }
}
