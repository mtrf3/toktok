package X;

import java.util.List;

/* renamed from: X.URq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77202URq implements InterfaceC70542pm {
    public final C77207URv LIZ;
    public C77208URw LIZIZ;

    public final boolean LIZ() {
        C34K c34k = new C34K();
        XKX.LJ(MBB.INSTANCE, new C77203URr(this, c34k, null));
        return c34k.element;
    }

    public final C3C3 LIZJ() {
        return new C3C3(new C77204URs(this, null));
    }

    public C77202URq(C77207URv c77207URv) {
        C77208URw c77208URw = new C77208URw(c77207URv, 2);
        this.LIZ = c77207URv;
        this.LIZIZ = c77208URw;
    }

    public final List<USJ> LIZIZ(boolean z) {
        if (this.LIZ.LJFF.LIZ == EnumC77147UPn.EMAIL) {
            return C47261Igj.LJJIJIIJI(new URI(), new C77205URt(), new US1(), new C77201URp(), new C77206URu());
        }
        if (z) {
            return C47261Igj.LJJIJIIJI(new C77191URf(0), new C77194URi(), new URG(0), new C77178UQs());
        }
        return C47261Igj.LJJIJIIJI(new C77191URf(0), new C77194URi(), new URG(0), new C77178UQs(), new US2(), new C77190URe(0), new URM());
    }
}
