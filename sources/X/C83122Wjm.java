package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wjm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C83122Wjm implements InterfaceC83144Wk8 {
    public final InterfaceC83115Wjf LIZ;

    public C83122Wjm(I37 module) {
        o.LJIIIZ(module, "module");
        this.LIZ = module;
    }

    @Override // X.InterfaceC83144Wk8
    public final void LIZIZ(List paths) {
        o.LJIIIZ(paths, "paths");
        this.LIZ.LLLLIIL(paths, 10000);
    }

    @Override // X.InterfaceC83144Wk8
    public final void LIZJ(boolean z) {
        this.LIZ.Z6(z);
    }

    @Override // X.InterfaceC83144Wk8
    public final void LIZ(List list, List newPaths) {
        o.LJIIIZ(newPaths, "newPaths");
        this.LIZ.LLIIJI(list, newPaths, 10000);
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
}
