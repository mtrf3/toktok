package X;

/* renamed from: X.Qqo */
/* loaded from: classes12.dex */
public final class C68270Qqo extends YIN implements YIK {
    public static final C68270Qqo zza;
    public int zze;
    public int zzf;
    public boolean zzh;
    public String zzg = "";
    public XM7 zzi = C84682XLi.LJLJJI;

    public static C68270Qqo LJIJI() {
        return zza;
    }

    public final boolean LJIJJ() {
        return (this.zze & 4) != 0;
    }

    public final boolean LJIJJLI() {
        return (this.zze & 2) != 0;
    }

    public final boolean LJIL() {
        return (this.zze & 1) != 0;
    }

    public final int LJJ() {
        int LIZ = C68324Qrg.LIZ(this.zzf);
        if (LIZ == 0) {
            return 1;
        }
        return LIZ;
    }

    static {
        C68270Qqo c68270Qqo = new C68270Qqo();
        zza = c68270Qqo;
        YIN.LJIILLIIL(C68270Qqo.class, c68270Qqo);
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
                    return new C68298QrG();
                }
                return new C68270Qqo();
            }
            return new YJW(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", C68320Qrc.LIZ, "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
