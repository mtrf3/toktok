package X;

import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SZB extends AbstractC65781Prl implements InterfaceC88472Yns<SZA, C76800UCe> {
    public static final SZB LJLIL = new SZB();

    public SZB() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(SZA sza) {
        SZA subscribeTrackEvent = sza;
        o.LJIIIZ(subscribeTrackEvent, "$this$subscribeTrackEvent");
        SZE.LIZLLL("powerlist_list_diff", 0.05f, new AqS162S0100000_12(subscribeTrackEvent, 45));
        return C76800UCe.LIZ;
    }
}
