package X;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.0BG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0BG {
    public final InterfaceC262611i LIZ;
    public final Context LIZIZ;
    public final String LIZJ;
    public final C0BZ LIZLLL;
    public final List<C0BX> LJ;
    public final boolean LJII;
    public final C0BY LJIIIIZZ;
    public final Executor LJIIIZ;
    public final Executor LJIIJ;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIIJJI = false;
    public final List<Object> LJFF = Collections.emptyList();
    public final List<InterfaceC23730wT> LJI = Collections.emptyList();

    public final boolean LIZ(int i, int i2) {
        if ((i <= i2 || !this.LJIILIIL) && this.LJIIL) {
            return true;
        }
        return false;
    }

    public C0BG(Context context, String str, InterfaceC262611i interfaceC262611i, C0BZ c0bz, List list, boolean z, C0BY c0by, Executor executor, Executor executor2, boolean z2, boolean z3) {
        this.LIZ = interfaceC262611i;
        this.LIZIZ = context;
        this.LIZJ = str;
        this.LIZLLL = c0bz;
        this.LJ = list;
        this.LJII = z;
        this.LJIIIIZZ = c0by;
        this.LJIIIZ = executor;
        this.LJIIJ = executor2;
        this.LJIIL = z2;
        this.LJIILIIL = z3;
    }
}
