package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.L6g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53714L6g extends AbstractC65781Prl implements InterfaceC88472Yns<Object, C76800UCe> {
    public static final C53714L6g LJLIL = new C53714L6g();

    public C53714L6g() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Object obj) {
        User user;
        if ((obj instanceof User) && (user = (User) obj) != null) {
            user.roomId = 0L;
        }
        return C76800UCe.LIZ;
    }
}
