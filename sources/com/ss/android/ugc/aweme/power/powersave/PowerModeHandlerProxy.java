package com.ss.android.ugc.aweme.power.powersave;

import X.C00F;
import X.C40010Fn4;
import com.ss.android.ugc.aweme.power.IPowerModeHandler;

/* loaded from: classes10.dex */
public final class PowerModeHandlerProxy implements IPowerModeHandler {
    @Override // com.ss.android.ugc.aweme.power.IPowerModeHandler
    public final boolean LIZ() {
        if (!C40010Fn4.LIZJ().LIZLLL() || C00F.LIZ(31744, 0, "power_mode_avatar_border_view", true) != 1) {
            return false;
        }
        return true;
    }
}
