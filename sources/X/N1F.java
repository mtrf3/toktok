package X;

import com.ss.android.ugc.aweme.log.AdWebLogModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N1F extends AbstractC65781Prl implements InterfaceC88472Yns<M95, Integer> {
    public static final N1F LJLIL = new N1F();

    public N1F() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Integer invoke(M95 m95) {
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        Object LIZ = $receiver.LIZ(AdWebLogModel.class);
        if (LIZ != null) {
            return Integer.valueOf(((AdWebLogModel) LIZ).isAdWebPage() ? 1 : 0);
        }
        throw new C58623Mzb(AdWebLogModel.class);
    }
}
