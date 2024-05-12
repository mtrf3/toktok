package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.Qqb */
/* loaded from: classes12.dex */
public final class C68257Qqb extends YIN implements YIK {
    public static final /* synthetic */ int LJLIL = 0;
    public static final C68257Qqb zza;
    public int zze;
    public long zzh;
    public float zzi;
    public double zzj;
    public String zzf = "";
    public String zzg = "";
    public XM7 zzk = C84682XLi.LJLJJI;

    public static /* synthetic */ void LJIL(C68257Qqb c68257Qqb) {
        c68257Qqb.zze &= -3;
        c68257Qqb.zzg = zza.zzg;
    }

    public static /* synthetic */ void LJJ(C68257Qqb c68257Qqb, long j) {
        c68257Qqb.zze |= 4;
        c68257Qqb.zzh = j;
    }

    public static /* synthetic */ void LJJI(C68257Qqb c68257Qqb) {
        c68257Qqb.zze &= -5;
        c68257Qqb.zzh = 0L;
    }

    public static /* synthetic */ void LJJIFFI(C68257Qqb c68257Qqb, double d) {
        c68257Qqb.zze |= 16;
        c68257Qqb.zzj = d;
    }

    public static /* synthetic */ void LJJII(C68257Qqb c68257Qqb) {
        c68257Qqb.zze &= -17;
        c68257Qqb.zzj = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    }

    public final boolean LJJIII() {
        return (this.zze & 16) != 0;
    }

    public final boolean LJJIIJ() {
        return (this.zze & 8) != 0;
    }

    public final boolean LJJIIJZLJL() {
        return (this.zze & 4) != 0;
    }

    public final boolean LJJIIZ() {
        return (this.zze & 1) != 0;
    }

    public final boolean LJJIIZI() {
        return (this.zze & 2) != 0;
    }

    static {
        C68257Qqb c68257Qqb = new C68257Qqb();
        zza = c68257Qqb;
        YIN.LJIILLIIL(C68257Qqb.class, c68257Qqb);
    }

    public static C68281Qqz LJIJ() {
        return (C68281Qqz) zza.LJIIJ();
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
                    return new C68281Qqz(0);
                }
                return new C68257Qqb();
            }
            return new YJW(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C68257Qqb.class});
        }
        return (byte) 1;
    }

    public static /* synthetic */ void LJIJJ(C68257Qqb c68257Qqb, String str) {
        str.getClass();
        c68257Qqb.zze |= 1;
        c68257Qqb.zzf = str;
    }

    public static /* synthetic */ void LJIJJLI(C68257Qqb c68257Qqb, String str) {
        str.getClass();
        c68257Qqb.zze |= 2;
        c68257Qqb.zzg = str;
    }
}
