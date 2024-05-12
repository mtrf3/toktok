package X;

/* renamed from: X.Qqh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68263Qqh extends YIN implements YIK {
    public static final /* synthetic */ int LJLIL = 0;
    public static final C68263Qqh zza;
    public InterfaceC68330Qrm zze;
    public InterfaceC68330Qrm zzf;
    public XM7 zzg;
    public XM7 zzh;

    public static C68263Qqh LJIJJLI() {
        return zza;
    }

    static {
        C68263Qqh c68263Qqh = new C68263Qqh();
        zza = c68263Qqh;
        YIN.LJIILLIIL(C68263Qqh.class, c68263Qqh);
    }

    public static C68262Qqg LJIJI() {
        return (C68262Qqg) zza.LJIIJ();
    }

    public final void LJJ() {
        XM7 xm7 = this.zzg;
        if (!xm7.LIZIZ()) {
            this.zzg = YIN.LJIILJJIL(xm7);
        }
    }

    public C68263Qqh() {
        C84686XLm c84686XLm = C84686XLm.LJLJJI;
        this.zze = c84686XLm;
        this.zzf = c84686XLm;
        C84682XLi c84682XLi = C84682XLi.LJLJJI;
        this.zzg = c84682XLi;
        this.zzh = c84682XLi;
    }

    @Override // X.YIN
    public final Object LJIIZILJ(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            int i3 = 0;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new C68262Qqg(i3);
                }
                return new C68263Qqh();
            }
            return new YJW(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", C68274Qqs.class, "zzh", C68271Qqp.class});
        }
        return (byte) 1;
    }

    public final C68274Qqs LJIJ(int i) {
        return (C68274Qqs) this.zzg.get(i);
    }

    public final C68271Qqp LJIL(int i) {
        return (C68271Qqp) this.zzh.get(i);
    }
}
