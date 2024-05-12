package X;

/* loaded from: classes16.dex */
public final class YJQ extends YIO<YJQ, C87172YJc> implements YID {
    public static volatile InterfaceC87148YIe<YJQ> zzdu;
    public static final YJQ zzlb;
    public int zzdi;
    public String zzen = "";

    static {
        YJQ yjq = new YJQ();
        zzlb = yjq;
        YIO.LJIIJ(YJQ.class, yjq);
    }

    @Override // X.YIO
    public final Object LJIIIIZZ(int i) {
        switch (C87147YId.LIZ[i - 1]) {
            case 1:
                return new YJQ();
            case 2:
                return new C87172YJc();
            case 3:
                return new YJK(zzlb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"zzdi", "zzen"});
            case 4:
                return zzlb;
            case 5:
                InterfaceC87148YIe<YJQ> interfaceC87148YIe = zzdu;
                if (interfaceC87148YIe == null) {
                    synchronized (YJQ.class) {
                        interfaceC87148YIe = zzdu;
                        if (interfaceC87148YIe == null) {
                            interfaceC87148YIe = new YIY<>();
                            zzdu = interfaceC87148YIe;
                        }
                    }
                }
                return interfaceC87148YIe;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
