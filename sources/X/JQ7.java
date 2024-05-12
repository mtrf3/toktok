package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes9.dex */
public final class JQ7 extends AbstractC65781Prl implements InterfaceC88472Yns<Aweme, String> {
    public static final JQ7 LJLIL = new JQ7();

    public JQ7() {
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
