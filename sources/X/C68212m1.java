package X;

import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2m1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68212m1 implements InterfaceC71003Rtn {
    public final String LJLIL;
    public final C70858RrS LJLILLLLZI;
    public final InterfaceC71003Rtn LJLJI;
    public final boolean LJLJJI;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TrackNodeSnapshot[id:");
        return q.LIZIZ(LIZ, this.LJLIL, ']', LIZ);
    }

    @Override // X.InterfaceC71003Rtn
    public final List<String> getRegisteredLane() {
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC71003Rtn
    public final InterfaceC71003Rtn preTrackNode() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public final void fillNodeParams(C70858RrS c70858RrS) {
        c70858RrS.LIZJ(this.LJLILLLLZI);
    }

    public C68212m1(String id, C70576Rmu c70576Rmu, InterfaceC71003Rtn interfaceC71003Rtn, boolean z) {
        o.LJIIIZ(id, "id");
        this.LJLIL = id;
        this.LJLILLLLZI = c70576Rmu;
        this.LJLJI = interfaceC71003Rtn;
        this.LJLJJI = z;
    }
}
