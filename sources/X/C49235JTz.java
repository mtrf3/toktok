package X;

import Y.AObserverS76S0100000_8;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.JTz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49235JTz {
    public final JU3 LIZ;
    public final C62822Ol8 LIZIZ;
    public final AObserverS76S0100000_8 LIZJ;

    public final ArrayList<InterfaceC49220JTk> LIZ() {
        return (ArrayList) this.LIZIZ.getValue();
    }

    public C49235JTz(JU3 emitter) {
        o.LJIIIZ(emitter, "emitter");
        this.LIZ = emitter;
        this.LIZIZ = C221108m2.LIZIZ(C49234JTy.LJLIL);
        this.LIZJ = new AObserverS76S0100000_8(this, 156);
    }
}
