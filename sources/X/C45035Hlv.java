package X;

import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;

/* renamed from: X.Hlv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45035Hlv extends AbstractC65781Prl implements InterfaceC65784Pro<IMainService> {
    public static final C45035Hlv LJLIL = new C45035Hlv();

    public C45035Hlv() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IMainService invoke() {
        return MainServiceImpl.createIMainServicebyMonsterPlugin(false);
    }
}
