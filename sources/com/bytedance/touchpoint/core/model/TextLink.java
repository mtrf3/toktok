package com.bytedance.touchpoint.core.model;

import X.C78966Uyw;
import X.C95U;
import X.InterfaceC65349Pkn;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes5.dex */
public final class TextLink extends C95U {
    public Set<String> LJI;
    public Set<String> LJII;

    @InterfaceC65349Pkn("dismiss_after")
    public Integer dismissAfter;

    @InterfaceC65349Pkn("hashtag_ids")
    public List<String> hashtagIds;

    @InterfaceC65349Pkn("icon")
    public String icon;

    @InterfaceC65349Pkn("jump_link")
    public String jumpLink;

    @InterfaceC65349Pkn("show_in_hashtagpage")
    public Boolean showInHashTagPage;

    @InterfaceC65349Pkn("show_in_profilepage")
    public Boolean showInProfilePage;

    @InterfaceC65349Pkn("show_times")
    public Integer showTimes;

    @InterfaceC65349Pkn("text")
    public String text;

    @InterfaceC65349Pkn("video_icon")
    public String videoIcon;

    @InterfaceC65349Pkn("video_ids")
    public List<String> videoIds;

    @InterfaceC65349Pkn("video_jump_link")
    public String videoJumpLink;

    @InterfaceC65349Pkn("video_show_in_profilepage")
    public Boolean videoShowInProfilePage;

    @InterfaceC65349Pkn("video_text")
    public String videoText;

    public final Object[] LIZIZ() {
        return new Object[]{this.hashtagIds, this.videoIds, this.icon, this.videoIcon, this.text, this.videoText, this.jumpLink, this.videoJumpLink, this.showTimes, this.dismissAfter, this.showInHashTagPage, this.showInProfilePage, this.videoShowInProfilePage};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextLink) {
            return C78966Uyw.LJIIIZ(((TextLink) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("TextLink:%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", LIZIZ());
    }

    public TextLink(List<String> list, List<String> list2, String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3) {
        this.hashtagIds = list;
        this.videoIds = list2;
        this.icon = str;
        this.videoIcon = str2;
        this.text = str3;
        this.videoText = str4;
        this.jumpLink = str5;
        this.videoJumpLink = str6;
        this.showTimes = num;
        this.dismissAfter = num2;
        this.showInHashTagPage = bool;
        this.showInProfilePage = bool2;
        this.videoShowInProfilePage = bool3;
    }
}
