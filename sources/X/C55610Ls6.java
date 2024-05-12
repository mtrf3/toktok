package X;

import com.ss.android.ugc.aweme.main.assems.MainLegacyEventBusAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.Ls6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55610Ls6 extends AbstractC65781Prl implements InterfaceC88472Yns<C8V6, C76800UCe> {
    public static final C55610Ls6 LJLIL = new C55610Ls6();

    public C55610Ls6() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V6 c8v6) {
        C8V6 assem = c8v6;
        o.LJIIIZ(assem, "$this$assem");
        assem.LJFF = new MainLegacyEventBusAssem();
        return C76800UCe.LIZ;
    }
}
