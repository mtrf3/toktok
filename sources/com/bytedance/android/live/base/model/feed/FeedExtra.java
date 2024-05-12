package com.bytedance.android.live.base.model.feed;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.model.FeedBannerContainer;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.m;

/* loaded from: classes.dex */
public class FeedExtra extends Extra {
    public transient LogPb LJLIL;

    @InterfaceC65349Pkn("banner")
    public FeedBannerContainer bannerContainer;

    @InterfaceC65349Pkn("cost")
    public long cost;

    @InterfaceC65349Pkn("hashtag_text")
    public String hashtag_text;

    @InterfaceC65349Pkn("log_pb")
    public m jsonLogPb;

    @InterfaceC65349Pkn("max_time")
    public long maxTime;

    @InterfaceC65349Pkn("min_time")
    public long minTime;

    @InterfaceC65349Pkn("req_id")
    public String reqId;

    @InterfaceC65349Pkn("style")
    public int style;

    @InterfaceC65349Pkn("total")
    public int total;

    @InterfaceC65349Pkn("unread_extra")
    public String unreadExtra;

    /* loaded from: classes.dex */
    public static final class LogPb {

        @InterfaceC65349Pkn("impr_id")
        public String content;

        @InterfaceC65349Pkn("session_id")
        public long sessionId;
    }

    public final m LIZ() {
        if (this.LJLIL != null) {
            m LJIIZILJ = GsonProtectorUtils.toJsonTree(new Gson(), this.LJLIL).LJIIZILJ();
            this.jsonLogPb = LJIIZILJ;
            this.LJLIL = null;
            return LJIIZILJ;
        }
        return this.jsonLogPb;
    }
}
