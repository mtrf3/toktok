package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Iyt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48387Iyt {
    public AtomicReference<EnumC48386Iys> LIZLLL;
    public int LJFF;
    public final C48388Iyu LIZ = new C48388Iyu();
    public volatile boolean LIZIZ = false;
    public final AtomicReference<EnumC48386Iys> LIZJ = new AtomicReference<>(EnumC48386Iys.UNKNOWN);
    public final ArrayList<InterfaceC48389Iyv> LJ = new ArrayList<>();

    public final synchronized EnumC48386Iys LIZIZ() {
        EnumC48386Iys enumC48386Iys;
        C48388Iyu c48388Iyu = this.LIZ;
        if (c48388Iyu == null) {
            return EnumC48386Iys.UNKNOWN;
        }
        double d = c48388Iyu.LIZIZ;
        if (d < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            enumC48386Iys = EnumC48386Iys.UNKNOWN;
        } else if (d < 150.0d) {
            enumC48386Iys = EnumC48386Iys.POOR;
        } else if (d < 550.0d) {
            enumC48386Iys = EnumC48386Iys.MODERATE;
        } else if (d < 2000.0d) {
            enumC48386Iys = EnumC48386Iys.GOOD;
        } else {
            enumC48386Iys = EnumC48386Iys.EXCELLENT;
        }
        return enumC48386Iys;
    }

    public final synchronized double LIZJ() {
        double d;
        C48388Iyu c48388Iyu = this.LIZ;
        if (c48388Iyu != null) {
            d = c48388Iyu.LIZIZ;
        } else {
            d = -1.0d;
        }
        return d;
    }

    public final synchronized void LIZ(long j, long j2) {
        if (j2 != 0) {
            double d = ((j * 1.0d) / j2) * 8.0d;
            if (d >= 10.0d) {
                this.LIZ.LIZ(d);
                if (this.LIZIZ) {
                    this.LJFF++;
                    if (LIZIZ() != this.LIZLLL.get()) {
                        this.LIZIZ = false;
                        this.LJFF = 1;
                    }
                    if (this.LJFF >= 5.0d) {
                        this.LIZIZ = false;
                        this.LJFF = 1;
                        this.LIZJ.set(this.LIZLLL.get());
                        int size = this.LJ.size();
                        for (int i = 0; i < size; i++) {
                            InterfaceC48389Iyv interfaceC48389Iyv = this.LJ.get(i);
                            this.LIZJ.get();
                            interfaceC48389Iyv.LIZ();
                        }
                    }
                    return;
                }
                if (this.LIZJ.get() != LIZIZ()) {
                    this.LIZIZ = true;
                    this.LIZLLL = new AtomicReference<>(LIZIZ());
                }
            }
        }
    }
}
