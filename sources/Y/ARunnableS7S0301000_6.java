package Y;

import X.BQ6;
import X.C16880lQ;
import X.C2050382x;
import X.C37238EjS;
import X.C37612EpU;
import X.C38901FOn;
import X.C64241PJd;
import X.C64246PJi;
import X.InterfaceC39061FUr;
import X.PJZ;
import X.W5V;
import X.W6U;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.pia.core.bridge.channel.WebViewPort;
import com.bytedance.pia.core.utils.GsonUtils;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.experiment.publishtest.PublishTestSupportSetting$PublishTestSupportConfig;
import com.ss.android.ugc.aweme.legoImp.task.publishtest.PublishDrillServiceImpl;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.livestreamv2.filter.FilterManager;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Random;
import kotlin.jvm.internal.AqS69S0201000_6;
import kotlin.jvm.internal.AqS95S0300000_6;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ARunnableS7S0301000_6 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS7S0301000_6 aRunnableS7S0301000_6) {
        boolean LIZ;
        try {
            C38901FOn c38901FOn = (C38901FOn) aRunnableS7S0301000_6.l0;
            InterfaceC39061FUr nitaView = (InterfaceC39061FUr) aRunnableS7S0301000_6.l1;
            int i = aRunnableS7S0301000_6.i3;
            Context context = (Context) aRunnableS7S0301000_6.l2;
            c38901FOn.getClass();
            o.LJIIJ(nitaView, "nitaView");
            o.LJIIJ(context, "context");
            new AqS95S0300000_6(context, nitaView, new AqS69S0201000_6(i, context, nitaView, 1), 0).invoke();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS7S0301000_6 aRunnableS7S0301000_6) {
        switch (aRunnableS7S0301000_6.i3) {
            case 0:
                WebViewPort webViewPort = (WebViewPort) aRunnableS7S0301000_6.l0;
                String str = (String) ((Serializable) aRunnableS7S0301000_6.l1);
                BQ6 bq6 = (BQ6) aRunnableS7S0301000_6.l2;
                webViewPort.getClass();
                if ("__port_init__".equals(str)) {
                    webViewPort.LIZ.LIZJ(new C37612EpU(webViewPort, Boolean.FALSE));
                    return;
                }
                if ("__port_init_next__".equals(str)) {
                    webViewPort.LIZ.LIZJ(new C37612EpU(webViewPort, Boolean.TRUE));
                    return;
                }
                try {
                    GsonUtils.LIZIZ.getClass();
                    m mVar = (m) com.google.gson.o.LIZ(str);
                    if (mVar.LJJIJLIJ("data")) {
                        j LJJIJ = mVar.LJJIJ("data");
                        LJJIJ.getClass();
                        if (!(LJJIJ instanceof m)) {
                            mVar.LJJII("data", com.google.gson.o.LIZ(mVar.LJJIJ("data").LJIJ().LJJIFFI()));
                        }
                    }
                    bq6.accept(mVar);
                    return;
                } catch (Throwable th) {
                    C37238EjS.LIZLLL(4, "[Bridge] onMessage error:", th);
                    return;
                }
            default:
                ((FilterManager) aRunnableS7S0301000_6.l0).lambda$toI420$11((VideoFrame.I420Buffer[]) ((Serializable) aRunnableS7S0301000_6.l1), (VideoFrame.TextureBuffer) aRunnableS7S0301000_6.l2);
                return;
        }
    }

    public static final void run$2(ARunnableS7S0301000_6 aRunnableS7S0301000_6) {
        switch (aRunnableS7S0301000_6.i3) {
            case 0:
                Object obj = aRunnableS7S0301000_6.l0;
                W6U w6u = (W6U) aRunnableS7S0301000_6.l1;
                Object obj2 = aRunnableS7S0301000_6.l2;
                obj.getClass();
                File LJII = W5V.LJII(w6u);
                if (LJII == null) {
                    return;
                }
                C2050382x.LIZ.execute(new ARunnableS14S0201000_11(1, obj2, LJII, 3));
                return;
            default:
                PublishDrillServiceImpl publishDrillServiceImpl = (PublishDrillServiceImpl) aRunnableS7S0301000_6.l0;
                PublishTestSupportSetting$PublishTestSupportConfig publishTestSupportSetting$PublishTestSupportConfig = (PublishTestSupportSetting$PublishTestSupportConfig) aRunnableS7S0301000_6.l1;
                Context context = (Context) aRunnableS7S0301000_6.l2;
                publishDrillServiceImpl.getClass();
                try {
                    if (!publishTestSupportSetting$PublishTestSupportConfig.syncWithException) {
                        publishDrillServiceImpl.LJ(context, publishTestSupportSetting$PublishTestSupportConfig);
                    }
                    try {
                        Thread.sleep(publishTestSupportSetting$PublishTestSupportConfig.testTriggerDelay);
                    } catch (InterruptedException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    Random random = new Random(System.currentTimeMillis());
                    if (publishTestSupportSetting$PublishTestSupportConfig.testTriggerRange <= 0) {
                        publishTestSupportSetting$PublishTestSupportConfig.testTriggerRange = 1;
                    }
                    if (TextUtils.isEmpty(publishTestSupportSetting$PublishTestSupportConfig.crashMsg)) {
                        publishTestSupportSetting$PublishTestSupportConfig.crashMsg = "PUBLISH_FUSED_TEST_EXCEPTION";
                    }
                    if (random.nextInt(publishTestSupportSetting$PublishTestSupportConfig.testTriggerRange) < publishTestSupportSetting$PublishTestSupportConfig.testTriggerProbability) {
                        if (publishTestSupportSetting$PublishTestSupportConfig.syncWithException) {
                            publishDrillServiceImpl.LJ(context, publishTestSupportSetting$PublishTestSupportConfig);
                        }
                        if (!TextUtils.isEmpty(publishTestSupportSetting$PublishTestSupportConfig.crashStack)) {
                            if ("java".equals(publishTestSupportSetting$PublishTestSupportConfig.crashType)) {
                                String str = publishTestSupportSetting$PublishTestSupportConfig.crashType;
                                C64246PJi LJJIFFI = C64246PJi.LJJIFFI(new StackTraceElement(str, str, "PublishTestSupportTask.java", 1), publishTestSupportSetting$PublishTestSupportConfig.crashStack, publishTestSupportSetting$PublishTestSupportConfig.crashMsg, "threadname", true, "EnsureNotReachHere", publishTestSupportSetting$PublishTestSupportConfig.logType);
                                if (!TextUtils.isEmpty(publishTestSupportSetting$PublishTestSupportConfig.customerFilters)) {
                                    for (String str2 : publishTestSupportSetting$PublishTestSupportConfig.customerFilters.split(",")) {
                                        String[] split = str2.split(":");
                                        LJJIFFI.LJFF(split[0], split[1]);
                                    }
                                }
                                JSONObject jSONObject = new JSONObject();
                                HashMap hashMap = (HashMap) publishDrillServiceImpl.LIZJ(publishTestSupportSetting$PublishTestSupportConfig);
                                for (String str3 : hashMap.keySet()) {
                                    try {
                                        jSONObject.put(str3, hashMap.get(str3));
                                    } catch (JSONException e2) {
                                        C16880lQ.LLLLIIL(e2);
                                    }
                                }
                                LJJIFFI.LJIIJJI("custom", jSONObject);
                                C64241PJd.LIZIZ(LJJIFFI);
                                return;
                            }
                            return;
                        }
                        PJZ.LIZLLL(publishTestSupportSetting$PublishTestSupportConfig.logType, publishTestSupportSetting$PublishTestSupportConfig.crashMsg, new RuntimeException("PUBLISH_FUSED_TEST_EXCEPTION"));
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    PJZ.LIZLLL("LOG_TYPE_PUBLISH_DRILL_TEST", "drill_inner_error", th);
                    return;
                }
        }
    }

    public ARunnableS7S0301000_6(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.$t = i2;
        this.i3 = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
