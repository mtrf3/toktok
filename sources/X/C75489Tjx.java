package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Tjx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75489Tjx {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJFF;
    public static DataChannel LJI;
    public static long LJII;
    public static C28272B7s LJIIIIZZ;
    public static C28272B7s LJIIIZ;
    public static boolean LJIIJJI;
    public static long LJIILJJIL;
    public static final C75489Tjx LIZ = new C75489Tjx();
    public static final AtomicBoolean LJ = new AtomicBoolean(false);
    public static int LJIIJ = 3;
    public static String LJIIL = "";
    public static String LJIILIIL = "";

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0205, code lost:
    
        if (r6 != null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x021e, code lost:
    
        if (r5 != null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0272, code lost:
    
        if (r4 != null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x024b, code lost:
    
        if (r4 != null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ed, code lost:
    
        if (r6 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0208, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0238, code lost:
    
        if (r5 != null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0221, code lost:
    
        r10 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ() {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75489Tjx.LIZ():void");
    }

    public static void LIZIZ() {
        if (!LIZJ && LJIIIIZZ != null && LJFF) {
            LJII = System.currentTimeMillis();
            LIZJ = true;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onStallStart , seiBefore = ");
            LIZ2.append(LJIIIIZZ);
            C0NB.LIZIZ("LinkMicStallHelper", X1D.LIZIZ(LIZ2));
            return;
        }
        String connectionType = ((IInteractService) CN1.LIZ(IInteractService.class)).getConnectionType();
        if ((o.LJ(LJIIL, "manual_pk") || o.LJ(LJIIL, "anchor")) && B5G.LIZIZ().LJ() == 4) {
            return;
        }
        o.LJIIIIZZ(connectionType, "connectionType");
        LJIIL = connectionType;
    }

    public static void LIZJ(C28272B7s c28272B7s) {
        String LIZ2;
        String str;
        String str2;
        int i;
        if (c28272B7s != null && (str = c28272B7s.LIZIZ) != null && C96Q.LIZ(str) && 1 != 0 && (str2 = c28272B7s.LIZIZ) != null && s.LJJLIIIJL(str2, "ByteVC", 0, false, 6) == -1) {
            if (!LIZJ) {
                LJIIIIZZ = c28272B7s;
                LIZIZ();
                return;
            }
            if (LJIIIZ == null || LJIIJJI) {
                LJIIIZ = c28272B7s;
                LIZ();
            }
            if (!LJIIJJI || (i = LJIIJ) <= 0) {
                return;
            }
            LJIIJ = i - 1;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("wait for a legal sei ");
            LIZ3.append(c28272B7s);
            C0NB.LIZIZ("LinkMicStallHelper", X1D.LIZIZ(LIZ3));
            return;
        }
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ2 = C32014ChO.LJ();
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ2 = C77800Ug8.LIZLLL(U44.BIZ, LIZ4, "_LinkMicStallHelper_", LJ2, LIZ4);
        } else {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ2 = C17M.LIZ(U44.BIZ, LIZ5, "_LinkMicStallHelper_", 166, LIZ5);
        }
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("illegal sei receive ");
        LIZ6.append(c28272B7s);
        C32014ChO.LJFF(LIZ2, X1D.LIZIZ(LIZ6));
    }
}
