package X;

/* renamed from: X.ZiJ, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90675ZiJ implements InterfaceC90313ZcT {
    public final InterfaceC90313ZcT[] LIZ;

    public C90675ZiJ(InterfaceC90313ZcT... interfaceC90313ZcTArr) {
        this.LIZ = interfaceC90313ZcTArr;
    }

    @Override // X.InterfaceC90313ZcT
    public final boolean LIZ(Class<?> cls) {
        InterfaceC90313ZcT[] interfaceC90313ZcTArr = this.LIZ;
        int i = 0;
        while (!interfaceC90313ZcTArr[i].LIZ(cls)) {
            i++;
            if (i >= 2) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC90313ZcT
    public final InterfaceC90305ZcL LIZIZ(Class<?> cls) {
        String str;
        InterfaceC90313ZcT[] interfaceC90313ZcTArr = this.LIZ;
        int i = 0;
        do {
            InterfaceC90313ZcT interfaceC90313ZcT = interfaceC90313ZcTArr[i];
            if (interfaceC90313ZcT.LIZ(cls)) {
                return interfaceC90313ZcT.LIZIZ(cls);
            }
            i++;
        } while (i < 2);
        String name = cls.getName();
        if (name.length() != 0) {
            str = "No factory is available for message type: ".concat(name);
        } else {
            str = new String("No factory is available for message type: ");
        }
        throw new UnsupportedOperationException(str);
    }
}
