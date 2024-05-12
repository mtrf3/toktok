package X;

/* renamed from: X.Qqk */
/* loaded from: classes12.dex */
public final class C68266Qqk extends YIN implements YIK {
    public static final C68266Qqk zza;
    public int zze;
    public int zzf;
    public String zzg = "";
    public C68267Qql zzh;
    public boolean zzi;
    public boolean zzj;
    public boolean zzk;

    public static /* synthetic */ void LJIJJLI(C68266Qqk c68266Qqk, String str) {
        c68266Qqk.zze |= 2;
        c68266Qqk.zzg = str;
    }

    public final boolean LJIL() {
        return (this.zze & 1) != 0;
    }

    public final boolean LJJ() {
        return (this.zze & 32) != 0;
    }

    static {
        C68266Qqk c68266Qqk = new C68266Qqk();
        zza = c68266Qqk;
        YIN.LJIILLIIL(C68266Qqk.class, c68266Qqk);
    }

    public static C68311QrT LJIJI() {
        return (C68311QrT) zza.LJIIJ();
    }

    public final C68267Qql LJIJ() {
        C68267Qql c68267Qql = this.zzh;
        if (c68267Qql == null) {
            return C68267Qql.LJIJI();
        }
        return c68267Qql;
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
                    return new C68311QrT(0);
                }
                return new C68266Qqk();
            }
            return new YJW(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
