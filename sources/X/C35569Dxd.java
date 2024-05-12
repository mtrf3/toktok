package X;

import android.os.Looper;
import android.os.Process;
import com.bytedance.common.jato.JatoXL;
import kotlin.jvm.internal.o;

/* renamed from: X.Dxd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35569Dxd implements EEA {
    public static boolean LIZJ() {
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ()) || !((Boolean) C33857DQn.LIZLLL.getValue()).booleanValue() || !C33857DQn.LIZJ) {
            return false;
        }
        return true;
    }

    @Override // X.EEA
    public final void LIZ(EEY component) {
        o.LJIIIZ(component, "component");
        if (LIZJ()) {
            try {
                JatoXL.resetPriority(Process.myTid());
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
    }

    @Override // X.EEA
    public final void LIZIZ(EEY component) {
        o.LJIIIZ(component, "component");
        if (LIZJ()) {
            int intValue = ((Number) C33857DQn.LJ.getValue()).intValue();
            int myTid = Process.myTid();
            if (Process.getThreadPriority(myTid) < intValue) {
                try {
                    EVM.LIZ(myTid, intValue);
                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
            }
        }
    }
}
