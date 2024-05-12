package X;

import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XIS extends AbstractC65781Prl implements InterfaceC88472Yns<SZD, C76800UCe> {
    public static final XIS LJLIL = new XIS();

    public XIS() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(SZD szd) {
        SZD subscribeTrackEvent = szd;
        o.LJIIIZ(subscribeTrackEvent, "$this$subscribeTrackEvent");
        SZE.LIZLLL("vprovider_provide_event", 1.0f, new AqS165S0100000_15(subscribeTrackEvent, 920));
        return C76800UCe.LIZ;
    }
}
