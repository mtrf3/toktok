package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KJ2 extends AbstractC65781Prl implements InterfaceC88472Yns<KJ3, KJ3> {
    public static final KJ2 LJLIL = new KJ2();

    public KJ2() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final KJ3 invoke(KJ3 setState) {
        o.LJIIIZ(setState, "$this$setState");
        KJ4 playingStatus = KJ4.Default;
        o.LJIIIZ(playingStatus, "playingStatus");
        return new KJ3(null, playingStatus);
    }
}
