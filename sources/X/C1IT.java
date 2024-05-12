package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1IT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1IT<K, V> extends C0OB {
    public InterfaceC37431dT<K, ? extends V> LIZJ;
    public int LIZLLL;

    @Override // X.C0OB
    public final C0OB LIZIZ() {
        return new C1IT(this.LIZJ);
    }

    public C1IT(InterfaceC37431dT<K, ? extends V> map) {
        o.LJIIIZ(map, "map");
        this.LIZJ = map;
    }

    @Override // X.C0OB
    public final void LIZ(C0OB value) {
        o.LJIIIZ(value, "value");
        C1IT c1it = (C1IT) value;
        synchronized (C0OH.LIZ) {
            this.LIZJ = c1it.LIZJ;
            this.LIZLLL = c1it.LIZLLL;
        }
    }

    public final void LIZJ(InterfaceC37431dT<K, ? extends V> interfaceC37431dT) {
        o.LJIIIZ(interfaceC37431dT, "<set-?>");
        this.LIZJ = interfaceC37431dT;
    }
}
