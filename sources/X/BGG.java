package X;

import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BGG extends AbstractC65781Prl implements InterfaceC88472Yns<BZI, BZI> {
    public static final BGG LJLIL = new BGG();

    public BGG() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final BZI invoke(BZI bzi) {
        BZI liveLog = bzi;
        o.LJIIIZ(liveLog, "liveLog");
        liveLog.LJIJJ("draw_guess", "features");
        return liveLog;
    }
}
