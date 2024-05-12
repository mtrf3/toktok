package X;

/* loaded from: classes16.dex */
public final class YJE {
    public static final C87173YJd LIZIZ = new C87173YJd();
    public final InterfaceC87174YJe LIZ;

    public YJE() {
        InterfaceC87174YJe interfaceC87174YJe;
        InterfaceC87174YJe[] interfaceC87174YJeArr = new InterfaceC87174YJe[2];
        interfaceC87174YJeArr[0] = YJ9.LIZ;
        try {
            interfaceC87174YJe = (InterfaceC87174YJe) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            interfaceC87174YJe = LIZIZ;
        }
        interfaceC87174YJeArr[1] = interfaceC87174YJe;
        this.LIZ = new YJF(interfaceC87174YJeArr);
    }
}
