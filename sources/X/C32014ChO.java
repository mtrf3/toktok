package X;

import Y.ARunnableS41S0100000_5;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.broadcast.HandlerThreadOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicALogToAppLogRegular;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicALogToAppLogSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.ChO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32014ChO implements InterfaceC28344BAm {
    public static HandlerC28345BAn LJLILLLLZI;
    public static final C32014ChO LJLIL = new C32014ChO();
    public static String LJLJI = "";
    public static String LJLJJI = "";
    public static String LJLJJL = "";
    public static String LJLJJLL = "";
    public static String LJLJL = "";

    public static final void LJIIIZ(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        LJIIJ(tag, msg);
    }

    public static JSONObject LIZLLL() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uid", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
            jSONObject.put("room_id", LJLJI);
            jSONObject.put("linkmic_id", LJLJJI);
            jSONObject.put("channel_id", LJLJJL);
            jSONObject.put("role", LJLJJLL);
            jSONObject.put(WM7.SCENE_SERVICE, LJLJL);
            return jSONObject;
        } catch (JSONException e) {
            C0NB.LJ("LinkMicALoggerImpl", e.toString());
            return new JSONObject();
        }
    }

    public static StackTraceElement LJ() {
        StackTraceElement stackTraceElement = C16880lQ.LLLLIIIILLL().getStackTrace()[3];
        o.LJIIIIZZ(stackTraceElement, "stacks[3]");
        return stackTraceElement;
    }

    public static void LJI(C32015ChP c32015ChP) {
        if (c32015ChP == null) {
            return;
        }
        try {
            if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_linkmic_tech_log", LiveLogMonitorSampleSetting.getSAMPLE_100())) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("level", c32015ChP.LIZ);
            hashMap.put("tag", c32015ChP.LIZIZ);
            hashMap.put("module", c32015ChP.LIZJ);
            hashMap.put("detail", c32015ChP.LIZLLL);
            String str = c32015ChP.LJ;
            if (str == null) {
                str = "{}";
            }
            hashMap.put("extra", str);
            hashMap.put("timestamp", String.valueOf(C31012CFc.LIZIZ()));
            String jSONObject = LIZLLL().toString();
            o.LJIIIIZZ(jSONObject, "getInteractContext().toString()");
            hashMap.put("context", jSONObject);
            BZI LIZ = C28787BRn.LIZ("livesdk_linkmic_tech_log");
            LIZ.LJJIFFI(hashMap);
            LIZ.LJJIIJZLJL();
        } catch (JSONException e) {
            C0NB.LJ("LinkMicALoggerImpl", e.toString());
        }
    }

    public static void LJIIIIZZ(C32016ChQ c32016ChQ) {
        LJLJJL = c32016ChQ.LJLJI;
        LJLJJI = c32016ChQ.LJLILLLLZI;
        LJLJI = c32016ChQ.LJLIL;
        LJLJJLL = c32016ChQ.LJLJJI;
        LJLJL = c32016ChQ.LJLJJL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("channelId:");
        LIZ.append(LJLJJL);
        LIZ.append(", linkMicId:");
        LIZ.append(LJLJJI);
        LIZ.append(", roomId:");
        LIZ.append(LJLJI);
        LIZ.append("role:");
        LIZ.append(LJLJJLL);
        LIZ.append(", scene:");
        JBR.LJIIJ(LIZ, LJLJL, LIZ, "LinkMicALoggerImpl");
    }

    @Override // X.InterfaceC28344BAm
    public final void handleMsg(Message message) {
        Integer valueOf;
        Looper looper;
        if (!HandlerThreadOptSetting.INSTANCE.enable()) {
            if (message == null || message.what != 1001) {
                HandlerC28345BAn handlerC28345BAn = LJLILLLLZI;
                if (handlerC28345BAn != null) {
                    handlerC28345BAn.removeMessages(1001);
                }
                HandlerC28345BAn handlerC28345BAn2 = LJLILLLLZI;
                if (handlerC28345BAn2 != null) {
                    handlerC28345BAn2.sendEmptyMessageDelayed(1001, LivePlayEnforceIntervalSetting.DEFAULT);
                }
            }
            C32015ChP c32015ChP = null;
            if (message == null || (valueOf = Integer.valueOf(message.what)) == null) {
                return;
            }
            if (valueOf.intValue() == 1001) {
                synchronized (this) {
                    HandlerC28345BAn handlerC28345BAn3 = LJLILLLLZI;
                    if (handlerC28345BAn3 != null && (looper = handlerC28345BAn3.getLooper()) != null) {
                        looper.quit();
                    }
                    LJLILLLLZI = null;
                }
                return;
            }
            if (valueOf.intValue() != 1002) {
                return;
            }
            Object obj = message.obj;
            if (obj instanceof C32015ChP) {
                c32015ChP = (C32015ChP) obj;
            }
            LJI(c32015ChP);
        }
    }

    public static void LIZ(String tag, String msg) {
        C32014ChO c32014ChO = LJLIL;
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        C0NB.LIZIZ(tag, msg);
        c32014ChO.LJII("d", tag, msg, null);
    }

    public static final void LIZIZ(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        LIZJ(tag, msg, null);
    }

    public static void LJFF(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        C0NB.LJIIIZ(tag, msg);
        LJLIL.LJII("i", tag, msg, null);
    }

    public static void LJIIJ(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        C0NB.LJIIL(tag, msg);
        LJLIL.LJII("w", tag, msg, null);
    }

    public static final void LIZJ(String tag, String msg, String str) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        C0NB.LJ(tag, msg);
        LJLIL.LJII("e", tag, msg, str);
    }

    public final void LJII(String str, String str2, String str3, String str4) {
        int LJJLIIIJL;
        if (!LinkMicALogToAppLogSetting.INSTANCE.enable()) {
            return;
        }
        LinkMicALogToAppLogRegular linkMicALogToAppLogRegular = LinkMicALogToAppLogRegular.INSTANCE;
        if (linkMicALogToAppLogRegular.getBlockList().contains(str2) || !linkMicALogToAppLogRegular.getLevelAllowList().contains(str) || (LJJLIIIJL = s.LJJLIIIJL(str2, "_", 0, false, 6)) <= 0) {
            return;
        }
        String charSequence = str2.subSequence(0, LJJLIIIJL).toString();
        if (!linkMicALogToAppLogRegular.getTagModuleAllowList().contains(charSequence)) {
            return;
        }
        C32015ChP c32015ChP = new C32015ChP(str, str2, charSequence, str3, str4);
        HandlerThreadOptSetting handlerThreadOptSetting = HandlerThreadOptSetting.INSTANCE;
        if (handlerThreadOptSetting.enable()) {
            C39202Fa2.LIZJ().submit(new ARunnableS41S0100000_5(c32015ChP, 314));
            return;
        }
        synchronized (this) {
            if (LJLILLLLZI == null) {
                if (!handlerThreadOptSetting.enable()) {
                    HandlerThread handlerThread = new HandlerThread("livesdk_linkmic_reporter");
                    handlerThread.start();
                    LJLILLLLZI = new HandlerC28345BAn(handlerThread.getLooper(), this);
                }
            }
        }
        HandlerC28345BAn handlerC28345BAn = LJLILLLLZI;
        if (handlerC28345BAn == null) {
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 1002;
        obtain.obj = c32015ChP;
        handlerC28345BAn.sendMessage(obtain);
    }
}
