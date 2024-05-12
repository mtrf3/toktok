package X;

import com.ss.android.ugc.aweme.commerce.IBEInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N0V extends AbstractC65781Prl implements InterfaceC88472Yns<M95, String> {
    public static final N0V LJLIL = new N0V();

    public N0V() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(M95 m95) {
        M95 string = m95;
        o.LJIIIZ(string, "$this$string");
        Object LIZ = string.LIZ(IBEInfo.class);
        if (LIZ != null) {
            return ((IBEInfo) LIZ).getLynxSchema();
        }
        throw new C58623Mzb(IBEInfo.class);
    }
}
