package X;

import com.ss.android.ugc.aweme.AccountService;

/* renamed from: X.3AV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3AV extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C3AV LJLIL = new C3AV();

    public C3AV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(AccountService.LJIJ().LJFF().isLogin());
    }
}
