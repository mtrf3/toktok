package X;

import com.ss.android.ugc.aweme.log.AdWebLogModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N1G extends AbstractC65781Prl implements InterfaceC88472Yns<M95, Integer> {
    public static final N1G LJLIL = new N1G();

    public N1G() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Integer invoke(M95 m95) {
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        Object LIZ = $receiver.LIZ(AdWebLogModel.class);
        if (LIZ != null) {
            return Integer.valueOf(((AdWebLogModel) LIZ).getLandingPageStyle());
        }
        throw new C58623Mzb(AdWebLogModel.class);
    }
}
