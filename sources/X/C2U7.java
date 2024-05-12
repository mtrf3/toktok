package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.2U7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2U7 extends AbstractC65781Prl implements InterfaceC88472Yns<Aweme, User> {
    public static final C2U7 LJLIL = new C2U7();

    public C2U7() {
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
