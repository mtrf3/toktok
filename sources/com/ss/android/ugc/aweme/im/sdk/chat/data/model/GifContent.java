package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C107104Ig;
import X.C109544Rq;
import X.C1B6;
import X.C1DD;
import X.C1GE;
import X.C29822Bn8;
import X.C38354F3m;
import X.C47261Igj;
import X.C73340SqO;
import X.EF7;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.share.data.model.PureDataSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import defpackage.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class GifContent extends BaseContent {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("display_name")
    public String displayName;

    @InterfaceC65349Pkn("height")
    public int height;

    @InterfaceC65349Pkn("image_id")
    public long imageId;

    @InterfaceC65349Pkn("image_type")
    public String imageType;
    public boolean isUpdateConversationTime = true;

    @InterfaceC65349Pkn("package_id")
    public long packageId;

    @InterfaceC65349Pkn("sticker_id")
    public String stickerId;

    @InterfaceC65349Pkn("url")
    public UrlModel url;

    @InterfaceC65349Pkn("version")
    public String version;

    @InterfaceC65349Pkn("width")
    public int width;

    public static final GifContent obtain(Emoji emoji) {
        return Companion.obtain(emoji);
    }

    public static final GifContent obtain(Emoji emoji, int i) {
        return Companion.obtain(emoji, i);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, com.ss.android.ugc.aweme.im.sdk.chat.data.model.PreloadFetcher
    public List<UrlModel> fetchPreload() {
        UrlModel urlModel = this.url;
        if (urlModel != null) {
            return C47261Igj.LJJIJ(urlModel);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        PureDataSharePackage.Companion.getClass();
        SharePackage LIZ = C107104Ig.LIZ("gif");
        Bundle bundle = LIZ.extras;
        bundle.putSerializable("video_cover", this.url);
        bundle.putInt("aweme_type", this.type);
        return LIZ;
    }

    public final UrlModel getLocalUrl() {
        String LJJIII;
        int i = this.type;
        if (i == 502) {
            return null;
        }
        if (i == 501) {
            LJJIII = C73340SqO.LJJIII(0L, this.imageId, CardStruct.IStatusCode.DEFAULT, this.imageType);
            o.LJIIIIZZ(LJJIII, "{\n            EmojiFileP…eId, imageType)\n        }");
        } else {
            LJJIII = C73340SqO.LJJIII(this.packageId, this.imageId, this.version, this.imageType);
            o.LJIIIIZZ(LJJIII, "{\n            EmojiFileP…eId, imageType)\n        }");
        }
        if (!C1B6.LIZIZ(LJJIII)) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        ArrayList arrayList = new ArrayList();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("file://");
        LIZ.append(LJJIII);
        arrayList.add(X1D.LIZIZ(LIZ));
        urlModel.setUrlList(arrayList);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("file://");
        LIZ2.append(LJJIII);
        urlModel.setUri(X1D.LIZIZ(LIZ2));
        return urlModel;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        int i = this.type;
        if (501 == i || 505 == i) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('[');
            LIZ.append(EF7.LIZIZ().getString(R.string.h5i));
            LIZ.append(']');
            return X1D.LIZIZ(LIZ);
        }
        if (!C38354F3m.LJ(this.displayName)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append('[');
            return q.LIZIZ(LIZ2, this.displayName, ']', LIZ2);
        }
        return C1DD.LIZLLL(R.string.h48, "context.getString(R.string.im_big_emoji_msg_hint)");
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final GifContent obtain(Emoji emoji) {
            if (emoji == null) {
                return null;
            }
            GifContent gifContent = new GifContent();
            gifContent.setUrl(emoji.getAnimateUrl());
            gifContent.setImageId(emoji.getId());
            gifContent.setDisplayName(C1GE.LJ(emoji));
            gifContent.setImageType(emoji.getAnimateType());
            gifContent.setPackageId(emoji.getResourcesId());
            gifContent.setVersion(emoji.getVersion());
            gifContent.setWidth(emoji.getWidth());
            gifContent.setHeight(emoji.getHeight());
            if (emoji.getStickerType() == 2) {
                gifContent.type = 501;
            } else if (emoji.getStickerType() == 3) {
                gifContent.type = 502;
                gifContent.setStickerId(emoji.getStickerId());
            } else if (emoji.getStickerType() == 4) {
                gifContent.type = 505;
            } else {
                gifContent.type = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
            }
            return gifContent;
        }

        public final GifContent obtain(Emoji emoji, int i) {
            o.LJIIIZ(emoji, "emoji");
            GifContent obtain = obtain(emoji);
            if (obtain != null) {
                obtain.type = i;
            }
            return obtain;
        }
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final int getHeight() {
        return this.height;
    }

    public final long getImageId() {
        return this.imageId;
    }

    public final String getImageType() {
        return this.imageType;
    }

    public final long getPackageId() {
        return this.packageId;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final UrlModel getUrl() {
        return this.url;
    }

    public final String getVersion() {
        return this.version;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isUpdateConversationTime() {
        return this.isUpdateConversationTime;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        o.LJIIIZ(context, "context");
        if (this.type == 502) {
            return C29822Bn8.LIZ(context, R.string.h7y, "{\n            context.re…g.im_quote_gif)\n        }");
        }
        return C29822Bn8.LIZ(context, R.string.h87, "{\n            context.re…_quote_sticker)\n        }");
    }

    public final void setDisplayName(String str) {
        this.displayName = str;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setImageId(long j) {
        this.imageId = j;
    }

    public final void setImageType(String str) {
        this.imageType = str;
    }

    public final void setPackageId(long j) {
        this.packageId = j;
    }

    public final void setStickerId(String str) {
        this.stickerId = str;
    }

    public final void setUpdateConversationTime(boolean z) {
        this.isUpdateConversationTime = z;
    }

    public final void setUrl(UrlModel urlModel) {
        this.url = urlModel;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str, C109544Rq c109544Rq) {
        boolean z3;
        String string;
        String string2;
        Context LIZIZ = EF7.LIZIZ();
        int i = this.type;
        if (500 == i || 501 == i || 504 == i || 505 == i) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2) {
            if (z3) {
                return LIZIZ.getString(R.string.c1a);
            }
            return LIZIZ.getString(R.string.ciw);
        }
        if (z) {
            if (z3) {
                string2 = LIZIZ.getString(R.string.c1a);
            } else {
                string2 = LIZIZ.getString(R.string.ciw);
            }
            o.LJIIIIZZ(string2, "{\n                if (st…          }\n            }");
            return string2;
        }
        if (z3) {
            string = LIZIZ.getString(R.string.c1b);
        } else {
            string = LIZIZ.getString(R.string.qgy);
        }
        o.LJIIIIZZ(string, "{\n                if (st…          }\n            }");
        return string;
    }
}
