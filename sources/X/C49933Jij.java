package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.ISearchDebugService;

/* renamed from: X.Jij, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49933Jij extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C49933Jij LJLIL = new C49933Jij();

    public C49933Jij() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        ((ISearchDebugService) ServiceManager.get().getService(ISearchDebugService.class)).LJ();
        return 0;
    }
}
