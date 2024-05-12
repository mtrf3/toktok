package X;

import android.os.Handler;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;

/* renamed from: X.Cur, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32849Cur {
    public static InterfaceC88471Ynr<? super String, ? super Integer, C76800UCe> LIZ;
    public static boolean LIZIZ;
    public static int LIZLLL;
    public static long LJ;
    public static boolean LJFF;
    public static final Handler LIZJ = new Handler(C16880lQ.LLJJJJ());
    public static final RunnableC35340Dtw LJI = RunnableC35340Dtw.LJLIL;

    public static void LIZIZ() {
        if (LIZ == null || GiftManager.inst().findGiftById(LJ) == null) {
            return;
        }
        if (LIZIZ) {
            InterfaceC88471Ynr<? super String, ? super Integer, C76800UCe> interfaceC88471Ynr = LIZ;
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke("convenient_gift", Integer.valueOf(LIZLLL));
            }
        } else {
            InterfaceC88471Ynr<? super String, ? super Integer, C76800UCe> interfaceC88471Ynr2 = LIZ;
            if (interfaceC88471Ynr2 != null) {
                interfaceC88471Ynr2.invoke("normal_gift", Integer.valueOf(LIZLLL));
            }
        }
        LJFF = false;
    }

    public static void LIZ(long j, boolean z, InterfaceC88471Ynr interfaceC88471Ynr) {
        if (LJFF) {
            if (j != LJ) {
                LIZJ.removeCallbacks(LJI);
                LIZIZ();
            } else {
                LIZLLL++;
                Handler handler = LIZJ;
                RunnableC35340Dtw runnableC35340Dtw = LJI;
                handler.removeCallbacks(runnableC35340Dtw);
                handler.postDelayed(runnableC35340Dtw, 3000L);
                return;
            }
        }
        LIZ = interfaceC88471Ynr;
        LIZLLL = 1;
        LJFF = true;
        LIZJ.postDelayed(LJI, 3000L);
        if (j != LJ) {
            LJ = j;
        }
        LIZIZ = z;
    }
}
