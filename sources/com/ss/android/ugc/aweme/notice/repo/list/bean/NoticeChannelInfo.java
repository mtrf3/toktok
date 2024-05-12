package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NoticeChannelInfo {
    public static final /* synthetic */ int LIZ = 0;

    @InterfaceC65349Pkn("group")
    public int group;

    @InterfaceC65349Pkn("has_read")
    public boolean hasRead;

    @InterfaceC65349Pkn("last_notice_create_time")
    public long lastNoticeCreateTime;

    @InterfaceC65349Pkn("image_url")
    public UrlModel logo;

    @InterfaceC65349Pkn("image_url_dark")
    public UrlModel logoDark;

    @InterfaceC65349Pkn("need_top")
    public boolean needTop;

    @InterfaceC65349Pkn("name")
    public String name = "";

    @InterfaceC65349Pkn("account_type")
    public String accountType = "";

    public final int hashCode() {
        int i;
        int hashCode = this.name.hashCode() + this.group;
        UrlModel urlModel = this.logo;
        if (urlModel != null) {
            i = urlModel.hashCode();
        } else {
            i = 0;
        }
        return this.accountType.hashCode() + C16880lQ.LLJIJIL(this.lastNoticeCreateTime) + C16880lQ.LLJILJIL(this.needTop) + C16880lQ.LLJILJIL(this.hasRead) + hashCode + i;
    }

    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof NoticeChannelInfo)) {
            NoticeChannelInfo noticeChannelInfo = (NoticeChannelInfo) obj;
            if (this.group == noticeChannelInfo.group && o.LJ(this.name, noticeChannelInfo.name) && o.LJ(this.logo, noticeChannelInfo.logo) && this.hasRead == noticeChannelInfo.hasRead && this.needTop == noticeChannelInfo.needTop && this.lastNoticeCreateTime == noticeChannelInfo.lastNoticeCreateTime && o.LJ(this.accountType, noticeChannelInfo.accountType)) {
                return true;
            }
        }
        return false;
    }
}
