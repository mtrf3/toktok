package com.ss.android.ugc.aweme.shortvideo.publish;

import X.InterfaceC65316PkG;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import java.io.Serializable;

/* loaded from: classes8.dex */
public final class CreateAwemeResponse extends CreateBaseAwemeResponse implements Serializable, InterfaceC65316PkG {

    @InterfaceC65349Pkn("aweme")
    public Aweme aweme;

    @InterfaceC65349Pkn("coupon_info")
    public CouponInfo couponInfo;

    @InterfaceC65349Pkn("has_sticker_red_packet")
    public boolean hasStickerRedPacket;

    @InterfaceC65349Pkn("is_review_video")
    public int isReviewVideo;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPbBean;

    @InterfaceC65349Pkn("notify")
    public String[] notify;

    @InterfaceC65349Pkn("notify_extra")
    public NotifyExtra notifyExtra;
    public String requestId;

    @InterfaceC65349Pkn("response_marker")
    public ResponseMarker responseMarker;

    @InterfaceC65349Pkn("share_tip_duration")
    public int shareTipDuration;

    @InterfaceC65349Pkn("token")
    public String stickerToken;

    /* loaded from: classes2.dex */
    public static final class NotifyExtra implements Serializable {

        @InterfaceC65349Pkn("button_text")
        public String btnText;

        @InterfaceC65349Pkn("text")
        public String text;

        @InterfaceC65349Pkn("type")
        public int type;
    }

    /* loaded from: classes8.dex */
    public static final class ResponseMarker implements Serializable {

        @InterfaceC65349Pkn("add_to_playlist_fail")
        public Boolean addToPlaylistFail;
    }

    public LogPbBean getLogPbBean() {
        return this.logPbBean;
    }

    @Override // X.InterfaceC65316PkG
    public String getRequestId() {
        return this.requestId;
    }

    public void setLogPbBean(LogPbBean logPbBean) {
        this.logPbBean = logPbBean;
    }

    @Override // X.InterfaceC65316PkG
    public void setRequestId(String str) {
        this.requestId = str;
    }
}
