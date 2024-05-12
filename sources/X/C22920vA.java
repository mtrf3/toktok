package X;

import Y.IDfS292S0100000;
import com.bytedance.android.livesdk.livesetting.broadcast.FrameSignSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.0vA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22920vA {
    public static C73411SrX LIZ;
    public static C73411SrX LIZIZ;
    public static final java.util.Map<String, String> LIZJ = new LinkedHashMap();
    public static final IHostUser LIZLLL;
    public static volatile int LJ;

    static {
        InterfaceC06390Mx LIZ2 = CN1.LIZ(IHostUser.class);
        o.LJIIIIZZ(LIZ2, "getService(IHostUser::class.java)");
        LIZLLL = (IHostUser) LIZ2;
        LJ = 1;
    }

    public static void LIZIZ(long j) {
        java.util.Map<String, String> map = LIZJ;
        ((LinkedHashMap) map).clear();
        map.put("aid", String.valueOf(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).appId()));
        map.put("uid", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getId()));
        String serverDeviceId = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).getServerDeviceId();
        o.LJIIIIZZ(serverDeviceId, "getService(IHostAppConte…lass.java).serverDeviceId");
        map.put("did", serverDeviceId);
        map.put("roomid", String.valueOf(j));
    }

    public static void LIZJ(LiveCore liveCore) {
        if (FrameSignSetting.INSTANCE.isDisable() || liveCore == null) {
            return;
        }
        LIZIZ = (C73411SrX) AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.1a0
            @Override // X.InterfaceC86003Zc
            public final void subscribe(InterfaceC73573Su9<String> interfaceC73573Su9) {
                java.util.Map<String, String> map = C22920vA.LIZJ;
                map.put("timestamp", String.valueOf(System.currentTimeMillis()));
                interfaceC73573Su9.onNext(C22920vA.LIZ(1, map).toString());
            }
        }).LJII(new C62705OjF()).LJJJLIIL(new IDfS292S0100000(liveCore, 43), new InterfaceC64592gB() { // from class: X.1a1
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                C0NB.LJII((Throwable) obj);
            }
        });
    }

    public static void LIZLLL(LiveCore liveCore) {
        if (FrameSignSetting.INSTANCE.isDisable() || liveCore == null) {
            return;
        }
        LIZ = (C73411SrX) AbstractC73672Svk.LJJIIZI(0L, 30L, TimeUnit.SECONDS).LJJIJL(new InterfaceC48038ItG() { // from class: X.1a2
            @Override // X.InterfaceC48038ItG
            public final Object apply(Object it) {
                o.LJIIIZ(it, "it");
                java.util.Map<String, String> map = C22920vA.LIZJ;
                map.put("timestamp", String.valueOf(System.currentTimeMillis()));
                int i = C22920vA.LJ;
                C22920vA.LJ = i + 1;
                map.put("index", String.valueOf(i));
                return C22920vA.LIZ(2, map);
            }
        }).LJII(new C62705OjF()).LJJJLIIL(new IDfS292S0100000(liveCore, 44), new InterfaceC64592gB() { // from class: X.1a3
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                C0NB.LJII((Throwable) obj);
            }
        });
    }

    public static JSONObject LJ(java.util.Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.putOpt((String) entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    public static JSONObject LIZ(int i, java.util.Map map) {
        java.util.Map<String, String> signResult = LIZLLL.frameSign(LJ(map).toString(), i);
        o.LJIIIIZZ(signResult, "signResult");
        if (!signResult.isEmpty()) {
            return LJ(signResult);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("framtype", String.valueOf(i));
        jSONObject.putOpt("signversion", "999");
        jSONObject.putOpt("signinfo", LJ(map));
        jSONObject.putOpt("signvalue", "");
        return jSONObject;
    }
}
