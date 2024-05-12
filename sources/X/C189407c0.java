package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.7c0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189407c0 extends AbstractC65781Prl implements InterfaceC88472Yns<C189257bl, C189367bw> {
    public static final C189407c0 LJLIL = new C189407c0();

    public C189407c0() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C189367bw invoke(C189257bl c189257bl) {
        Aweme aweme;
        C189257bl state = c189257bl;
        o.LJIIIZ(state, "state");
        C189367bw c189367bw = state.LJLILLLLZI;
        if (c189367bw == null || (aweme = c189367bw.LIZ) == null) {
            return c189367bw;
        }
        return C189367bw.LIZ(c189367bw, C54838Lfe.LJIILL(aweme), C54838Lfe.LJIILJJIL(aweme));
    }
}
