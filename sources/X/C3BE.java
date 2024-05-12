package X;

import Y.IDeS360S0100000_1;

/* renamed from: X.3BE, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BE {
    public static final /* synthetic */ C3BE LIZ = new C3BE();
    public static final C3BF LIZIZ = new C3BD() { // from class: X.3BF
        public final String toString() {
            return "SharingStarted.Eagerly";
        }

        @Override // X.C3BD
        public final InterfaceC65462ha<C3BM> LIZ(InterfaceC71762rk<Integer> interfaceC71762rk) {
            return new IDeS360S0100000_1(C3BM.START, 10);
        }
    };
    public static final C3BG LIZJ = new C3BD() { // from class: X.3BG
        public final String toString() {
            return "SharingStarted.Lazily";
        }

        @Override // X.C3BD
        public final InterfaceC65462ha<C3BM> LIZ(InterfaceC71762rk<Integer> interfaceC71762rk) {
            return new C3C3(new C3BH(interfaceC71762rk, null));
        }
    };
}
