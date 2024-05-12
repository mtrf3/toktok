package X;

/* renamed from: X.Qqn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68269Qqn extends YIN implements YIK {
    public static final C68269Qqn zza;
    public int zze;
    public int zzf;
    public boolean zzg;
    public String zzh = "";
    public String zzi = "";
    public String zzj = "";

    public static C68269Qqn LJIJI() {
        return zza;
    }

    public final boolean LJIJJ() {
        return (this.zze & 1) != 0;
    }

    public final boolean LJIJJLI() {
        return (this.zze & 4) != 0;
    }

    public final boolean LJIL() {
        return (this.zze & 2) != 0;
    }

    public final boolean LJJ() {
        return (this.zze & 16) != 0;
    }

    public final boolean LJJI() {
        return (this.zze & 8) != 0;
    }

    public final int LJJIFFI() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        if (i2 != 4) {
                            return 1;
                        }
                        i = 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        return i;
    }

    static {
        C68269Qqn c68269Qqn = new C68269Qqn();
        zza = c68269Qqn;
        YIN.LJIILLIIL(C68269Qqn.class, c68269Qqn);
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
                    return new C68309QrR();
                }
                return new C68269Qqn();
            }
            return new YJW(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", C68323Qrf.LIZ, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
