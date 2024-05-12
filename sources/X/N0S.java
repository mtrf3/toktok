package X;

import com.ss.android.ugc.aweme.commerce.IBEInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N0S extends AbstractC65781Prl implements InterfaceC88472Yns<M95, String> {
    public static final N0S LJLIL = new N0S();

    public N0S() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(M95 m95) {
        M95 stringOptional = m95;
        o.LJIIIZ(stringOptional, "$this$stringOptional");
        Object LIZ = stringOptional.LIZ(IBEInfo.class);
        if (LIZ != null) {
            return ((IBEInfo) LIZ).getGeckoChannel();
        }
        throw new C58623Mzb(IBEInfo.class);
    }
}
