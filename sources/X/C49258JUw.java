package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.JUw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49258JUw extends AbstractC65781Prl implements InterfaceC88472Yns<Aweme, String> {
    public static final C49258JUw LJLIL = new C49258JUw();

    public C49258JUw() {
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
