package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JCZ extends AbstractC65781Prl implements InterfaceC88472Yns<Aweme, Boolean> {
    public static final JCZ LJLIL = new JCZ();

    public JCZ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Aweme aweme) {
        boolean z;
        Aweme aweme2 = aweme;
        o.LJIIIZ(aweme2, "aweme");
        if (aweme2.getAwemeType() == 58) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
