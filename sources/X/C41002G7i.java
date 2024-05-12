package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;

/* renamed from: X.G7i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41002G7i extends C41005G7l {
    public final boolean LIZ;

    @Override // X.C41005G7l
    public final int LIZIZ() {
        if (C00F.LIZ(31744, 0, "studio_max_publish_title_length_for_photo_mode", true) > 0) {
            return C00F.LIZ(31744, 0, "studio_max_publish_title_length_for_photo_mode", true);
        }
        if (C00F.LIZ(31744, 0, "expand_the_character_limit_of_video_caption_from_150_to_500", true) == 2) {
            return 300;
        }
        if (C00F.LIZ(31744, 0, "expand_the_character_limit_of_video_caption_from_150_to_500", true) == 3) {
            return LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        }
        return 150;
    }

    @Override // X.C41005G7l
    public final boolean LIZ() {
        return this.LIZ;
    }

    public C41002G7i(boolean z) {
        this.LIZ = z;
    }
}
