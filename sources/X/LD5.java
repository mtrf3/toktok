package X;

import com.ss.android.ugc.aweme.power.IPowerModeHandler;
import com.ss.android.ugc.aweme.power.powersave.PowerModeHandlerProxy;

/* loaded from: classes10.dex */
public final class LD5 implements IPowerModeHandler {
    public static final LD5 LIZIZ = new LD5();
    public final /* synthetic */ IPowerModeHandler LIZ;

    @Override // com.ss.android.ugc.aweme.power.IPowerModeHandler
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    public LD5() {
        IPowerModeHandler iPowerModeHandler;
        Object LIZ = C58096Mr6.LIZ(IPowerModeHandler.class, false);
        if (LIZ != null) {
            iPowerModeHandler = (IPowerModeHandler) LIZ;
        } else {
            if (C58096Mr6.b4 == null) {
                synchronized (IPowerModeHandler.class) {
                    if (C58096Mr6.b4 == null) {
                        C58096Mr6.b4 = new PowerModeHandlerProxy();
                    }
                }
            }
            iPowerModeHandler = C58096Mr6.b4;
        }
        this.LIZ = iPowerModeHandler;
    }
}
