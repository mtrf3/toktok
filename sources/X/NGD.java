package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NGD extends AbstractC65781Prl implements InterfaceC88472Yns<M95, String> {
    public static final NGD LJLIL = new NGD();

    public NGD() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(M95 m95) {
        M95 string = m95;
        o.LJIIIZ(string, "$this$string");
        Object LIZ = string.LIZ(NGR.class);
        if (LIZ != null) {
            NGR ngr = (NGR) LIZ;
            if (ngr.LJ || ngr.LJFF) {
                return "fold";
            }
            return "unfold";
        }
        throw new C58623Mzb(NGR.class);
    }
}
