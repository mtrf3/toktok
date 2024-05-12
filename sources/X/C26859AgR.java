package X;

import java.util.HashMap;

/* renamed from: X.AgR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26859AgR {
    public static HashMap LIZ(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("disableBounces", 1);
        if (!z) {
            hashMap.put("__status_bar", Boolean.TRUE);
            hashMap.put("hide_nav_bar", 1);
            hashMap.put("container_color_auto_dark", 1);
            hashMap.put("should_full_screen", 1);
        } else {
            hashMap.put("use_webview_title", 1);
        }
        return hashMap;
    }
}
