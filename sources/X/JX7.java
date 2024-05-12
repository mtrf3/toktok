package X;

import com.ss.android.ugc.aweme.userservice.UserService;
import com.ss.android.ugc.aweme.userservice.api.IUserService;

/* loaded from: classes9.dex */
public final class JX7 extends AbstractC65781Prl implements InterfaceC65784Pro<IUserService> {
    public static final JX7 LJLIL = new JX7();

    public JX7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IUserService invoke() {
        return UserService.LIZ();
    }
}
