package X;

import com.ss.android.common.lib.AppLogNewUtils;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.FdC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39398FdC {
    public static final C39398FdC LIZ = new C39398FdC();
    public static ExecutorService LIZIZ;

    public static ExecutorService LIZ() {
        if (LIZIZ == null) {
            synchronized (C39398FdC.class) {
                if (LIZIZ == null) {
                    C38027EwB c38027EwB = new C38027EwB(FSY.SERIAL);
                    c38027EwB.LIZIZ = "EventUpload";
                    LIZIZ = C38995FSd.LIZ(new C38028EwC(c38027EwB));
                }
            }
        }
        return LIZIZ;
    }

    public static void LIZIZ(String eventName, JSONObject jSONObject) {
        o.LJIIIZ(eventName, "eventName");
        try {
            AppLogNewUtils.onEventV3(eventName, jSONObject);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
