package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ad.feed.ibe.CommerceIBEService;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NDZ {
    public static final C58993NDh LIZ = new C58993NDh();
    public static NDW LIZIZ = NDR.LJI;

    public static void LIZ(List list, EnumC59048NFk preloadScene, Integer num) {
        o.LJIIIZ(preloadScene, "preloadScene");
        try {
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("ibe_switch", true)) {
                return;
            }
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        CommerceIBEService.LJFF().LJ(list, preloadScene, num);
    }
}
