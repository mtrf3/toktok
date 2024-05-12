package X;

import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import java.util.ArrayList;
import java.util.List;
import ujb.o;

/* loaded from: classes7.dex */
public final class EPI implements AttachUserData {
    public static final List<String> LIZ;

    static {
        EPI epi = new EPI();
        LIZ = new ArrayList();
        Npth.setAttachUserData(epi, CrashType.ALL);
    }

    public static void LIZ(String str) {
        if (o.LJJJLIIL(str, "http://", false) || o.LJJJLIIL(str, "https://", false)) {
            Npth.addTag("web_url", str);
            ((ArrayList) LIZ).add(str);
        }
    }

    @Override // com.bytedance.crash.AttachUserData
    public final java.util.Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        return C113554cx.LJJLIIIIJ(new OSZ("webview_url_list", LIZ.toString()));
    }
}
