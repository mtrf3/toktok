package X;

/* renamed from: X.Qqj */
/* loaded from: classes12.dex */
public final class C68265Qqj extends YIN implements YIK {
    public static final C68265Qqj zza;
    public int zze;
    public int zzf;
    public C68263Qqh zzg;
    public C68263Qqh zzh;
    public boolean zzi;

    public static /* synthetic */ void LJIL(C68265Qqj c68265Qqj, int i) {
        c68265Qqj.zze |= 1;
        c68265Qqj.zzf = i;
    }

    public static /* synthetic */ void LJJI(C68265Qqj c68265Qqj, C68263Qqh c68263Qqh) {
        c68265Qqj.zzh = c68263Qqh;
        c68265Qqj.zze |= 4;
    }

    public static /* synthetic */ void LJJIFFI(C68265Qqj c68265Qqj, boolean z) {
        c68265Qqj.zze |= 8;
        c68265Qqj.zzi = z;
    }

    public final boolean LJJII() {
        return (this.zze & 1) != 0;
    }

    public final boolean LJJIII() {
        return (this.zze & 8) != 0;
    }

    public final boolean LJJIIJ() {
        return (this.zze & 4) != 0;
    }

    static {
        C68265Qqj c68265Qqj = new C68265Qqj();
        zza = c68265Qqj;
        YIN.LJIILLIIL(C68265Qqj.class, c68265Qqj);
    }

    public static C68308QrQ LJIJ() {
        return (C68308QrQ) zza.LJIIJ();
    }

    public final C68263Qqh LJIJJ() {
        C68263Qqh c68263Qqh = this.zzg;
        if (c68263Qqh == null) {
            return C68263Qqh.LJIJJLI();
        }
        return c68263Qqh;
    }

    public final C68263Qqh LJIJJLI() {
        C68263Qqh c68263Qqh = this.zzh;
        if (c68263Qqh == null) {
            return C68263Qqh.LJIJJLI();
        }
        return c68263Qqh;
    }

    @Override // X.YIN
    public final Object LJIIZILJ(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new C68308QrQ(0);
                }
                return new C68265Qqj();
            }
            return new YJW(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public static /* synthetic */ void LJJ(C68265Qqj c68265Qqj, C68263Qqh c68263Qqh) {
        c68265Qqj.zzg = c68263Qqh;
        c68265Qqj.zze |= 2;
    }
}
