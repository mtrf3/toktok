package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Mzq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58638Mzq extends AbstractC65781Prl implements InterfaceC88472Yns<M95, String> {
    public static final C58638Mzq LJLIL = new C58638Mzq();

    public C58638Mzq() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(M95 m95) {
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        Aweme aweme = (Aweme) $receiver.LIZ(Aweme.class);
        if (aweme != null) {
            return aweme.getAid();
        }
        return null;
    }
}
