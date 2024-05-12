package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Vb3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80033Vb3 implements InterfaceC80021Var, InterfaceC80037Vb7 {
    public final CopyOnWriteArrayList<InterfaceC80037Vb7> LJLIL = new CopyOnWriteArrayList<>();

    public final void LIZ() {
        this.LJLIL.clear();
    }

    @Override // X.InterfaceC80037Vb7
    public final InterfaceC79968Va0 LIZJ(InterfaceC79968Va0 interfaceC79968Va0) {
        Iterator<InterfaceC80037Vb7> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            try {
                interfaceC79968Va0 = it.next().LIZJ(interfaceC79968Va0);
            } catch (Exception e) {
                J7Z.LIZ("MusicPlayerOperationInterceptorDispatcher", e.getMessage());
            }
        }
        return interfaceC79968Va0;
    }

    @Override // X.InterfaceC80037Vb7
    public final EnumC79963VZv LJIIIIZZ(EnumC79963VZv playMode) {
        o.LJIIJ(playMode, "playMode");
        Iterator<InterfaceC80037Vb7> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            try {
                playMode = it.next().LJIIIIZZ(playMode);
            } catch (Exception e) {
                J7Z.LIZ("MusicPlayerOperationInterceptorDispatcher", e.getMessage());
            }
        }
        return playMode;
    }

    @Override // X.InterfaceC80021Var
    public final void LJIILLIIL(InterfaceC80037Vb7 interceptor) {
        o.LJIIJ(interceptor, "interceptor");
        this.LJLIL.remove(interceptor);
    }

    @Override // X.InterfaceC80021Var
    public final void LJIL(InterfaceC80037Vb7 interceptor) {
        o.LJIIJ(interceptor, "interceptor");
        if (!this.LJLIL.contains(interceptor)) {
            this.LJLIL.add(interceptor);
        }
    }

    @Override // X.InterfaceC80037Vb7
    public final V1L LJ(V1L v1l, C48651J7n c48651J7n) {
        Iterator<InterfaceC80037Vb7> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            try {
                v1l = it.next().LJ(v1l, c48651J7n);
            } catch (Exception e) {
                J7Z.LIZ("MusicPlayerOperationInterceptorDispatcher", e.getMessage());
            }
        }
        return v1l;
    }
}
