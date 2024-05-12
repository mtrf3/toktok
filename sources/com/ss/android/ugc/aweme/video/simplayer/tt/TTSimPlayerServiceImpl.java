package com.ss.android.ugc.aweme.video.simplayer.tt;

import X.C46752IWm;
import X.C46757IWr;
import X.C46777IXl;
import X.C46779IXn;
import X.C46780IXo;
import X.C46784IXs;
import X.C46809IYr;
import X.C46999IcV;
import X.C78253UnR;
import X.ITZ;
import X.IUA;
import X.IX5;
import X.IX6;
import X.IXL;
import X.IZ8;
import X.InterfaceC46747IWh;
import X.V16;
import com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class TTSimPlayerServiceImpl implements ISimPlayerService {
    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final IXL LJI() {
        return LJFF(true, false);
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final void LJII() {
        TTVideoEngine.LIZLLL = false;
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final IXL LIZ() {
        return new C46777IXl().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final C46784IXs LIZJ() {
        if (C46784IXs.LIZ == null) {
            synchronized (C46784IXs.class) {
                if (C46784IXs.LIZ == null) {
                    C46784IXs.LIZ = new C46784IXs();
                }
            }
        }
        return C46784IXs.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final IXL LIZLLL() {
        InterfaceC46747IWh c46757IWr;
        ITZ playerType = ITZ.TT;
        o.LJIIIZ(playerType, "playerType");
        Object value = IZ8.LLJJLIIIJLLLLLLLZ.getValue();
        o.LJIIIIZZ(value, "<get-SIM_PLAYER_ARCH_VERSION>(...)");
        if (((Number) value).intValue() == 3) {
            C46999IcV iSimPlayerPlaySessionConfig = IUA.LIZ.LIZ().getISimPlayerPlaySessionConfig(false);
            o.LJIIIIZZ(iSimPlayerPlaySessionConfig, "instance().playerConfig(…rPlaySessionConfig(false)");
            c46757IWr = new IX6(playerType, iSimPlayerPlaySessionConfig);
        } else {
            c46757IWr = new C46757IWr(new IX5(playerType));
        }
        return new IXL(c46757IWr, new C46780IXo());
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final C46752IWm LJ() {
        return new C46752IWm(false);
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final void LIZIZ(C46809IYr c46809IYr) {
        TTVideoEngineLog.setListener(new C46779IXn(c46809IYr));
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final void LJIIIIZZ(ExecutorService executorService) {
        C78253UnR.LJI("TTVideoEngine", "set player threadpool");
        synchronized (V16.class) {
            V16.LIZ = executorService;
        }
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final void setLogLevel(int i) {
        int i2;
        if (i == 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        TTVideoEngineLog.turnOn(1, i2);
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final IXL LJFF(boolean z, boolean z2) {
        C46777IXl c46777IXl = new C46777IXl();
        c46777IXl.LIZ = z;
        c46777IXl.LIZIZ = z2;
        return c46777IXl.LIZ();
    }
}
