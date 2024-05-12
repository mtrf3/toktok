package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C109544Rq;
import X.C62374Odu;
import X.C72972SkS;
import X.C78857UxB;
import X.C86V;
import X.EF7;
import X.InterfaceC65349Pkn;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShareLiveContent extends BaseContent {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("push_detail")
    public String pushDetail;
    public String realItemType;

    @InterfaceC65349Pkn("cover_url")
    public UrlModel roomCover;

    @InterfaceC65349Pkn("room_description")
    public String roomDesc;

    @InterfaceC65349Pkn("room_id")
    public String roomId;

    @InterfaceC65349Pkn("room_owner_avatar")
    public UrlModel roomOwnerAvatar;

    @InterfaceC65349Pkn("room_owner_id")
    public String roomOwnerId;

    @InterfaceC65349Pkn("room_owner_name")
    public String roomOwnerName;

    @InterfaceC65349Pkn("room_owner_sec_id")
    public String roomSecOwnerId;

    @InterfaceC65349Pkn("share_live_intent")
    public String shareLiveIntent;

    @InterfaceC65349Pkn("shared_enter_from")
    public String sharedEnterFrom;

    public static final ShareLiveContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    public static /* synthetic */ void getSharedEnterFrom$annotations() {
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        C62374Odu c62374Odu = new C62374Odu();
        String type = getRealItemType();
        o.LJIIIZ(type, "type");
        c62374Odu.LIZ = type;
        String str = this.roomId;
        if (str == null) {
            str = "";
        }
        c62374Odu.LIZIZ = str;
        SharePackage sharePackage = new SharePackage(c62374Odu);
        Bundle bundle = sharePackage.extras;
        bundle.putString("live_id", this.roomOwnerId);
        bundle.putSerializable("video_cover", this.roomCover);
        bundle.putString("author_name", this.roomOwnerName);
        bundle.putSerializable("thumb_for_share", this.roomOwnerAvatar);
        bundle.putString("share_live_intent", this.shareLiveIntent);
        if (!TextUtils.isEmpty(this.roomDesc)) {
            bundle.putString("room_title", this.roomDesc);
        }
        return sharePackage;
    }

    public final String getRealItemType() {
        String str = this.realItemType;
        if (str == null || str.length() == 0) {
            return "live";
        }
        return str;
    }

    public final boolean isFromMultiLiveShare() {
        return o.LJ(this.shareLiveIntent, "multi_guest_invite");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        String string = EF7.LIZIZ().getString(R.string.h6r, this.roomOwnerName);
        o.LJIIIIZZ(string, "getApplicationContext().…_msg_hint, roomOwnerName)");
        return string;
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final ShareLiveContent fromSharePackage(SharePackage sharePackage) {
            o.LJIIIZ(sharePackage, "sharePackage");
            ShareLiveContent shareLiveContent = new ShareLiveContent();
            shareLiveContent.setRoomId(sharePackage.identifier);
            shareLiveContent.setRoomOwnerId(sharePackage.extras.getString("live_id"));
            shareLiveContent.setRoomSecOwnerId(sharePackage.extras.getString("sec_user_id"));
            shareLiveContent.setRoomOwnerName(sharePackage.extras.getString("author_name"));
            shareLiveContent.setShareLiveIntent(sharePackage.extras.getString("share_live_intent"));
            if (shareLiveContent.isFromMultiLiveShare()) {
                shareLiveContent.type = 2101;
            }
            shareLiveContent.realItemType = sharePackage.itemType;
            Serializable serializable = sharePackage.extras.getSerializable("thumb_for_share");
            boolean z = serializable instanceof UrlModel;
            if (z) {
                shareLiveContent.setRoomOwnerAvatar((UrlModel) serializable);
            }
            shareLiveContent.setPushDetail(sharePackage.extras.getString("author_name"));
            if (sharePackage.extras.containsKey("room_title")) {
                shareLiveContent.setRoomDesc(sharePackage.extras.getString("room_title"));
            }
            if (sharePackage.extras.getLong("room_id", 0L) == 0) {
                shareLiveContent.setRoomDesc(C86V.LJFF(R.string.r3u));
            }
            Serializable serializable2 = sharePackage.extras.getSerializable("video_cover");
            if (serializable2 instanceof UrlModel) {
                shareLiveContent.setRoomCover((UrlModel) serializable2);
            } else if (z) {
                shareLiveContent.setRoomCover((UrlModel) serializable);
            } else {
                shareLiveContent.setRoomCover(null);
            }
            return shareLiveContent;
        }
    }

    public final String getPushDetail() {
        return this.pushDetail;
    }

    public final UrlModel getRoomCover() {
        return this.roomCover;
    }

    public final String getRoomDesc() {
        return this.roomDesc;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final UrlModel getRoomOwnerAvatar() {
        return this.roomOwnerAvatar;
    }

    public final String getRoomOwnerId() {
        return this.roomOwnerId;
    }

    public final String getRoomOwnerName() {
        return this.roomOwnerName;
    }

    public final String getRoomSecOwnerId() {
        return this.roomSecOwnerId;
    }

    public final String getShareLiveIntent() {
        return this.shareLiveIntent;
    }

    public final String getSharedEnterFrom() {
        return this.sharedEnterFrom;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        return C72972SkS.LJ(context, "context", R.string.h82, "context.resources.getStr…g(R.string.im_quote_live)");
    }

    public final void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public final void setRoomCover(UrlModel urlModel) {
        this.roomCover = urlModel;
    }

    public final void setRoomDesc(String str) {
        this.roomDesc = str;
    }

    public final void setRoomId(String str) {
        this.roomId = str;
    }

    public final void setRoomOwnerAvatar(UrlModel urlModel) {
        this.roomOwnerAvatar = urlModel;
    }

    public final void setRoomOwnerId(String str) {
        this.roomOwnerId = str;
    }

    public final void setRoomOwnerName(String str) {
        this.roomOwnerName = str;
    }

    public final void setRoomSecOwnerId(String str) {
        this.roomSecOwnerId = str;
    }

    public final void setShareLiveIntent(String str) {
        this.shareLiveIntent = str;
    }

    public final void setSharedEnterFrom(String str) {
        this.sharedEnterFrom = str;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str, C109544Rq c109544Rq) {
        Context LIZIZ = EF7.LIZIZ();
        if (z || z2) {
            if (isFromMultiLiveShare()) {
                return C78857UxB.LJJIIZI("pm_mt_multi_invite_joinfriendasguest");
            }
            String string = LIZIZ.getString(R.string.cj0);
            o.LJIIIIZZ(string, "{\n                contex…_sent_live)\n            }");
            return string;
        }
        String string2 = LIZIZ.getString(R.string.qh2);
        o.LJIIIIZZ(string2, "{\n            context.ge…self_sent_live)\n        }");
        return string2;
    }
}
