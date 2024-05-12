package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wk7, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83143Wk7 implements InterfaceC83144Wk8 {
    public final InterfaceC83144Wk8 LIZ;

    @Override // X.InterfaceC83144Wk8
    public final void LIZ(List list, List newPaths) {
        o.LJIIIZ(newPaths, "newPaths");
        this.LIZ.LIZ(list, newPaths);
    }

    @Override // X.InterfaceC83144Wk8
    public final void LIZIZ(List paths) {
        o.LJIIIZ(paths, "paths");
        this.LIZ.LIZIZ(paths);
    }

    @Override // X.InterfaceC83144Wk8
    public final void LIZJ(boolean z) {
        this.LIZ.LIZJ(z);
    }

    @Override // X.InterfaceC83144Wk8
    public final int[] LLII(String nodePath, String nodeKey) {
        o.LJIIIZ(nodePath, "nodePath");
        o.LJIIIZ(nodeKey, "nodeKey");
        return this.LIZ.LLII(nodePath, nodeKey);
    }

    @Override // X.InterfaceC83144Wk8
    public final void LLLFF(String path, String nodeTag, float f) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(nodeTag, "nodeTag");
        this.LIZ.LLLFF(path, nodeTag, f);
    }

    @Override // X.InterfaceC83144Wk8
    public final void onDismiss() {
        this.LIZ.onDismiss();
    }

    @Override // X.InterfaceC83144Wk8
    public final void onShow() {
        this.LIZ.onShow();
    }

    public C83143Wk7(InterfaceC83144Wk8 listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZ = listener;
        C221108m2.LIZIZ(C82697Wcv.LJLIL);
    }
}
