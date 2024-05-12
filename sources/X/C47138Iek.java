package X;

import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Iek, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47138Iek implements InterfaceC47499IkZ {
    public final ISpeedCalculator LIZ;
    public final boolean LIZIZ;

    @Override // X.InterfaceC47499IkZ
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // X.InterfaceC47499IkZ
    public final C47152Iey[] LIZLLL() {
        C47152Iey c47152Iey;
        C47139Iel[] LIZLLL = this.LIZ.LIZLLL();
        if (LIZLLL == null) {
            return null;
        }
        C47152Iey[] c47152IeyArr = new C47152Iey[LIZLLL.length];
        for (int i = 0; i < LIZLLL.length; i++) {
            C47139Iel c47139Iel = LIZLLL[i];
            if (c47139Iel == null) {
                c47152Iey = null;
            } else {
                c47152Iey = new C47152Iey(c47139Iel.LJLJI, c47139Iel.LJLIL / 8.0d, (long) c47139Iel.LJLILLLLZI, c47139Iel.LJLJJI);
            }
            c47152IeyArr[i] = c47152Iey;
        }
        return c47152IeyArr;
    }

    @Override // X.InterfaceC47499IkZ
    public final double calculateSpeed() {
        return this.LIZ.calculateSpeed();
    }

    @Override // X.InterfaceC47505Ikf
    public final double getSpeed() {
        if (this.LIZIZ) {
            return TTVideoEngine.LJJIJIIJI();
        }
        return this.LIZ.LJI();
    }

    public C47138Iek() {
        new HashMap();
        this.LIZ = C1DG.LIZ().LJI();
        Object value = IZ8.LJJJJL.getValue();
        o.LJIIIIZZ(value, "<get-ENABLE_NATIVE_SPEED_MONITOR>(...)");
        this.LIZIZ = ((Boolean) value).booleanValue();
    }

    @Override // X.InterfaceC47499IkZ
    public final void LIZIZ(double d) {
        this.LIZ.LIZIZ(d);
    }

    @Override // X.InterfaceC47499IkZ
    public final void setSpeedQueueSize(int i) {
        if (this.LIZIZ) {
            C47147Iet.LIZ.LJ().businessEvent(1002, i);
        } else {
            this.LIZ.setSpeedQueueSize(i);
        }
    }

    @Override // X.InterfaceC47499IkZ
    public final void monitorVideoSpeed(double d, double d2, long j) {
        this.LIZ.LJ(new C47139Iel(d2 * 8.0d, j));
    }
}
