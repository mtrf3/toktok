package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveAdmNsTypeSetting;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CKX {
    public static final CKX LIZ = new CKX();
    public static LiveCore LIZIZ;
    public static int LIZJ;

    static {
        new YA6();
        LIZJ = 3;
    }

    public static C31824CeK LIZ(String str) {
        C31824CeK c31824CeK = new C31824CeK("sami.model", EnumC31874Cf8.NS_MODEL, null, null, str, null, false, 3, false, 748);
        c31824CeK.LJFF = true;
        c31824CeK.LJ = "ns_model";
        c31824CeK.LJI = 20;
        return c31824CeK;
    }

    public static final void LIZIZ(TEBundle teBundle) {
        String str;
        o.LJIIIZ(teBundle, "teBundle");
        teBundle.setInt("adm_ns_type", LIZJ);
        LiveAdmNsTypeSetting liveAdmNsTypeSetting = LiveAdmNsTypeSetting.INSTANCE;
        teBundle.setBool("adm_enable_ns_on_headset", liveAdmNsTypeSetting.isHeadsetEnabled());
        teBundle.setString("adm_ns_sami_model", C78983UzD.LJJIIJZLJL(LIZ("")));
        teBundle.setBool("enable_sami_enginecommon_debug", liveAdmNsTypeSetting.isDebugEnable());
        if (liveAdmNsTypeSetting.isDebugEnable()) {
            File LLIIIZ = C16880lQ.LLIIIZ(GlobalContext.getApplicationContext());
            if (LLIIIZ != null) {
                str = LLIIIZ.getAbsolutePath();
            } else {
                str = null;
            }
            teBundle.setString("sami_enginecommon_dump_dir", str);
        }
    }
}
