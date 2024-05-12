package X;

/* renamed from: X.ZnO */
/* loaded from: classes29.dex */
public final class C90990ZnO extends AbstractC90950Zmk<C90990ZnO, C90940Zma> implements InterfaceC90327Zch {
    public static final C90990ZnO zzb;
    public int zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public byte zzi = 2;

    static {
        C90990ZnO c90990ZnO = new C90990ZnO();
        zzb = c90990ZnO;
        AbstractC90950Zmk.LIZLLL(C90990ZnO.class, c90990ZnO);
    }

    @Override // X.AbstractC90950Zmk
    public final Object LJ(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 0;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (obj != null) {
                                b = 1;
                            }
                            this.zzi = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new C90940Zma();
                }
                return new C90990ZnO();
            }
            return new C90758Zje(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔌ\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"zze", "zzf", C90705Zin.LIZ, "zzg", "zzh", C90664Zi8.LIZ});
        }
        return Byte.valueOf(this.zzi);
    }
}
