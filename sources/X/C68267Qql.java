package X;

/* renamed from: X.Qql */
/* loaded from: classes12.dex */
public final class C68267Qql extends YIN implements YIK {
    public static final C68267Qql zza;
    public int zze;
    public C68270Qqo zzf;
    public C68269Qqn zzg;
    public boolean zzh;
    public String zzi = "";

    public static C68267Qql LJIJI() {
        return zza;
    }

    public static /* synthetic */ void LJIL(C68267Qql c68267Qql, String str) {
        c68267Qql.zze |= 8;
        c68267Qql.zzi = str;
    }

    public final boolean LJJ() {
        return (this.zze & 4) != 0;
    }

    public final boolean LJJI() {
        return (this.zze & 2) != 0;
    }

    public final boolean LJJIFFI() {
        return (this.zze & 8) != 0;
    }

    public final boolean LJJII() {
        return (this.zze & 1) != 0;
    }

    static {
        C68267Qql c68267Qql = new C68267Qql();
        zza = c68267Qql;
        YIN.LJIILLIIL(C68267Qql.class, c68267Qql);
    }

    public final C68269Qqn LJIJJ() {
        C68269Qqn c68269Qqn = this.zzg;
        if (c68269Qqn == null) {
            return C68269Qqn.LJIJI();
        }
        return c68269Qqn;
    }

    public final C68270Qqo LJIJJLI() {
        C68270Qqo c68270Qqo = this.zzf;
        if (c68270Qqo == null) {
            return C68270Qqo.LJIJI();
        }
        return c68270Qqo;
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
                    return new C68307QrP(0);
                }
                return new C68267Qql();
            }
            return new YJW(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
