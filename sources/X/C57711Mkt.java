package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Mkt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57711Mkt extends AbstractC65781Prl implements InterfaceC88472Yns<Aweme, InterfaceC57784Mm4> {
    public static final C57711Mkt LJLIL = new C57711Mkt();

    public C57711Mkt() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC57784Mm4 invoke(Aweme aweme) {
        Aweme aweme2 = aweme;
        o.LJIIIZ(aweme2, "aweme");
        return new C57712Mku(aweme2);
    }
}
