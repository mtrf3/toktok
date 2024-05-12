package com.ss.android.ugc.aweme.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EcPromotionInfo {

    @InterfaceC65349Pkn("icon")
    public final EcPromotionIcon icon;

    @InterfaceC65349Pkn("priority")
    public final String priority;

    @InterfaceC65349Pkn("content")
    public final EcPromotionText text;

    @InterfaceC65349Pkn("track_info")
    public final List<Map<String, String>> trackInfo;

    @InterfaceC65349Pkn("promotion_type")
    public final String type;

    /* JADX WARN: Multi-variable type inference failed */
    public EcPromotionInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcPromotionInfo)) {
            return false;
        }
        EcPromotionInfo ecPromotionInfo = (EcPromotionInfo) obj;
        return o.LJ(this.type, ecPromotionInfo.type) && o.LJ(this.priority, ecPromotionInfo.priority) && o.LJ(this.icon, ecPromotionInfo.icon) && o.LJ(this.text, ecPromotionInfo.text) && o.LJ(this.trackInfo, ecPromotionInfo.trackInfo);
    }

    public final int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.priority;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        EcPromotionIcon ecPromotionIcon = this.icon;
        int hashCode3 = (hashCode2 + (ecPromotionIcon == null ? 0 : ecPromotionIcon.hashCode())) * 31;
        EcPromotionText ecPromotionText = this.text;
        int hashCode4 = (hashCode3 + (ecPromotionText == null ? 0 : ecPromotionText.hashCode())) * 31;
        List<Map<String, String>> list = this.trackInfo;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EcPromotionInfo(type=");
        LIZ.append(this.type);
        LIZ.append(", priority=");
        LIZ.append(this.priority);
        LIZ.append(", icon=");
        LIZ.append(this.icon);
        LIZ.append(", text=");
        LIZ.append(this.text);
        LIZ.append(", trackInfo=");
        return C1NE.LIZIZ(LIZ, this.trackInfo, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EcPromotionInfo(String str, String str2, EcPromotionIcon ecPromotionIcon, EcPromotionText ecPromotionText, List<? extends Map<String, String>> list) {
        this.type = str;
        this.priority = str2;
        this.icon = ecPromotionIcon;
        this.text = ecPromotionText;
        this.trackInfo = list;
    }

    public /* synthetic */ EcPromotionInfo(String str, String str2, EcPromotionIcon ecPromotionIcon, EcPromotionText ecPromotionText, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : ecPromotionIcon, (i & 8) != 0 ? null : ecPromotionText, (i & 16) == 0 ? list : null);
    }
}
