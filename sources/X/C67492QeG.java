package X;

import java.util.Date;
import java.util.HashMap;

/* renamed from: X.QeG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67492QeG implements InterfaceC67509QeX<C67492QeG> {
    public static final C67497QeL LJ = new InterfaceC67508QeW() { // from class: X.QeL
        @Override // X.InterfaceC67511QeZ
        public final void LIZ(Object obj, InterfaceC67543Qf5 interfaceC67543Qf5) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Couldn't find encoder for type ");
            LIZ.append(C16880lQ.LJLLILLLL(obj.getClass()));
            throw new C67504QeS(X1D.LIZIZ(LIZ));
        }
    };
    public static final C67506QeU LJFF = new InterfaceC67507QeV() { // from class: X.QeU
        @Override // X.InterfaceC67511QeZ
        public final void LIZ(Object obj, InterfaceC67510QeY interfaceC67510QeY) {
            interfaceC67510QeY.LIZ((String) obj);
        }
    };
    public static final C67505QeT LJI = new InterfaceC67507QeV() { // from class: X.QeT
        @Override // X.InterfaceC67511QeZ
        public final void LIZ(Object obj, InterfaceC67510QeY interfaceC67510QeY) {
            interfaceC67510QeY.LIZJ(((Boolean) obj).booleanValue());
        }
    };
    public static final C67494QeI LJII = new C67494QeI();
    public final java.util.Map<Class<?>, InterfaceC67508QeW<?>> LIZ;
    public final java.util.Map<Class<?>, InterfaceC67507QeV<?>> LIZIZ;
    public final C67497QeL LIZJ;
    public boolean LIZLLL;

    public C67492QeG() {
        HashMap hashMap = new HashMap();
        this.LIZ = hashMap;
        HashMap hashMap2 = new HashMap();
        this.LIZIZ = hashMap2;
        this.LIZJ = LJ;
        this.LIZLLL = false;
        hashMap2.put(String.class, LJFF);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, LJI);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, LJII);
        hashMap.remove(Date.class);
    }

    public final InterfaceC67509QeX LIZ(Class cls, InterfaceC67508QeW interfaceC67508QeW) {
        ((HashMap) this.LIZ).put(cls, interfaceC67508QeW);
        ((HashMap) this.LIZIZ).remove(cls);
        return this;
    }
}
