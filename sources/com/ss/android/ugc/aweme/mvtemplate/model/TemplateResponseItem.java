package com.ss.android.ugc.aweme.mvtemplate.model;

import X.C07670Rv;
import X.C16880lQ;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.JBR;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class TemplateResponseItem {

    @InterfaceC65349Pkn("author")
    public final User author;

    @InterfaceC65349Pkn("desc")
    public final String description;

    @InterfaceC65349Pkn("extra")
    public final String extra;

    @InterfaceC65349Pkn("fragment_count")
    public final int fragmentCount;

    @InterfaceC65349Pkn("template_id")
    public final long id;

    @InterfaceC65349Pkn("is_collected")
    public final boolean isCollected;

    @InterfaceC65349Pkn("item_type")
    public final int itemType;

    @InterfaceC65349Pkn("md5")
    public final String md5;

    @InterfaceC65349Pkn("music")
    public final Music music;

    @InterfaceC65349Pkn("sdk_version")
    public final String sdkVersion;

    @InterfaceC65349Pkn("template_url")
    public final String templateUrl;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("usage_amount")
    public final long usageAmount;

    @InterfaceC65349Pkn("video")
    public final Video video;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TemplateResponseItem() {
        /*
            r19 = this;
            r1 = 0
            r3 = 0
            r9 = 0
            r17 = 16383(0x3fff, float:2.2957E-41)
            r0 = r19
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r8 = r3
            r10 = r1
            r12 = r3
            r13 = r9
            r14 = r3
            r15 = r9
            r16 = r3
            r18 = r3
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mvtemplate.model.TemplateResponseItem.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateResponseItem)) {
            return false;
        }
        TemplateResponseItem templateResponseItem = (TemplateResponseItem) obj;
        return this.id == templateResponseItem.id && o.LJ(this.author, templateResponseItem.author) && o.LJ(this.music, templateResponseItem.music) && o.LJ(this.video, templateResponseItem.video) && o.LJ(this.title, templateResponseItem.title) && o.LJ(this.description, templateResponseItem.description) && o.LJ(this.templateUrl, templateResponseItem.templateUrl) && this.fragmentCount == templateResponseItem.fragmentCount && this.usageAmount == templateResponseItem.usageAmount && o.LJ(this.extra, templateResponseItem.extra) && this.isCollected == templateResponseItem.isCollected && o.LJ(this.sdkVersion, templateResponseItem.sdkVersion) && this.itemType == templateResponseItem.itemType && o.LJ(this.md5, templateResponseItem.md5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int LLJIJIL = C16880lQ.LLJIJIL(this.id) * 31;
        User user = this.author;
        int i = 0;
        if (user == null) {
            hashCode = 0;
        } else {
            hashCode = user.hashCode();
        }
        int i2 = (LLJIJIL + hashCode) * 31;
        Music music = this.music;
        if (music == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = music.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Video video = this.video;
        if (video == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = video.hashCode();
        }
        int LJ = C79062V1e.LJ(this.extra, JBR.LIZJ(this.usageAmount, (C79062V1e.LJ(this.templateUrl, C79062V1e.LJ(this.description, C79062V1e.LJ(this.title, (i3 + hashCode3) * 31, 31), 31), 31) + this.fragmentCount) * 31, 31), 31);
        boolean z = this.isCollected;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int LJ2 = (C79062V1e.LJ(this.sdkVersion, (LJ + i4) * 31, 31) + this.itemType) * 31;
        String str = this.md5;
        if (str != null) {
            i = str.hashCode();
        }
        return LJ2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TemplateResponseItem(id=");
        sb.append(this.id);
        sb.append(", author=");
        sb.append(this.author);
        sb.append(", music=");
        sb.append(this.music);
        sb.append(", video=");
        sb.append(this.video);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", templateUrl=");
        sb.append(this.templateUrl);
        sb.append(", fragmentCount=");
        sb.append(this.fragmentCount);
        sb.append(", usageAmount=");
        sb.append(this.usageAmount);
        sb.append(", extra=");
        sb.append(this.extra);
        sb.append(", isCollected=");
        sb.append(this.isCollected);
        sb.append(", sdkVersion=");
        sb.append(this.sdkVersion);
        sb.append(", itemType=");
        sb.append(this.itemType);
        sb.append(", md5=");
        return C07670Rv.LIZIZ(sb, this.md5, ')');
    }

    public TemplateResponseItem(long j, User user, Music music, Video video, String title, String description, String templateUrl, int i, long j2, String extra, boolean z, String sdkVersion, int i2, String str) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(description, "description");
        o.LJIIIZ(templateUrl, "templateUrl");
        o.LJIIIZ(extra, "extra");
        o.LJIIIZ(sdkVersion, "sdkVersion");
        this.id = j;
        this.author = user;
        this.music = music;
        this.video = video;
        this.title = title;
        this.description = description;
        this.templateUrl = templateUrl;
        this.fragmentCount = i;
        this.usageAmount = j2;
        this.extra = extra;
        this.isCollected = z;
        this.sdkVersion = sdkVersion;
        this.itemType = i2;
        this.md5 = str;
    }

    public /* synthetic */ TemplateResponseItem(long j, User user, Music music, Video video, String str, String str2, String str3, int i, long j2, String str4, boolean z, String str5, int i2, String str6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1L : j, (i3 & 2) != 0 ? null : user, (i3 & 4) != 0 ? null : music, (i3 & 8) == 0 ? video : null, (i3 & 16) != 0 ? "not_set" : str, (i3 & 32) != 0 ? "not_set" : str2, (i3 & 64) != 0 ? "not_set" : str3, (i3 & 128) != 0 ? 0 : i, (i3 & 256) != 0 ? 0L : j2, (i3 & 512) != 0 ? "not_set" : str4, (i3 & 1024) == 0 ? z : false, (i3 & 2048) != 0 ? "not_set" : str5, (i3 & 4096) != 0 ? -1 : i2, (i3 & FileUtils.BUFFER_SIZE) == 0 ? str6 : "not_set");
    }
}
