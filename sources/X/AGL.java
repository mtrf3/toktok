package X;

import com.bytedance.keva.Keva;
import defpackage.i0;
import java.util.LinkedHashSet;

/* loaded from: classes5.dex */
public final class AGL {
    public static final Keva LIZ = Keva.getRepo("auto_translation_settings_cache");
    public static final Keva LIZIZ = Keva.getRepo("creator_edited_caption_repo");
    public static final java.util.Set<Long> LIZJ = new LinkedHashSet();
    public static final String LIZLLL = "key_available_content_languages";

    public static boolean LIZIZ() {
        Keva keva = LIZ;
        boolean z = false;
        if (keva.getInt("key_autogenerated_caption_on", 0) >= 0) {
            z = true;
        }
        if (!keva.contains("key_autogenerated_caption_on_bool")) {
            keva.storeBoolean("key_autogenerated_caption_on_bool", z);
            return z;
        }
        return keva.getBoolean("key_autogenerated_caption_on_bool", z);
    }

    public static String LIZ(String str) {
        return i0.LJFF("show_edit_caption_hint_count_", str);
    }

    public static String LIZJ(String str) {
        return i0.LJFF("show_edit_caption_banner_count_", str);
    }
}
