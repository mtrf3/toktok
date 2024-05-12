package X;

/* renamed from: X.Qrs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68336Qrs extends YIN implements YIK {
    public static final C68336Qrs zza;
    public int zze;
    public String zzf = "";
    public String zzg = "";

    static {
        C68336Qrs c68336Qrs = new C68336Qrs();
        zza = c68336Qrs;
        YIN.LJIILLIIL(C68336Qrs.class, c68336Qrs);
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
                    return new C68338Qru();
                }
                return new C68336Qrs();
            }
            return new YJW(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
