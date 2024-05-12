package X;

/* renamed from: X.IjC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47414IjC extends AbstractC47819Ipj {
    public final InterfaceC47412IjA LIZ;

    @Override // X.AbstractC47819Ipj
    public final void LIZ() {
        this.LIZ.cancel();
    }

    public C47414IjC(InterfaceC47412IjA interfaceC47412IjA) {
        this.LIZ = interfaceC47412IjA;
    }

    @Override // X.AbstractC47819Ipj
    public final void LIZJ(String str, C47590Im2 c47590Im2) {
        this.LIZ.LIZ(str, new C47415IjD(c47590Im2));
    }

    @Override // X.AbstractC47819Ipj
    public final void LIZIZ(String str, java.util.Map map, InterfaceC47420IjI interfaceC47420IjI) {
        this.LIZ.LIZJ(str, map, null, 0, new C47415IjD(interfaceC47420IjI));
    }

    @Override // X.AbstractC47819Ipj
    public final void LIZLLL(String str, java.util.Map<String, String> map, InterfaceC47420IjI interfaceC47420IjI) {
        this.LIZ.LIZIZ(str, map, new C47415IjD(interfaceC47420IjI));
    }
}
