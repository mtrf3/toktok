package X;

import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.services.BaseUserService;

/* loaded from: classes11.dex */
public final class N78 extends AbstractC65781Prl implements InterfaceC65784Pro<IUserService> {
    public static final N78 LJLIL = new N78();

    public N78() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IUserService invoke() {
        return BaseUserService.createIUserServicebyMonsterPlugin(false);
    }
}
