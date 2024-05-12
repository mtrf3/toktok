package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Ius, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48138Ius {
    public AtomicReference<EnumC48139Iut> LIZLLL;
    public int LJFF;
    public final C48141Iuv LIZ = new C48141Iuv();
    public volatile boolean LIZIZ = false;
    public final AtomicReference<EnumC48139Iut> LIZJ = new AtomicReference<>(EnumC48139Iut.UNKNOWN);
    public final ArrayList<InterfaceC48142Iuw> LJ = new ArrayList<>();

    public final synchronized EnumC48139Iut LIZIZ() {
        EnumC48139Iut enumC48139Iut;
        C48141Iuv c48141Iuv = this.LIZ;
        if (c48141Iuv == null) {
            return EnumC48139Iut.UNKNOWN;
        }
        double d = c48141Iuv.LIZIZ;
        if (d < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            enumC48139Iut = EnumC48139Iut.UNKNOWN;
        } else if (d < 150.0d) {
            enumC48139Iut = EnumC48139Iut.POOR;
        } else if (d < 550.0d) {
            enumC48139Iut = EnumC48139Iut.MODERATE;
        } else if (d < 2000.0d) {
            enumC48139Iut = EnumC48139Iut.GOOD;
        } else {
            enumC48139Iut = EnumC48139Iut.EXCELLENT;
        }
        return enumC48139Iut;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
    
        if (r4 < (r6 * 0.8d)) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae A[Catch: all -> 0x00e1, LOOP:0: B:27:0x00ac->B:28:0x00ae, LOOP_END, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x0018, B:9:0x0022, B:11:0x0035, B:12:0x0039, B:14:0x0042, B:17:0x0047, B:26:0x0097, B:28:0x00ae, B:31:0x007d, B:33:0x0085, B:36:0x008d, B:43:0x00c6, B:45:0x00d2), top: B:6:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LIZ(long r11, long r13) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48138Ius.LIZ(long, long):void");
    }
}
