package X;

import android.os.HandlerThread;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.Icd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47007Icd extends IX7 {
    public EnumC47008Ice LJIJ;
    public final C62822Ol8 LJIJI;
    public boolean LJIJJ;

    @Override // X.IX7
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Session (");
        StringBuilder sb = new StringBuilder(JBR.LJFF(LIZ, (String) this.LJIJI.getValue(), ") | ", LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("key=");
        LIZ2.append((Object) this.LIZ);
        LIZ2.append(" ; status (");
        LIZ2.append(this.LJIJ);
        LIZ2.append(')');
        sb.append(X1D.LIZIZ(LIZ2));
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    @Override // X.IX7
    public final void LJFF() {
        super.LJFF();
        String msg = LJIILIIL("release");
        o.LJIIIZ(msg, "msg");
        this.LJIJ = EnumC47008Ice.RELEASED;
    }

    @Override // X.IX7
    public final void LJII() {
        super.LJII();
        String msg = LJIILIIL("reset");
        o.LJIIIZ(msg, "msg");
        this.LJIJ = EnumC47008Ice.RESET;
    }

    @Override // X.IX7
    public final void LJIIL() {
        super.LJIIL();
        String msg = LJIILIIL("stop");
        o.LJIIIZ(msg, "msg");
        this.LJIJ = EnumC47008Ice.STOPPED;
    }

    @Override // X.IX7
    public final void LJ(IX4 ix4) {
        boolean z;
        String str;
        super.LJ(ix4);
        boolean z2 = false;
        if (ix4.LJJ) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "(prerender)";
        } else {
            str = "";
        }
        String msg = LJIILIIL(o.LJIILLIIL(str, "prepare "));
        o.LJIIIZ(msg, "msg");
        this.LJIJ = EnumC47008Ice.PREPARED;
        if (ix4.LJIILJJIL) {
            z2 = true;
        }
        this.LJIJJ = z2;
    }

    public final String LJIILIIL(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('@');
        YE1.LIZLLL(LIZ, (String) this.LJIJI.getValue(), " -> #", str, "#!!! | key=");
        LIZ.append((Object) this.LIZ);
        LIZ.append(" ; status (");
        LIZ.append(this.LJIJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47007Icd(ITZ playerType, HandlerThread handlerThread, IX4 ix4, IXI sessionCallback, ITX itx, boolean z) {
        super(playerType, handlerThread, ix4, sessionCallback, itx, z);
        o.LJIIIZ(playerType, "playerType");
        o.LJIIIZ(sessionCallback, "sessionCallback");
        this.LJIJ = EnumC47008Ice.INIT;
        this.LJIJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 627));
    }
}
