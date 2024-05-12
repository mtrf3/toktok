package X;

/* loaded from: classes16.dex */
public final class YJP extends YIO<YJP, YJY> implements YID {
    public static volatile InterfaceC87148YIe<YJP> zzdu;
    public static final YJP zzjp;
    public int zzdi;
    public long zzjj;
    public long zzjk;
    public long zzfd = -1;
    public long zzfe = -1;
    public long zziw = -1;
    public long zzix = -1;
    public long zziy = -1;
    public long zziz = -1;
    public int zzja = 1000;
    public long zzjb = -1;
    public long zzjc = -1;
    public long zzjd = -1;
    public int zzje = 1000;
    public long zzjf = -1;
    public long zzjg = -1;
    public long zzjh = -1;
    public long zzji = -1;
    public long zzjl = -1;
    public long zzjm = -1;
    public long zzjn = -1;
    public long zzjo = -1;

    static {
        YJP yjp = new YJP();
        zzjp = yjp;
        YIO.LJIIJ(YJP.class, yjp);
    }

    @Override // X.YIO
    public final Object LJIIIIZZ(int i) {
        switch (C87147YId.LIZ[i - 1]) {
            case 1:
                return new YJP();
            case 2:
                return new YJY();
            case 3:
                return new YJK(zzjp, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\f\u0006\b\u0002\u0007\t\u0002\b\n\u0002\t\u000b\f\n\f\u0002\u000b\r\u0002\f\u000e\u0002\r\u000f\u0002\u000e\u0010\u0002\u000f\u0011\u0002\u0010\u0012\u0002\u0011\u0013\u0002\u0012\u0014\u0002\u0013\u0015\u0002\u0014", new Object[]{"zzdi", "zzfd", "zzfe", "zziw", "zzix", "zziy", "zziz", "zzja", YJU.zzad(), "zzjb", "zzjc", "zzjd", "zzje", YJU.zzad(), "zzjf", "zzjg", "zzjh", "zzji", "zzjj", "zzjk", "zzjl", "zzjm", "zzjn", "zzjo"});
            case 4:
                return zzjp;
            case 5:
                InterfaceC87148YIe<YJP> interfaceC87148YIe = zzdu;
                if (interfaceC87148YIe == null) {
                    synchronized (YJP.class) {
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
