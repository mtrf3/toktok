package X;

/* loaded from: classes16.dex */
public final class YJD {
    public static final C87177YJh LIZIZ = new C87177YJh();
    public final YJJ LIZ;

    public YJD() {
        InterfaceC87184YJo interfaceC87184YJo;
        InterfaceC87184YJo[] interfaceC87184YJoArr = new InterfaceC87184YJo[2];
        interfaceC87184YJoArr[0] = YJC.LIZ;
        try {
            interfaceC87184YJo = (InterfaceC87184YJo) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            interfaceC87184YJo = LIZIZ;
        }
        interfaceC87184YJoArr[1] = interfaceC87184YJo;
        this.LIZ = new YJJ(interfaceC87184YJoArr);
    }
}
