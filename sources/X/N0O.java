package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N0O extends AbstractC65781Prl implements InterfaceC88472Yns<M95, Integer> {
    public static final N0O LJLIL = new N0O();

    public N0O() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Integer invoke(M95 m95) {
        int i;
        M95 m952 = m95;
        o.LJIIIZ(m952, "$this$int");
        Object LIZ = m952.LIZ(Aweme.class);
        if (LIZ != null) {
            if (((Aweme) LIZ).isAd()) {
                i = 1;
            } else {
                i = 2;
            }
            return Integer.valueOf(i);
        }
        throw new C58623Mzb(Aweme.class);
    }
}
