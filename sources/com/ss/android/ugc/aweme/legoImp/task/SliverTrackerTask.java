package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C16880lQ;
import X.C39151FYd;
import X.C39154FYg;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FY8;
import X.InterfaceC39152FYe;
import X.InterfaceC65349Pkn;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.gift.LiveExchangeConfirmThreshold;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.keva.Keva;
import com.bytedance.sliver.Sliver;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class SliverTrackerTask implements EE1 {
    public static final List<InterfaceC39152FYe> LJLILLLLZI = new ArrayList();
    public SliverTrackerConfig LJLIL;

    @Override // X.EEY
    public final String key() {
        return "SliverTrackerTask";
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
        try {
            String string = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("sliver_tracker_str", "");
            if (!TextUtils.isEmpty(string)) {
                this.LJLIL = (SliverTrackerConfig) new Gson().LJI(string, SliverTrackerConfig.class);
            }
        } catch (Throwable unused) {
        }
        SliverTrackerConfig sliverTrackerConfig = this.LJLIL;
        if (sliverTrackerConfig == null) {
            return EFK.BOOT_FINISH;
        }
        if (sliverTrackerConfig.isStartMainThread) {
            return EFK.MAIN;
        }
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    /* loaded from: classes7.dex */
    public class SliverTrackerConfig {

        @InterfaceC65349Pkn("allThreadEnable")
        public boolean allThreadEnable;

        @InterfaceC65349Pkn("isStartMainThread")
        public boolean isStartMainThread;

        @InterfaceC65349Pkn("targetVersion")
        public int targetVersion;

        @InterfaceC65349Pkn("bufferSize")
        public int bufferSize = 10000;

        @InterfaceC65349Pkn("samplingMs")
        public int samplingMs = 30;

        public SliverTrackerConfig(SliverTrackerTask sliverTrackerTask) {
        }
    }

    @Override // X.EEY
    public final void run(Context context) {
        try {
            if (this.LJLIL == null) {
                LIZLLL(context, false);
            } else if (r0.targetVersion <= EF7.LJFF()) {
                LIZLLL(context, true);
            } else {
                LIZLLL(context, false);
            }
        } catch (Throwable unused) {
            LIZLLL(context, false);
        }
    }

    public final void LIZLLL(Context context, boolean z) {
        if (z) {
            SliverTrackerConfig sliverTrackerConfig = this.LJLIL;
            if (sliverTrackerConfig.samplingMs < 20) {
                sliverTrackerConfig.samplingMs = 20;
            }
            int i = sliverTrackerConfig.bufferSize;
            if (i <= 10000 || i >= 50000) {
                sliverTrackerConfig.bufferSize = 10000;
            }
            C39151FYd c39151FYd = new C39151FYd();
            SliverTrackerConfig sliverTrackerConfig2 = this.LJLIL;
            c39151FYd.LJI = sliverTrackerConfig2.allThreadEnable;
            int i2 = sliverTrackerConfig2.bufferSize;
            if (c39151FYd.LIZIZ > 50000) {
                c39151FYd.LIZIZ = LiveExchangeConfirmThreshold.DEFAULT;
            } else {
                c39151FYd.LIZIZ = i2;
            }
            c39151FYd.LIZ = sliverTrackerConfig2.samplingMs;
            c39151FYd.LJFF = true;
            c39151FYd.LIZJ = false;
            c39151FYd.LJ = false;
            c39151FYd.LIZLLL = false;
            synchronized (C39154FYg.class) {
                if (!C39154FYg.LIZLLL) {
                    if (context != null && C16880lQ.LLLLL(context) != null) {
                        C39154FYg.LIZLLL = true;
                        if (Sliver.init(true)) {
                            if (c39151FYd.LJI) {
                                Sliver.startAll(5, c39151FYd.LIZ);
                            } else {
                                Sliver.start(C16880lQ.LLJJJJ().getThread(), c39151FYd.LIZ, c39151FYd.LIZIZ, FY8.RING);
                            }
                            C39154FYg c39154FYg = C39154FYg.LIZIZ;
                            c39154FYg.LIZ = C16880lQ.LLLLL(context);
                            c39154FYg.LIZIZ();
                            if (c39151FYd.LIZJ) {
                                Npth.registerCrashInfoCallback(c39154FYg, CrashType.LAUNCH);
                            }
                            if (c39151FYd.LIZLLL) {
                                Npth.registerCrashInfoCallback(c39154FYg, CrashType.JAVA);
                            }
                            if (c39151FYd.LJ) {
                                Npth.registerCrashInfoCallback(c39154FYg, CrashType.NATIVE);
                            }
                            if (c39151FYd.LJFF) {
                                Npth.registerCrashInfoCallback(c39154FYg, CrashType.ANR);
                            }
                        }
                    }
                }
            }
            Npth.addTag("sliver_enable", "1");
        } else {
            Npth.addTag("sliver_enable", CardStruct.IStatusCode.DEFAULT);
        }
        Iterator it = ((ArrayList) LJLILLLLZI).iterator();
        while (it.hasNext()) {
            ((InterfaceC39152FYe) it.next()).LIZ();
        }
    }
}
