package X;

import com.ss.android.ugc.aweme.plugin.IPluginService;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E5H {
    public static final HashSet<EnumC40761FzB> LIZ = new HashSet<>();

    public static boolean LIZIZ(EnumC40761FzB enumC40761FzB) {
        Object obj;
        String str;
        IPluginService.PluginDataWrapper pluginDataWrapper;
        java.util.Map<String, Boolean> map;
        EnumC40761FzB enumC40761FzB2;
        EnumC40761FzB enumC40761FzB3;
        EnumC40761FzB enumC40761FzB4;
        Iterator LJFF = C79061V1d.LJFF(false);
        do {
            obj = null;
            if (!LJFF.hasNext()) {
                break;
            }
            obj = LJFF.next();
        } while (((IPluginService.PluginData) obj).id != EnumC35839E4t.FLEXIBLE_REMOVE_NUJ_DATA.getValue());
        IPluginService.PluginData pluginData = (IPluginService.PluginData) obj;
        if (pluginData == null) {
            return false;
        }
        Boolean bool = pluginData.showConfig.shouldShow;
        Boolean bool2 = Boolean.TRUE;
        if (!o.LJ(bool, bool2) || (str = pluginData.abExposeVid) == null || str.length() == 0 || (pluginDataWrapper = pluginData.configData) == null || (map = pluginDataWrapper.removeNujStepConfigData) == null) {
            return false;
        }
        if (map.size() > 1 && enumC40761FzB != (enumC40761FzB2 = EnumC40761FzB.JOURNEY_INTERESTS_ID) && (enumC40761FzB == (enumC40761FzB3 = EnumC40761FzB.JOURNEY_CONTENT_LANGUAGE_ID) || enumC40761FzB == (enumC40761FzB4 = EnumC40761FzB.JOURNEY_APP_LANGUAGE_ID) ? LIZ(enumC40761FzB2, map) : !(enumC40761FzB != EnumC40761FzB.JOURNEY_SWIPE_UP_ID || !LIZ(enumC40761FzB2, map) || !LIZ(enumC40761FzB4, map) || !LIZ(enumC40761FzB3, map)))) {
            return false;
        }
        LIZ.add(enumC40761FzB);
        String str2 = pluginData.abExposeVid;
        if (str2 != null) {
            FH5.LIZIZ().getClass();
            FH5.LIZ(str2);
        }
        return o.LJ(map.get(LIZJ(enumC40761FzB)), bool2);
    }

    public static String LIZJ(EnumC40761FzB enumC40761FzB) {
        if (enumC40761FzB == EnumC40761FzB.JOURNEY_INTERESTS_ID) {
            return "should_skip_interest_selection";
        }
        if (enumC40761FzB == EnumC40761FzB.JOURNEY_CONTENT_LANGUAGE_ID) {
            return "should_skip_content_language";
        }
        if (enumC40761FzB == EnumC40761FzB.JOURNEY_APP_LANGUAGE_ID) {
            return "should_skip_app_language";
        }
        if (enumC40761FzB == EnumC40761FzB.JOURNEY_SWIPE_UP_ID) {
            return "should_skip_swipe_up";
        }
        return "";
    }

    public static boolean LIZ(EnumC40761FzB enumC40761FzB, java.util.Map map) {
        if (map.containsKey(LIZJ(enumC40761FzB)) && !LIZ.contains(enumC40761FzB)) {
            return true;
        }
        return false;
    }
}
