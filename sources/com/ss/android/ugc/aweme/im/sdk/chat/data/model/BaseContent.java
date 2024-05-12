package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C07670Rv;
import X.C109544Rq;
import X.C16880lQ;
import X.C91933jB;
import X.InterfaceC65349Pkn;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class BaseContent extends C91933jB implements Serializable, PreloadFetcher {

    @InterfaceC65349Pkn("ext")
    public SystemContent _extContent;

    @InterfaceC65349Pkn("is_card")
    public boolean isCard;

    @InterfaceC65349Pkn("prev_conv_id")
    public String prevConvId;

    @InterfaceC65349Pkn("prev_id")
    public Long prevId;

    @InterfaceC65349Pkn("reference_video")
    public ReferenceVideo refVideo;

    @InterfaceC65349Pkn("root_conv_id")
    public String rootConvId;

    @InterfaceC65349Pkn("root_id")
    public Long rootId;

    @InterfaceC65349Pkn("root_relation_tag")
    public String rootRelationTag;
    public long sendStartTime;

    @InterfaceC65349Pkn("aweType")
    public int type;

    public static /* synthetic */ void getType$annotations() {
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.PreloadFetcher
    public List<UrlModel> fetchPreload() {
        return null;
    }

    public SharePackage generateSharePackage() {
        return null;
    }

    public String getMsgHint() {
        return "";
    }

    public final SystemContent getExtContent() {
        SystemContent systemContent = this._extContent;
        if (systemContent != null) {
            systemContent.type = 100;
        }
        return systemContent;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C16880lQ.LJLLJ(getClass()));
        sb.append("{type=");
        sb.append(this.type);
        sb.append(", prevId=");
        sb.append(this.prevId);
        sb.append(", rootId=");
        sb.append(this.rootId);
        sb.append(", prevConvId=");
        sb.append(this.prevConvId);
        sb.append(", rootConvId=");
        sb.append(this.rootConvId);
        sb.append(", isCard=");
        sb.append(this.isCard);
        sb.append(", refVide=");
        sb.append(this.refVideo);
        sb.append(", extContent=");
        sb.append(this._extContent);
        sb.append(", mgHint='");
        sb.append(getMsgHint());
        sb.append("', sendStartTime=");
        sb.append(this.sendStartTime);
        sb.append(", rootRelationTag=");
        return C07670Rv.LIZIZ(sb, this.rootRelationTag, '}');
    }

    /* loaded from: classes2.dex */
    public static final class ReferenceVideo implements Serializable {

        @InterfaceC65349Pkn("reference_video_cover_url")
        public UrlModel refVideoCoverUrl;

        @InterfaceC65349Pkn("reference_video_is_story")
        public boolean refVideoIsStory;

        @InterfaceC65349Pkn("reference_video_id")
        public String refVideoId = "";

        @InterfaceC65349Pkn("reference_video_author_uid")
        public String refVideoAuthorUid = "";

        @InterfaceC65349Pkn("reference_video_author_secuid")
        public String refVideoAuthorSecUid = "";

        @InterfaceC65349Pkn("reference_video_aweme_type")
        public int refVideoAwemeType = -1;

        public final String getRefVideoAuthorSecUid() {
            return this.refVideoAuthorSecUid;
        }

        public final String getRefVideoAuthorUid() {
            return this.refVideoAuthorUid;
        }

        public final int getRefVideoAwemeType() {
            return this.refVideoAwemeType;
        }

        public final UrlModel getRefVideoCoverUrl() {
            return this.refVideoCoverUrl;
        }

        public final String getRefVideoId() {
            return this.refVideoId;
        }

        public final boolean getRefVideoIsStory() {
            return this.refVideoIsStory;
        }

        public final void setRefVideoAuthorSecUid(String str) {
            this.refVideoAuthorSecUid = str;
        }

        public final void setRefVideoAuthorUid(String str) {
            this.refVideoAuthorUid = str;
        }

        public final void setRefVideoAwemeType(int i) {
            this.refVideoAwemeType = i;
        }

        public final void setRefVideoCoverUrl(UrlModel urlModel) {
            this.refVideoCoverUrl = urlModel;
        }

        public final void setRefVideoId(String str) {
            this.refVideoId = str;
        }

        public final void setRefVideoIsStory(boolean z) {
            this.refVideoIsStory = z;
        }
    }

    public final String getPrevConvId() {
        return this.prevConvId;
    }

    public final Long getPrevId() {
        return this.prevId;
    }

    public final ReferenceVideo getRefVideo() {
        return this.refVideo;
    }

    public final String getRootConvId() {
        return this.rootConvId;
    }

    public final Long getRootId() {
        return this.rootId;
    }

    public final String getRootRelationTag() {
        return this.rootRelationTag;
    }

    public final long getSendStartTime() {
        return this.sendStartTime;
    }

    public final boolean isCard() {
        return this.isCard;
    }

    public Map<String, String> getExtForShare(C109544Rq message) {
        o.LJIIIZ(message, "message");
        Map<String, String> ext = message.getExt();
        o.LJIIIIZZ(ext, "message.ext");
        return ext;
    }

    public String getQuoteHint(Context context) {
        o.LJIIIZ(context, "context");
        return getMsgHint();
    }

    public final void setCard(boolean z) {
        this.isCard = z;
    }

    public final void setPrevConvId(String str) {
        this.prevConvId = str;
    }

    public final void setPrevId(Long l) {
        this.prevId = l;
    }

    public final void setRefVideo(ReferenceVideo referenceVideo) {
        this.refVideo = referenceVideo;
    }

    public final void setRootConvId(String str) {
        this.rootConvId = str;
    }

    public final void setRootId(Long l) {
        this.rootId = l;
    }

    public final void setRootRelationTag(String str) {
        this.rootRelationTag = str;
    }

    public final void setSendStartTime(long j) {
        this.sendStartTime = j;
    }

    public final void wrapForward(long j, String str, String str2) {
        if (j > 0 && !TextUtils.isEmpty(str)) {
            this.prevId = Long.valueOf(j);
            Long l = this.rootId;
            if (l == null || l.longValue() <= 0) {
                this.rootId = Long.valueOf(j);
            }
            this.prevConvId = str;
            if (TextUtils.isEmpty(this.rootConvId)) {
                this.rootConvId = str;
            }
            if (TextUtils.isEmpty(this.rootRelationTag)) {
                this.rootRelationTag = str2;
            }
        }
    }

    public String wrapMentionMsgHint(Context context, boolean z, String str) {
        o.LJIIIZ(context, "context");
        return getMsgHint();
    }

    public String wrapMsgHint(boolean z, boolean z2, String str, C109544Rq c109544Rq) {
        return getMsgHint();
    }

    public static /* synthetic */ String wrapMsgHint$default(BaseContent baseContent, boolean z, boolean z2, String str, C109544Rq c109544Rq, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                c109544Rq = null;
            }
            return baseContent.wrapMsgHint(z, z2, str, c109544Rq);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: wrapMsgHint");
    }
}
