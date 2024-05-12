package X;

/* renamed from: X.6zt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178736zt implements InterfaceC178516zX {
    public static final C178736zt LIZ = new C178736zt();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C178746zu.LJLIL);

    public static final void LIZIZ() {
        ((C35979EAd) LIZIZ.getValue()).LIZ();
    }

    @Override // X.InterfaceC178516zX
    public final C7AL get(String str) {
        if (str == null) {
            return new C7AL(0);
        }
        C7AL c7al = (C7AL) ((C35979EAd) LIZIZ.getValue()).LIZIZ(str);
        if (c7al != null) {
            return C7AL.L(c7al, false, false, null, 7);
        }
        return new C7AL(0);
    }

    @Override // X.InterfaceC178516zX
    public final void LIZ(String str, C7AL c7al) {
        if (str == null) {
            return;
        }
        ((C35979EAd) LIZIZ.getValue()).LIZLLL(str, c7al);
    }
}
