package X;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.ELg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36268ELg {
    public long LIZ;
    public M0N LIZIZ = M0N.IDLE;
    public final java.util.Set<M0N> LIZJ = new LinkedHashSet();
    public XKQ LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;

    public final boolean LIZ() {
        if (this.LIZJ.contains(M0N.TOOLTIP_SHOW_START) || this.LIZJ.contains(M0N.TOOLTIP_SHOW_SUCCESS)) {
            return true;
        }
        return false;
    }

    public final void LIZIZ(M0N m0n) {
        o.LJIIIZ(m0n, "<set-?>");
        this.LIZIZ = m0n;
    }
}
