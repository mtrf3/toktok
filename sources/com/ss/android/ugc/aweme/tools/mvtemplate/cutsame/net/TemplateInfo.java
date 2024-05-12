package com.ss.android.ugc.aweme.tools.mvtemplate.cutsame.net;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import X.JBR;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class TemplateInfo {

    @InterfaceC65349Pkn("app_id")
    public final int appId;

    @InterfaceC65349Pkn("cover")
    public final TemplateCover cover;

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("extra")
    public final String extra;

    @InterfaceC65349Pkn("height")
    public final int height;

    @InterfaceC65349Pkn("md5")
    public final String md5;

    @InterfaceC65349Pkn("media_id")
    public final long mediaId;

    @InterfaceC65349Pkn("provider")
    public final long provider;

    @InterfaceC65349Pkn("region_key")
    public final String regionKey;

    @InterfaceC65349Pkn("tags")
    public final List<String> tags;

    @InterfaceC65349Pkn("template_id")
    public final long templateId;

    @InterfaceC65349Pkn("TemplateUri")
    public final String templateUri;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("type")
    public final int type;

    @InterfaceC65349Pkn("video_template_ext")
    public final VideoTemplateInfoExt videoTemplateExt;

    @InterfaceC65349Pkn("width")
    public final int width;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TemplateInfo() {
        /*
            r22 = this;
            r1 = 0
            r3 = 0
            r4 = 0
            r20 = 65535(0xffff, float:9.1834E-41)
            r0 = r22
            r5 = r3
            r6 = r1
            r8 = r4
            r9 = r4
            r10 = r3
            r11 = r3
            r12 = r4
            r13 = r4
            r14 = r4
            r15 = r4
            r16 = r4
            r17 = r4
            r18 = r1
            r21 = r4
            r0.<init>(r1, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.mvtemplate.cutsame.net.TemplateInfo.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateInfo)) {
            return false;
        }
        TemplateInfo templateInfo = (TemplateInfo) obj;
        return this.templateId == templateInfo.templateId && this.appId == templateInfo.appId && o.LJ(this.regionKey, templateInfo.regionKey) && this.type == templateInfo.type && this.mediaId == templateInfo.mediaId && o.LJ(this.title, templateInfo.title) && o.LJ(this.desc, templateInfo.desc) && this.width == templateInfo.width && this.height == templateInfo.height && o.LJ(this.md5, templateInfo.md5) && o.LJ(this.templateUri, templateInfo.templateUri) && o.LJ(this.cover, templateInfo.cover) && o.LJ(this.tags, templateInfo.tags) && o.LJ(this.extra, templateInfo.extra) && o.LJ(this.videoTemplateExt, templateInfo.videoTemplateExt) && this.provider == templateInfo.provider;
    }

    public final String toString() {
        return "TemplateInfo(templateId=" + this.templateId + ", appId=" + this.appId + ", regionKey=" + this.regionKey + ", type=" + this.type + ", mediaId=" + this.mediaId + ", title=" + this.title + ", desc=" + this.desc + ", width=" + this.width + ", height=" + this.height + ", md5=" + this.md5 + ", templateUri=" + this.templateUri + ", cover=" + this.cover + ", tags=" + this.tags + ", extra=" + this.extra + ", videoTemplateExt=" + this.videoTemplateExt + ", provider=" + this.provider + ')';
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int LLJIJIL = ((C16880lQ.LLJIJIL(this.templateId) * 31) + this.appId) * 31;
        String str = this.regionKey;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.mediaId, (((LLJIJIL + hashCode) * 31) + this.type) * 31, 31);
        String str2 = this.title;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (LIZJ + hashCode2) * 31;
        String str3 = this.desc;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (((((i2 + hashCode3) * 31) + this.width) * 31) + this.height) * 31;
        String str4 = this.md5;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        String str5 = this.templateUri;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        TemplateCover templateCover = this.cover;
        if (templateCover == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = templateCover.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        List<String> list = this.tags;
        if (list == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = list.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        String str6 = this.extra;
        if (str6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str6.hashCode();
        }
        int i8 = (i7 + hashCode8) * 31;
        VideoTemplateInfoExt videoTemplateInfoExt = this.videoTemplateExt;
        if (videoTemplateInfoExt != null) {
            i = videoTemplateInfoExt.hashCode();
        }
        return C16880lQ.LLJIJIL(this.provider) + ((i8 + i) * 31);
    }

    public TemplateInfo(long j, int i, String str, int i2, long j2, String str2, String str3, int i3, int i4, String str4, String str5, TemplateCover templateCover, List<String> list, String str6, VideoTemplateInfoExt videoTemplateInfoExt, long j3) {
        this.templateId = j;
        this.appId = i;
        this.regionKey = str;
        this.type = i2;
        this.mediaId = j2;
        this.title = str2;
        this.desc = str3;
        this.width = i3;
        this.height = i4;
        this.md5 = str4;
        this.templateUri = str5;
        this.cover = templateCover;
        this.tags = list;
        this.extra = str6;
        this.videoTemplateExt = videoTemplateInfoExt;
        this.provider = j3;
    }

    public /* synthetic */ TemplateInfo(long j, int i, String str, int i2, long j2, String str2, String str3, int i3, int i4, String str4, String str5, TemplateCover templateCover, List list, String str6, VideoTemplateInfoExt videoTemplateInfoExt, long j3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0L : j, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? "" : str, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? 0L : j2, (i5 & 32) != 0 ? "" : str2, (i5 & 64) != 0 ? "" : str3, (i5 & 128) != 0 ? 0 : i3, (i5 & 256) == 0 ? i4 : 0, (i5 & 512) != 0 ? "" : str4, (i5 & 1024) != 0 ? "" : str5, (i5 & 2048) != 0 ? null : templateCover, (i5 & 4096) != 0 ? null : list, (i5 & FileUtils.BUFFER_SIZE) == 0 ? str6 : "", (i5 & 16384) == 0 ? videoTemplateInfoExt : null, (i5 & 32768) != 0 ? 0L : j3);
    }
}
