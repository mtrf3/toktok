package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.fragment.StickerSetDetailFragment;

/* renamed from: X.3d2 */
/* loaded from: classes2.dex */
public final class C88123d2 {
    public static /* synthetic */ StickerSetDetailFragment LIZIZ(long j, int i, String str) {
        return LIZ(i, null, str, false, j);
    }

    public static StickerSetDetailFragment LIZ(int i, String str, String str2, boolean z, long j) {
        StickerSetDetailFragment stickerSetDetailFragment = new StickerSetDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("sticker_set_id", j);
        bundle.putInt("content_type", i);
        bundle.putString("uid", str);
        bundle.putBoolean("is_from_message", z);
        bundle.putString("conversation_id", str2);
        stickerSetDetailFragment.setArguments(bundle);
        return stickerSetDetailFragment;
    }
}
