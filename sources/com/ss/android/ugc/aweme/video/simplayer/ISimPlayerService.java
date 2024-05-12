package com.ss.android.ugc.aweme.video.simplayer;

import X.C46752IWm;
import X.C46784IXs;
import X.C46809IYr;
import X.ESN;
import X.IUA;
import X.IUB;
import X.IXL;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public interface ISimPlayerService {
    public static final Companion LIZ = Companion.LIZ;

    /* loaded from: classes9.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion LIZ = new Companion();

        public final ISimPlayerService get() {
            ISimPlayerService iSimPlayerService;
            IUB iub = IUA.LIZ;
            int playerType = iub.LIZ().getPlayerType();
            if (playerType != 0) {
                if (playerType != 1) {
                    iSimPlayerService = (ISimPlayerService) ESN.LIZ("com.ss.android.ugc.aweme.video.simplayer.exo.ExoSimPlayerServiceImpl");
                } else {
                    iSimPlayerService = (ISimPlayerService) ESN.LIZ("com.ss.android.ugc.aweme.video.simplayer.exo.ExoSimPlayerServiceImpl");
                }
            } else {
                if (iub.LIZ().getTTPlayerPlan() == 1) {
                    iSimPlayerService = (ISimPlayerService) ESN.LIZ("com.ss.android.ugc.aweme.playerkit.engineexo.TTSimPlayerServiceImpl");
                } else {
                    iSimPlayerService = (ISimPlayerService) ESN.LIZ("com.ss.android.ugc.aweme.video.simplayer.tt.TTSimPlayerServiceImpl");
                }
                if (iSimPlayerService == null) {
                    iSimPlayerService = (ISimPlayerService) ESN.LIZ("com.ss.android.ugc.aweme.video.simplayer.ttcrop.TTCropSimPlayerServiceImpl");
                }
                return iSimPlayerService;
            }
            if (iSimPlayerService == null) {
                throw new IllegalStateException(o.LJIILLIIL(Integer.valueOf(playerType), "cannot find match player service, please check config: getPlayerType. need:"));
            }
            return iSimPlayerService;
        }
    }

    IXL LIZ();

    void LIZIZ(C46809IYr c46809IYr);

    C46784IXs LIZJ();

    IXL LIZLLL();

    C46752IWm LJ();

    IXL LJFF(boolean z, boolean z2);

    IXL LJI();

    void LJII();

    void LJIIIIZZ(ExecutorService executorService);

    void setLogLevel(int i);
}
