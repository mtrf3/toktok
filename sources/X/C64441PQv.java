package X;

import android.app.Activity;
import android.os.Build;
import android.view.WindowManager;
import java.util.LinkedHashMap;

/* renamed from: X.PQv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64441PQv {
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static final C64441PQv LIZ = new C64441PQv();
    public static final java.util.Set<String> LIZIZ = C77275UUl.LJIIIIZZ("com.ss.android.ugc.aweme.main.MainActivity", "com.ss.android.ugc.aweme.detail.ui.DetailActivity", "com.ss.android.ugc.aweme.live.LivePlayActivity", "com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "com.ss.android.ugc.aweme.host.TikTokHostActivity", "com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity", "com.ss.android.ugc.aweme.adaptation.saa.SAAActivity", "com.ss.android.ugc.aweme.music.ui.MusicDetailActivity");
    public static int LJ = -1;
    public static final java.util.Map<String, Integer> LJFF = new LinkedHashMap();
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(C64442PQw.LJLIL);
    public static final C62822Ol8 LJII = C221108m2.LIZIZ(C64438PQs.LJLIL);
    public static final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(C64440PQu.LJLIL);

    public final synchronized void LIZ() {
        if (LIZJ && !LIZLLL) {
            LIZLLL = true;
            LIZJ(C84763XOl.LJIIIIZZ());
        }
    }

    public final synchronized void LIZJ(Activity activity) {
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (!LIZLLL) {
                    return;
                }
                String name = activity.getClass().getName();
                if (name.length() > 0) {
                    if (!((Boolean) C64443PQx.LJ.getValue()).booleanValue()) {
                        if (((Boolean) C64443PQx.LJFF.getValue()).booleanValue() && LIZIZ.contains(name)) {
                        }
                    }
                    java.util.Map<String, Integer> map = LJFF;
                    if (!map.containsKey(name)) {
                        int i = LJ;
                        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
                        attributes.preferredDisplayModeId = i;
                        activity.getWindow().setAttributes(attributes);
                        map.put(name, Integer.valueOf(LJ));
                    }
                }
            }
        }
    }

    public final synchronized void LIZIZ(Activity activity, boolean z) {
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                String name = activity.getClass().getName();
                java.util.Map<String, Integer> map = LJFF;
                if (map.containsKey(name)) {
                    map.remove(name);
                    if (z) {
                        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
                        attributes.preferredDisplayModeId = 0;
                        activity.getWindow().setAttributes(attributes);
                    }
                }
            }
        }
    }
}
