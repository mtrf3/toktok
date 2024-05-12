package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TYP {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str, String msg) {
        o.LJIIIZ(msg, "msg");
        C0NB.LJFF(str, msg, null);
    }

    public static final void LIZJ(String str, String msg) {
        o.LJIIIZ(msg, "msg");
        C0NB.LJIIIZ(str, msg);
    }

    public static final void LIZLLL(String str, String extra) {
        o.LJIIIZ(extra, "extra");
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        hashMap.put("extra", extra);
        C74838TYs LJ = C74838TYs.LJ();
        TTV.LIZ();
        hashMap.put("opened", LJ.LIZIZ);
        hashMap.put("anchorLinkMicId", LJ.LJIILIIL);
        hashMap.put("linkMicId", LJ.LIZLLL());
        hashMap.put("linkMicVendor", Integer.valueOf(Config.Vendor.fromValue(0).getValue()));
        hashMap.put("rtcExtInfo", LJ.LJIILL);
        hashMap.put("is_game_link", Boolean.TRUE);
        C28733BPl.LJIILIIL().LJIIIIZZ("ttlive_interact", hashMap);
    }

    public static final void LIZ(String str, String msg, boolean z) {
        o.LJIIIZ(msg, "msg");
        if (z && o.LJ("local_test", ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).getChannel())) {
            StackTraceElement[] stackTrace = C16880lQ.LLLLIIIILLL().getStackTrace();
            int i = 2;
            do {
                if (i < stackTrace.length) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("log trace");
                    LIZ2.append(i);
                    LIZ2.append(stackTrace[i].getClassName());
                    LIZ2.append(' ');
                    LIZ2.append(stackTrace[i].getMethodName());
                    C0NB.LIZIZ(str, X1D.LIZIZ(LIZ2));
                }
                i++;
            } while (i < 6);
        }
        C0NB.LIZIZ(str, msg);
    }
}
