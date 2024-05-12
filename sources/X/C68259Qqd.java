package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.Qqd */
/* loaded from: classes12.dex */
public final class C68259Qqd extends YIN implements YIK {
    public static final C68259Qqd zza;
    public int zze;
    public long zzf;
    public String zzg = "";
    public String zzh = "";
    public long zzi;
    public float zzj;
    public double zzk;

    public static /* synthetic */ void LJIJJ(C68259Qqd c68259Qqd, long j) {
        c68259Qqd.zze |= 1;
        c68259Qqd.zzf = j;
    }

    public static /* synthetic */ void LJJ(C68259Qqd c68259Qqd) {
        c68259Qqd.zze &= -5;
        c68259Qqd.zzh = zza.zzh;
    }

    public static /* synthetic */ void LJJI(C68259Qqd c68259Qqd, long j) {
        c68259Qqd.zze |= 8;
        c68259Qqd.zzi = j;
    }

    public static /* synthetic */ void LJJIFFI(C68259Qqd c68259Qqd) {
        c68259Qqd.zze &= -9;
        c68259Qqd.zzi = 0L;
    }

    public static /* synthetic */ void LJJII(C68259Qqd c68259Qqd, double d) {
        c68259Qqd.zze |= 32;
        c68259Qqd.zzk = d;
    }

    public static /* synthetic */ void LJJIII(C68259Qqd c68259Qqd) {
        c68259Qqd.zze &= -33;
        c68259Qqd.zzk = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    }

    public final boolean LJJIIJ() {
        return (this.zze & 32) != 0;
    }

    public final boolean LJJIIJZLJL() {
        return (this.zze & 8) != 0;
    }

    public final boolean LJJIIZ() {
        return (this.zze & 1) != 0;
    }

    public final boolean LJJIIZI() {
        return (this.zze & 4) != 0;
    }

    static {
        C68259Qqd c68259Qqd = new C68259Qqd();
        zza = c68259Qqd;
        YIN.LJIILLIIL(C68259Qqd.class, c68259Qqd);
    }

    public static C68282Qr0 LJIJ() {
        return (C68282Qr0) zza.LJIIJ();
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
                    return new C68282Qr0(0);
                }
                return new C68259Qqd();
            }
            return new YJW(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    public static /* synthetic */ void LJIJJLI(C68259Qqd c68259Qqd, String str) {
        str.getClass();
        c68259Qqd.zze |= 2;
        c68259Qqd.zzg = str;
    }

    public static /* synthetic */ void LJIL(C68259Qqd c68259Qqd, String str) {
        str.getClass();
        c68259Qqd.zze |= 4;
        c68259Qqd.zzh = str;
    }
}
