package X;

/* loaded from: classes16.dex */
public final class YJL extends YIO<YJL, C87170YJa> implements YID {
    public static volatile InterfaceC87148YIe<YJL> zzdu;
    public static final YJL zzka;
    public int zzdi;
    public long zzjv;
    public int zzjw;
    public boolean zzjx;
    public InterfaceC84677XLd zzjy = C84679XLf.LJLJJI;
    public long zzjz;

    static {
        YJL yjl = new YJL();
        zzka = yjl;
        YIO.LJIIJ(YJL.class, yjl);
    }

    @Override // X.YIO
    public final Object LJIIIIZZ(int i) {
        switch (C87147YId.LIZ[i - 1]) {
            case 1:
                return new YJL();
            case 2:
                return new C87170YJa();
            case 3:
                return new YJK(zzka, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0002\u0000\u0002\u0004\u0001\u0003\u0007\u0002\u0004\u0016\u0005\u0003\u0003", new Object[]{"zzdi", "zzjv", "zzjw", "zzjx", "zzjy", "zzjz"});
            case 4:
                return zzka;
            case 5:
                InterfaceC87148YIe<YJL> interfaceC87148YIe = zzdu;
                if (interfaceC87148YIe == null) {
                    synchronized (YJL.class) {
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
