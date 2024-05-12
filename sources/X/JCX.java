package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JCX extends AbstractC65781Prl implements InterfaceC88472Yns<Aweme, Boolean> {
    public static final JCX LJLIL = new JCX();

    public JCX() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Aweme aweme) {
        Aweme aweme2 = aweme;
        o.LJIIIZ(aweme2, "aweme");
        return Boolean.valueOf(aweme2.isAd());
    }
}
