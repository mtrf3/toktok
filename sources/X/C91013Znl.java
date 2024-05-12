package X;

/* renamed from: X.Znl */
/* loaded from: classes29.dex */
public final class C91013Znl extends AbstractC90950Zmk<C91013Znl, C90965Zmz> implements InterfaceC90327Zch {
    public static final C91013Znl zzb;
    public int zze;
    public C90994ZnS zzf;
    public boolean zzg;
    public long zzh;
    public int zzi;
    public int zzj;
    public int zzk;
    public int zzl;
    public int zzm;
    public C90986ZnK zzn;
    public int zzo;
    public int zzp;

    public static C91013Znl LJIILL() {
        return zzb;
    }

    public static /* synthetic */ void LJIIZILJ(C91013Znl c91013Znl, boolean z) {
        c91013Znl.zze |= 2;
        c91013Znl.zzg = z;
    }

    public static /* synthetic */ void LJIJ(C91013Znl c91013Znl, long j) {
        c91013Znl.zze |= 4;
        c91013Znl.zzh = j;
    }

    public static /* synthetic */ void LJIJI(C91013Znl c91013Znl, int i) {
        c91013Znl.zze |= 64;
        c91013Znl.zzl = i;
    }

    public static /* synthetic */ void LJIJJ(C91013Znl c91013Znl, int i) {
        c91013Znl.zze |= 128;
        c91013Znl.zzm = i;
    }

    public static /* synthetic */ void LJIJJLI(C91013Znl c91013Znl, int i) {
        c91013Znl.zze |= 1024;
        c91013Znl.zzp = i;
    }

    static {
        C91013Znl c91013Znl = new C91013Znl();
        zzb = c91013Znl;
        AbstractC90950Zmk.LIZLLL(C91013Znl.class, c91013Znl);
    }

    public static C90965Zmz LJIIJ() {
        return zzb.LJI();
    }

    public static C90965Zmz LJIIJJI(C91013Znl c91013Znl) {
        C90965Zmz LJI = zzb.LJI();
        LJI.LIZIZ(c91013Znl);
        return LJI;
    }

    public static /* synthetic */ void LJIILLIIL(C91013Znl c91013Znl, C90994ZnS c90994ZnS) {
        c91013Znl.zzf = c90994ZnS;
        c91013Znl.zze |= 1;
    }

    @Override // X.AbstractC90950Zmk
    public final Object LJ(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new C90965Zmz(0);
                }
                return new C91013Znl();
            }
            return new C90758Zje(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007င\u0006\bင\u0007\tဉ\b\nဌ\t\u000bင\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", C90661Zi5.LIZ, "zzk", C90763Zjj.LIZ, "zzl", "zzm", "zzn", "zzo", C90722Zj4.LIZ, "zzp"});
        }
        return (byte) 1;
    }
}
