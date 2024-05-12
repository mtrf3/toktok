package X;

import com.ss.android.ugc.aweme.log.AdWebLogModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N1M extends AbstractC65781Prl implements InterfaceC88472Yns<M95, String> {
    public static final N1M LJLIL = new N1M();

    public N1M() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(M95 m95) {
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        Object LIZ = $receiver.LIZ(AdWebLogModel.class);
        if (LIZ != null) {
            return ((AdWebLogModel) LIZ).getPreloadChannel();
        }
        throw new C58623Mzb(AdWebLogModel.class);
    }
}
