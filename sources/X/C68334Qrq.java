package X;

/* renamed from: X.Qrq */
/* loaded from: classes12.dex */
public final class C68334Qrq extends YIN implements YIK {
    public static final C68334Qrq zza;
    public int zze;
    public XM7 zzf = C84682XLi.LJLJJI;
    public C68332Qro zzg;

    static {
        C68334Qrq c68334Qrq = new C68334Qrq();
        zza = c68334Qrq;
        YIN.LJIILLIIL(C68334Qrq.class, c68334Qrq);
    }

    public final C68332Qro LJIJ() {
        C68332Qro c68332Qro = this.zzg;
        if (c68332Qro == null) {
            return C68332Qro.LJIJI();
        }
        return c68332Qro;
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
                    return new C68343Qrz();
                }
                return new C68334Qrq();
            }
            return new YJW(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", C68347Qs3.class, "zzg"});
        }
        return (byte) 1;
    }
}
