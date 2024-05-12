package com.ss.android.ugc.aweme.experiment;

import X.FFL;
import X.InterfaceC65349Pkn;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EditorProAnchorConfigSetting {
    public static final Map<String, Map<String, String>> LIZ;

    /* loaded from: classes2.dex */
    public static final class EditorProAnchorInfo {

        @InterfaceC65349Pkn("title")
        public String title = "";

        @InterfaceC65349Pkn("iconUrl")
        public String iconUrl = "";
    }

    static {
        new EditorProAnchorConfigSetting();
        LIZ = new LinkedHashMap();
    }

    public static final Map<String, EditorProAnchorInfo> LIZ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        Map<String, Map<String, String>> map = LIZ;
        LJIIIZ.getClass();
        Map map2 = (Map) FFL.LJIJ(true, "studio_editor_pro_anchor_title", 31744, Map.class, map);
        if (map2 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map2.entrySet()) {
                Object key = entry.getKey();
                Object fromJson = GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), GsonProtectorUtils.toJsonTree(GsonHolder.LIZLLL().LIZ(), entry.getValue()), (Class<Object>) EditorProAnchorInfo.class);
                o.LJIIIIZZ(fromJson, "get().gson.fromJson(toJs…roAnchorInfo::class.java)");
                linkedHashMap.put(key, fromJson);
            }
            return linkedHashMap;
        }
        return new LinkedHashMap();
    }
}
