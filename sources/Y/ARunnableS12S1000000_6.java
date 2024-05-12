package Y;

import X.C113554cx;
import X.C16880lQ;
import X.C35339Dtv;
import X.C36093EEn;
import X.C36098EEs;
import X.C36296EMi;
import X.C39149FYb;
import X.C62822Ol8;
import X.EG1;
import X.EGB;
import X.FMX;
import X.FRW;
import X.OSZ;
import X.RunnableC36297EMj;
import X.X1D;
import android.os.Handler;
import com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingData;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sliver.Sliver;
import com.bytedance.sliver.SliverAllThreadSupport;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ARunnableS12S1000000_6 implements Runnable {
    public final int $t;
    public String s0;

    public final void LIZ$1() {
        GsonProtectorUtils.fromJson(new Gson(), this.s0, TTSettingData.class);
        C36296EMi.LIZIZ = new JSONObject(this.s0);
        if (C36296EMi.LIZLLL) {
            C36296EMi.LIZLLL();
        } else {
            new Handler(C16880lQ.LLJJJJ()).post(RunnableC36297EMj.LJLIL);
        }
    }

    public final void LIZ$2() {
        int i;
        INetworkStateService createINetworkStateServicebyMonsterPlugin = NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false);
        if (createINetworkStateServicebyMonsterPlugin != null) {
            i = createINetworkStateServicebyMonsterPlugin.getEffectiveConnectionType();
        } else {
            i = -2;
        }
        FMX.LJIIL("network_toast_show", C113554cx.LJJL(new OSZ("network_status", String.valueOf(i)), new OSZ("toast_content", this.s0)));
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        if (!SliverAllThreadSupport.dumpHeader(this.s0)) {
            return;
        }
        for (C39149FYb c39149FYb : SliverAllThreadSupport.threadGroups) {
            String str = this.s0;
            synchronized (c39149FYb) {
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(str, true));
                    try {
                        Iterator<Thread> it = c39149FYb.LIZJ.iterator();
                        while (it.hasNext()) {
                            Thread next = it.next();
                            long threadPeer = Sliver.getThreadPeer(next);
                            if (threadPeer != 0) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("# thread_info:");
                                LIZ.append(SliverAllThreadSupport.nGetThreadId(threadPeer));
                                LIZ.append(":");
                                LIZ.append(next.getName());
                                LIZ.append("\n");
                                bufferedWriter.write(X1D.LIZIZ(LIZ));
                            }
                        }
                        bufferedWriter.flush();
                    } catch (Throwable unused) {
                        if (bufferedWriter == null) {
                            continue;
                        }
                    }
                    bufferedWriter.close();
                } catch (IOException unused2) {
                }
            }
        }
        Iterator<C39149FYb> it2 = SliverAllThreadSupport.threadGroups.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(this.s0);
        }
    }

    public static final void run$0(ARunnableS12S1000000_6 aRunnableS12S1000000_6) {
        boolean LIZ;
        try {
            FRW.LIZ(aRunnableS12S1000000_6.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS12S1000000_6 aRunnableS12S1000000_6) {
        boolean LIZ;
        try {
            EG1.LIZ().LLLLLJLJLL(aRunnableS12S1000000_6.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS12S1000000_6 aRunnableS12S1000000_6) {
        boolean LIZ;
        try {
            C62822Ol8 c62822Ol8 = C35339Dtv.LIZ;
            ((Keva) c62822Ol8.getValue()).storeString("search_intermediate_recom_reponse", aRunnableS12S1000000_6.s0);
            ((Keva) c62822Ol8.getValue()).storeLong("search_intermediate_recom_reponse_time", System.currentTimeMillis());
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS12S1000000_6 aRunnableS12S1000000_6) {
        boolean LIZ;
        try {
            aRunnableS12S1000000_6.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS12S1000000_6 aRunnableS12S1000000_6) {
        boolean LIZ;
        try {
            EG1.LIZ().LLLLLLIL(aRunnableS12S1000000_6.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS12S1000000_6 aRunnableS12S1000000_6) {
        boolean LIZ;
        try {
            aRunnableS12S1000000_6.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS12S1000000_6 aRunnableS12S1000000_6) {
        boolean LIZ;
        try {
            EGB.LIZ.LJJJJJ(aRunnableS12S1000000_6.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS12S1000000_6 aRunnableS12S1000000_6) {
        boolean LIZ;
        try {
            C36093EEn.LIZ.getClass();
            C36093EEn.LIZLLL.LIZIZ(aRunnableS12S1000000_6.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS12S1000000_6 aRunnableS12S1000000_6) {
        boolean LIZ;
        try {
            C36093EEn.LIZ.getClass();
            C36093EEn.LIZLLL.LIZIZ(aRunnableS12S1000000_6.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS12S1000000_6 aRunnableS12S1000000_6) {
        boolean LIZ;
        try {
            C36093EEn.LIZ.getClass();
            C36093EEn.LIZLLL.LIZIZ(aRunnableS12S1000000_6.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS12S1000000_6 aRunnableS12S1000000_6) {
        boolean LIZ;
        try {
            C36093EEn.LIZ.getClass();
            C36098EEs c36098EEs = C36093EEn.LJ;
            String name = aRunnableS12S1000000_6.s0;
            o.LJIIIIZZ(name, "name");
            c36098EEs.LIZ(name);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS12S1000000_6 aRunnableS12S1000000_6) {
        boolean LIZ;
        try {
            aRunnableS12S1000000_6.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS12S1000000_6(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
