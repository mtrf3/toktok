package X;

/* renamed from: X.Qqe */
/* loaded from: classes12.dex */
public final class C68260Qqe extends YIN implements YIK {
    public static final /* synthetic */ int LJLIL = 0;
    public static final C68260Qqe zza;
    public int zze;
    public XM7 zzf = C84682XLi.LJLJJI;
    public String zzg = "";
    public long zzh;
    public long zzi;
    public int zzj;

    public static /* synthetic */ void LJIJJLI(long j, C68260Qqe c68260Qqe) {
        c68260Qqe.zze |= 2;
        c68260Qqe.zzh = j;
    }

    public static /* synthetic */ void LJIL(long j, C68260Qqe c68260Qqe) {
        c68260Qqe.zze |= 4;
        c68260Qqe.zzi = j;
    }

    public final boolean LJJ() {
        return (this.zze & 8) != 0;
    }

    public final boolean LJJI() {
        return (this.zze & 4) != 0;
    }

    public final boolean LJJIFFI() {
        return (this.zze & 2) != 0;
    }

    static {
        C68260Qqe c68260Qqe = new C68260Qqe();
        zza = c68260Qqe;
        YIN.LJIILLIIL(C68260Qqe.class, c68260Qqe);
    }

    public static C68264Qqi LJIJ() {
        return (C68264Qqi) zza.LJIIJ();
    }

    public final void LJJII() {
        XM7 xm7 = this.zzf;
        if (!xm7.LIZIZ()) {
            this.zzf = YIN.LJIILJJIL(xm7);
        }
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
                    return new C68264Qqi(0);
                }
                return new C68260Qqe();
            }
            return new YJW(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", C68257Qqb.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public static /* synthetic */ void LJIJJ(C68260Qqe c68260Qqe, String str) {
        str.getClass();
        c68260Qqe.zze |= 1;
        c68260Qqe.zzg = str;
    }
}
