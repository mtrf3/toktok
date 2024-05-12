package X;

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Qmx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68031Qmx extends AbstractC68050QnG {
    public String LIZJ;
    public String LIZLLL;
    public int LJ;
    public String LJFF;
    public long LJI;
    public final long LJII;
    public List LJIIIIZZ;
    public String LJIIIZ;
    public int LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public long LJIILJJIL;
    public String LJIILL;

    @Override // X.AbstractC68050QnG
    public final boolean LJIIIIZZ() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0168 A[Catch: IllegalStateException -> 0x01b2, TryCatch #3 {IllegalStateException -> 0x01b2, blocks: (B:17:0x014f, B:20:0x0160, B:22:0x0168, B:24:0x017b, B:27:0x0191, B:29:0x018d, B:32:0x0184, B:34:0x0195, B:36:0x01a9, B:37:0x01ab, B:39:0x01af), top: B:16:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0195 A[Catch: IllegalStateException -> 0x01b2, TryCatch #3 {IllegalStateException -> 0x01b2, blocks: (B:17:0x014f, B:20:0x0160, B:22:0x0168, B:24:0x017b, B:27:0x0191, B:29:0x018d, B:32:0x0184, B:34:0x0195, B:36:0x01a9, B:37:0x01ab, B:39:0x01af), top: B:16:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011f A[Catch: NameNotFoundException -> 0x0137, TryCatch #1 {NameNotFoundException -> 0x0137, blocks: (B:91:0x0111, B:93:0x011f, B:95:0x012b), top: B:90:0x0111 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ() {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68031Qmx.LJIIIZ():void");
    }

    public final String LJIIJJI() {
        ((InterfaceC68072Qnc) C68175QpH.LJLILLLLZI.LJLIL.zza()).zza();
        if (this.LIZ.LJI.LJIILJJIL(null, C68555QvP.LJJLIIIJILLIZJL)) {
            LJFF();
        }
        LJI();
        QH7.LJIIIIZZ(this.LJIIJJI);
        return this.LJIIJJI;
    }

    public final String LJIIJ() {
        LJI();
        QH7.LJIIIIZZ(this.LIZJ);
        return this.LIZJ;
    }

    public final void LJIIL() {
        String LLLZI;
        String str;
        LJFF();
        if (!this.LIZ.LJIILLIIL().LJIIL().LJFF(EnumC68125QoT.ANALYTICS_STORAGE)) {
            this.LIZ.LIZJ().LJIIL.LIZ("Analytics Storage consent is not granted");
            LLLZI = null;
        } else {
            byte[] bArr = new byte[16];
            this.LIZ.LJIL().LJIILJJIL().nextBytes(bArr);
            LLLZI = C16880lQ.LLLZI(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
        }
        C67281Qar c67281Qar = this.LIZ.LIZJ().LJIIL;
        Object[] objArr = new Object[1];
        if (LLLZI == null) {
            str = "null";
        } else {
            str = "not null";
        }
        objArr[0] = str;
        c67281Qar.LIZ(C16880lQ.LLLZ("Resetting session stitching token to %s", objArr));
        this.LJIILIIL = LLLZI;
        this.LIZ.LJIILIIL.getClass();
        this.LJIILJJIL = System.currentTimeMillis();
    }

    public C68031Qmx(C68033Qmz c68033Qmz, long j) {
        super(c68033Qmz);
        this.LJII = j;
    }
}
