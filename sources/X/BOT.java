package X;

import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdkapi.host.IHostPersonalized;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BOT {
    public static String LIZ = "";
    public static String LIZIZ = "";

    public static boolean LIZ() {
        IHostPersonalized iHostPersonalized = (IHostPersonalized) CN1.LIZ(IHostPersonalized.class);
        if (iHostPersonalized != null && iHostPersonalized.Mi0()) {
            return true;
        }
        return false;
    }

    public static LiveData LIZIZ() {
        IHostPersonalized iHostPersonalized = (IHostPersonalized) CN1.LIZ(IHostPersonalized.class);
        if (iHostPersonalized != null) {
            return iHostPersonalized.ag0();
        }
        return null;
    }

    public static boolean LIZJ() {
        LiveData LIZIZ2;
        if (!LIZ() || (LIZIZ2 = LIZIZ()) == null || !o.LJ(LIZIZ2.getValue(), Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(ActivityC45651qj activityC45651qj) {
        boolean z;
        Resources resources;
        Configuration configuration;
        if (activityC45651qj != null && (resources = activityC45651qj.getResources()) != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJ(DataChannel dataChannel, String str) {
        int i;
        LiveData LIZIZ2 = LIZIZ();
        if (LIZIZ2 != null) {
            i = o.LJ(LIZIZ2.getValue(), Boolean.FALSE);
        } else {
            i = 0;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_manage_feeds_popup_click");
        LIZ2.LJIJJ(LIZIZ, "from_page");
        C78895Uxn.LIZIZ(LIZ2, str, "click_position", i ^ 1, "is_live_non_personalized");
        LIZ2.LJIJJ(LIZ, "source");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJJIIJZLJL();
    }
}
