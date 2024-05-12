package X;

import X.B83;
import X.C0IT;
import X.C141335gf;
import X.C3C5;
import X.InterfaceC29405BgP;
import Y.IDRunnableS85S0100000;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService;
import com.bytedance.android.livesdk.livesetting.other.LiveClientAISettings;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PTYDIDCallback;
import com.bytedance.pitaya.api.PTYPackageFilterCallback;
import com.bytedance.pitaya.api.PTYSetupCallback;
import com.bytedance.pitaya.api.PTYUIDCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYSetupInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.0IT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0IT {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static int LIZJ = 3;
    public static volatile boolean LIZLLL;

    public static final synchronized void LIZ() {
        synchronized (C0IT.class) {
            if (!LiveClientAISettings.INSTANCE.initAfterAppStart()) {
                return;
            }
            if (LIZLLL) {
                return;
            }
            LIZLLL = true;
            LIZIZ(C46631sJ.LJLIL, C46641sK.LJLIL);
            C20990s3.LIZLLL();
        }
    }

    public static IHostAppContext LJ() {
        InterfaceC06390Mx LIZ2 = CN1.LIZ(IHostAppContext.class);
        o.LJIIIIZZ(LIZ2, "getService(\n        IHostAppContext::class.java)");
        return (IHostAppContext) LIZ2;
    }

    public static final InterfaceC22790ux LJFF() {
        return ((ILiveClientAIService) CN1.LIZ(ILiveClientAIService.class)).ni0();
    }

    public static void LJI() {
        if (!LIZIZ) {
            LiveClientAISettings liveClientAISettings = LiveClientAISettings.INSTANCE;
            if (liveClientAISettings.requestAllPkgsDelay() > 0) {
                T16.LIZ.LIZJ(new Runnable() { // from class: X.0IS
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ2;
                        try {
                            C0IT.LJFF().LIZLLL();
                        } finally {
                            if (LIZ2) {
                            }
                        }
                    }
                }, liveClientAISettings.requestAllPkgsDelay(), TimeUnit.MILLISECONDS);
            } else {
                ((C29921Fk) LJFF()).LIZLLL();
            }
        }
        if (LiveClientAISettings.INSTANCE.requestAllPkgsOnce()) {
            LIZIZ = true;
        }
    }

    public static final void LIZJ(Activity activity) {
        ((ILiveClientAIService) CN1.LIZ(ILiveClientAIService.class)).M50();
        C25230yt.LIZJ = true;
        LIZIZ(new IDqS420S0100000(activity, 23), C46651sL.LJLIL);
        C20990s3.LIZLLL();
        C20990s3.LIZJ();
        if (C36731cL.LIZJ.ohrPredictEnable) {
            C20990s3.LIZJ();
            C36731cL.LIZLLL();
        }
        C20990s3.LIZIZ();
        C36711cJ c36711cJ = C36711cJ.LIZ;
        if (C36711cJ.LIZLLL.enable) {
            C20990s3.LIZIZ();
            if (c36711cJ.LJJZZIII()) {
                C20990s3.LIZIZ();
                c36711cJ.LJII();
            }
        }
        if (LiveClientAISettings.INSTANCE.frequentControlSettings().enableFrequentControl) {
            C22800uy.LIZJ.start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZLLL(Activity activity) {
        if (activity != 0 && (activity instanceof LifecycleOwner)) {
            if (C29306Beo.LJIJI()) {
                ((LifecycleOwner) activity).getLifecycle().removeObserver(C20990s3.LIZ());
            } else {
                C15610jN.LIZIZ(new IDRunnableS85S0100000(activity, 39));
            }
        }
        C20990s3.LIZ().mo3do();
        LJFF().releaseAll();
        if (C20990s3.LIZJ().isEnable()) {
            C20990s3.LIZJ().LIZ();
        }
        if (C20990s3.LIZIZ().isEnable() && C20990s3.LIZIZ().LJJZZIII()) {
            C20990s3.LIZIZ().LIZLLL();
        }
        if (LiveClientAISettings.INSTANCE.frequentControlSettings().enableFrequentControl) {
            C22800uy.LIZJ.destroy();
        }
    }

    public static final void LIZIZ(InterfaceC65784Pro<C76800UCe> resolve, InterfaceC88471Ynr<? super Integer, ? super PTYError, C76800UCe> reject) {
        o.LJIIIZ(resolve, "resolve");
        o.LJIIIZ(reject, "reject");
        IDqS420S0100000 iDqS420S0100000 = new IDqS420S0100000(resolve, 22);
        if (LIZ) {
            iDqS420S0100000.invoke();
            return;
        }
        if (!LiveClientAISettings.INSTANCE.enable()) {
            reject.invoke(-6, null);
            return;
        }
        if (((IHostConfig) CN1.LIZ(IHostConfig.class)).DO()) {
            final IDqS420S0100000 iDqS420S01000002 = new IDqS420S0100000(iDqS420S0100000, 21);
            final IDqS416S0100000 iDqS416S0100000 = new IDqS416S0100000((InterfaceC88471Ynr) reject, (InterfaceC88471Ynr<? super Integer, ? super PTYError, C76800UCe>) 34);
            IPitayaCore core = PitayaCoreFactory.getCore("1728");
            Context context = LJ().context();
            o.LJIIIIZZ(context, "getHostContext().context()");
            String LIZ2 = C30443Bx9.LIZ();
            String channel = LJ().getChannel();
            PTYDIDCallback pTYDIDCallback = new PTYDIDCallback() { // from class: com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv$setUpLivePitayaEnv$1
                @Override // com.bytedance.pitaya.api.PTYDIDCallback
                public String getDid() {
                    String serverDeviceId = C0IT.LJ().getServerDeviceId();
                    o.LJIIIIZZ(serverDeviceId, "getHostContext().serverDeviceId");
                    return serverDeviceId;
                }
            };
            PTYUIDCallback pTYUIDCallback = new PTYUIDCallback() { // from class: com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv$setUpLivePitayaEnv$2
                @Override // com.bytedance.pitaya.api.PTYUIDCallback
                public String getUid() {
                    String l;
                    InterfaceC29405BgP LIZIZ2 = B83.LIZ().LIZIZ();
                    if (LIZIZ2 == null || (l = Long.valueOf(LIZIZ2.getCurrentUserId()).toString()) == null) {
                        return CardStruct.IStatusCode.DEFAULT;
                    }
                    return l;
                }
            };
            PTYPackageFilterCallback pTYPackageFilterCallback = new PTYPackageFilterCallback() { // from class: com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv$setUpLivePitayaEnv$3
                @Override // com.bytedance.pitaya.api.PTYPackageFilterCallback
                public JSONObject getFilter() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("host_app_version", C0IT.LJ().getVersionCode());
                        C3C5.m7constructorimpl(jSONObject.put("host_app_id", String.valueOf(C0IT.LJ().appId())));
                    } catch (Throwable th) {
                        C3C5.m7constructorimpl(C141335gf.LIZ(th));
                    }
                    return jSONObject;
                }
            };
            o.LJIIIIZZ(LIZ2, "getSdkVersion()");
            o.LJIIIIZZ(channel, "channel");
            core.setup(context, new PTYSetupInfo("1728", LIZ2, channel, pTYDIDCallback, pTYUIDCallback, pTYPackageFilterCallback, null, 0, false, null, 0, null, false, false, null, 32448, null), new PTYSetupCallback() { // from class: com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv$setUpLivePitayaEnv$4
                @Override // com.bytedance.pitaya.api.PTYSetupCallback
                public void onResult(boolean z, PTYError pTYError) {
                    if (z) {
                        iDqS420S01000002.invoke();
                    } else {
                        iDqS416S0100000.invoke(pTYError);
                    }
                }
            });
            return;
        }
        int i = LIZJ;
        if (i <= 0) {
            reject.invoke(-1, null);
        } else {
            LIZJ = i - 1;
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C2A2(iDqS420S0100000, reject, null), 3);
        }
    }
}
