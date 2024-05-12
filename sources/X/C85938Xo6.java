package X;

import kotlin.jvm.internal.AqS57S0110000_15;
import kotlin.jvm.internal.AqS68S1100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Xo6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C85938Xo6 extends C25849ACn {
    public final C25848ACm LJLJJL;
    public String LJLJJLL;

    public C85938Xo6() {
        this(null);
    }

    @Override // X.C25849ACn
    /* renamed from: LJIIJJI */
    public C25848ACm LJIIIIZZ() {
        C25848ACm c25848ACm = this.LJLJJL;
        if (c25848ACm != null) {
            return c25848ACm;
        }
        throw new RuntimeException("pls pass item or extends the PushSwitchUnit");
    }

    @Override // X.C25849ACn, X.AG6
    public /* bridge */ /* synthetic */ C25848ACm LJIIIIZZ() {
        return LJIIIIZZ();
    }

    public C85938Xo6(C25848ACm c25848ACm) {
        super(null);
        this.LJLJJL = c25848ACm;
    }

    @Override // X.AG6
    public final void LJIIIZ(boolean z) {
        LJIIJ(new AqS57S0110000_15(this, z, 6));
    }

    public final void LJIILIIL(boolean z) {
        LJIIJ(new AqS57S0110000_15(this, z, 4));
    }

    public final void LJIILJJIL(boolean z) {
        LJIIJ(new AqS57S0110000_15(this, z, 5));
    }

    public final void LJIILL(String string) {
        o.LJIIIZ(string, "string");
        LJIIJ(new AqS68S1100000_15(this, string, 8));
    }
}
