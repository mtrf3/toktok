package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Jlh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50117Jlh {
    public static final C50117Jlh LIZ = new C50117Jlh();
    public static final String LIZIZ = "";

    public static boolean LIZ(String searchSource) {
        o.LJIIIZ(searchSource, "searchSource");
        SettingsManager.LIZLLL().getClass();
        String LJI = SettingsManager.LJI("search_prefer_layout_source_list", "");
        if (LJI == null) {
            LJI = LIZIZ;
        }
        if (s.LJLJJL(LJI, new String[]{","}, 0, 6).indexOf(searchSource) == -1) {
            return false;
        }
        return true;
    }
}
