package X;

/* loaded from: classes16.dex */
public final class YJM extends YIO<YJM, C87171YJb> implements YID {
    public static volatile InterfaceC87148YIe<YJM> zzdu;
    public static final YJM zzla;
    public int zzdi;
    public long zzjv;
    public String zzky = "";
    public AbstractC87141YHx zzkz = AbstractC87141YHx.zzfuo;

    static {
        YJM yjm = new YJM();
        zzla = yjm;
        YIO.LJIIJ(YJM.class, yjm);
    }

    @Override // X.YIO
    public final Object LJIIIIZZ(int i) {
        switch (C87147YId.LIZ[i - 1]) {
            case 1:
                return new YJM();
            case 2:
                return new C87171YJb();
            case 3:
                return new YJK(zzla, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0002\u0000\u0003\b\u0001\u0004\n\u0002", new Object[]{"zzdi", "zzjv", "zzky", "zzkz"});
            case 4:
                return zzla;
            case 5:
                InterfaceC87148YIe<YJM> interfaceC87148YIe = zzdu;
                if (interfaceC87148YIe == null) {
                    synchronized (YJM.class) {
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
