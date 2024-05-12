package com.ss.android.ugc.aweme.services.external.ui;

import X.AnonymousClass391;
import X.C07670Rv;
import X.C78685UuP;
import X.C79062V1e;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AutoCutAnchorConfig {
    public final AnchorCommonStruct anchor;
    public final CreativeInfo creativeInfo;
    public final List<Float> durationList;
    public final String enterFrom;
    public final String enterMethod;
    public final boolean isCommerceMusic;
    public final int maxClips;
    public final int minClips;
    public final String musicId;
    public final String shootWay;
    public final String templateGroupId;
    public final String templateId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AutoCutAnchorConfig copy$default(AutoCutAnchorConfig autoCutAnchorConfig, AnchorCommonStruct anchorCommonStruct, String str, String str2, int i, int i2, boolean z, List list, CreativeInfo creativeInfo, String str3, String str4, String str5, String str6, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            anchorCommonStruct = autoCutAnchorConfig.anchor;
        }
        if ((i3 & 2) != 0) {
            str = autoCutAnchorConfig.templateId;
        }
        if ((i3 & 4) != 0) {
            str2 = autoCutAnchorConfig.musicId;
        }
        if ((i3 & 8) != 0) {
            i = autoCutAnchorConfig.minClips;
        }
        if ((i3 & 16) != 0) {
            i2 = autoCutAnchorConfig.maxClips;
        }
        if ((i3 & 32) != 0) {
            z = autoCutAnchorConfig.isCommerceMusic;
        }
        if ((i3 & 64) != 0) {
            list = autoCutAnchorConfig.durationList;
        }
        if ((i3 & 128) != 0) {
            creativeInfo = autoCutAnchorConfig.creativeInfo;
        }
        if ((i3 & 256) != 0) {
            str3 = autoCutAnchorConfig.shootWay;
        }
        if ((i3 & 512) != 0) {
            str4 = autoCutAnchorConfig.enterFrom;
        }
        if ((i3 & 1024) != 0) {
            str5 = autoCutAnchorConfig.enterMethod;
        }
        if ((i3 & 2048) != 0) {
            str6 = autoCutAnchorConfig.templateGroupId;
        }
        return autoCutAnchorConfig.copy(anchorCommonStruct, str, str2, i, i2, z, list, creativeInfo, str3, str4, str5, str6);
    }

    public final AutoCutAnchorConfig copy(AnchorCommonStruct anchorCommonStruct, String str, String str2, int i, int i2, boolean z, List<Float> durationList, CreativeInfo creativeInfo, String shootWay, String enterFrom, String enterMethod, String str3) {
        o.LJIIIZ(durationList, "durationList");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(shootWay, "shootWay");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        return new AutoCutAnchorConfig(anchorCommonStruct, str, str2, i, i2, z, durationList, creativeInfo, shootWay, enterFrom, enterMethod, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCutAnchorConfig)) {
            return false;
        }
        AutoCutAnchorConfig autoCutAnchorConfig = (AutoCutAnchorConfig) obj;
        return o.LJ(this.anchor, autoCutAnchorConfig.anchor) && o.LJ(this.templateId, autoCutAnchorConfig.templateId) && o.LJ(this.musicId, autoCutAnchorConfig.musicId) && this.minClips == autoCutAnchorConfig.minClips && this.maxClips == autoCutAnchorConfig.maxClips && this.isCommerceMusic == autoCutAnchorConfig.isCommerceMusic && o.LJ(this.durationList, autoCutAnchorConfig.durationList) && o.LJ(this.creativeInfo, autoCutAnchorConfig.creativeInfo) && o.LJ(this.shootWay, autoCutAnchorConfig.shootWay) && o.LJ(this.enterFrom, autoCutAnchorConfig.enterFrom) && o.LJ(this.enterMethod, autoCutAnchorConfig.enterMethod) && o.LJ(this.templateGroupId, autoCutAnchorConfig.templateGroupId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        AnchorCommonStruct anchorCommonStruct = this.anchor;
        int i = 0;
        if (anchorCommonStruct == null) {
            hashCode = 0;
        } else {
            hashCode = anchorCommonStruct.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.templateId;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.musicId;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (((((i3 + hashCode3) * 31) + this.minClips) * 31) + this.maxClips) * 31;
        boolean z = this.isCommerceMusic;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int LJ = C79062V1e.LJ(this.enterMethod, C79062V1e.LJ(this.enterFrom, C79062V1e.LJ(this.shootWay, (this.creativeInfo.hashCode() + AnonymousClass391.LIZIZ(this.durationList, (i4 + i5) * 31, 31)) * 31, 31), 31), 31);
        String str3 = this.templateGroupId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return LJ + i;
    }

    public final boolean isValid() {
        int i;
        if (C78685UuP.LJJJZ(this.templateId) && this.minClips >= 0 && (i = this.maxClips) > 0 && i == this.durationList.size()) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AutoCutAnchorConfig(anchor=");
        sb.append(this.anchor);
        sb.append(", templateId=");
        sb.append(this.templateId);
        sb.append(", musicId=");
        sb.append(this.musicId);
        sb.append(", minClips=");
        sb.append(this.minClips);
        sb.append(", maxClips=");
        sb.append(this.maxClips);
        sb.append(", isCommerceMusic=");
        sb.append(this.isCommerceMusic);
        sb.append(", durationList=");
        sb.append(this.durationList);
        sb.append(", creativeInfo=");
        sb.append(this.creativeInfo);
        sb.append(", shootWay=");
        sb.append(this.shootWay);
        sb.append(", enterFrom=");
        sb.append(this.enterFrom);
        sb.append(", enterMethod=");
        sb.append(this.enterMethod);
        sb.append(", templateGroupId=");
        return C07670Rv.LIZIZ(sb, this.templateGroupId, ')');
    }

    public final AnchorCommonStruct getAnchor() {
        return this.anchor;
    }

    public final CreativeInfo getCreativeInfo() {
        return this.creativeInfo;
    }

    public final List<Float> getDurationList() {
        return this.durationList;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final int getMaxClips() {
        return this.maxClips;
    }

    public final int getMinClips() {
        return this.minClips;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final String getTemplateGroupId() {
        return this.templateGroupId;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final boolean isCommerceMusic() {
        return this.isCommerceMusic;
    }

    public AutoCutAnchorConfig(AnchorCommonStruct anchorCommonStruct, String str, String str2, int i, int i2, boolean z, List<Float> durationList, CreativeInfo creativeInfo, String shootWay, String enterFrom, String enterMethod, String str3) {
        o.LJIIIZ(durationList, "durationList");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(shootWay, "shootWay");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        this.anchor = anchorCommonStruct;
        this.templateId = str;
        this.musicId = str2;
        this.minClips = i;
        this.maxClips = i2;
        this.isCommerceMusic = z;
        this.durationList = durationList;
        this.creativeInfo = creativeInfo;
        this.shootWay = shootWay;
        this.enterFrom = enterFrom;
        this.enterMethod = enterMethod;
        this.templateGroupId = str3;
    }

    public /* synthetic */ AutoCutAnchorConfig(AnchorCommonStruct anchorCommonStruct, String str, String str2, int i, int i2, boolean z, List list, CreativeInfo creativeInfo, String str3, String str4, String str5, String str6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(anchorCommonStruct, str, str2, i, i2, z, list, (i3 & 128) != 0 ? new CreativeInfo(null, 0, null, 7, null) : creativeInfo, (i3 & 256) != 0 ? "autocut_anchor" : str3, str4, str5, str6);
    }
}
