package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* renamed from: X.Qrw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68340Qrw {
    public final C68356QsC LIZ;
    public C68377QsX LIZIZ;
    public final C68284Qr2 LIZJ;
    public final C68341Qrx LIZLLL;

    public C68340Qrw() {
        C68356QsC c68356QsC = new C68356QsC();
        this.LIZ = c68356QsC;
        this.LIZIZ = c68356QsC.LIZIZ.LIZ();
        this.LIZJ = new C68284Qr2();
        this.LIZLLL = new C68341Qrx();
        ((HashMap) c68356QsC.LIZLLL.LIZ).put("internal.registerCallback", new Callable() { // from class: X.Qs0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C68340Qrw c68340Qrw = C68340Qrw.this;
                c68340Qrw.getClass();
                return new C68358QsE(c68340Qrw.LIZLLL);
            }
        });
        ((HashMap) c68356QsC.LIZLLL.LIZ).put("internal.eventLogger", new Callable() { // from class: X.Qs1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C68359QsF(C68340Qrw.this.LIZJ);
            }
        });
    }

    public final void LIZ(C68334Qrq c68334Qrq) {
        try {
            C68377QsX LIZ = this.LIZ.LIZIZ.LIZ();
            this.LIZIZ = LIZ;
            if (!(this.LIZ.LIZ(LIZ, (C68347Qs3[]) c68334Qrq.zzf.toArray(new C68347Qs3[0])) instanceof C68381Qsb)) {
                for (C68335Qrr c68335Qrr : c68334Qrq.LJIJ().zze) {
                    XM7 xm7 = c68335Qrr.zzg;
                    String str = c68335Qrr.zzf;
                    Iterator it = xm7.iterator();
                    while (it.hasNext()) {
                        InterfaceC68379QsZ LIZ2 = this.LIZ.LIZ(this.LIZIZ, (C68347Qs3) it.next());
                        if (LIZ2 instanceof C68363QsJ) {
                            C68377QsX c68377QsX = this.LIZIZ;
                            if (c68377QsX.LJI(str)) {
                                InterfaceC68379QsZ LIZLLL = c68377QsX.LIZLLL(str);
                                if (LIZLLL instanceof AbstractC68364QsK) {
                                    AbstractC68364QsK abstractC68364QsK = (AbstractC68364QsK) LIZLLL;
                                    if (abstractC68364QsK != null) {
                                        abstractC68364QsK.LIZ(this.LIZIZ, Collections.singletonList(LIZ2));
                                    }
                                } else {
                                    throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(str)));
                                }
                            }
                            throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(str)));
                        }
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new C68319Qrb(th);
        }
    }

    public final boolean LIZIZ(C68276Qqu c68276Qqu) {
        try {
            C68284Qr2 c68284Qr2 = this.LIZJ;
            c68284Qr2.LIZ = c68276Qqu;
            c68284Qr2.LIZIZ = c68276Qqu.clone();
            ((ArrayList) c68284Qr2.LIZJ).clear();
            this.LIZ.LIZJ.LJFF("runtime.counter", new C68366QsM(Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)));
            this.LIZLLL.LIZ(this.LIZIZ.LIZ(), this.LIZJ);
            C68284Qr2 c68284Qr22 = this.LIZJ;
            if (!(!c68284Qr22.LIZIZ.equals(c68284Qr22.LIZ))) {
                if (!(!((ArrayList) this.LIZJ.LIZJ).isEmpty())) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw new C68319Qrb(th);
        }
    }
}
