package X;

import com.ss.android.ugc.aweme.comment.api.GifEmojiApi;
import com.ss.android.ugc.aweme.comment.model.GifEmoji;
import com.ss.android.ugc.aweme.comment.model.GifEmojiResponse;
import com.ss.android.ugc.aweme.comment.model.StickerBean;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TCA extends R30<TC9, List<? extends GifEmoji>, TC9, GifEmojiResponse> {
    @Override // X.InterfaceC68907R2p
    public final Object LJFF(Object req) {
        o.LJIIIZ(req, "req");
        return req;
    }

    @Override // X.R30
    public final AbstractC73672Svk<GifEmojiResponse> LJII(TC9 tc9) {
        TC9 req = tc9;
        o.LJIIIZ(req, "req");
        GifEmojiApi.LIZ.getClass();
        return ((GifEmojiApi) TCG.LIZIZ.getValue()).searchGifEmoji(req.LJLIL, req.LJLILLLLZI, "comment", req.LJLJI).LJJL(T16.LIZ());
    }

    @Override // X.InterfaceC68907R2p
    public final Object LJI(Object req, Object obj) {
        List<GifEmoji> stickerList;
        GifEmojiResponse resp = (GifEmojiResponse) obj;
        o.LJIIIZ(req, "req");
        o.LJIIIZ(resp, "resp");
        StickerBean stickers = resp.getStickers();
        if (stickers == null || (stickerList = stickers.getStickerList()) == null) {
            return C61878OQg.INSTANCE;
        }
        return stickerList;
    }
}
