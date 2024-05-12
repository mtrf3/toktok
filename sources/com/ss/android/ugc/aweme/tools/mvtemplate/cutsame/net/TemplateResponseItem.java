package com.ss.android.ugc.aweme.tools.mvtemplate.cutsame.net;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.JBR;
import com.ss.android.ugc.aweme.cutsame.AuthorInfo;
import com.ss.android.ugc.aweme.cutsame.CutSameVideo;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class TemplateResponseItem {

    @InterfaceC65349Pkn("author")
    public final AuthorInfo authorInfo;

    @InterfaceC65349Pkn("challenge")
    public final ArrayList<String> challengeIds;

    @InterfaceC65349Pkn("create_time")
    public final long createTime;

    @InterfaceC65349Pkn("desc")
    public final String description;

    @InterfaceC65349Pkn("summary")
    public final String extra;

    @InterfaceC65349Pkn("icon_url")
    public final String iconUrl;

    @InterfaceC65349Pkn("template_id")
    public final String id;

    @InterfaceC65349Pkn("is_collected")
    public final boolean isCollected;

    @InterfaceC65349Pkn("md5")
    public final String md5;

    @InterfaceC65349Pkn("music")
    public final ArrayList<String> musicIds;

    @InterfaceC65349Pkn("sdk_version")
    public final String sdkVersion;

    @InterfaceC65349Pkn("template_url")
    public final String templateUrl;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("video")
    public final CutSameVideo video;

    /* JADX WARN: Multi-variable type inference failed */
    public TemplateResponseItem() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16383, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateResponseItem)) {
            return false;
        }
        TemplateResponseItem templateResponseItem = (TemplateResponseItem) obj;
        return o.LJ(this.id, templateResponseItem.id) && o.LJ(this.video, templateResponseItem.video) && o.LJ(this.title, templateResponseItem.title) && o.LJ(this.description, templateResponseItem.description) && o.LJ(this.templateUrl, templateResponseItem.templateUrl) && this.createTime == templateResponseItem.createTime && o.LJ(this.extra, templateResponseItem.extra) && this.isCollected == templateResponseItem.isCollected && o.LJ(this.sdkVersion, templateResponseItem.sdkVersion) && o.LJ(this.md5, templateResponseItem.md5) && o.LJ(this.iconUrl, templateResponseItem.iconUrl) && o.LJ(this.authorInfo, templateResponseItem.authorInfo) && o.LJ(this.challengeIds, templateResponseItem.challengeIds) && o.LJ(this.musicIds, templateResponseItem.musicIds);
    }

    public final String toString() {
        return "TemplateResponseItem(id=" + this.id + ", video=" + this.video + ", title=" + this.title + ", description=" + this.description + ", templateUrl=" + this.templateUrl + ", createTime=" + this.createTime + ", extra=" + this.extra + ", isCollected=" + this.isCollected + ", sdkVersion=" + this.sdkVersion + ", md5=" + this.md5 + ", iconUrl=" + this.iconUrl + ", authorInfo=" + this.authorInfo + ", challengeIds=" + this.challengeIds + ", musicIds=" + this.musicIds + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = this.id.hashCode() * 31;
        CutSameVideo cutSameVideo = this.video;
        int i = 0;
        if (cutSameVideo == null) {
            hashCode = 0;
        } else {
            hashCode = cutSameVideo.hashCode();
        }
        int LJ = C79062V1e.LJ(this.extra, JBR.LIZJ(this.createTime, C79062V1e.LJ(this.templateUrl, C79062V1e.LJ(this.description, C79062V1e.LJ(this.title, (hashCode6 + hashCode) * 31, 31), 31), 31), 31), 31);
        boolean z = this.isCollected;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int LJ2 = C79062V1e.LJ(this.sdkVersion, (LJ + i2) * 31, 31);
        String str = this.md5;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (LJ2 + hashCode2) * 31;
        String str2 = this.iconUrl;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        AuthorInfo authorInfo = this.authorInfo;
        if (authorInfo == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = authorInfo.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        ArrayList<String> arrayList = this.challengeIds;
        if (arrayList == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = arrayList.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        ArrayList<String> arrayList2 = this.musicIds;
        if (arrayList2 != null) {
            i = arrayList2.hashCode();
        }
        return i6 + i;
    }

    public TemplateResponseItem(String id, CutSameVideo cutSameVideo, String title, String description, String templateUrl, long j, String extra, boolean z, String sdkVersion, String str, String str2, AuthorInfo authorInfo, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(description, "description");
        o.LJIIIZ(templateUrl, "templateUrl");
        o.LJIIIZ(extra, "extra");
        o.LJIIIZ(sdkVersion, "sdkVersion");
        this.id = id;
        this.video = cutSameVideo;
        this.title = title;
        this.description = description;
        this.templateUrl = templateUrl;
        this.createTime = j;
        this.extra = extra;
        this.isCollected = z;
        this.sdkVersion = sdkVersion;
        this.md5 = str;
        this.iconUrl = str2;
        this.authorInfo = authorInfo;
        this.challengeIds = arrayList;
        this.musicIds = arrayList2;
    }

    public /* synthetic */ TemplateResponseItem(String str, CutSameVideo cutSameVideo, String str2, String str3, String str4, long j, String str5, boolean z, String str6, String str7, String str8, AuthorInfo authorInfo, ArrayList arrayList, ArrayList arrayList2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : cutSameVideo, (i & 4) != 0 ? "not_set" : str2, (i & 8) != 0 ? "not_set" : str3, (i & 16) != 0 ? "not_set" : str4, (i & 32) != 0 ? 0L : j, (i & 64) != 0 ? "not_set" : str5, (i & 128) != 0 ? false : z, (i & 256) != 0 ? "not_set" : str6, (i & 512) == 0 ? str7 : "not_set", (i & 1024) != 0 ? null : str8, (i & 2048) == 0 ? authorInfo : null, (i & 4096) != 0 ? new ArrayList() : arrayList, (i & FileUtils.BUFFER_SIZE) != 0 ? new ArrayList() : arrayList2);
    }
}
