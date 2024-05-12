package X;

import com.bytedance.poplayer.core.PopupManager;
import kotlin.jvm.internal.AqS31S1300000_9;

/* renamed from: X.LhH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC54939LhH {
    public final void LIZ(String str, boolean z, InterfaceC56322M8o interfaceC56322M8o, ActivityC45651qj activityC45651qj, C85258Xd8 c85258Xd8) {
        if (z || interfaceC56322M8o == null || C56179M3b.LIZ.LJIILLIIL(0, activityC45651qj)) {
            return;
        }
        C54943LhL c54943LhL = C54943LhL.LIZ;
        c54943LhL.getClass();
        if (C54943LhL.LIZ().waitingThreshold > 0) {
            if (C35908E7k.LIZ() < 0) {
                return;
            }
            if (C35908E7k.LIZ() > 0) {
                long currentTimeMillis = System.currentTimeMillis() - C35908E7k.LIZ();
                c54943LhL.getClass();
                if (currentTimeMillis < C54943LhL.LIZ().waitingThreshold) {
                    return;
                }
            }
        }
        PopupManager.LJIIL(new C54933LhB(interfaceC56322M8o, new AqS31S1300000_9(this, str, activityC45651qj, c85258Xd8, 1)));
    }
}
