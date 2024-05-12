package X;

import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SZ6 extends AbstractC65781Prl implements InterfaceC88472Yns<SZ8, C76800UCe> {
    public static final SZ6 LJLIL = new SZ6();

    public SZ6() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(SZ8 sz8) {
        SZ8 subscribeTrackEvent = sz8;
        o.LJIIIZ(subscribeTrackEvent, "$this$subscribeTrackEvent");
        SZE.LIZLLL("powerlist_list_page_load", 0.05f, new AqS162S0100000_12(subscribeTrackEvent, 48));
        return C76800UCe.LIZ;
    }
}
