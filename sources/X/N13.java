package X;

import com.ss.android.ugc.aweme.cct.AdCCTLogModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N13 extends AbstractC65781Prl implements InterfaceC88472Yns<M95, Integer> {
    public static final N13 LJLIL = new N13();

    public N13() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Integer invoke(M95 m95) {
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        Object LIZ = $receiver.LIZ(AdCCTLogModel.class);
        if (LIZ != null) {
            return Integer.valueOf(((AdCCTLogModel) LIZ).isFromJSB() ? 1 : 0);
        }
        throw new C58623Mzb(AdCCTLogModel.class);
    }
}
