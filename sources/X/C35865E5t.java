package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import java.util.Iterator;

/* renamed from: X.E5t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35865E5t {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C74932wr.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C35866E5u.LJLIL);

    public static IPluginService.PluginData LIZ() {
        Object obj;
        Iterator LJFF = C79061V1d.LJFF(false);
        while (true) {
            if (LJFF.hasNext()) {
                obj = LJFF.next();
                if (((IPluginService.PluginData) obj).id == EnumC35839E4t.PERSONALIZED_NUJ_V2_DATA.getValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (IPluginService.PluginData) obj;
    }

    public static void LIZIZ() {
        if (((Keva) LIZIZ.getValue()).getBoolean("keva_key_is_report_success", false)) {
            return;
        }
        AbstractC73672Svk.LJIIJ(E6Y.LJLIL).LJJIII(C35861E5p.LJLIL, false).LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LJJJJL(new C74219TAx()).LJJJLIIL(C35862E5q.LJLIL, C35864E5s.LJLIL);
    }
}
