package X;

import kotlin.jvm.internal.o;

/* renamed from: X.E7m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35910E7m extends AbstractC65781Prl implements InterfaceC65784Pro<C35911E7n> {
    public static final C35910E7m LJLIL = new C35910E7m();

    public C35910E7m() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C35911E7n invoke() {
        C35911E7n c35911E7n = new C35911E7n();
        c35911E7n.LIZLLL = "im_msg_card_biz";
        c35911E7n.LIZ = C35510Dwg.LIZ().enable;
        c35911E7n.LIZJ = C35510Dwg.LIZ().volume;
        c35911E7n.LJ = C35510Dwg.LIZ().expiredTimeInSeconds;
        c35911E7n.LJI = C35510Dwg.LIZ().allowList;
        c35911E7n.LJII = C35510Dwg.LIZ().denyList;
        C35913E7p c35913E7p = C35913E7p.LJLIL;
        o.LJIIIZ(c35913E7p, "<set-?>");
        c35911E7n.LJFF = c35913E7p;
        return c35911E7n;
    }
}
