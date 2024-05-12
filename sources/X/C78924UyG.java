package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UyG, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78924UyG implements InterfaceC162186Yc, InterfaceC83180Wki, InterfaceC80039Vb9 {
    public static final C78924UyG LJLIL = new C78924UyG();

    public static final View LIZJ(ViewGroup get) {
        o.LJIIIZ(get, "$this$get");
        View childAt = get.getChildAt(0);
        if (childAt != null) {
            return childAt;
        }
        StringBuilder LJ = C7MY.LJ("Index: ", 0, ", Size: ");
        LJ.append(get.getChildCount());
        throw new IndexOutOfBoundsException(X1D.LIZIZ(LJ));
    }

    public static final C33961Uy LIZLLL(ViewGroup children) {
        o.LJIIIZ(children, "$this$children");
        return new C33961Uy(children);
    }

    @Override // X.InterfaceC83180Wki
    public void LIZIZ(List paths) {
        o.LJIIIZ(paths, "paths");
        throw null;
    }

    @Override // X.InterfaceC80039Vb9
    public V1L LJ(InterfaceC79968Va0 interfaceC79968Va0) {
        List<V1L> LIZIZ;
        if (interfaceC79968Va0 != null && (LIZIZ = interfaceC79968Va0.LIZIZ()) != null) {
            return (V1L) ORZ.LJLLLLLL(interfaceC79968Va0.getCurrentIndex() + 1, LIZIZ);
        }
        return null;
    }

    @Override // X.InterfaceC80039Vb9
    public V1L LJI(InterfaceC79968Va0 interfaceC79968Va0) {
        List<V1L> LIZIZ;
        if (interfaceC79968Va0 != null && (LIZIZ = interfaceC79968Va0.LIZIZ()) != null) {
            return (V1L) ORZ.LJLLLLLL(interfaceC79968Va0.getCurrentIndex() - 1, LIZIZ);
        }
        return null;
    }

    @Override // X.InterfaceC80039Vb9
    public V1L LJII(InterfaceC79968Va0 interfaceC79968Va0) {
        List<V1L> LIZIZ;
        if (interfaceC79968Va0 != null && (LIZIZ = interfaceC79968Va0.LIZIZ()) != null) {
            return (V1L) ORZ.LJLLLLLL(interfaceC79968Va0.getCurrentIndex(), LIZIZ);
        }
        return null;
    }

    @Override // X.InterfaceC162186Yc
    public void onError(String str) {
        C0JU.LIZLLL(str);
    }

    @Override // X.InterfaceC83180Wki
    public void LIZ(List list, List newPaths) {
        o.LJIIIZ(newPaths, "newPaths");
        throw null;
    }
}
