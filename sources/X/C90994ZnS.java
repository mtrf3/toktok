package X;

/* renamed from: X.ZnS, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90994ZnS extends AbstractC90950Zmk<C90994ZnS, C90943Zmd> implements InterfaceC90327Zch {
    public static final C90994ZnS zzb;
    public int zze;
    public String zzf = "";
    public String zzg = "";

    static {
        C90994ZnS c90994ZnS = new C90994ZnS();
        zzb = c90994ZnS;
        AbstractC90950Zmk.LIZLLL(C90994ZnS.class, c90994ZnS);
    }

    public static C90943Zmd LJIIJ() {
        return zzb.LJI();
    }

    public static /* synthetic */ void LJIIL(C90994ZnS c90994ZnS, String str) {
        str.getClass();
        c90994ZnS.zze |= 1;
        c90994ZnS.zzf = str;
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
                    return new C90943Zmd(i3);
                }
                return new C90994ZnS();
            }
            return new C90758Zje(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
