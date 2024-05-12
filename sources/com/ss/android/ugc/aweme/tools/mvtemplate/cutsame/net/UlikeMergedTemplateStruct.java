package com.ss.android.ugc.aweme.tools.mvtemplate.cutsame.net;

import X.AnonymousClass391;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class UlikeMergedTemplateStruct {

    @InterfaceC65349Pkn("jtk_template_info")
    public final TemplateResponseItem cutsameInfo;

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("is_commercial_music")
    public final boolean isCommerceMusic;

    @InterfaceC65349Pkn("media_id")
    public final String media_id;

    @InterfaceC65349Pkn("mv_template_info")
    public final MvEffect mvData;

    @InterfaceC65349Pkn("region")
    public final String region;

    @InterfaceC65349Pkn("template_type")
    public final int templateType;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("url_prefix")
    public final List<String> urlPrefix;

    @InterfaceC65349Pkn("aspect_ratio")
    public final String videoRatio;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UlikeMergedTemplateStruct)) {
            return false;
        }
        UlikeMergedTemplateStruct ulikeMergedTemplateStruct = (UlikeMergedTemplateStruct) obj;
        return o.LJ(this.media_id, ulikeMergedTemplateStruct.media_id) && o.LJ(this.title, ulikeMergedTemplateStruct.title) && o.LJ(this.description, ulikeMergedTemplateStruct.description) && this.templateType == ulikeMergedTemplateStruct.templateType && o.LJ(this.cutsameInfo, ulikeMergedTemplateStruct.cutsameInfo) && o.LJ(this.urlPrefix, ulikeMergedTemplateStruct.urlPrefix) && this.isCommerceMusic == ulikeMergedTemplateStruct.isCommerceMusic && o.LJ(this.region, ulikeMergedTemplateStruct.region) && o.LJ(this.videoRatio, ulikeMergedTemplateStruct.videoRatio) && o.LJ(this.mvData, ulikeMergedTemplateStruct.mvData);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UlikeMergedTemplateStruct(media_id=");
        LIZ.append(this.media_id);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", description=");
        LIZ.append(this.description);
        LIZ.append(", templateType=");
        LIZ.append(this.templateType);
        LIZ.append(", cutsameInfo=");
        LIZ.append(this.cutsameInfo);
        LIZ.append(", urlPrefix=");
        LIZ.append(this.urlPrefix);
        LIZ.append(", isCommerceMusic=");
        LIZ.append(this.isCommerceMusic);
        LIZ.append(", region=");
        LIZ.append(this.region);
        LIZ.append(", videoRatio=");
        LIZ.append(this.videoRatio);
        LIZ.append(", mvData=");
        LIZ.append(this.mvData);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = (C79062V1e.LJ(this.description, C79062V1e.LJ(this.title, this.media_id.hashCode() * 31, 31), 31) + this.templateType) * 31;
        TemplateResponseItem templateResponseItem = this.cutsameInfo;
        int i = 0;
        if (templateResponseItem == null) {
            hashCode = 0;
        } else {
            hashCode = templateResponseItem.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.urlPrefix, (LJ + hashCode) * 31, 31);
        boolean z = this.isCommerceMusic;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int LJ2 = C79062V1e.LJ(this.videoRatio, C79062V1e.LJ(this.region, (LIZIZ + i2) * 31, 31), 31);
        MvEffect mvEffect = this.mvData;
        if (mvEffect != null) {
            i = mvEffect.hashCode();
        }
        return LJ2 + i;
    }

    public UlikeMergedTemplateStruct(String media_id, String title, String description, int i, TemplateResponseItem templateResponseItem, List<String> urlPrefix, boolean z, String region, String videoRatio, MvEffect mvEffect) {
        o.LJIIIZ(media_id, "media_id");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(description, "description");
        o.LJIIIZ(urlPrefix, "urlPrefix");
        o.LJIIIZ(region, "region");
        o.LJIIIZ(videoRatio, "videoRatio");
        this.media_id = media_id;
        this.title = title;
        this.description = description;
        this.templateType = i;
        this.cutsameInfo = templateResponseItem;
        this.urlPrefix = urlPrefix;
        this.isCommerceMusic = z;
        this.region = region;
        this.videoRatio = videoRatio;
        this.mvData = mvEffect;
    }

    public /* synthetic */ UlikeMergedTemplateStruct(String str, String str2, String str3, int i, TemplateResponseItem templateResponseItem, List list, boolean z, String str4, String str5, MvEffect mvEffect, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? null : templateResponseItem, (i2 & 32) != 0 ? new ArrayList() : list, z, (i2 & 128) != 0 ? "" : str4, (i2 & 256) == 0 ? str5 : "", (i2 & 512) == 0 ? mvEffect : null);
    }
}
