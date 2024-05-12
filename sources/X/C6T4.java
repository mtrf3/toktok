package X;

import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.global.GlobalHashTagStickerModel;

/* renamed from: X.6T4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6T4 extends C6U8<GlobalHashTagStickerModel> {
    @Override // X.C6U8
    public final C6UF LIZ() {
        return new C161006To(LIZIZ().LIZLLL, LIZIZ(), 6);
    }

    @Override // X.C6U8
    public final GlobalHashTagStickerModel LIZJ(InteractStickerStruct interactStickerStruct) {
        String str;
        HashtagStruct hashtagInfo = interactStickerStruct.getHashtagInfo();
        if (hashtagInfo == null || (str = hashtagInfo.getHashtagName()) == null) {
            str = "";
        }
        return new GlobalHashTagStickerModel(null, 0L, str, false, false, false, 59, null);
    }
}
