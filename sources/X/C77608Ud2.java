package X;

import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ud2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77608Ud2 {
    public static final C5H3 LIZ = C78996UzQ.LJJIJIIJI(C58526My2.LJLIL);
    public static String LIZIZ = "";
    public static final List<Diamond> LIZJ = new ArrayList();

    public static boolean LIZIZ() {
        String str;
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        if (iHostAppContext != null) {
            str = iHostAppContext.getChannel();
        } else {
            str = null;
        }
        return C38354F3m.LIZJ("amazon_int", str);
    }

    public static String LIZ() {
        if (LIZIZ()) {
            return "amazon";
        }
        return "google_pay";
    }
}
