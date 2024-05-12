package X;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.PUw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64546PUw extends C64545PUv {
    public C64545PUv LJ;

    @Override // X.C64545PUv
    public final C64545PUv LIZ() {
        return this.LJ.LIZ();
    }

    @Override // X.C64545PUv
    public final C64545PUv LIZIZ() {
        return this.LJ.LIZIZ();
    }

    @Override // X.C64545PUv
    public final long LIZJ() {
        return this.LJ.LIZJ();
    }

    @Override // X.C64545PUv
    public final boolean LJ() {
        return this.LJ.LJ();
    }

    @Override // X.C64545PUv
    public final void LJFF() {
        this.LJ.LJFF();
    }

    @Override // X.C64545PUv
    public final long LJII() {
        return this.LJ.LJII();
    }

    public C64546PUw(C64545PUv delegate) {
        o.LJIIJ(delegate, "delegate");
        this.LJ = delegate;
    }

    @Override // X.C64545PUv
    public final C64545PUv LIZLLL(long j) {
        return this.LJ.LIZLLL(j);
    }

    @Override // X.C64545PUv
    public final C64545PUv LJI(long j, TimeUnit unit) {
        o.LJIIJ(unit, "unit");
        return this.LJ.LJI(j, unit);
    }
}
