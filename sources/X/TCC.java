package X;

import com.ss.android.ugc.aweme.comment.model.GifEmoji;
import com.ss.android.ugc.aweme.comment.model.GifEmojiResponse;
import com.ss.android.ugc.aweme.comment.model.StickerBean;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TCC<T, R> implements InterfaceC48038ItG {
    public static final TCC<T, R> LJLIL = new TCC<>();

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        GifEmojiResponse it = (GifEmojiResponse) obj;
        o.LJIIIZ(it, "it");
        StickerBean stickers = it.getStickers();
        if (stickers != null) {
            List<GifEmoji> stickerList = stickers.getStickerList();
            if (stickerList != null) {
                Iterator<GifEmoji> it2 = stickerList.iterator();
                while (it2.hasNext()) {
                    it2.next().setLogPb(it.getLogPb());
                }
            }
            List<GifEmoji> stickerList2 = stickers.getStickerList();
            if (stickerList2 == null) {
                stickerList2 = C61878OQg.INSTANCE;
            }
            return new OSZ(stickerList2, new C70839Rr9(stickers.getHasMore(), stickers.getNextCursor()));
        }
        return null;
    }
}
