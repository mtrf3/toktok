package X;

import Y.ARunnableS49S0100000_13;
import Y.AfS65S0100000_13;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.UmA, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78174UmA {
    public InterfaceC31064CHc LIZ;
    public Double LIZIZ;
    public long LJ;
    public C78164Um0 LJFF;
    public InterfaceC88472Yns<? super C78164Um0, C76800UCe> LJI;
    public final C73318Sq2 LIZJ = new C73318Sq2();
    public final ArrayList<C35946E8w> LIZLLL = new ArrayList<>();
    public final C62822Ol8 LJII = C221108m2.LIZIZ(C78178UmE.LJLIL);
    public final ARunnableS49S0100000_13 LJIIIIZZ = new ARunnableS49S0100000_13(this, 125);

    public final void LIZIZ() {
        CHQ LIZIZ;
        this.LIZJ.LIZLLL();
        InterfaceC31064CHc interfaceC31064CHc = this.LIZ;
        if (interfaceC31064CHc != null) {
            interfaceC31064CHc.stop();
        }
        synchronized (this.LIZLLL) {
            this.LIZLLL.clear();
        }
        this.LJ = 0L;
        CHQ chq = null;
        this.LJI = null;
        C32257ClJ.LIZ.removeCallbacks(this.LJIIIIZZ);
        this.LJ = System.currentTimeMillis();
        this.LIZJ.LIZ(AbstractC73672Svk.LJJIJIIJI(1L, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LJJJJZI(new AfS65S0100000_13(this, 108)));
        CHV chv = (CHV) this.LJII.getValue();
        if (chv != null && (LIZIZ = chv.LIZIZ()) != null) {
            LIZIZ.LIZIZ(new C78175UmB(this));
            LIZIZ.LIZ(new C78176UmC(this));
            LIZIZ.LIZJ();
            chq = LIZIZ;
        }
        this.LIZ = chq;
    }

    public final void LIZJ() {
        this.LIZJ.LIZLLL();
        LIZ(System.currentTimeMillis());
        InterfaceC31064CHc interfaceC31064CHc = this.LIZ;
        if (interfaceC31064CHc != null) {
            interfaceC31064CHc.stop();
        }
        this.LJI = null;
        C32257ClJ.LIZ.removeCallbacks(this.LJIIIIZZ);
    }

    public final void LIZ(long j) {
        Object LIZ;
        JSONObject LIZ2;
        try {
            CHV chv = (CHV) this.LJII.getValue();
            if (chv != null && (LIZ2 = chv.LIZ()) != null) {
                double optDouble = LIZ2.optDouble("render_fps:", -1.0d);
                double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                if (optDouble < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    optDouble = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                }
                double optDouble2 = LIZ2.optDouble("push_client_fps:", -1.0d);
                if (optDouble2 >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    d = optDouble2;
                }
                C35946E8w c35946E8w = new C35946E8w(optDouble, d, this.LJ, j);
                synchronized (this.LIZLLL) {
                    this.LIZLLL.add(c35946E8w);
                }
                C32444CoK.LIZLLL(null, String.valueOf(c35946E8w));
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9 A[LOOP:2: B:32:0x00b1->B:34:0x00b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016b A[LOOP:5: B:64:0x0165->B:66:0x016b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.InterfaceC88472Yns<? super X.C78164Um0, X.C76800UCe> r22) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78174UmA.LIZLLL(X.Yns):void");
    }

    public final void LJ(Double d) {
        if (d != null) {
            d.doubleValue();
            C78164Um0 c78164Um0 = this.LJFF;
            if (c78164Um0 != null) {
                c78164Um0.LJFF = d;
            }
            InterfaceC88472Yns<? super C78164Um0, C76800UCe> interfaceC88472Yns = this.LJI;
            if (interfaceC88472Yns != null && c78164Um0 != null && c78164Um0.LJFF != null) {
                interfaceC88472Yns.invoke(c78164Um0);
                this.LJI = null;
            }
        }
    }
}
