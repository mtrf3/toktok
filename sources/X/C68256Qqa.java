package X;

/* renamed from: X.Qqa */
/* loaded from: classes12.dex */
public final class C68256Qqa extends YIN implements YIK {
    public static final /* synthetic */ int LJLIL = 0;
    public static final C68256Qqa zza;
    public int zze;
    public long zzf;
    public String zzg = "";
    public int zzh;
    public XM7 zzi;
    public XM7 zzj;
    public XM7 zzk;
    public String zzl;
    public boolean zzm;
    public XM7 zzn;
    public XM7 zzo;
    public String zzp;

    public static C68256Qqa LJIL() {
        return zza;
    }

    public final boolean LJJI() {
        return (this.zze & 2) != 0;
    }

    public final boolean LJJIFFI() {
        return (this.zze & 1) != 0;
    }

    static {
        C68256Qqa c68256Qqa = new C68256Qqa();
        zza = c68256Qqa;
        YIN.LJIILLIIL(C68256Qqa.class, c68256Qqa);
    }

    public static C68299QrH LJIJJ() {
        return (C68299QrH) zza.LJIIJ();
    }

    public final int LJIJ() {
        return this.zzj.size();
    }

    public C68256Qqa() {
        C84682XLi c84682XLi = C84682XLi.LJLJJI;
        this.zzi = c84682XLi;
        this.zzj = c84682XLi;
        this.zzk = c84682XLi;
        this.zzl = "";
        this.zzn = c84682XLi;
        this.zzo = c84682XLi;
        this.zzp = "";
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
                    return new C68299QrH(0);
                }
                return new C68256Qqa();
            }
            return new YJW(zza, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C68283Qr1.class, "zzj", C68272Qqq.class, "zzk", C68273Qqr.class, "zzl", "zzm", "zzn", C68334Qrq.class, "zzo", C68333Qrp.class, "zzp"});
        }
        return (byte) 1;
    }

    public final C68272Qqq LJIJI(int i) {
        return (C68272Qqq) this.zzj.get(i);
    }

    public static /* synthetic */ void LJJ(C68256Qqa c68256Qqa, int i, C68272Qqq c68272Qqq) {
        XM7 xm7 = c68256Qqa.zzj;
        if (!xm7.LIZIZ()) {
            c68256Qqa.zzj = YIN.LJIILJJIL(xm7);
        }
        c68256Qqa.zzj.set(i, c68272Qqq);
    }
}
