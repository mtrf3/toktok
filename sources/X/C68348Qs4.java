package X;

/* renamed from: X.Qs4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68348Qs4 extends YIN implements YIK {
    public static final C68348Qs4 zza;
    public int zze;
    public String zzf = "";
    public long zzg;

    static {
        C68348Qs4 c68348Qs4 = new C68348Qs4();
        zza = c68348Qs4;
        YIN.LJIILLIIL(C68348Qs4.class, c68348Qs4);
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
                    return new C68350Qs6(i3);
                }
                return new C68348Qs4();
            }
            return new YJW(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
