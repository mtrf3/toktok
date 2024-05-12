package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;

/* renamed from: X.G7l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C41005G7l {
    public boolean LIZ() {
        return false;
    }

    public int LIZIZ() {
        if (C00F.LIZ(31744, 0, "studio_max_publish_title_length_for_normal", true) > 0) {
            return C00F.LIZ(31744, 0, "studio_max_publish_title_length_for_normal", true);
        }
        if (C00F.LIZ(31744, 0, "expand_the_character_limit_of_video_caption_from_150_to_500", true) == 2) {
            return 300;
        }
        if (C00F.LIZ(31744, 0, "expand_the_character_limit_of_video_caption_from_150_to_500", true) == 3) {
            return LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        }
        return 150;
    }
}
