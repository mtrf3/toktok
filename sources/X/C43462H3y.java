package X;

import Y.ACallableS109S0100000_6;
import Y.AfS59S0100000_7;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.H3y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43462H3y extends AbstractC43455H3r {
    public static final long LJI;
    public C73411SrX LJFF;

    static {
        FFL.LJIIIZ().getClass();
        LJI = Math.max(FFL.LJIILIIL(31744, 30000L, "studio_publish_cache_clean_timeout_threshold"), 0L);
    }

    @Override // X.AbstractC43455H3r
    public final H1T LJIIIZ() {
        return H1T.CACHE_CLEAN;
    }

    @Override // X.AbstractC43455H3r, X.AbstractC43456H3s
    public final boolean LIZ(AbstractC42983Gtv cause, C87623YaB c87623YaB) {
        o.LJIIIZ(cause, "cause");
        C73411SrX c73411SrX = this.LJFF;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            C73411SrX c73411SrX2 = this.LJFF;
            if (c73411SrX2 != null) {
                c73411SrX2.dispose();
            }
            this.LJFF = null;
        }
        super.LIZ(cause, c87623YaB);
        return false;
    }

    @Override // X.AbstractC43455H3r
    public final void LJI(ERR args, C67996QmO c67996QmO) {
        o.LJIIIZ(args, "args");
        C73870Syw LJJLIIIJJI = AbstractC73672Svk.LJJIIJZLJL(new ACallableS109S0100000_6(this, 12)).LJJLIIIJJI(LJI, TimeUnit.MILLISECONDS);
        EnumC169566l6 enumC169566l6 = EnumC169566l6.LJLIL;
        this.LJFF = (C73411SrX) LJJLIIIJJI.LJJL(new C73950T0o(enumC169566l6)).LJJJ(new C73950T0o(enumC169566l6)).LJJJLIIL(new AfS59S0100000_7(c67996QmO, 32), new AfS59S0100000_7(c67996QmO, 33));
    }
}
