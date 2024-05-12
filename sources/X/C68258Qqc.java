package X;

/* renamed from: X.Qqc */
/* loaded from: classes12.dex */
public final class C68258Qqc extends YIN implements YIK {
    public static final /* synthetic */ int LJLIL = 0;
    public static final C68258Qqc zza;
    public int zze;
    public int zzf;
    public String zzg = "";
    public XM7 zzh = C84682XLi.LJLJJI;
    public boolean zzi;
    public C68269Qqn zzj;
    public boolean zzk;
    public boolean zzl;
    public boolean zzm;

    public static /* synthetic */ void LJIJJLI(C68258Qqc c68258Qqc, String str) {
        c68258Qqc.zze |= 2;
        c68258Qqc.zzg = str;
    }

    public final boolean LJIL() {
        return (this.zze & 8) != 0;
    }

    public final boolean LJJ() {
        return (this.zze & 1) != 0;
    }

    public final boolean LJJI() {
        return (this.zze & 64) != 0;
    }

    static {
        C68258Qqc c68258Qqc = new C68258Qqc();
        zza = c68258Qqc;
        YIN.LJIILLIIL(C68258Qqc.class, c68258Qqc);
    }

    public static C68303QrL LJIJ() {
        return (C68303QrL) zza.LJIIJ();
    }

    public final C68269Qqn LJIJJ() {
        C68269Qqn c68269Qqn = this.zzj;
        if (c68269Qqn == null) {
            return C68269Qqn.LJIJI();
        }
        return c68269Qqn;
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
                    return new C68303QrL(0);
                }
                return new C68258Qqc();
            }
            return new YJW(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", C68267Qql.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }
}
