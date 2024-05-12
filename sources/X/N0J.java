package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N0J extends AbstractC65781Prl implements InterfaceC88472Yns<M95, String> {
    public static final N0J LJLIL = new N0J();

    public N0J() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(M95 m95) {
        String aid;
        M95 stringOptional = m95;
        o.LJIIIZ(stringOptional, "$this$stringOptional");
        Aweme aweme = (Aweme) stringOptional.LIZ(Aweme.class);
        if (aweme == null || (aid = aweme.getAid()) == null) {
            Object LIZ = stringOptional.LIZ(ETC.class);
            if (LIZ != null) {
                return ((ETC) LIZ).LIZIZ;
            }
            throw new C58623Mzb(ETC.class);
        }
        return aid;
    }
}
