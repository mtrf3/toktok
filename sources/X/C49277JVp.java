package X;

import com.ss.android.ugc.aweme.userservice.UserService;
import com.ss.android.ugc.aweme.userservice.api.IUserService;

/* renamed from: X.JVp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49277JVp extends AbstractC65781Prl implements InterfaceC65784Pro<IUserService> {
    public static final C49277JVp LJLIL = new C49277JVp();

    public C49277JVp() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IUserService invoke() {
        return UserService.LIZ();
    }
}
