package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Iz1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48395Iz1 {
    public AtomicReference<EnumC48394Iz0> LIZLLL;
    public int LJFF;
    public final C48396Iz2 LIZ = new C48396Iz2();
    public volatile boolean LIZIZ = false;
    public final AtomicReference<EnumC48394Iz0> LIZJ = new AtomicReference<>(EnumC48394Iz0.UNKNOWN);
    public final ArrayList<InterfaceC48397Iz3> LJ = new ArrayList<>();

    public final synchronized EnumC48394Iz0 LIZIZ() {
        EnumC48394Iz0 enumC48394Iz0;
        C48396Iz2 c48396Iz2 = this.LIZ;
        if (c48396Iz2 == null) {
            return EnumC48394Iz0.UNKNOWN;
        }
        try {
            double d = c48396Iz2.LIZIZ;
            if (d < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                enumC48394Iz0 = EnumC48394Iz0.UNKNOWN;
            } else if (d < 28.0d) {
                enumC48394Iz0 = EnumC48394Iz0.POOR;
            } else if (d < 112.0d) {
                enumC48394Iz0 = EnumC48394Iz0.MODERATE;
            } else if (d < 560.0d) {
                enumC48394Iz0 = EnumC48394Iz0.GOOD;
            } else {
                enumC48394Iz0 = EnumC48394Iz0.EXCELLENT;
            }
            return enumC48394Iz0;
        } catch (Throwable unused) {
            return EnumC48394Iz0.UNKNOWN;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
    
        if (r4 < (r6 * 0.8d)) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #0 {all -> 0x00c2, blocks: (B:18:0x004a, B:21:0x006b, B:24:0x0081, B:28:0x00a4, B:30:0x00ac, B:34:0x0089, B:36:0x005b, B:40:0x0062, B:42:0x0070), top: B:17:0x004a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LIZ(long r11, long r13) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48395Iz1.LIZ(long, long):void");
    }
}
