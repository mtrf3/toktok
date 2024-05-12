package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;

/* renamed from: X.4XV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4XV {
    public static final String[] LIZ;
    public static final String[] LIZIZ;

    static {
        String[] strArr = {"🥰", "😂", "🥺", "😁", "👍", "👏", "🙏", "🎉"};
        LIZ = strArr;
        LIZIZ = strArr;
    }

    public static final List<String> LIZ() {
        String[] strArr;
        Object LJIIIIZZ = SettingsManager.LIZLLL().LJIIIIZZ("messaging_quick_emoji_list", String[].class, LIZIZ);
        if (!(LJIIIIZZ instanceof String[]) || (strArr = (String[]) LJIIIIZZ) == null || strArr.length == 0) {
            strArr = LIZ;
        }
        return ORY.LJJZZIII(strArr);
    }
}
