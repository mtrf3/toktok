package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.Lbv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54607Lbv extends AbstractC65781Prl implements InterfaceC88472Yns<Aweme, User> {
    public static final C54607Lbv LJLIL = new C54607Lbv();

    public C54607Lbv() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final User invoke(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (aweme2 != null) {
            return aweme2.getAuthor();
        }
        return null;
    }
}
