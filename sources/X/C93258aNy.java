package X;

import android.content.Context;
import android.os.Looper;
import com.bytedance.pitaya.api.bean.PTYApplogEvent;
import com.bytedance.pitaya.api.bean.PTYApplogEventType;
import com.bytedance.pitaya.api.bean.PTYSetupMode;
import com.bytedance.pitaya.api.mutilinstance.HostSetupWatcher;
import com.bytedance.pitaya.api.mutilinstance.LiteHostSetupWatcher;
import com.bytedance.pitaya.jniwrapper.PitayaNativeInstance;
import com.bytedance.pitaya.log.PitayaLogger;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.aNy, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93258aNy {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public volatile boolean LIZ;
    public volatile String LIZIZ;
    public volatile boolean LIZJ;
    public volatile boolean LIZLLL;
    public volatile boolean LJ;
    public final Semaphore LJFF = new Semaphore(0);
    public volatile PTYSetupMode LJI = PTYSetupMode.NONE;
    public volatile boolean LJII;

    public static String LIZJ(Context context) {
        String str;
        File LLIIJLIL = C16880lQ.LLIIJLIL(context);
        if (LLIIJLIL != null) {
            str = LLIIJLIL.getAbsolutePath();
        } else {
            str = null;
        }
        return o.LJIILLIIL("/Pitaya/CFG/LITE_MODE_MARK", str);
    }

    public static void LIZLLL(int i) {
        if (i == PTYSetupMode.Lite.getCode()) {
            PitayaLogger.LIZJ("PitayaInstance", "Notify lite host setup");
            LiteHostSetupWatcher.INSTANCE.onLiteHostSetup();
        } else if (i == PTYSetupMode.Normal.getCode()) {
            PitayaLogger.LIZJ("PitayaInstance", "Notify normal host setup");
            HostSetupWatcher.INSTANCE.onHostSetup();
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("unexpected setup mode: ");
            LIZ.append(i);
            PitayaLogger.LIZIZ("PitayaInstance", X1D.LIZIZ(LIZ));
        }
    }

    public final void LIZIZ(PTYApplogEvent pTYApplogEvent, boolean z) {
        if (!this.LJII || C93302aOg.LJII) {
            return;
        }
        if (!z) {
            String eventName = pTYApplogEvent.getEventName();
            o.LJIIJ(eventName, "eventName");
            try {
                if (!PitayaNativeInstance.nativeIsValidEvent(eventName)) {
                    return;
                }
                String event = pTYApplogEvent.getEventName();
                String args = pTYApplogEvent.getArgs();
                double timestamp = pTYApplogEvent.getTimestamp();
                int code = pTYApplogEvent.getType().getCode();
                o.LJIIJ(event, "event");
                try {
                    PitayaNativeInstance.nativeOnEvent(event, args, timestamp, code);
                    return;
                } catch (UnsatisfiedLinkError e) {
                    PitayaLogger.LJ(e, null, 6);
                    return;
                }
            } catch (UnsatisfiedLinkError e2) {
                PitayaLogger.LJ(e2, null, 6);
                return;
            }
        }
        String event2 = pTYApplogEvent.getEventName();
        String args2 = pTYApplogEvent.getArgs();
        double timestamp2 = pTYApplogEvent.getTimestamp();
        int code2 = pTYApplogEvent.getType().getCode();
        o.LJIIJ(event2, "event");
        try {
            PitayaNativeInstance.nativeOnEvent(event2, args2, timestamp2, code2);
        } catch (UnsatisfiedLinkError e3) {
            PitayaLogger.LJ(e3, null, 6);
        }
    }

    public final void LJ(String customEventName, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject optJSONObject;
        String optString;
        o.LJIIJ(customEventName, "customEventName");
        if (!this.LJII) {
            return;
        }
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            ExecutorC93235aNb.LIZIZ(new RunnableC93257aNx(this, customEventName, jSONObject));
            return;
        }
        HashSet<String> hashSet = C93244aNk.LIZ;
        String str = null;
        if (hashSet.isEmpty() || !hashSet.contains(customEventName) || (jSONObject2 = C93244aNk.LIZIZ) == null || (optJSONObject = jSONObject2.optJSONObject(customEventName)) == null) {
            return;
        }
        Iterator<String> keys = optJSONObject.keys();
        o.LJFF(keys, "mappingRule.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            if (jSONObject == null || (optString = jSONObject.optString(next)) == null) {
                return;
            }
            JSONArray optJSONArray = optJSONObject.optJSONArray(next);
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    String optString2 = optJSONArray.optString(i);
                    if (o.LJ(optString, optString2)) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(customEventName);
                        LIZ.append('_');
                        LIZ.append(optString2);
                        String LIZIZ = X1D.LIZIZ(LIZ);
                        if (LIZIZ == null || LIZIZ.length() <= 0) {
                            return;
                        }
                        try {
                            if (!PitayaNativeInstance.nativeIsValidEvent(LIZIZ)) {
                                return;
                            }
                            if (jSONObject != null) {
                                str = jSONObject.toString();
                            }
                            LIZIZ(new PTYApplogEvent(LIZIZ, str, PTYApplogEventType.NORMAL), true);
                            return;
                        } catch (UnsatisfiedLinkError e) {
                            PitayaLogger.LJ(e, null, 6);
                            return;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(final android.content.Context r32, final com.bytedance.pitaya.inner.api.bean.SetupInfo r33, final com.bytedance.pitaya.api.PTYSetupCallback r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 1179
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93258aNy.LIZ(android.content.Context, com.bytedance.pitaya.inner.api.bean.SetupInfo, com.bytedance.pitaya.api.PTYSetupCallback, boolean, boolean):void");
    }
}
