package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.JGy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48896JGy extends AbstractC65781Prl implements InterfaceC88472Yns<Aweme, String> {
    public static final C48896JGy LJLIL = new C48896JGy();

    public C48896JGy() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(Aweme aweme) {
        String aid;
        Aweme aweme2 = aweme;
        if (aweme2 == null || (aid = aweme2.getAid()) == null) {
            return "";
        }
        return aid;
    }
}
