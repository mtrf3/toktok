package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JXO extends AbstractC65781Prl implements InterfaceC88472Yns<Aweme, Boolean> {
    public static final JXO LJLIL = new JXO();

    public JXO() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Aweme aweme) {
        String str;
        Aweme aweme2 = aweme;
        if (aweme2 != null) {
            str = aweme2.getSearchFeedType();
        } else {
            str = null;
        }
        return Boolean.valueOf(o.LJ(str, "SearchBotFeed"));
    }
}
