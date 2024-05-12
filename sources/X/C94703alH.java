package X;

import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;

/* renamed from: X.alH, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94703alH extends AbstractC65781Prl implements InterfaceC65784Pro<IAccountUserService> {
    public static final C94703alH LJLIL = new C94703alH();

    public C94703alH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IAccountUserService invoke() {
        IAccountService LJIJ = AccountService.LJIJ();
        if (LJIJ != null) {
            return LJIJ.LJFF();
        }
        return null;
    }
}
