package X;

import java.io.OutputStream;

/* renamed from: X.QeN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67499QeN {
    public final java.util.Map<Class<?>, InterfaceC67508QeW<?>> LIZ;
    public final java.util.Map<Class<?>, InterfaceC67507QeV<?>> LIZIZ;
    public final InterfaceC67508QeW<Object> LIZJ;

    public final void LIZ(OutputStream outputStream, Object obj) {
        java.util.Map<Class<?>, InterfaceC67508QeW<?>> map = this.LIZ;
        C67524Qem c67524Qem = new C67524Qem(outputStream, map, this.LIZIZ, this.LIZJ);
        if (obj == null) {
            return;
        }
        InterfaceC67508QeW<?> interfaceC67508QeW = map.get(obj.getClass());
        if (interfaceC67508QeW != null) {
            interfaceC67508QeW.LIZ(obj, c67524Qem);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No encoder for ");
        LIZ.append(obj.getClass());
        throw new C67504QeS(X1D.LIZIZ(LIZ));
    }

    public C67499QeN(java.util.Map map, java.util.Map map2, C67498QeM c67498QeM) {
        this.LIZ = map;
        this.LIZIZ = map2;
        this.LIZJ = c67498QeM;
    }
}
