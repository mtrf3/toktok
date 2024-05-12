package X;

/* loaded from: classes16.dex */
public final class YJF implements InterfaceC87174YJe {
    public final InterfaceC87174YJe[] LIZ;

    public YJF(InterfaceC87174YJe... interfaceC87174YJeArr) {
        this.LIZ = interfaceC87174YJeArr;
    }

    @Override // X.InterfaceC87174YJe
    public final boolean LIZ(Class<?> cls) {
        for (InterfaceC87174YJe interfaceC87174YJe : this.LIZ) {
            if (interfaceC87174YJe.LIZ(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC87174YJe
    public final InterfaceC87181YJl LIZIZ(Class<?> cls) {
        String str;
        for (InterfaceC87174YJe interfaceC87174YJe : this.LIZ) {
            if (interfaceC87174YJe.LIZ(cls)) {
                return interfaceC87174YJe.LIZIZ(cls);
            }
        }
        String name = cls.getName();
        if (name.length() != 0) {
            str = "No factory is available for message type: ".concat(name);
        } else {
            str = new String("No factory is available for message type: ");
        }
        throw new UnsupportedOperationException(str);
    }
}
