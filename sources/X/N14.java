package X;

import com.ss.android.ugc.aweme.cct.AdCCTLogModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N14 extends AbstractC65781Prl implements InterfaceC88472Yns<M95, String> {
    public static final N14 LJLIL = new N14();

    public N14() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(M95 m95) {
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        Object LIZ = $receiver.LIZ(AdCCTLogModel.class);
        if (LIZ != null) {
            String sessionId = ((AdCCTLogModel) LIZ).getSessionId();
            if (sessionId == null) {
                return CardStruct.IStatusCode.DEFAULT;
            }
            return sessionId;
        }
        throw new C58623Mzb(AdCCTLogModel.class);
    }
}
