package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C107104Ig;
import X.C109544Rq;
import X.C48339Iy7;
import X.C93793mB;
import X.EF7;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.content.Context;
import com.bytedance.ies.im.core.api.model.RichTextInfo;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.share.data.model.PureDataSharePackage;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TextContent extends BaseContent {
    public static final Companion Companion = new Companion();
    public final boolean isDefault;

    @InterfaceC65349Pkn("rich_text_infos")
    public final List<RichTextInfo> richTextInfos;

    @InterfaceC65349Pkn("text")
    public final String text;

    public TextContent() {
        this(null, null, false, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextContent copy$default(TextContent textContent, String str, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = textContent.text;
        }
        if ((i & 2) != 0) {
            list = textContent.richTextInfos;
        }
        if ((i & 4) != 0) {
            z = textContent.isDefault;
        }
        return textContent.copy(str, list, z);
    }

    public static final TextContent obtain(TextContent textContent) {
        return Companion.obtain(textContent);
    }

    public static final TextContent obtain(String str) {
        return Companion.obtain(str);
    }

    public static final TextContent obtain(String str, Aweme aweme) {
        return Companion.obtain(str, aweme);
    }

    public static final TextContent obtain(String str, Aweme aweme, List<RichTextInfo> list) {
        return Companion.obtain(str, aweme, list);
    }

    public static final TextContent obtainShareReplyContent(String str, User user) {
        return Companion.obtainShareReplyContent(str, user);
    }

    public static final TextContent obtainShareReplyContent(String str, User user, Aweme aweme) {
        return Companion.obtainShareReplyContent(str, user, aweme);
    }

    public static final TextContent obtainShareReplyContent(String str, String str2, String str3) {
        return Companion.obtainShareReplyContent(str, str2, str3);
    }

    public static final TextContent obtainShareReplyContent(String str, String str2, String str3, Aweme aweme) {
        return Companion.obtainShareReplyContent(str, str2, str3, aweme);
    }

    public final TextContent copy(String str, List<RichTextInfo> list, boolean z) {
        return new TextContent(str, list, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextContent)) {
            return false;
        }
        TextContent textContent = (TextContent) obj;
        return o.LJ(this.text, textContent.text) && o.LJ(this.richTextInfos, textContent.richTextInfos) && this.isDefault == textContent.isDefault;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<RichTextInfo> list = this.richTextInfos;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.isDefault;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        PureDataSharePackage.Companion.getClass();
        SharePackage LIZ = C107104Ig.LIZ("text");
        LIZ.extras.putString("share_text", this.text);
        return LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        String str = this.text;
        if (str == null) {
            return super.getMsgHint();
        }
        return str;
    }

    public final boolean isValid() {
        boolean z;
        String str = this.text;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TextContent(text=");
        LIZ.append(this.text);
        LIZ.append(", richTextInfos=");
        LIZ.append(this.richTextInfos);
        LIZ.append(", isDefault=");
        return C48339Iy7.LIZJ(LIZ, this.isDefault, ')', LIZ);
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TextContent obtain(String str) {
            return obtain$default(this, str, null, null, 6, null);
        }

        public final TextContent obtain(String str, Aweme aweme) {
            return obtain$default(this, str, aweme, null, 4, null);
        }

        public final TextContent obtainShareReplyContent(String str, User user) {
            return obtainShareReplyContent$default(this, str, user, null, 4, null);
        }

        public final TextContent obtainShareReplyContent(String str, String str2, String str3) {
            return obtainShareReplyContent$default(this, str, str2, str3, null, 8, null);
        }

        public Companion() {
        }

        public final TextContent obtain(TextContent content) {
            o.LJIIIZ(content, "content");
            TextContent textContent = new TextContent(content.getText(), null, false, 6, null);
            textContent.type = 700;
            textContent.setRefVideo(content.getRefVideo());
            textContent.setPrevId(content.getPrevId());
            textContent.setRootId(content.getRootId());
            return textContent;
        }

        public final TextContent obtain(String str, Aweme aweme, List<RichTextInfo> list) {
            UrlModel urlModel;
            TextContent textContent = new TextContent(str, list, false, 4, null);
            textContent.type = 700;
            if (aweme != null) {
                BaseContent.ReferenceVideo referenceVideo = new BaseContent.ReferenceVideo();
                referenceVideo.setRefVideoId(aweme.getAid());
                referenceVideo.setRefVideoAuthorUid(aweme.getAuthorUid());
                referenceVideo.setRefVideoAuthorSecUid(aweme.getSecAuthorUid());
                Video video = aweme.getVideo();
                if (video != null) {
                    urlModel = video.getOriginCover();
                } else {
                    urlModel = null;
                }
                referenceVideo.setRefVideoCoverUrl(urlModel);
                referenceVideo.setRefVideoAwemeType(aweme.getAwemeType());
                referenceVideo.setRefVideoIsStory(aweme.getIsTikTokStory());
                textContent.setRefVideo(referenceVideo);
            }
            return textContent;
        }

        public final TextContent obtainShareReplyContent(String str, User user, Aweme aweme) {
            UrlModel urlModel;
            TextContent textContent = new TextContent(str, null, false, 6, null);
            textContent.type = 700;
            if (aweme != null) {
                BaseContent.ReferenceVideo referenceVideo = new BaseContent.ReferenceVideo();
                referenceVideo.setRefVideoId(aweme.getAid());
                if (user != null) {
                    referenceVideo.setRefVideoAuthorUid(user.getUid());
                    referenceVideo.setRefVideoAuthorSecUid(user.getSecUid());
                }
                Video video = aweme.getVideo();
                if (video != null) {
                    urlModel = video.getOriginCover();
                } else {
                    urlModel = null;
                }
                referenceVideo.setRefVideoCoverUrl(urlModel);
                referenceVideo.setRefVideoAwemeType(aweme.getAwemeType());
                referenceVideo.setRefVideoIsStory(aweme.getIsTikTokStory());
                textContent.setRefVideo(referenceVideo);
            }
            return textContent;
        }

        public final TextContent obtainShareReplyContent(String str, String str2, String str3, Aweme aweme) {
            UrlModel urlModel;
            TextContent textContent = new TextContent(str, null, false, 6, null);
            textContent.type = 700;
            if (aweme != null) {
                BaseContent.ReferenceVideo referenceVideo = new BaseContent.ReferenceVideo();
                referenceVideo.setRefVideoId(aweme.getAid());
                referenceVideo.setRefVideoAuthorUid(str2);
                referenceVideo.setRefVideoAuthorSecUid(str3);
                Video video = aweme.getVideo();
                if (video != null) {
                    urlModel = video.getOriginCover();
                } else {
                    urlModel = null;
                }
                referenceVideo.setRefVideoCoverUrl(urlModel);
                referenceVideo.setRefVideoAwemeType(aweme.getAwemeType());
                referenceVideo.setRefVideoIsStory(aweme.getIsTikTokStory());
                textContent.setRefVideo(referenceVideo);
            }
            return textContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TextContent obtain$default(Companion companion, String str, Aweme aweme, List list, int i, Object obj) {
            if ((i & 2) != 0) {
                aweme = null;
            }
            if ((i & 4) != 0) {
                list = null;
            }
            return companion.obtain(str, aweme, list);
        }

        public static /* synthetic */ TextContent obtainShareReplyContent$default(Companion companion, String str, User user, Aweme aweme, int i, Object obj) {
            if ((i & 4) != 0) {
                aweme = null;
            }
            return companion.obtainShareReplyContent(str, user, aweme);
        }

        public static /* synthetic */ TextContent obtainShareReplyContent$default(Companion companion, String str, String str2, String str3, Aweme aweme, int i, Object obj) {
            if ((i & 8) != 0) {
                aweme = null;
            }
            return companion.obtainShareReplyContent(str, str2, str3, aweme);
        }
    }

    public final List<RichTextInfo> getRichTextInfos() {
        return this.richTextInfos;
    }

    public final String getText() {
        return this.text;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public TextContent(String str, List<RichTextInfo> list, boolean z) {
        this.text = str;
        this.richTextInfos = list;
        this.isDefault = z;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMentionMsgHint(Context context, boolean z, String str) {
        o.LJIIIZ(context, "context");
        String str2 = "";
        if (str != null) {
            Object[] objArr = new Object[2];
            objArr[0] = str;
            String str3 = this.text;
            if (str3 != null) {
                str2 = str3;
            }
            objArr[1] = str2;
            return context.getString(R.string.ep4, objArr);
        }
        Object[] objArr2 = new Object[1];
        String str4 = this.text;
        if (str4 != null) {
            str2 = str4;
        }
        objArr2[0] = str2;
        return context.getString(R.string.ep6, objArr2);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str, C109544Rq c109544Rq) {
        int i;
        if (!z2 && C93793mB.LJIIJ(c109544Rq)) {
            if (c109544Rq != null && c109544Rq.isSelf()) {
                i = R.string.eu_;
            } else {
                i = R.string.eua;
            }
            return EF7.LIZIZ().getResources().getString(i);
        }
        return super.wrapMsgHint(z, z2, str, c109544Rq);
    }

    public /* synthetic */ TextContent(String str, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? false : z);
    }
}
