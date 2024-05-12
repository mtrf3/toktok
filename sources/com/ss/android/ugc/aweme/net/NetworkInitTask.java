package com.ss.android.ugc.aweme.net;

import X.C0RN;
import X.C10K;
import X.C33949DUb;
import X.C36922EeM;
import X.C38995FSd;
import X.C48236IwS;
import X.C64756PbE;
import X.C64841Pcb;
import X.C73548Stk;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FLX;
import X.PJZ;
import X.X1D;
import Y.ACallableS83S0200000_6;
import Y.AfS58S0100000_6;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.network.INetwork;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class NetworkInitTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "NetworkInitTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 16777215;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EE1
    public final EFK type() {
        if (((Boolean) C33949DUb.LJFF.getValue()).booleanValue()) {
            return EFK.BACKGROUND;
        }
        return EFK.MAIN;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEY
    public final void run(Context context) {
        ExecutorService LIZLLL;
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("network_set_rxjava_error_handler", true)) {
            try {
                if (C73548Stk.LIZ == null) {
                    C73548Stk.LIZ = new AfS58S0100000_6(this, 16);
                }
            } catch (Throwable th) {
                C10K.LIZJ(new ACallableS83S0200000_6(this, th, 4));
            }
        }
        INetwork LIZ = C64841Pcb.LIZ();
        C64756PbE c64756PbE = new C64756PbE(this);
        if (C48236IwS.LJIIJ() && ((Boolean) FLX.LIZLLL.getValue()).booleanValue()) {
            LIZLLL = C38995FSd.LIZJ();
        } else {
            LIZLLL = C38995FSd.LIZLLL();
        }
        o.LJIIIIZZ(LIZLLL, "if (FeedCacheLoader.hasC…oolHelper.getIOExecutor()");
        LIZ.LIZLLL(c64756PbE, LIZLLL);
    }

    public static void LIZLLL(String str, Throwable th) {
        C36922EeM.LJFF(th);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(' ');
        LIZ.append(th.getMessage());
        PJZ.LIZIZ(th, X1D.LIZIZ(LIZ));
    }
}
