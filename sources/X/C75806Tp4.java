package X;

import Y.AfS65S0100000_13;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.platform.core.LinkerManager;
import com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3VideoSeiEndSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveParseSeiAsyncSetting;
import com.bytedance.android.livesdk.sei.LiveSeiStruct;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiCommonData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AqS52S0110000_9;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Tp4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75806Tp4 implements C0K7, InterfaceC73592SuS, InterfaceC68018Qmk, X27, InterfaceC54135LMl {
    public static final C75806Tp4 LJLIL = new C75806Tp4();

    @Override // X.X27
    public long LJJII(int i, int i2) {
        if (i == 1) {
            return 3000L;
        }
        if (i == 2) {
            return LivePlayEnforceIntervalSetting.DEFAULT;
        }
        if (i == 3) {
            return 30000L;
        }
        if (i > 3) {
            return LivePreviewNetworkSpeedThresholdSetting.DEFAULT;
        }
        return 0L;
    }

    public static Executor LJ() {
        Object value = GAP.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-WAVE_DISPATCH_EXECUTOR>(...)");
        return (Executor) value;
    }

    public static Executor LJI() {
        Object value = GAP.LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-WAVE_TASK_EXECUTOR>(...)");
        return (Executor) value;
    }

    public QCU LIZJ() {
        return new QCU();
    }

    public C43526H6k LIZLLL() {
        return new C43526H6k();
    }

    public static Executor LJFF(GUU record) {
        Executor executor;
        o.LJIIIZ(record, "record");
        GUQ guq = record.LJI;
        if (guq != null && (executor = guq.LJLJJI) != null) {
            return executor;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("executor is not specified in this publish record, publishId=");
        LIZ.append(record.LIZIZ);
        LIZ.append(", task: ");
        LIZ.append(record.LJI);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public static boolean LJIIIIZZ(C28272B7s c28272B7s) {
        if (c28272B7s == null) {
            return false;
        }
        LiveSeiStruct liveSeiStruct = c28272B7s.LIZ;
        if (liveSeiStruct != null) {
            String str = liveSeiStruct.ttlsLiveScene;
            Iterator<String> it = MultiGuestV3VideoSeiEndSetting.INSTANCE.enableSceneList().iterator();
            while (it.hasNext()) {
                if (it.next().equals(str)) {
                    return true;
                }
            }
            if ("video".equals(str)) {
                return true;
            }
        } else {
            String str2 = c28272B7s.LIZIZ;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    Iterator<String> it2 = MultiGuestV3VideoSeiEndSetting.INSTANCE.enableSceneList().iterator();
                    do {
                        if (!it2.hasNext()) {
                            if ("video".equals(JSONObjectProtectorUtils.getString(jSONObject, "ttls_live_scene"))) {
                                return true;
                            }
                        }
                    } while (!it2.next().equals(JSONObjectProtectorUtils.getString(jSONObject, "ttls_live_scene")));
                    return true;
                } catch (Throwable unused) {
                }
            }
        }
        return false;
    }

    public static SeiCommonData LJIIIZ(String str) {
        if (LiveParseSeiAsyncSetting.INSTANCE.getValue().getInnerEnable() || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("LinkMicSDK")) {
                return null;
            }
            return (SeiCommonData) C09650Zl.LIZIZ.LJI(JSONObjectProtectorUtils.getString(jSONObject, "LinkMicSDK").replaceAll("\\\\", ""), SeiCommonData.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public static SeiAppData LJIIJ(C28272B7s c28272B7s) {
        if (c28272B7s == null) {
            return null;
        }
        LiveSeiStruct liveSeiStruct = c28272B7s.LIZ;
        if (liveSeiStruct != null) {
            return liveSeiStruct.LIZ;
        }
        return C78685UuP.LJJLIIIJJI(c28272B7s.LIZIZ);
    }

    @Override // X.InterfaceC54135LMl
    public void LIZ(int i) {
        boolean z;
        LLR llr = LLR.LIZJ;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z != llr.LIZIZ) {
            llr.LIZIZ = z;
            AbstractC225698tR tabStyle = llr.LIZ;
            o.LJIIIZ(tabStyle, "tabStyle");
            LFQ.LIZ(new AqS52S0110000_9(tabStyle, z, 1));
        }
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object t) {
        o.LJIIIZ(t, "t");
        return true;
    }

    public static Object LJIIJJI(Class cls, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("app_data")) {
                    return C09650Zl.LIZIZ.LJI(JSONObjectProtectorUtils.getString(jSONObject, "app_data"), cls);
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static final void LJII(long j, Context context, LifecycleOwner lifecycleOwner, C75749To9 info, InterfaceC75754ToE callback, LinkerManager linkerManager, DataChannel dataChannel) {
        AbstractC73672Svk<C28467BFf<MGetUserLinkmicStatusResponse.ResponseData>> userLinkmicStatusMultiCoHost;
        o.LJIIIZ(linkerManager, "linkerManager");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(info, "info");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(callback, "callback");
        LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
        if (C44432HcC.LJIIJ().isMultiCoHost()) {
            C73318Sq2 c73318Sq2 = new C73318Sq2();
            CoHostApi coHostApi = (CoHostApi) Q7L.LIZIZ(CoHostApi.class);
            if (coHostApi != null && (userLinkmicStatusMultiCoHost = coHostApi.getUserLinkmicStatusMultiCoHost(j, info.LIZ, info.LIZJ, "", "", "")) != null) {
                c73318Sq2.LIZ(C1EW.LIZ(userLinkmicStatusMultiCoHost).LJJJLIIL(new C75748To8(info, j, LIZIZ, dataChannel, context, callback), new AfS65S0100000_13(callback, 200)));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b2, code lost:
    
        if (r8.isMuteAudio() != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0150, code lost:
    
        if (r19.o5(r8.getInteractId()) != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject LIZIZ(com.ss.avframework.livestreamv2.core.interact.model.InteractConfig r10, java.util.List r11, int r12, int r13, java.util.Map r14, com.bytedance.android.livesdk.comp.api.linkcore.model.Layout r15, java.lang.String r16, java.util.Map r17, java.lang.String r18, X.InterfaceC75807Tp5 r19, java.util.Map r20, java.util.List r21, float r22, long r23, int r25, java.util.HashMap r26) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75806Tp4.LIZIZ(com.ss.avframework.livestreamv2.core.interact.model.InteractConfig, java.util.List, int, int, java.util.Map, com.bytedance.android.livesdk.comp.api.linkcore.model.Layout, java.lang.String, java.util.Map, java.lang.String, X.Tp5, java.util.Map, java.util.List, float, long, int, java.util.HashMap):org.json.JSONObject");
    }
}
