package X;

import java.util.HashMap;

/* renamed from: X.Qea, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67512Qea implements InterfaceC67509QeX<C67512Qea> {
    public static final C67498QeM LIZLLL = new InterfaceC67508QeW() { // from class: X.QeM
        @Override // X.InterfaceC67511QeZ
        public final void LIZ(Object obj, InterfaceC67543Qf5 interfaceC67543Qf5) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Couldn't find encoder for type ");
            LIZ.append(C16880lQ.LJLLILLLL(obj.getClass()));
            throw new C67504QeS(X1D.LIZIZ(LIZ));
        }
    };
    public final java.util.Map<Class<?>, InterfaceC67508QeW<?>> LIZ = new HashMap();
    public final java.util.Map<Class<?>, InterfaceC67507QeV<?>> LIZIZ = new HashMap();
    public final C67498QeM LIZJ = LIZLLL;

    public final InterfaceC67509QeX LIZ(Class cls, InterfaceC67508QeW interfaceC67508QeW) {
        ((HashMap) this.LIZ).put(cls, interfaceC67508QeW);
        ((HashMap) this.LIZIZ).remove(cls);
        return this;
    }
}
