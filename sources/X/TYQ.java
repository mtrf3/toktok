package X;

import android.os.Looper;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import defpackage.i0;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TYQ {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZJ(String event) {
        o.LJIIIZ(event, "event");
        LIZLLL(event, "");
    }

    public static final void LJ(java.util.Map<String, ? extends Object> map) {
        C28733BPl.LJIILIIL().LJIIIIZZ("ttlive_interact", map);
    }

    public static final void LIZ(String str, String str2) {
        String LJFF = i0.LJFF("InteractALog_", str);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C16880lQ.LLLLIIIILLL().getId());
        LIZ2.append("_[");
        LIZ2.append(o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ()));
        LIZ2.append("] ");
        LIZ2.append(str2);
        C0NB.LIZIZ(LJFF, X1D.LIZIZ(LIZ2));
    }

    public static final void LIZIZ(String str, String str2) {
        if (o.LJ("local_test", ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).getChannel())) {
            StackTraceElement[] stackTrace = C16880lQ.LLLLIIIILLL().getStackTrace();
            int i = 2;
            do {
                if (i < stackTrace.length) {
                    String LJFF = i0.LJFF("InteractALog_", str);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("log trace");
                    LIZ2.append(i);
                    LIZ2.append(stackTrace[i].getClassName());
                    LIZ2.append(' ');
                    LIZ2.append(stackTrace[i].getMethodName());
                    C0NB.LIZIZ(LJFF, X1D.LIZIZ(LIZ2));
                }
                i++;
            } while (i < 6);
        }
        LIZ(str, str2);
    }

    public static final void LIZLLL(String event, String extra) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(extra, "extra");
        HashMap hashMap = new HashMap();
        hashMap.put("event", event);
        hashMap.put("extra", extra);
        LJ(hashMap);
    }

    public static final void LJFF(String str, String extra) {
        o.LJIIIZ(extra, "extra");
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        hashMap.put("extra", extra);
        C74838TYs LJ = C74838TYs.LJ();
        C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_DATA_HOLDER");
        hashMap.put("opened", LJ.LIZIZ);
        hashMap.put("anchorLinkMicId", LJ.LJIILIIL);
        hashMap.put("linkMicId", LJ.LIZLLL());
        hashMap.put("linkMicVendor", Integer.valueOf(Config.Vendor.fromValue(0).getValue()));
        hashMap.put("rtcExtInfo", LJ.LJIILL);
        LJ(hashMap);
    }
}
