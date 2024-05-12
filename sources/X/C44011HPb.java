package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.setting.EoyHighlightConfig;
import java.util.Iterator;
import java.util.List;
import ujb.s;

/* renamed from: X.HPb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44011HPb {
    public static final boolean LIZ;

    static {
        SettingsManager.LIZLLL().getClass();
        LIZ = SettingsManager.LIZ("enable_eoy_prop", true);
    }

    public static boolean LIZ(String str) {
        EoyHighlightConfig eoyHighlightConfig;
        List<String> text;
        if (!LIZ || str == null || str.length() == 0 || (eoyHighlightConfig = C44016HPg.LIZ) == null || (text = eoyHighlightConfig.getText()) == null || text.isEmpty()) {
            return false;
        }
        Iterator<String> it = text.iterator();
        while (it.hasNext()) {
            if (s.LJJJLZIJ(str, it.next(), false)) {
                return true;
            }
        }
        return false;
    }
}
