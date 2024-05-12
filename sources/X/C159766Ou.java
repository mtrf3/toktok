package X;

import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.embed.EmbedHashTagStickerModel;

/* renamed from: X.6Ou, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159766Ou extends C6U8<EmbedHashTagStickerModel> {
    @Override // X.C6U8
    public final C6UF LIZ() {
        return new C160946Ti(LIZIZ().LIZLLL, LIZIZ(), 6);
    }

    @Override // X.C6U8
    public final EmbedHashTagStickerModel LIZJ(InteractStickerStruct interactStickerStruct) {
        String str;
        HashtagStruct hashtagInfo = interactStickerStruct.getHashtagInfo();
        if (hashtagInfo == null || (str = hashtagInfo.getHashtagName()) == null) {
            str = "";
        }
        return new EmbedHashTagStickerModel(null, 0L, str, false, false, false, 59, null);
    }
}
