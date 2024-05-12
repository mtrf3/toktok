package X;

import android.app.Application;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.applog.AppLog;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes12.dex */
public final class QI4 implements Handler.Callback, Comparator<QI2> {
    public static final List<String> LLF = Collections.singletonList("Engine");
    public final InterfaceC66837QKz LJLIL;
    public final Looper LJLILLLLZI;
    public final QI3 LJLJI;
    public final QH9 LJLJJI;
    public QHT LJLJJL;
    public volatile C66758QHy LJLJL;
    public final QI6 LJLJLJ;
    public volatile Handler LJLJLLL;
    public List<C66749QHp> LJLL;
    public final QI5 LJLLI;
    public C66770QIk LJLLILLLL;
    public final Handler LJLLJ;
    public long LJLLL;
    public volatile boolean LJLLLL;
    public volatile long LJLZ;
    public volatile QHQ LJZI;
    public volatile QL4 LJZL;
    public final C66748QHo LLD;
    public final ArrayList<QI2> LJLJJLL = new ArrayList<>(32);
    public final ArrayList<QHV> LJLLLLLL = new ArrayList<>(4);
    public final List<QJ9> LJZ = new ArrayList();
    public volatile int LL = 0;

    public final QL4 LIZLLL() {
        if (this.LJZL == null) {
            synchronized (this) {
                QL4 ql4 = this.LJZL;
                if (ql4 == null) {
                    ql4 = new QL4(this.LJLJI, LJ(), this.LJLJLJ);
                }
                this.LJZL = ql4;
            }
        }
        return this.LJZL;
    }

    public final C66758QHy LJ() {
        if (this.LJLJL == null) {
            synchronized (this) {
                C66758QHy c66758QHy = this.LJLJL;
                if (c66758QHy == null) {
                    c66758QHy = new C66758QHy(this, this.LJLJJI.LIZIZ.LIZ());
                }
                this.LJLJL = c66758QHy;
            }
        }
        return this.LJLJL;
    }

    public final List<C66749QHp> LJFF() {
        ArrayList arrayList = new ArrayList();
        QHA qha = this.LJLJJI.LJIIJ;
        if (qha != null && qha.LIZ()) {
            for (QHC qhc : ((HashMap) qha.LIZJ).values()) {
                if (qhc != null && qhc.LIZ != 0) {
                    arrayList.add(new C66749QHp(this, qhc));
                }
            }
        } else {
            arrayList.add(new C66749QHp(this));
        }
        return arrayList;
    }

    public final C66770QIk LJI() {
        if (this.LJLLILLLL == null) {
            C66770QIk c66770QIk = this.LJLJJI.LIZIZ.LJIIJ;
            this.LJLLILLLL = c66770QIk;
            if (c66770QIk == null) {
                this.LJLLILLLL = null;
            }
        }
        return this.LJLLILLLL;
    }

    public final void LIZIZ(String str) {
        InterfaceC66837QKz interfaceC66837QKz = this.LJLIL;
        Application application = this.LJLJI.LJIIJ;
        C66765QIf c66765QIf = (C66765QIf) ((C66760QIa) interfaceC66837QKz).LIZ();
        c66765QIf.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("user_unique_id", str);
        c66765QIf.LIZLLL.LIZIZ(application).LJFF(application, hashMap, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C66753QHt r18) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QI4.LIZJ(X.QHt):void");
    }

    public final void LJIIIZ(QI2 qi2) {
        int size;
        if (qi2.LJLILLLLZI == 0) {
            this.LJLJI.LJJIZ.LJIILL(LLF, "receive zero ts", null, new Object[0]);
        }
        synchronized (this.LJLJJLL) {
            size = this.LJLJJLL.size();
            this.LJLJJLL.add(qi2);
        }
        boolean z = qi2 instanceof QID;
        if (this.LJLJI.LJJII) {
            if (z || (size + 1) % this.LJLJI.LJJIII == 0) {
                this.LJLLJ.removeMessages(4);
                this.LJLLJ.sendEmptyMessage(4);
            } else if (!this.LJLLJ.hasMessages(4)) {
                this.LJLLJ.sendEmptyMessageDelayed(4, this.LJLJI.LJJIIJ);
            }
        } else if (size % 5 == 0 || z) {
            this.LJLLJ.removeMessages(4);
            if (size != 0 || z) {
                this.LJLLJ.sendEmptyMessage(4);
            } else {
                this.LJLLJ.sendEmptyMessageDelayed(4, 200L);
            }
        }
        int size2 = this.LJLJJLL.size();
        if (size2 > 0 && size2 % LiveMaxRetainAlogMessageSizeSetting.DEFAULT == 0) {
            this.LJLJI.LIZLLL.LJ(QIQ.engine, QIK.engine_event_cache_overflow);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0016. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x027b  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r16) {
        /*
            Method dump skipped, instructions count: 1722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QI4.handleMessage(android.os.Message):boolean");
    }

    public final void LJII(QIK qik, int i) {
        this.LJLJI.LIZLLL.LJI(QIQ.event_v3, qik, i);
        this.LJLJI.LIZLLL.LJI(QIQ.real_event, qik, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(java.lang.String[] r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 1877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QI4.LJIIIIZZ(java.lang.String[], boolean):void");
    }

    public final void LJIIJJI(int i, List list) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LJIIL((QHV) it.next(), i);
            }
        }
    }

    public final void LJIIL(QHV qhv, int i) {
        if (this.LJLJLLL != null && qhv != null) {
            qhv.LIZJ = true;
            if (Looper.myLooper() == this.LJLJLLL.getLooper()) {
                if (!(true ^ qhv.LIZ.LJLJI.LJIILL)) {
                    qhv.LIZ(i);
                }
            } else {
                this.LJLJLLL.removeMessages(6);
                Message obtainMessage = this.LJLJLLL.obtainMessage(6);
                obtainMessage.arg1 = i;
                this.LJLJLLL.sendMessage(obtainMessage);
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(QI2 qi2, QI2 qi22) {
        long j = qi2.LJLILLLLZI - qi22.LJLILLLLZI;
        if (j < 0) {
            return -1;
        }
        if (j > 0) {
            return 1;
        }
        return 0;
    }

    public final void LIZ(boolean z, int i, long j, InterfaceC66818QKg interfaceC66818QKg) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Message obtainMessage = this.LJLLJ.obtainMessage(i);
        C66780QIu c66780QIu = new C66780QIu();
        c66780QIu.LIZ = z;
        c66780QIu.LIZIZ = interfaceC66818QKg;
        c66780QIu.LIZJ = j;
        c66780QIu.LIZLLL = countDownLatch;
        obtainMessage.obj = c66780QIu;
        this.LJLLJ.sendMessage(obtainMessage);
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            this.LJLJI.LJJIZ.LJIILL(LLF, "clearOrResetWhenSwitchChildMode interrupted", e, new Object[0]);
        }
    }

    public QI4(QI3 qi3, QH9 qh9, QI6 qi6, C66760QIa c66760QIa, C66748QHo c66748QHo) {
        this.LJLJI = qi3;
        this.LJLJJI = qh9;
        qh9.LJIILIIL = this;
        this.LJLJLJ = qi6;
        this.LLD = c66748QHo;
        this.LJLLI = new QI5(this);
        this.LJLIL = c66760QIa;
        String str = qi3.LJIIIZ;
        HandlerThread handlerThread = new HandlerThread(i0.LJFF("bd_tracker_w:", str));
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.LJLLJ = handler;
        HandlerThread handlerThread2 = new HandlerThread(i0.LJFF("bd_tracker_n:", str));
        handlerThread2.start();
        Looper looper = handlerThread2.getLooper();
        this.LJLILLLLZI = looper;
        C48852JFg c48852JFg = LJI().LIZLLL;
        c66760QIa.getClass();
        QIN qin = qh9.LIZIZ;
        c66760QIa.LIZJ = new QIP(c66760QIa.LIZLLL);
        Handler handler2 = new Handler(looper);
        QGL qgl = new QGL(0);
        qgl.LIZ = new ETF(handler2);
        qgl.LIZJ = looper;
        InterfaceC66835QKx LIZ = c66760QIa.LIZ();
        String str2 = qin.LIZ;
        LIZ.getClass();
        Object obj = qgl.LIZ;
        if (obj != null) {
            ((ConcurrentHashMap) JFV.LIZ).put(str2, obj);
        }
        Object obj2 = qgl.LIZIZ;
        if (obj2 != null) {
            ((ConcurrentHashMap) JFV.LIZIZ).put(str2, obj2);
        }
        Object obj3 = qgl.LIZJ;
        if (obj3 != null) {
            ((ConcurrentHashMap) JFV.LIZJ).put(str2, obj3);
        }
        QJD qjd = new QJD(c66760QIa, qin);
        QIE qie = c66760QIa.LIZ;
        qie.LJIIIIZZ = c66760QIa.LIZLLL.LJIIJ;
        qie.LJJII = null;
        qie.LIZJ = qin.LJIJJ;
        qie.LJI = CastIntegerProtector.parseInt(qin.LIZ);
        qie.getClass();
        qie.LJIL = qin.LIZLLL;
        qie.LJJ = qin.LJ;
        qie.LJIILLIIL = qin.LJIIIZ;
        qie.LIZ = qjd;
        qie.LJIIZILJ = qin.LIZJ;
        qie.LJIJ = qin.LJIIL;
        qie.LIZLLL = qin.LJI;
        qie.LJJIIJ = qin.LJJIFFI;
        qie.LJIJJ = qin.LJJI;
        qie.LJJIII = c66760QIa.LIZLLL.LJJJ;
        qie.LJFF = c66760QIa.LIZLLL.LJIJI;
        qie.LJJIFFI = null;
        qie.LJII = new PA1(c66760QIa.LIZLLL);
        qie.LJIILL = qin.LJIILL;
        qie.LJIILIIL = qin.LJIILIIL;
        qie.LJIIJJI = qin.LJIIJJI;
        qie.LJIILJJIL = qin.LJIILJJIL;
        qie.LJIIL = qin.LJIILLIIL;
        qie.LJIJI = qin.LJIIIIZZ;
        qie.LIZIZ = false;
        qie.LJIIIZ = qin.LJJ;
        qie.LJIIJ = qin.LJIIZILJ;
        C36860EdM.LIZIZ = Boolean.valueOf(qh9.LIZLLL());
        qie.LJ = c66760QIa.LIZJ;
        qie.LJJIIZ = qin.LJIJI;
        qie.LJJIIZI = null;
        qie.LJJIIJZLJL = qin.LJJIIJ;
        qie.LJJIJ = qin.LJJIIJZLJL;
        synchronized (C66760QIa.class) {
            QIF LIZ2 = c66760QIa.LIZ.LIZ();
            ((C66765QIf) c66760QIa.LIZ()).LJI(LIZ2, c48852JFg);
            c66760QIa.LIZ = null;
            c66760QIa.LIZIZ = LIZ2;
        }
        if (qi3.LJJ) {
            this.LJZI = new QHQ(this, C59163NJv.LIZJ(qi3.LJIIJ, C66745QHl.LIZIZ(qi3, "sampling_list")));
        }
        if (qh9.LIZIZ.LIZIZ) {
            this.LJLLLL = true;
            handler.sendEmptyMessage(1);
            handler.sendEmptyMessageDelayed(2, 200L);
        }
        handler.sendEmptyMessage(10);
        qh9.LIZIZ.getClass();
        if (qi3.LJJIIJZLJL && AppLog.LIZ == qi3) {
            handler.sendEmptyMessageDelayed(24, 10000L);
        }
    }

    public static void LJIIJ(Iterator it, List list, QIQ qiq, String str, String str2) {
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            if (((QHZ) it2.next()).LIZ(qiq, str, str2)) {
                it.remove();
                return;
            }
        }
    }
}
