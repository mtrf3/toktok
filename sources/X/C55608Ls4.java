package X;

import com.ss.android.ugc.aweme.main.assems.BackRefreshStrategyAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.Ls4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55608Ls4 extends AbstractC65781Prl implements InterfaceC88472Yns<C8V6, C76800UCe> {
    public static final C55608Ls4 LJLIL = new C55608Ls4();

    public C55608Ls4() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V6 c8v6) {
        C8V6 assem = c8v6;
        o.LJIIIZ(assem, "$this$assem");
        assem.LJFF = new BackRefreshStrategyAssem();
        return C76800UCe.LIZ;
    }
}
