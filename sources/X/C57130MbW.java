package X;

import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;

/* renamed from: X.MbW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57130MbW extends AbstractC65781Prl implements InterfaceC65784Pro<IAccountUserService> {
    public static final C57130MbW LJLIL = new C57130MbW();

    public C57130MbW() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IAccountUserService invoke() {
        return AccountService.LJIJ().LJFF();
    }
}
