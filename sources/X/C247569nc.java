package X;

import Y.ARunnableS40S0100000_4;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.touchpoint.core.crossplatform.IncentivePreloadViewModel;
import com.bytedance.touchpoint.core.model.IncentivePreload;
import com.bytedance.touchpoint.core.viewmodel.BaseTouchPointDataVM;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.9nc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247569nc extends AbstractC244999jT {
    public static boolean LJLIL;
    public static boolean LJLILLLLZI;
    public static IncentivePreload LJLJI;
    public static boolean LJLJJI;
    public static final C247569nc LJLJJL;

    static {
        C247569nc c247569nc = new C247569nc();
        LJLJJL = c247569nc;
        C8YN.LJII(c247569nc, c247569nc.LJJ(), new TBT() { // from class: X.9Os
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Long.valueOf(((C236009Oa) obj).LJLIL);
            }
        }, C213688a4.LIZLLL(), C247549na.LJLIL, 4);
        C8YN.LJII(c247569nc, c247569nc.LJJ(), new TBT() { // from class: X.9P6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C236009Oa) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), C247559nb.LJLIL, 4);
    }

    public static void LJJI() {
        if (!LJLJJI || LJLJI == null) {
            return;
        }
        try {
            LJLJJL.getClass();
            LJJIFFI();
            LJJII();
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static void LJJIFFI() {
        boolean z;
        Boolean bool;
        if (!LJLIL) {
            C247579nd c247579nd = (C247579nd) C95J.LIZ(1003);
            boolean z2 = false;
            if (c247579nd != null) {
                z = c247579nd.LIZJ();
            } else {
                z = false;
            }
            IncentivePreload incentivePreload = LJLJI;
            if (incentivePreload != null && (bool = incentivePreload.enablePreload) != null) {
                z2 = bool.booleanValue();
            }
            if (z && z2) {
                synchronized (C40343FsR.LJIILJJIL) {
                    AtomicBoolean atomicBoolean = C40343FsR.LJIIIIZZ;
                    if (!atomicBoolean.get()) {
                        FD6.LIZ(C40086FoI.LJLIL);
                        atomicBoolean.set(true);
                    }
                }
                LJLIL = true;
            }
        }
    }

    public static void LJJII() {
        boolean z;
        Boolean bool;
        if (!LJLILLLLZI) {
            C247579nd c247579nd = (C247579nd) C95J.LIZ(1003);
            boolean z2 = false;
            if (c247579nd != null) {
                z = c247579nd.LIZLLL();
            } else {
                z = false;
            }
            IncentivePreload incentivePreload = LJLJI;
            if (incentivePreload != null && (bool = incentivePreload.enablePreload) != null) {
                z2 = bool.booleanValue();
            }
            if (z && z2) {
                boolean z3 = true;
                LJLILLLLZI = true;
                C247579nd c247579nd2 = (C247579nd) C95J.LIZ(1003);
                if (c247579nd2 != null) {
                    z3 = c247579nd2.LJFF();
                }
                C244989jS c244989jS = new C244989jS(z3);
                if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
                    C250139rl.LIZ = System.currentTimeMillis();
                    C60829Nu5.LIZIZ(c244989jS);
                } else {
                    new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS40S0100000_4(c244989jS, 142));
                }
            }
        }
    }

    @Override // X.AbstractC244999jT
    public final BaseTouchPointDataVM LJJ() {
        C246049lA c246049lA = C246049lA.LJLILLLLZI;
        return (BaseTouchPointDataVM) new C214378bB(C65352Pkq.LIZ(IncentivePreloadViewModel.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(c246049lA, false), C184077Kh.LJLIL, C247589ne.INSTANCE, null, null).getValue();
    }
}
