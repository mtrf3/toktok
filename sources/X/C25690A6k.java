package X;

import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.services.BaseUserService;

/* renamed from: X.A6k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25690A6k extends AbstractC65781Prl implements InterfaceC65784Pro<IUserService> {
    public static final C25690A6k LJLIL = new C25690A6k();

    public C25690A6k() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IUserService invoke() {
        return BaseUserService.createIUserServicebyMonsterPlugin(false);
    }
}
