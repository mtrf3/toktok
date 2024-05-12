package com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HighLightExtra implements Serializable {

    @InterfaceC65349Pkn("anchor_info")
    public final AnchorInfo anchorInfo;

    @InterfaceC65349Pkn("fragment_type")
    public final Integer fragmentType;

    @InterfaceC65349Pkn("suggest_video_title")
    public final String suggestVideoTitle;

    @InterfaceC65349Pkn("suggest_video_toast")
    public final String suggestVideoToast;

    public static /* synthetic */ HighLightExtra copy$default(HighLightExtra highLightExtra, AnchorInfo anchorInfo, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            anchorInfo = highLightExtra.anchorInfo;
        }
        if ((i & 2) != 0) {
            str = highLightExtra.suggestVideoTitle;
        }
        if ((i & 4) != 0) {
            str2 = highLightExtra.suggestVideoToast;
        }
        if ((i & 8) != 0) {
            num = highLightExtra.fragmentType;
        }
        return highLightExtra.copy(anchorInfo, str, str2, num);
    }

    public final HighLightExtra copy(AnchorInfo anchorInfo, String str, String str2, Integer num) {
        return new HighLightExtra(anchorInfo, str, str2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighLightExtra)) {
            return false;
        }
        HighLightExtra highLightExtra = (HighLightExtra) obj;
        return o.LJ(this.anchorInfo, highLightExtra.anchorInfo) && o.LJ(this.suggestVideoTitle, highLightExtra.suggestVideoTitle) && o.LJ(this.suggestVideoToast, highLightExtra.suggestVideoToast) && o.LJ(this.fragmentType, highLightExtra.fragmentType);
    }

    public int hashCode() {
        AnchorInfo anchorInfo = this.anchorInfo;
        int hashCode = (anchorInfo == null ? 0 : anchorInfo.hashCode()) * 31;
        String str = this.suggestVideoTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.suggestVideoToast;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.fragmentType;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HighLightExtra(anchorInfo=");
        LIZ.append(this.anchorInfo);
        LIZ.append(", suggestVideoTitle=");
        LIZ.append(this.suggestVideoTitle);
        LIZ.append(", suggestVideoToast=");
        LIZ.append(this.suggestVideoToast);
        LIZ.append(", fragmentType=");
        return s0.LIZJ(LIZ, this.fragmentType, ')', LIZ);
    }

    public final AnchorInfo getAnchorInfo() {
        return this.anchorInfo;
    }

    public final Integer getFragmentType() {
        return this.fragmentType;
    }

    public final String getSuggestVideoTitle() {
        return this.suggestVideoTitle;
    }

    public final String getSuggestVideoToast() {
        return this.suggestVideoToast;
    }

    public HighLightExtra(AnchorInfo anchorInfo, String str, String str2, Integer num) {
        this.anchorInfo = anchorInfo;
        this.suggestVideoTitle = str;
        this.suggestVideoToast = str2;
        this.fragmentType = num;
    }
}
