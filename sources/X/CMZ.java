package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CMZ implements InterfaceC31193CMb {
    public final Context LIZ;
    public final C5H3 LIZIZ;

    public CMZ(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = C78996UzQ.LJJIJIIJI(C31192CMa.LJLIL);
    }

    public final void LIZ(String str, String businessName, String str2, String str3, String error, boolean z) {
        o.LJIIIZ(businessName, "businessName");
        o.LJIIIZ(error, "error");
        if (!((Keva) this.LIZIZ.getValue()).getBoolean("live_debug_tools_client_trigger_switcher", false)) {
            return;
        }
        C15610jN.LIZIZ(new CMY(z, this, businessName, str3, str, error));
    }
}
