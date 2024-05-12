package X;

/* loaded from: classes16.dex */
public final class YJN extends YIO<YJN, YJZ> implements YID {
    public static volatile InterfaceC87148YIe<YJN> zzdu;
    public static final YJN zzju;
    public int zzdi;
    public long zzgf = -1;
    public long zzgg = -1;
    public long zzjq = -1;
    public long zzjr = -1;
    public long zzjs = -1;
    public long zzjt = -1;

    static {
        YJN yjn = new YJN();
        zzju = yjn;
        YIO.LJIIJ(YJN.class, yjn);
    }

    @Override // X.YIO
    public final Object LJIIIIZZ(int i) {
        switch (C87147YId.LIZ[i - 1]) {
            case 1:
                return new YJN();
            case 2:
                return new YJZ();
            case 3:
                return new YJK(zzju, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005", new Object[]{"zzdi", "zzgf", "zzgg", "zzjq", "zzjr", "zzjs", "zzjt"});
            case 4:
                return zzju;
            case 5:
                InterfaceC87148YIe<YJN> interfaceC87148YIe = zzdu;
                if (interfaceC87148YIe == null) {
                    synchronized (YJN.class) {
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
