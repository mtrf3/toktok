package X;

import com.zhiliaoapp.musically.R;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.YrI, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88684YrI {
    public static final java.util.Map<Integer, FE0> LIZ = new ConcurrentHashMap();

    public static FE0 LIZ(int i) {
        java.util.Map<Integer, FE0> map = LIZ;
        FE0 fe0 = (FE0) ((ConcurrentHashMap) map).get(Integer.valueOf(i));
        if (fe0 != null) {
            return fe0;
        }
        synchronized (map) {
            FE0 fe02 = (FE0) ((ConcurrentHashMap) map).get(Integer.valueOf(i));
            if (fe02 != null) {
                return fe02;
            }
            FE0 LIZIZ = LIZIZ(i);
            if (LIZIZ != null) {
                ((ConcurrentHashMap) map).put(Integer.valueOf(i), LIZIZ);
            }
            return LIZIZ;
        }
    }

    public static FE0 LIZIZ(int i) {
        if (i == R.layout.cob) {
            return new C88676YrA();
        }
        if (i == R.layout.alw) {
            return new C88691YrP();
        }
        if (i == R.layout.cok) {
            return new C88701YrZ();
        }
        if (i == R.layout.cou) {
            return new C88601Ypx();
        }
        if (i == R.layout.cod) {
            return new C88695YrT();
        }
        if (i == R.layout.abj) {
            return new C88741YsD();
        }
        if (i == R.layout.abh) {
            return new C88735Ys7();
        }
        if (i == R.layout.aa7) {
            return new C88714Yrm();
        }
        if (i == R.layout.ab9) {
            return new C88729Ys1();
        }
        if (i == R.layout.aa6) {
            return new C88709Yrh();
        }
        if (i == R.layout.aab) {
            return new C88623YqJ();
        }
        if (i == R.layout.acm) {
            return new C88634YqU();
        }
        if (i == R.layout.coz) {
            return new C88605Yq1();
        }
        if (i == R.layout.cpb) {
            return new C88718Yrq();
        }
        if (i == R.layout.cow) {
            return new C88616YqC();
        }
        if (i == R.layout.dgn) {
            return new C88710Yri();
        }
        if (i == R.layout.ddg) {
            return new C88696YrU();
        }
        if (i == R.layout.dfo) {
            return new C88706Yre();
        }
        if (i == R.layout.afm) {
            return new C88686YrK();
        }
        if (i == R.layout.d3h) {
            return new C88734Ys6();
        }
        if (i == R.layout.dp1) {
            return new C88593Ypp();
        }
        if (i == R.layout.d2z) {
            return new C88728Ys0();
        }
        if (i == R.layout.de9) {
            return new C88609Yq5();
        }
        if (i == R.layout.dhj) {
            return new C88645Yqf();
        }
        if (i == R.layout.dph) {
            return new C88736Ys8();
        }
        if (i == R.layout.d4l) {
            return new C88669Yr3();
        }
        if (i == R.layout.dq6) {
            return new C88587Ypj();
        }
        if (i == R.layout.bp4) {
            return new C88725Yrx();
        }
        if (i == R.layout.acu) {
            return new C88748YsK();
        }
        if (i == R.layout.bll) {
            return new C88596Yps();
        }
        if (i == R.layout.ddb) {
            return new C88690YrO();
        }
        if (i == R.layout.d4k) {
            return new C88742YsE();
        }
        if (i == R.layout.cya) {
            return new C88722Yru();
        }
        if (i == R.layout.bqb) {
            return new C88730Ys2();
        }
        if (i == R.layout.dl3) {
            return new C88724Yrw();
        }
        if (i == R.layout.dd_) {
            return new C88685YrJ();
        }
        if (i == R.layout.dhl) {
            return new C88627YqN();
        }
        if (i == R.layout.bky) {
            return new C88715Yrn();
        }
        if (i == R.layout.chk) {
            return new C88700YrY();
        }
        if (i == R.layout.cj8) {
            return new C88747YsJ();
        }
        if (i == R.layout.cf6) {
            return new C88744YsG();
        }
        if (i == R.layout.cfz) {
            return new C88689YrN();
        }
        if (i == R.layout.cfb) {
            return new C88583Ypf();
        }
        if (i == R.layout.ci3) {
            return new C88717Yrp();
        }
        if (i == R.layout.ci4) {
            return new C88721Yrt();
        }
        if (i == R.layout.chj) {
            return new C88694YrS();
        }
        if (i == R.layout.cia) {
            return new C88590Ypm();
        }
        if (i == R.layout.cj1) {
            return new C88740YsC();
        }
        if (i == R.layout.ci2) {
            return new C88713Yrl();
        }
        if (i == R.layout.cip) {
            return new C88733Ys5();
        }
        if (i == R.layout.cj3) {
            return new C88745YsH();
        }
        if (i == R.layout.chs) {
            return new C88704Yrc();
        }
        if (i == R.layout.chy) {
            return new C88639YqZ();
        }
        if (i == R.layout.bth) {
            return new C88737Ys9();
        }
        if (i == R.layout.c1u) {
            return new C88727Yrz();
        }
        if (i == R.layout.c1y) {
            return new C88732Ys4();
        }
        if (i == R.layout.c25) {
            return new C88739YsB();
        }
        if (i == R.layout.pi) {
            return new C88697YrV();
        }
        if (i == R.layout.ql) {
            return new C88705Yrd();
        }
        if (i == R.layout.ab3) {
            return new C88723Yrv();
        }
        if (i == R.layout.bal) {
            return new C88711Yrj();
        }
        if (i == R.layout.byi) {
            return new C88688YrM();
        }
        if (i == R.layout.byj) {
            return new C88693YrR();
        }
        if (i == R.layout.by8) {
            return new C88712Yrk();
        }
        if (i == R.layout.by7) {
            return new C88707Yrf();
        }
        if (i == R.layout.byp) {
            return new C88655Yqp();
        }
        if (i == R.layout.byc) {
            return new C88719Yrr();
        }
        if (i == R.layout.bai) {
            return new C88698YrW();
        }
        if (i == R.layout.byr) {
            return new C88720Yrs();
        }
        if (i == R.layout.bxx) {
            return new C88687YrL();
        }
        if (i == R.layout.by6) {
            return new C88702Yra();
        }
        if (i == R.layout.bye) {
            return new C88731Ys3();
        }
        if (i == R.layout.byn) {
            return new C88703Yrb();
        }
        if (i == R.layout.by1) {
            return new C88699YrX();
        }
        if (i == R.layout.bxh) {
            return new C88659Yqt();
        }
        if (i == R.layout.by0) {
            return new C88692YrQ();
        }
        if (i == R.layout.baj) {
            return new C88585Yph();
        }
        if (i == R.layout.byg) {
            return new C88743YsF();
        }
        if (i == R.layout.byq) {
            return new C88716Yro();
        }
        if (i == R.layout.byf) {
            return new C88738YsA();
        }
        if (i == R.layout.byd) {
            return new C88726Yry();
        }
        if (i == R.layout.byo) {
            return new C88708Yrg();
        }
        if (i == R.layout.byk) {
            return new C88598Ypu();
        }
        if (i == R.layout.by9) {
            return new C88619YqF();
        }
        if (i == R.layout.bak) {
            return new C88581Ypd();
        }
        if (i == R.layout.bxw) {
            return new C88665Yqz();
        }
        if (i == R.layout.byh) {
            return new C88746YsI();
        }
        return null;
    }
}
