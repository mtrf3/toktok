package X;

import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;

/* renamed from: X.FeF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39463FeF extends AbstractC65781Prl implements InterfaceC65784Pro<IMainService> {
    public static final C39463FeF LJLIL = new C39463FeF();

    public C39463FeF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IMainService invoke() {
        return MainServiceImpl.createIMainServicebyMonsterPlugin(false);
    }
}
