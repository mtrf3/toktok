package X;

/* renamed from: X.Qqp */
/* loaded from: classes12.dex */
public final class C68271Qqp extends YIN implements YIK {
    public static final C68271Qqp zza;
    public int zze;
    public int zzf;
    public InterfaceC68330Qrm zzg = C84686XLm.LJLJJI;

    public static /* synthetic */ void LJIJJLI(C68271Qqp c68271Qqp, int i) {
        c68271Qqp.zze |= 1;
        c68271Qqp.zzf = i;
    }

    public final boolean LJIL() {
        return (this.zze & 1) != 0;
    }

    static {
        C68271Qqp c68271Qqp = new C68271Qqp();
        zza = c68271Qqp;
        YIN.LJIILLIIL(C68271Qqp.class, c68271Qqp);
    }

    public static C68302QrK LJIJI() {
        return (C68302QrK) zza.LJIIJ();
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
                    return new C68302QrK(0);
                }
                return new C68271Qqp();
            }
            return new YJW(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final long LJIJ(int i) {
        C84686XLm c84686XLm = (C84686XLm) this.zzg;
        c84686XLm.LJII(i);
        return c84686XLm.LJLILLLLZI[i];
    }
}
