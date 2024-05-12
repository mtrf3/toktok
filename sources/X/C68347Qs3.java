package X;

/* renamed from: X.Qs3 */
/* loaded from: classes12.dex */
public final class C68347Qs3 extends YIN implements YIK {
    public static final C68347Qs3 zza;
    public int zze;
    public int zzf;
    public XM7 zzg = C84682XLi.LJLJJI;
    public String zzh = "";
    public String zzi = "";
    public boolean zzj;
    public double zzk;

    public final boolean LJIJI() {
        return (this.zze & 8) != 0;
    }

    public final boolean LJIJJ() {
        return (this.zze & 16) != 0;
    }

    public final boolean LJIJJLI() {
        return (this.zze & 4) != 0;
    }

    public final int LJIL() {
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
        C68347Qs3 c68347Qs3 = new C68347Qs3();
        zza = c68347Qs3;
        YIN.LJIILLIIL(C68347Qs3.class, c68347Qs3);
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
                    return new C68351Qs7();
                }
                return new C68347Qs3();
            }
            return new YJW(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", C68352Qs8.LIZ, "zzg", C68347Qs3.class, "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
