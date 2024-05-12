package X;

import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Request;

/* loaded from: classes12.dex */
public final class PWD implements PW9 {
    public static final List<String> LJFF = PVA.LJIILJJIL("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List<String> LJI = PVA.LJIILJJIL("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final PXZ LIZ;
    public final C64583PWh LIZIZ;
    public final PWE LIZJ;
    public PWF LIZLLL;
    public final EnumC64572PVw LJ;

    @Override // X.PW9
    public final void LIZ() {
        this.LIZJ.flush();
    }

    @Override // X.PW9
    public final void LJ() {
        PWF pwf = this.LIZLLL;
        synchronized (pwf) {
            if (!pwf.LJFF && !pwf.LJ()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        pwf.LJII.close();
    }

    @Override // X.PW9
    public final void cancel() {
        PWF pwf = this.LIZLLL;
        if (pwf != null) {
            PWT pwt = PWT.CANCEL;
            if (!pwf.LIZLLL(pwt)) {
                return;
            }
            pwf.LIZLLL.LJIIJJI(pwf.LIZJ, pwt);
        }
    }

    @Override // X.PW9
    public final void LIZIZ(Request request) {
        boolean z;
        int i;
        PWF pwf;
        if (this.LIZLLL != null) {
            return;
        }
        boolean z2 = false;
        if (request.body() != null) {
            z = true;
        } else {
            z = false;
        }
        C64606PXe headers = request.headers();
        ArrayList arrayList = new ArrayList((headers.LIZ.length / 2) + 4);
        arrayList.add(new PWL(request.method(), PWL.LJFF));
        arrayList.add(new PWL(C64625PXx.LIZ(request.url()), PWL.LJI));
        String header = request.header("Host");
        if (header != null) {
            arrayList.add(new PWL(header, PWL.LJIIIIZZ));
        }
        arrayList.add(new PWL(request.url().LIZ, PWL.LJII));
        int length = headers.LIZ.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            C64537PUn encodeUtf8 = C64537PUn.encodeUtf8(headers.LJ(i2).toLowerCase(Locale.US));
            if (!LJFF.contains(encodeUtf8.utf8())) {
                arrayList.add(new PWL(headers.LJIIJ(i2), encodeUtf8));
            }
        }
        PWE pwe = this.LIZJ;
        boolean z3 = !z;
        synchronized (pwe.LL) {
            synchronized (pwe) {
                if (pwe.LJLJJLL > 1073741823) {
                    pwe.LJFF(PWT.REFUSED_STREAM);
                }
                if (!pwe.LJLJL) {
                    i = pwe.LJLJJLL;
                    pwe.LJLJJLL = i + 2;
                    pwf = new PWF(i, pwe, z3, false, null);
                    if (!z || pwe.LJLZ == 0 || pwf.LIZIZ == 0) {
                        z2 = true;
                    }
                    if (pwf.LJFF()) {
                        pwe.LJLJI.put(Integer.valueOf(i), pwf);
                    }
                } else {
                    throw new C64580PWe();
                }
            }
            pwe.LL.LJIIJJI(arrayList, i, z3);
        }
        if (z2) {
            pwe.LL.flush();
        }
        this.LIZLLL = pwf;
        PWI pwi = pwf.LJIIIIZZ;
        long LIZIZ = this.LIZ.LIZIZ();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        pwi.LJI(LIZIZ, timeUnit);
        this.LIZLLL.LJIIIZ.LJI(this.LIZ.LIZJ(), timeUnit);
    }

    @Override // X.PW9
    public final PVQ LIZJ(C64598PWw c64598PWw) {
        C64583PWh c64583PWh = this.LIZIZ;
        c64583PWh.LJFF.responseBodyStart(c64583PWh.LJ);
        return new PVQ(c64598PWw.LIZ("Content-Type", null), C64573PVx.LIZ(c64598PWw), PU7.LIZ(new C64555PVf(this, this.LIZLLL.LJI)));
    }

    @Override // X.PW9
    public final C64597PWv LJFF(boolean z) {
        C64606PXe c64606PXe;
        PWF pwf = this.LIZLLL;
        synchronized (pwf) {
            pwf.LJIIIIZZ.LJIIIIZZ();
            while (((ArrayDeque) pwf.LJ).isEmpty() && pwf.LJIIJ == null) {
                try {
                    pwf.LJIIIZ();
                } catch (Throwable th) {
                    pwf.LJIIIIZZ.LJIILJJIL();
                    throw th;
                }
            }
            pwf.LJIIIIZZ.LJIILJJIL();
            if (!((ArrayDeque) pwf.LJ).isEmpty()) {
                c64606PXe = (C64606PXe) ((ArrayDeque) pwf.LJ).removeFirst();
            } else {
                throw new C64576PWa(pwf.LJIIJ);
            }
        }
        EnumC64572PVw enumC64572PVw = this.LJ;
        C64605PXd c64605PXd = new C64605PXd();
        int length = c64606PXe.LIZ.length / 2;
        PPG ppg = null;
        for (int i = 0; i < length; i++) {
            String LJ = c64606PXe.LJ(i);
            String LJIIJ = c64606PXe.LJIIJ(i);
            if (LJ.equals(":status")) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("HTTP/1.1 ");
                LIZ.append(LJIIJ);
                ppg = PPG.LIZ(X1D.LIZIZ(LIZ));
            } else if (!LJI.contains(LJ)) {
                AbstractC64554PVe.LIZ.getClass();
                c64605PXd.LIZIZ(LJ, LJIIJ);
            }
        }
        if (ppg != null) {
            C64597PWv c64597PWv = new C64597PWv();
            c64597PWv.LIZIZ = enumC64572PVw;
            c64597PWv.LIZJ = ppg.LIZIZ;
            c64597PWv.LIZLLL = ppg.LIZJ;
            c64597PWv.LJFF = new C64606PXe(c64605PXd).LJI();
            if (z) {
                AbstractC64554PVe.LIZ.getClass();
                if (c64597PWv.LIZJ == 100) {
                    return null;
                }
            }
            return c64597PWv;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // X.PW9
    public final PUJ LIZLLL(Request request, long j) {
        PWF pwf = this.LIZLLL;
        synchronized (pwf) {
            if (!pwf.LJFF && !pwf.LJ()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return pwf.LJII;
    }

    public PWD(C64600PWy c64600PWy, PW8 pw8, C64583PWh c64583PWh, PWE pwe) {
        this.LIZ = pw8;
        this.LIZIZ = c64583PWh;
        this.LIZJ = pwe;
        List<EnumC64572PVw> list = c64600PWy.LJLJI;
        EnumC64572PVw enumC64572PVw = EnumC64572PVw.H2_PRIOR_KNOWLEDGE;
        this.LJ = list.contains(enumC64572PVw) ? enumC64572PVw : EnumC64572PVw.HTTP_2;
    }
}
