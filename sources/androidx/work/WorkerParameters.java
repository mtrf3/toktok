package androidx.work;

import X.AbstractC08560Vg;
import X.C0CY;
import X.C0VU;
import X.C1NP;
import X.C34811Yf;
import X.InterfaceC23750wV;
import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class WorkerParameters {
    public final UUID LIZ;
    public final C0CY LIZIZ;
    public final Executor LIZJ;
    public final InterfaceC23750wV LIZLLL;
    public final AbstractC08560Vg LJ;
    public final C0VU LJFF;

    public WorkerParameters(UUID uuid, C0CY c0cy, Collection collection, Executor executor, InterfaceC23750wV interfaceC23750wV, C1NP c1np, C34811Yf c34811Yf) {
        this.LIZ = uuid;
        this.LIZIZ = c0cy;
        new HashSet(collection);
        this.LIZJ = executor;
        this.LIZLLL = interfaceC23750wV;
        this.LJ = c1np;
        this.LJFF = c34811Yf;
    }
}
