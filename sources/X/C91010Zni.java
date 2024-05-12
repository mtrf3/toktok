package X;

/* renamed from: X.Zni, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C91010Zni extends AbstractC90950Zmk<C91010Zni, C90960Zmu> implements InterfaceC90327Zch {
    public static final C91010Zni zzb;
    public int zze;
    public String zzf = "";
    public String zzg = "";

    static {
        C91010Zni c91010Zni = new C91010Zni();
        zzb = c91010Zni;
        AbstractC90950Zmk.LIZLLL(C91010Zni.class, c91010Zni);
    }

    public static C90960Zmu LJIIJ() {
        return zzb.LJI();
    }

    public static /* synthetic */ void LJIIL(C91010Zni c91010Zni, String str) {
        str.getClass();
        c91010Zni.zze |= 1;
        c91010Zni.zzf = str;
    }

    public static /* synthetic */ void LJIILL(C91010Zni c91010Zni, String str) {
        str.getClass();
        c91010Zni.zze |= 2;
        c91010Zni.zzg = str;
    }

    @Override // X.AbstractC90950Zmk
    public final Object LJ(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            int i3 = 0;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new C90960Zmu(i3);
                }
                return new C91010Zni();
            }
            return new C90758Zje(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
