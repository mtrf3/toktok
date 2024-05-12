package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.base.fragment.BaseStickerStoreContentFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.fragment.StickerSetContentFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.fragment.VideoStickerContentFragment;

/* renamed from: X.3i8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91283i8 {
    public static BaseStickerStoreContentFragment LIZ(int i, int i2, int i3, String str, String str2, int i4) {
        BaseStickerStoreContentFragment baseStickerStoreContentFragment;
        if ((i4 & 8) != 0) {
            str = null;
        }
        if ((i4 & 16) != 0) {
            str2 = null;
        }
        if (i2 == EnumC91113hr.STICKER_SET.getType()) {
            baseStickerStoreContentFragment = new StickerSetContentFragment();
        } else if (i2 == EnumC91113hr.VIDEO_STICKER.getType()) {
            baseStickerStoreContentFragment = new VideoStickerContentFragment();
        } else {
            baseStickerStoreContentFragment = new BaseStickerStoreContentFragment();
        }
        Bundle LIZLLL = C1DG.LIZLLL("filter_type", i, "content_type", i3);
        LIZLLL.putString("uid", str);
        if (str2 != null) {
            LIZLLL.putString("conversation_id", str2);
        }
        baseStickerStoreContentFragment.setArguments(LIZLLL);
        return baseStickerStoreContentFragment;
    }
}
