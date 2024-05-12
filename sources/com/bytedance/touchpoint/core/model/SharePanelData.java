package com.bytedance.touchpoint.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class SharePanelData extends F9E {

    @InterfaceC65349Pkn("action_hint")
    public final Title actionHint;

    @InterfaceC65349Pkn("background_image")
    public final String backgroundImage;

    @InterfaceC65349Pkn("inapp_share_info")
    public final InAppShareInfo inAppShareInfo;

    @InterfaceC65349Pkn("inviter_code")
    public final Title inviterCode;

    @InterfaceC65349Pkn("inviter_icon")
    public final String inviterIcon;

    @InterfaceC65349Pkn("nickname")
    public final Title nickname;

    @InterfaceC65349Pkn("related_touchpoints")
    public final List<Integer> relatedTouchpoints;

    @InterfaceC65349Pkn("share_link")
    public final String shareLink;

    @InterfaceC65349Pkn("title")
    public final Title title;

    @InterfaceC65349Pkn("user_avatar")
    public final String userAvatar;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.relatedTouchpoints, this.inAppShareInfo, this.shareLink, this.userAvatar, this.nickname, this.title, this.inviterIcon, this.actionHint, this.inviterCode, this.backgroundImage};
    }

    public SharePanelData(List<Integer> list, InAppShareInfo inAppShareInfo, String str, String str2, Title title, Title title2, String str3, Title title3, Title title4, String str4) {
        this.relatedTouchpoints = list;
        this.inAppShareInfo = inAppShareInfo;
        this.shareLink = str;
        this.userAvatar = str2;
        this.nickname = title;
        this.title = title2;
        this.inviterIcon = str3;
        this.actionHint = title3;
        this.inviterCode = title4;
        this.backgroundImage = str4;
    }

    public /* synthetic */ SharePanelData(List list, InAppShareInfo inAppShareInfo, String str, String str2, Title title, Title title2, String str3, Title title3, Title title4, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, inAppShareInfo, str, str2, title, title2, str3, title3, title4, str4);
    }
}
