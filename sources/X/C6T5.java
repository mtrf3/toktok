package X;

import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.single.SingleHashTagStickerModel;

/* renamed from: X.6T5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6T5 extends C6U8<SingleHashTagStickerModel> {
    @Override // X.C6U8
    public final C6UF LIZ() {
        return new C161016Tp(LIZIZ().LIZLLL, LIZIZ(), 6);
    }

    @Override // X.C6U8
    public final SingleHashTagStickerModel LIZJ(InteractStickerStruct interactStickerStruct) {
        String str;
        HashtagStruct hashtagInfo = interactStickerStruct.getHashtagInfo();
        if (hashtagInfo == null || (str = hashtagInfo.getHashtagName()) == null) {
            str = "";
        }
        return new SingleHashTagStickerModel(null, 0L, str, false, false, false, 59, null);
    }
}
