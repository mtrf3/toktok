package X;

/* renamed from: X.Qqs */
/* loaded from: classes12.dex */
public final class C68274Qqs extends YIN implements YIK {
    public static final C68274Qqs zza;
    public int zze;
    public int zzf;
    public long zzg;

    public static /* synthetic */ void LJIJJ(C68274Qqs c68274Qqs, int i) {
        c68274Qqs.zze |= 1;
        c68274Qqs.zzf = i;
    }

    public static /* synthetic */ void LJIJJLI(C68274Qqs c68274Qqs, long j) {
        c68274Qqs.zze |= 2;
        c68274Qqs.zzg = j;
    }

    public final boolean LJIL() {
        return (this.zze & 2) != 0;
    }

    public final boolean LJJ() {
        return (this.zze & 1) != 0;
    }

    static {
        C68274Qqs c68274Qqs = new C68274Qqs();
        zza = c68274Qqs;
        YIN.LJIILLIIL(C68274Qqs.class, c68274Qqs);
    }

    public static C68310QrS LJIJ() {
        return (C68310QrS) zza.LJIIJ();
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
                    return new C68310QrS(0);
                }
                return new C68274Qqs();
            }
            return new YJW(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
