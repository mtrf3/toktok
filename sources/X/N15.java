package X;

import com.ss.android.ugc.aweme.cct.AdCCTLogModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N15 extends AbstractC65781Prl implements InterfaceC88472Yns<M95, String> {
    public static final N15 LJLIL = new N15();

    public N15() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(M95 m95) {
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        Object LIZ = $receiver.LIZ(AdCCTLogModel.class);
        if (LIZ != null) {
            return ((AdCCTLogModel) LIZ).getRefer();
        }
        throw new C58623Mzb(AdCCTLogModel.class);
    }
}
