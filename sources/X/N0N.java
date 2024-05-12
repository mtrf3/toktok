package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N0N extends AbstractC65781Prl implements InterfaceC88472Yns<M95, String> {
    public static final N0N LJLIL = new N0N();

    public N0N() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(M95 m95) {
        M95 stringOptional = m95;
        o.LJIIIZ(stringOptional, "$this$stringOptional");
        Object LIZ = stringOptional.LIZ(Aweme.class);
        if (LIZ != null) {
            return ((Aweme) LIZ).getAid();
        }
        throw new C58623Mzb(Aweme.class);
    }
}
