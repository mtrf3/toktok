package X;

import com.ss.android.ugc.aweme.inbox.api.IInboxMobEventService;
import com.ss.android.ugc.aweme.inbox.service.InboxMobEventServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.LsV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55635LsV extends AbstractC65781Prl implements InterfaceC88472Yns<C8V6, C76800UCe> {
    public static final C55635LsV LJLIL = new C55635LsV();

    public C55635LsV() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V6 c8v6) {
        IInboxMobEventService iInboxMobEventService;
        C8V6 assem = c8v6;
        o.LJIIIZ(assem, "$this$assem");
        Object LIZ = C58096Mr6.LIZ(IInboxMobEventService.class, false);
        if (LIZ != null) {
            iInboxMobEventService = (IInboxMobEventService) LIZ;
        } else {
            if (C58096Mr6.s1 == null) {
                synchronized (IInboxMobEventService.class) {
                    if (C58096Mr6.s1 == null) {
                        C58096Mr6.s1 = new InboxMobEventServiceImpl();
                    }
                }
            }
            iInboxMobEventService = C58096Mr6.s1;
        }
        assem.LJFF = iInboxMobEventService.LIZ();
        return C76800UCe.LIZ;
    }
}
