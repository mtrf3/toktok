package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.X5e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84262X5e {
    public AtomicReference<EnumC84263X5f> LIZLLL;
    public int LJFF;
    public final WBN LIZ = new WBN(0.05d);
    public volatile boolean LIZIZ = false;
    public final AtomicReference<EnumC84263X5f> LIZJ = new AtomicReference<>(EnumC84263X5f.UNKNOWN);
    public final List<X5N> LJ = new CopyOnWriteArrayList();

    public final synchronized EnumC84263X5f LIZ() {
        EnumC84263X5f enumC84263X5f;
        WBN wbn = this.LIZ;
        if (wbn == null) {
            return EnumC84263X5f.UNKNOWN;
        }
        try {
            double d = wbn.LIZJ;
            if (d < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                enumC84263X5f = EnumC84263X5f.UNKNOWN;
            } else if (d < 150.0d) {
                enumC84263X5f = EnumC84263X5f.POOR;
            } else if (d < 550.0d) {
                enumC84263X5f = EnumC84263X5f.MODERATE;
            } else if (d < 2000.0d) {
                enumC84263X5f = EnumC84263X5f.GOOD;
            } else {
                enumC84263X5f = EnumC84263X5f.EXCELLENT;
            }
            return enumC84263X5f;
        } catch (Throwable unused) {
            return EnumC84263X5f.UNKNOWN;
        }
    }
}
