package X;

import Y.IDHandlerS24S0100000_14;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseIntArray;
import ccb.t;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VAK {
    public static final SparseArray<String> LJIJ;
    public final VBL LIZ;
    public final long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public int LJ = 5000;
    public int LJFF = 50;
    public final AtomicInteger LJI;
    public int LJII;
    public String LJIIIIZZ;
    public boolean LJIIIZ;
    public long LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public final VAD LJIILIIL;
    public int LJIILJJIL;
    public boolean LJIILL;
    public int LJIILLIIL;
    public final IDHandlerS24S0100000_14 LJIIZILJ;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseArray<String> sparseArray = new SparseArray<>();
        LJIJ = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        SparseArray sparseArray3 = new SparseArray();
        sparseIntArray.put(-100002, 3);
        sparseIntArray.put(-100006, 3);
        sparseIntArray.put(-100007, 3);
        sparseIntArray.put(-100008, 3);
        sparseIntArray.put(-100009, 3);
        sparseIntArray.put(-100013, 3);
        sparseIntArray.put(-100014, 3);
        sparseArray.put(-499988, "media player: setting uri is null error");
        sparseArray.put(-499987, "media player: setting uri is error");
        sparseArray.put(-499986, "media player: url is not mp4 error");
        sparseArray.put(-499985, "media player: invalid data error");
        sparseArray.put(-499899, "media player: http bad request error");
        sparseArray.put(-499898, "media player: http unauthorized error");
        sparseArray.put(-499897, "media player: http forbidden error");
        sparseArray.put(-499896, "media player: http not found error");
        sparseArray.put(-499894, "media player: http other 4xx error");
        sparseArray.put(-499893, "media player: http server error");
        sparseArray.put(-499891, "media player: http content type invalid");
        sparseArray.put(251658241, "media info http redirect");
        sparseArray.put(-499799, "media player: tcp failed to resolve hostname");
        sparseArray.put(-499795, "media player: tcp send data failed");
        sparseArray.put(-499794, "media player: tcp receive data failed");
        sparseArray.put(-499793, "media player: tcp read network timeout");
        sparseArray.put(-499792, "media player: tcp write network timeout");
        sparseArray2.put(-499999, "media player setting is null");
        sparseArray2.put(-499997, "media player start decoder error");
        sparseArray2.put(-499996, "media player open decoder error");
        sparseArray2.put(-499992, "media player open outlet error");
        sparseArray2.put(-499991, "media player start outputer error");
        sparseArray2.put(-499990, "media player start outlet error");
        sparseArray2.put(-499989, "media player open device error");
        sparseArray2.put(1, "android media player unknown");
        sparseArray3.put(-1, "not retry, report to application");
        sparseArray3.put(1, "try next url from live info");
        sparseArray3.put(2, "reset player");
    }

    public final void LIZLLL() {
        this.LJI.set(0);
        this.LIZJ = 0L;
        this.LJII = 7;
        this.LJIIIZ = false;
        this.LJIIJ = 0L;
        this.LJIIJJI = false;
        this.LJIILL = false;
        this.LJIILLIIL = 2;
        this.LJIIZILJ.removeCallbacksAndMessages(null);
    }

    public final void LJ() {
        if (this.LJIILJJIL != -1) {
            if (this.LJIIZILJ.hasMessages(10005)) {
                this.LJIIZILJ.removeMessages(10005);
            }
            this.LJIIZILJ.sendEmptyMessageDelayed(10005, this.LJIILJJIL);
        }
    }

    public final void LJFF(int i) {
        t tVar;
        if (!this.LJIIIZ || System.currentTimeMillis() - this.LJIIJ >= 1000) {
            this.LJIILIIL.LJJIL(i);
            VAD vad = this.LJIILIIL;
            if (!vad.LLLJIL && (tVar = vad.LJLJJL) != null) {
                tVar.N(vad.LJLJJI, 2);
                JSONObject LJFF = vad.LJFF();
                if (LJFF != null) {
                    try {
                        LJFF.put("event_key", "first_frame_failed").put("start_time", System.currentTimeMillis()).put("reason", i);
                        vad.LJJJZ(LJFF);
                        vad.LJJI("live_client_monitor_log", LJFF);
                        long j = vad.LLLLII;
                        if (j > 0) {
                            vad.LLLLII = j + 1;
                        }
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
            this.LJIIIZ = true;
            this.LJIIJ = System.currentTimeMillis();
        }
    }

    public final void LIZ(int i, C48315Ixj c48315Ixj) {
        String str;
        C48436Izg c48436Izg;
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleRetryForError action=");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        C46496IMq.LIZJ();
        int i2 = 0;
        String str3 = null;
        long j = 0;
        switch (i) {
            case -1:
                C46496IMq.LIZ();
                t tVar = ((VAT) this.LIZ).LIZ.get();
                if (tVar == null || tVar.LJLLL == null) {
                    return;
                }
                C46496IMq.LIZJ();
                InterfaceC48269Iwz interfaceC48269Iwz = tVar.LJLJL;
                if (interfaceC48269Iwz != null) {
                    ((VBU) interfaceC48269Iwz).LIZIZ(c48315Ixj);
                }
                tVar.LJLLLL.getClass();
                tVar.LJLLI.LIZLLL();
                return;
            case 0:
            default:
                return;
            case 1:
                C46496IMq.LIZJ();
                t tVar2 = ((VAT) this.LIZ).LIZ.get();
                if (tVar2 == null || tVar2.LJLLL == null) {
                    return;
                }
                C46496IMq.LIZJ();
                tVar2.J1();
                tVar2.LJLJJI.LJJJJ();
                tVar2.K();
                tVar2.E = true;
                VAN van = tVar2.LJLLJ;
                int i3 = van.LIZLLL;
                if (i3 == 1) {
                    int i4 = van.LJ + 1;
                    van.LJ = i4;
                    String[] strArr = van.LIZJ;
                    if (strArr != null && strArr.length != 0) {
                        if (i4 < strArr.length) {
                            i2 = i4;
                        }
                        str3 = strArr[i2];
                    }
                } else if (i3 == 2) {
                    if (tVar2.LLZLLIL.equals("auto")) {
                        str = tVar2.a0();
                    } else {
                        str = tVar2.LLZLLIL;
                    }
                    str3 = tVar2.LJLLJ.LJIIL(str, tVar2.LLZZJLIL, tVar2.LLZZ);
                }
                VAD vad = tVar2.LJLJJI;
                vad.LJLLJ = str3;
                if (!tVar2.LLILIL) {
                    tVar2.LLILIL = true;
                    vad.LJJLIIIJILLIZJL(tVar2.LJLLL.getLongOption(314, 0L));
                }
                tVar2.h();
                tVar2.LJLJJI.q2 = System.currentTimeMillis();
                if (tVar2.LLIILII == EnumC47633Imj.PREPARED) {
                    tVar2.O0(str3);
                    return;
                } else {
                    tVar2.LLZZZZ();
                    tVar2.O0(str3);
                    return;
                }
            case 2:
                C46496IMq.LIZJ();
                ((VAT) this.LIZ).LIZ(false);
                return;
            case 3:
                C46496IMq.LIZJ();
                if (this.LJIIZILJ.hasMessages(10002)) {
                    return;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("start ");
                LIZ2.append(this.LJI);
                X1D.LIZIZ(LIZ2);
                C46496IMq.LIZJ();
                IDHandlerS24S0100000_14 iDHandlerS24S0100000_14 = this.LJIIZILJ;
                if (this.LJI.get() > 3) {
                    j = this.LJ;
                }
                iDHandlerS24S0100000_14.sendEmptyMessageDelayed(10002, j);
                return;
            case 4:
            case 8:
                C46496IMq.LIZJ();
                t tVar3 = ((VAT) this.LIZ).LIZ.get();
                if (tVar3 == null || tVar3.LJLLL == null) {
                    return;
                }
                tVar3.h1(true);
                return;
            case 5:
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("ACTION_RTC_RESET_LATER start ");
                LIZ3.append(this.LJI);
                LIZ3.append(", max retry count ");
                LIZ3.append(this.LJIILIIL.L1);
                LIZ3.append(",fallback threshold:");
                LIZ3.append(this.LJIILIIL.M1);
                LIZ3.append(", retry interval:");
                UFE.LIZLLL(LIZ3, this.LJIILIIL.N1, LIZ3);
                this.LJIIZILJ.sendEmptyMessageDelayed(10003, this.LJIILIIL.N1);
                return;
            case 6:
                C46496IMq.LIZJ();
                if (this.LJIIZILJ.hasMessages(10004)) {
                    return;
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("start ");
                LIZ4.append(this.LJI);
                X1D.LIZIZ(LIZ4);
                C46496IMq.LIZJ();
                IDHandlerS24S0100000_14 iDHandlerS24S0100000_142 = this.LJIIZILJ;
                if (this.LJI.get() > 3) {
                    j = this.LJ;
                }
                iDHandlerS24S0100000_142.sendEmptyMessageDelayed(10004, j);
                return;
            case 7:
                C46496IMq.LIZJ();
                VBL vbl = this.LIZ;
                boolean z = this.LJIILL;
                t tVar4 = ((VAT) vbl).LIZ.get();
                if (tVar4 != null && (c48436Izg = tVar4.LJLLL) != null) {
                    if (tVar4.E && !z) {
                        tVar4.LJLLI.LJ();
                    } else {
                        if (!tVar4.LLILIL) {
                            tVar4.LLILIL = true;
                            tVar4.LJLJJI.LJJLIIIJILLIZJL(c48436Izg.getLongOption(314, 0L));
                        }
                        tVar4.E = true;
                        tVar4.z();
                        if (tVar4.LJLLJ.LJIILL(tVar4.LLZLLIL) >= tVar4.LLJLLL) {
                            tVar4.LJLLI.LJ();
                        }
                    }
                }
                this.LJIILL = true;
                return;
            case 9:
                C46496IMq.LIZJ();
                t tVar5 = ((VAT) this.LIZ).LIZ.get();
                if (tVar5 == null || tVar5.LJLLL == null) {
                    return;
                }
                tVar5.J1();
                tVar5.LJLJJI.LJJJJ();
                tVar5.LJLJJI.LJIILIIL();
                tVar5.K();
                tVar5.E = true;
                if (tVar5.v0()) {
                    tVar5.LJLJJI.Q0 = 2;
                }
                if (!tVar5.LLILIL) {
                    tVar5.LLILIL = true;
                    tVar5.LJLJJI.LJJLIIIJILLIZJL(tVar5.LJLLL.getLongOption(314, 0L));
                }
                tVar5.h();
                tVar5.LJLJJI.LJJIIZI();
                VAN van2 = tVar5.LJLLJ;
                int i5 = van2.LIZLLL;
                if (i5 == 1) {
                    if (van2.LJIIJJI() != null) {
                        str3 = tVar5.LJLLJ.LJIIJJI().LIZ;
                    }
                } else if (i5 == 2) {
                    if (tVar5.LLZLLIL.equals("auto")) {
                        str2 = tVar5.a0();
                    } else {
                        str2 = tVar5.LLZLLIL;
                    }
                    str3 = tVar5.LJLLJ.LJIIL(str2, tVar5.LLZZJLIL, tVar5.LLZZ);
                }
                C0AX.LIZIZ("retry url: ", str3);
                tVar5.LJLJJI.LJLLJ = str3;
                System.currentTimeMillis();
                tVar5.LJLJJI.q2 = System.currentTimeMillis();
                if (tVar5.LLIILII == EnumC47633Imj.PREPARED) {
                    tVar5.O0(str3);
                    return;
                } else {
                    tVar5.LLZZZZ();
                    tVar5.O0(str3);
                    return;
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C48315Ixj r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VAK.LIZIZ(X.Ixj, boolean):void");
    }

    public final void LIZJ(boolean z, boolean z2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStall ");
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        C46496IMq.LIZJ();
        if (z) {
            this.LIZJ = System.currentTimeMillis();
            if (z2) {
                ((VAT) this.LIZ).LIZ(true);
                LJFF(-100018);
            }
            if (!this.LJIIZILJ.hasMessages(10001)) {
                this.LJIIZILJ.sendEmptyMessageDelayed(10001, this.LIZLLL);
                return;
            }
            return;
        }
        LIZLLL();
    }

    public VAK(VAT vat, int i, long j, VAD vad) {
        this.LIZLLL = 10000L;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.LJI = atomicInteger;
        this.LJII = 7;
        this.LJIIIIZZ = null;
        this.LJIIIZ = false;
        this.LJIIJ = 0L;
        this.LJIIJJI = false;
        this.LJIIL = false;
        this.LJIILJJIL = -1;
        this.LJIILL = false;
        this.LJIILLIIL = 2;
        this.LJIIZILJ = new IDHandlerS24S0100000_14(this, Looper.myLooper(), 2);
        this.LIZ = vat;
        this.LIZIZ = i * 1000;
        this.LIZLLL = j;
        atomicInteger.set(0);
        this.LJIILIIL = vad;
    }
}
