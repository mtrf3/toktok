package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: X.QqQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68246QqQ extends YIN implements YIK {
    public static final /* synthetic */ int zza = 0;
    public static final C68246QqQ zze;
    public boolean zzA;
    public String zzB;
    public long zzC;
    public int zzD;
    public String zzE;
    public String zzF;
    public boolean zzG;
    public XM7 zzH;
    public String zzI;
    public int zzJ;
    public int zzK;
    public int zzL;
    public String zzM;
    public long zzN;
    public long zzO;
    public String zzP;
    public String zzQ;
    public int zzR;
    public String zzS;
    public C68346Qs2 zzT;
    public InterfaceC68329Qrl zzU;
    public long zzV;
    public long zzW;
    public String zzX;
    public String zzY;
    public int zzZ;
    public boolean zzaa;
    public String zzab;
    public boolean zzac;
    public C68305QrN zzad;
    public String zzae;
    public XM7 zzaf;
    public String zzag;
    public int zzf;
    public int zzg;
    public int zzh;
    public XM7 zzi;
    public XM7 zzj;
    public long zzk;
    public long zzl;
    public long zzm;
    public long zzn;
    public long zzo;
    public String zzp;
    public String zzq;
    public String zzr;
    public String zzs;
    public int zzt;
    public String zzu;
    public String zzv;
    public String zzw;
    public long zzx;
    public long zzy;
    public String zzz;

    public static /* synthetic */ void LJIJ(C68246QqQ c68246QqQ, long j) {
        c68246QqQ.zzf |= 1073741824;
        c68246QqQ.zzO = j;
    }

    public static /* synthetic */ void LJIJI(C68246QqQ c68246QqQ) {
        c68246QqQ.zzf &= Integer.MAX_VALUE;
        c68246QqQ.zzP = zze.zzP;
    }

    public static /* synthetic */ void LJIJJ(C68246QqQ c68246QqQ, int i) {
        c68246QqQ.zzg |= 2;
        c68246QqQ.zzR = i;
    }

    public static /* synthetic */ void LJJ(C68246QqQ c68246QqQ, long j) {
        c68246QqQ.zzg |= 16;
        c68246QqQ.zzV = j;
    }

    public static /* synthetic */ void LJJI(C68246QqQ c68246QqQ, long j) {
        c68246QqQ.zzg |= 32;
        c68246QqQ.zzW = j;
    }

    public static /* synthetic */ void LJJIIJ(C68246QqQ c68246QqQ, long j) {
        c68246QqQ.zzf |= 16384;
        c68246QqQ.zzx = j;
    }

    public static /* synthetic */ void LJJIIJZLJL(C68246QqQ c68246QqQ) {
        c68246QqQ.zzf |= 32768;
        c68246QqQ.zzy = 64000L;
    }

    public static /* synthetic */ void LJJIIZI(C68246QqQ c68246QqQ) {
        c68246QqQ.zzf &= -65537;
        c68246QqQ.zzz = zze.zzz;
    }

    public static /* synthetic */ void LJJIJ(C68246QqQ c68246QqQ, boolean z) {
        c68246QqQ.zzf |= 131072;
        c68246QqQ.zzA = z;
    }

    public static /* synthetic */ void LJJIJIIJI(C68246QqQ c68246QqQ) {
        c68246QqQ.zzf &= -131073;
        c68246QqQ.zzA = false;
    }

    public static /* synthetic */ void LJJIJIL(C68246QqQ c68246QqQ) {
        c68246QqQ.zzf &= -262145;
        c68246QqQ.zzB = zze.zzB;
    }

    public static /* synthetic */ void LJJIJL(C68246QqQ c68246QqQ, long j) {
        c68246QqQ.zzf |= 524288;
        c68246QqQ.zzC = j;
    }

    public static /* synthetic */ void LJJIJLIJ(C68246QqQ c68246QqQ, int i) {
        c68246QqQ.zzf |= 1048576;
        c68246QqQ.zzD = i;
    }

    public static /* synthetic */ void LJJIL(C68246QqQ c68246QqQ, String str) {
        c68246QqQ.zzf |= 2097152;
        c68246QqQ.zzE = str;
    }

    public static /* synthetic */ void LJJIZ(C68246QqQ c68246QqQ) {
        c68246QqQ.zzf &= -2097153;
        c68246QqQ.zzE = zze.zzE;
    }

    public static /* synthetic */ void LJJJI(C68246QqQ c68246QqQ) {
        c68246QqQ.zzf |= 8388608;
        c68246QqQ.zzG = false;
    }

    public static /* synthetic */ void LJJJJ(C68246QqQ c68246QqQ, int i) {
        c68246QqQ.zzf |= 33554432;
        c68246QqQ.zzJ = i;
    }

    public static /* synthetic */ void LJJJJI(C68246QqQ c68246QqQ) {
        c68246QqQ.zzf |= 1;
        c68246QqQ.zzh = 1;
    }

    public static /* synthetic */ void LJJJJIZL(C68246QqQ c68246QqQ) {
        c68246QqQ.zzf &= -268435457;
        c68246QqQ.zzM = zze.zzM;
    }

    public static /* synthetic */ void LJJJJJ(C68246QqQ c68246QqQ, long j) {
        c68246QqQ.zzf |= 536870912;
        c68246QqQ.zzN = j;
    }

    public static /* synthetic */ void LJJJJJL(C68246QqQ c68246QqQ, String str) {
        c68246QqQ.zzg |= 128;
        c68246QqQ.zzY = str;
    }

    public static /* synthetic */ void LJJJJLI(C68246QqQ c68246QqQ) {
        c68246QqQ.zzg &= -8193;
        c68246QqQ.zzae = zze.zzae;
    }

    public static /* synthetic */ void LJJJJZI(C68246QqQ c68246QqQ, long j) {
        c68246QqQ.zzf |= 2;
        c68246QqQ.zzk = j;
    }

    public static /* synthetic */ void LJJJLIIL(C68246QqQ c68246QqQ, long j) {
        c68246QqQ.zzf |= 4;
        c68246QqQ.zzl = j;
    }

    public static /* synthetic */ void LJJJLL(C68246QqQ c68246QqQ, long j) {
        c68246QqQ.zzf |= 8;
        c68246QqQ.zzm = j;
    }

    public static /* synthetic */ void LJJJLZIJ(C68246QqQ c68246QqQ, long j) {
        c68246QqQ.zzf |= 16;
        c68246QqQ.zzn = j;
    }

    public static /* synthetic */ void LJJJZ(C68246QqQ c68246QqQ) {
        c68246QqQ.zzf &= -17;
        c68246QqQ.zzn = 0L;
    }

    public static /* synthetic */ void LJJL(C68246QqQ c68246QqQ, long j) {
        c68246QqQ.zzf |= 32;
        c68246QqQ.zzo = j;
    }

    public static /* synthetic */ void LJJLI(C68246QqQ c68246QqQ) {
        c68246QqQ.zzf &= -33;
        c68246QqQ.zzo = 0L;
    }

    public static /* synthetic */ void LJJLIIIIJ(C68246QqQ c68246QqQ) {
        c68246QqQ.zzf |= 64;
        c68246QqQ.zzp = "android";
    }

    public static /* synthetic */ void LJJLIIIJILLIZJL(C68246QqQ c68246QqQ) {
        c68246QqQ.zzf &= -129;
        c68246QqQ.zzq = zze.zzq;
    }

    public static /* synthetic */ void LJJLIIIJJIZ(C68246QqQ c68246QqQ) {
        c68246QqQ.zzf &= -257;
        c68246QqQ.zzr = zze.zzr;
    }

    public static /* synthetic */ void LJJLIIIJLJLI(C68246QqQ c68246QqQ, int i) {
        c68246QqQ.zzf |= 1024;
        c68246QqQ.zzt = i;
    }

    public final boolean LJJLIIJ() {
        return (this.zzf & 1073741824) != 0;
    }

    public final boolean LJJLIL() {
        return (this.zzf & 33554432) != 0;
    }

    public final boolean LJJLJ() {
        return (this.zzf & 1048576) != 0;
    }

    public final boolean LJJLJLI() {
        return (this.zzf & 536870912) != 0;
    }

    public final boolean LJJLL() {
        return (this.zzg & 128) != 0;
    }

    public final boolean LJJZ() {
        return (this.zzf & 524288) != 0;
    }

    public final boolean LJJZZI() {
        return (this.zzg & 16) != 0;
    }

    public final boolean LJJZZIII() {
        return (this.zzf & 8) != 0;
    }

    public final boolean LJL() {
        return (this.zzf & 16384) != 0;
    }

    public final boolean LJLI() {
        return (this.zzf & 131072) != 0;
    }

    public final boolean LJLIIIL() {
        return (this.zzf & 32) != 0;
    }

    public final boolean LJLIIL() {
        return (this.zzf & 16) != 0;
    }

    public final boolean LJLIL() {
        return (this.zzf & 1) != 0;
    }

    public final boolean LJLILLLLZI() {
        return (this.zzg & 2) != 0;
    }

    public final boolean LJLJI() {
        return (this.zzf & 8388608) != 0;
    }

    public final boolean LJLJJI() {
        return (this.zzg & FileUtils.BUFFER_SIZE) != 0;
    }

    public final boolean LJLJJL() {
        return (this.zzf & 4) != 0;
    }

    public final boolean LJLJJLL() {
        return (this.zzf & 1024) != 0;
    }

    public final boolean LJLJL() {
        return (this.zzf & 2) != 0;
    }

    public final boolean LJLJLJ() {
        return (this.zzf & 32768) != 0;
    }

    static {
        C68246QqQ c68246QqQ = new C68246QqQ();
        zze = c68246QqQ;
        YIN.LJIILLIIL(C68246QqQ.class, c68246QqQ);
    }

    public static C68253QqX LJLJLLL() {
        return (C68253QqX) zze.LJIIJ();
    }

    public final void LJJLIIIJLLLLLLLZ() {
        XM7 xm7 = this.zzi;
        if (!xm7.LIZIZ()) {
            this.zzi = YIN.LJIILJJIL(xm7);
        }
    }

    public C68246QqQ() {
        C84682XLi c84682XLi = C84682XLi.LJLJJI;
        this.zzi = c84682XLi;
        this.zzj = c84682XLi;
        this.zzp = "";
        this.zzq = "";
        this.zzr = "";
        this.zzs = "";
        this.zzu = "";
        this.zzv = "";
        this.zzw = "";
        this.zzz = "";
        this.zzB = "";
        this.zzE = "";
        this.zzF = "";
        this.zzH = c84682XLi;
        this.zzI = "";
        this.zzM = "";
        this.zzP = "";
        this.zzQ = "";
        this.zzS = "";
        this.zzU = C84684XLk.LJLJJI;
        this.zzX = "";
        this.zzY = "";
        this.zzab = "";
        this.zzae = "";
        this.zzaf = c84682XLi;
        this.zzag = "";
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
                        return zze;
                    }
                    return new C68253QqX(i3);
                }
                return new C68246QqQ();
            }
            return new YJW(zze, "\u00014\u0000\u0002\u0001A4\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.", new Object[]{"zzf", "zzg", "zzh", "zzi", C68260Qqe.class, "zzj", C68259Qqd.class, "zzk", "zzl", "zzm", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzn", "zzG", "zzH", C68265Qqj.class, "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ", C68322Qre.LIZ, "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag"});
        }
        return (byte) 1;
    }

    public static /* synthetic */ void LJIJJLI(C68246QqQ c68246QqQ, String str) {
        str.getClass();
        c68246QqQ.zzg |= 4;
        c68246QqQ.zzS = str;
    }

    public static void LJIL(C68246QqQ c68246QqQ, Iterable iterable) {
        int i;
        RandomAccess randomAccess = c68246QqQ.zzU;
        if (!((AbstractC84676XLc) randomAccess).LJLIL) {
            C84684XLk c84684XLk = (C84684XLk) randomAccess;
            int i2 = c84684XLk.LJLJI;
            if (i2 == 0) {
                i = 10;
            } else {
                i = i2 + i2;
                if (i < i2) {
                    throw new IllegalArgumentException();
                }
            }
            c68246QqQ.zzU = new C84684XLk(Arrays.copyOf(c84684XLk.LJLILLLLZI, i), c84684XLk.LJLJI);
        }
        YIP.LJI(iterable, c68246QqQ.zzU);
    }

    public static /* synthetic */ void LJJIFFI(C68246QqQ c68246QqQ, String str) {
        str.getClass();
        c68246QqQ.zzf |= 2048;
        c68246QqQ.zzu = str;
    }

    public static /* synthetic */ void LJJII(C68246QqQ c68246QqQ, String str) {
        str.getClass();
        c68246QqQ.zzf |= 4096;
        c68246QqQ.zzv = str;
    }

    public static /* synthetic */ void LJJIII(C68246QqQ c68246QqQ, String str) {
        str.getClass();
        c68246QqQ.zzf |= FileUtils.BUFFER_SIZE;
        c68246QqQ.zzw = str;
    }

    public static /* synthetic */ void LJJIIZ(C68246QqQ c68246QqQ, String str) {
        str.getClass();
        c68246QqQ.zzf |= 65536;
        c68246QqQ.zzz = str;
    }

    public static /* synthetic */ void LJJIJIIJIL(C68246QqQ c68246QqQ, String str) {
        c68246QqQ.zzf |= 262144;
        c68246QqQ.zzB = str;
    }

    public static /* synthetic */ void LJJJ(C68246QqQ c68246QqQ, String str) {
        str.getClass();
        c68246QqQ.zzf |= 4194304;
        c68246QqQ.zzF = str;
    }

    public static /* synthetic */ void LJJJIL(C68246QqQ c68246QqQ, String str) {
        c68246QqQ.zzf |= 16777216;
        c68246QqQ.zzI = str;
    }

    public static /* synthetic */ void LJJJJL(C68246QqQ c68246QqQ, String str) {
        str.getClass();
        c68246QqQ.zzg |= FileUtils.BUFFER_SIZE;
        c68246QqQ.zzae = str;
    }

    public static /* synthetic */ void LJJJJLL(C68246QqQ c68246QqQ, Iterable iterable) {
        XM7 xm7 = c68246QqQ.zzaf;
        if (!xm7.LIZIZ()) {
            c68246QqQ.zzaf = YIN.LJIILJJIL(xm7);
        }
        YIP.LJI(iterable, c68246QqQ.zzaf);
    }

    public static /* synthetic */ void LJJJJZ(C68246QqQ c68246QqQ, String str) {
        str.getClass();
        c68246QqQ.zzg |= 16384;
        c68246QqQ.zzag = str;
    }

    public static /* synthetic */ void LJJLIIIJ(C68246QqQ c68246QqQ, String str) {
        str.getClass();
        c68246QqQ.zzf |= 128;
        c68246QqQ.zzq = str;
    }

    public static /* synthetic */ void LJJLIIIJJI(C68246QqQ c68246QqQ, String str) {
        str.getClass();
        c68246QqQ.zzf |= 256;
        c68246QqQ.zzr = str;
    }

    public static /* synthetic */ void LJJLIIIJL(C68246QqQ c68246QqQ, String str) {
        str.getClass();
        c68246QqQ.zzf |= 512;
        c68246QqQ.zzs = str;
    }
}
