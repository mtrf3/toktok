package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.model;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ChatInviteShareResponse extends BaseResponse {

    @InterfaceC65349Pkn("expire_time")
    public Long expireTime;

    @InterfaceC65349Pkn("long_url")
    public String longUrl;

    @InterfaceC65349Pkn("share_link_text")
    public String shareLinkText;

    @InterfaceC65349Pkn("short_url")
    public String shortUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public ChatInviteShareResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatInviteShareResponse)) {
            return false;
        }
        ChatInviteShareResponse chatInviteShareResponse = (ChatInviteShareResponse) obj;
        return o.LJ(this.shareLinkText, chatInviteShareResponse.shareLinkText) && o.LJ(this.shortUrl, chatInviteShareResponse.shortUrl) && o.LJ(this.longUrl, chatInviteShareResponse.longUrl) && o.LJ(this.expireTime, chatInviteShareResponse.expireTime);
    }

    public final int hashCode() {
        String str = this.shareLinkText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.shortUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.longUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.expireTime;
        return hashCode3 + (l != null ? l.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChatInviteShareResponse(shareLinkText=");
        LIZ.append(this.shareLinkText);
        LIZ.append(", shortUrl=");
        LIZ.append(this.shortUrl);
        LIZ.append(", longUrl=");
        LIZ.append(this.longUrl);
        LIZ.append(", expireTime=");
        return JBR.LJ(LIZ, this.expireTime, ')', LIZ);
    }

    public ChatInviteShareResponse(String str, String str2, String str3, Long l) {
        this.shareLinkText = str;
        this.shortUrl = str2;
        this.longUrl = str3;
        this.expireTime = l;
    }

    public /* synthetic */ ChatInviteShareResponse(String str, String str2, String str3, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l);
    }
}
