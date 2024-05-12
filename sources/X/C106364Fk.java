package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.adapter.SearchGifViewHolder;
import com.ss.android.ugc.aweme.comment.model.GifEmoji;
import com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiState;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4Fk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106364Fk extends AbstractC65781Prl implements InterfaceC88471Ynr<SearchGifViewHolder, GifEmojiState, C76800UCe> {
    public static final C106364Fk LJLIL = new C106364Fk();

    public C106364Fk() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(SearchGifViewHolder searchGifViewHolder, GifEmojiState gifEmojiState) {
        int i;
        SearchGifViewHolder subscribe = searchGifViewHolder;
        GifEmojiState it = gifEmojiState;
        o.LJIIIZ(subscribe, "$this$subscribe");
        o.LJIIIZ(it, "it");
        UrlModel thumbnail = it.getGifEmoji().getThumbnail();
        if (thumbnail != null) {
            int LIZJ = (int) KL2.LIZJ(EF7.LIZIZ(), 60.0f);
            if (thumbnail.getWidth() != 0) {
                if (thumbnail.getHeight() == 0) {
                    throw null;
                }
                Math.min(O6R.LJJIIZ((thumbnail.getWidth() / thumbnail.getHeight()) * LIZJ), (int) KL2.LIZJ(EF7.LIZIZ(), 107.0f));
                throw null;
            }
            throw null;
        }
        Emoji emoji = new Emoji();
        UrlModel origin = ((GifEmoji) subscribe.getItem()).getOrigin();
        if (origin == null) {
            origin = new UrlModel();
        }
        emoji.setAnimateUrl(origin);
        UrlModel thumbnail2 = ((GifEmoji) subscribe.getItem()).getThumbnail();
        if (thumbnail2 == null) {
            thumbnail2 = new UrlModel();
        }
        emoji.setStaticUrl(thumbnail2);
        emoji.setId(((GifEmoji) subscribe.getItem()).getImageId());
        UrlModel origin2 = ((GifEmoji) subscribe.getItem()).getOrigin();
        int i2 = 0;
        if (origin2 != null) {
            i = origin2.getWidth();
        } else {
            i = 0;
        }
        emoji.setWidth(i);
        UrlModel origin3 = ((GifEmoji) subscribe.getItem()).getOrigin();
        if (origin3 != null) {
            i2 = origin3.getHeight();
        }
        emoji.setHeight(i2);
        emoji.setStickerType(((GifEmoji) subscribe.getItem()).getStickerType());
        emoji.setAnimateType("gif");
        emoji.setDisplayName(subscribe.itemView.getContext().getString(R.string.g26));
        emoji.setLogPb(((GifEmoji) subscribe.getItem()).getLogPb());
        subscribe.getAdapterPosition();
        throw null;
    }
}
