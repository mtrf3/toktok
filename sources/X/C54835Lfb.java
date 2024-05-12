package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.Lfb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54835Lfb extends AbstractC65781Prl implements InterfaceC88472Yns<Aweme, User> {
    public static final C54835Lfb LJLIL = new C54835Lfb();

    public C54835Lfb() {
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
