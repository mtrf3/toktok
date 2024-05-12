package X;

/* loaded from: classes16.dex */
public final class YJJ implements InterfaceC87184YJo {
    public final InterfaceC87184YJo[] LIZ;

    public YJJ(InterfaceC87184YJo... interfaceC87184YJoArr) {
        this.LIZ = interfaceC87184YJoArr;
    }

    @Override // X.InterfaceC87184YJo
    public final boolean LIZ(Class cls) {
        InterfaceC87184YJo[] interfaceC87184YJoArr = this.LIZ;
        int i = 0;
        while (!interfaceC87184YJoArr[i].LIZ(cls)) {
            i++;
            if (i >= 2) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC87184YJo
    public final InterfaceC87182YJm LIZIZ(Class cls) {
        InterfaceC87184YJo[] interfaceC87184YJoArr = this.LIZ;
        int i = 0;
        do {
            InterfaceC87184YJo interfaceC87184YJo = interfaceC87184YJoArr[i];
            if (interfaceC87184YJo.LIZ(cls)) {
                return interfaceC87184YJo.LIZIZ(cls);
            }
            i++;
        } while (i < 2);
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
