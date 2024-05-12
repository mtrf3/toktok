package X;

import java.util.HashMap;

/* loaded from: classes13.dex */
public final class SU9 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(java.util.Map map, boolean z) {
        String str;
        if (z) {
            str = "pgc_clip";
        } else {
            str = "original_song";
        }
        ((HashMap) map).put("from_music_type", str);
    }
}
