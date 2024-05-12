package X;

import com.ss.android.ugc.aweme.services.BusinessMainServiceImpl;
import com.ss.android.ugc.aweme.services.IBusinessMainService;

/* renamed from: X.Hlw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45036Hlw extends AbstractC65781Prl implements InterfaceC65784Pro<IBusinessMainService> {
    public static final C45036Hlw LJLIL = new C45036Hlw();

    public C45036Hlw() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IBusinessMainService invoke() {
        return BusinessMainServiceImpl.createIBusinessMainServicebyMonsterPlugin(false);
    }
}
