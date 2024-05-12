package X;

/* renamed from: X.Qqq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68272Qqq extends YIN implements YIK {
    public static final C68272Qqq zza;
    public int zze;
    public String zzf = "";
    public boolean zzg;
    public boolean zzh;
    public int zzi;

    public final boolean LJIJJ() {
        return (this.zze & 2) != 0;
    }

    public final boolean LJIJJLI() {
        return (this.zze & 4) != 0;
    }

    public final boolean LJIL() {
        return (this.zze & 8) != 0;
    }

    static {
        C68272Qqq c68272Qqq = new C68272Qqq();
        zza = c68272Qqq;
        YIN.LJIILLIIL(C68272Qqq.class, c68272Qqq);
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
                    return new C68294QrC(i3);
                }
                return new C68272Qqq();
            }
            return new YJW(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public static /* synthetic */ void LJIJI(C68272Qqq c68272Qqq, String str) {
        str.getClass();
        c68272Qqq.zze |= 1;
        c68272Qqq.zzf = str;
    }
}
