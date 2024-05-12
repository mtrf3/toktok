package com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EntityCardLabel {

    @InterfaceC65349Pkn("label_color")
    public final String labelColor;

    @InterfaceC65349Pkn("label_index")
    public final Integer labelIndex;

    @InterfaceC65349Pkn("label_list")
    public final List<SearchLabel> labelList;

    @InterfaceC65349Pkn("top_height")
    public final Integer topHeight;

    /* JADX WARN: Multi-variable type inference failed */
    public EntityCardLabel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntityCardLabel)) {
            return false;
        }
        EntityCardLabel entityCardLabel = (EntityCardLabel) obj;
        return o.LJ(this.labelList, entityCardLabel.labelList) && o.LJ(this.labelIndex, entityCardLabel.labelIndex) && o.LJ(this.labelColor, entityCardLabel.labelColor) && o.LJ(this.topHeight, entityCardLabel.topHeight);
    }

    public final int hashCode() {
        List<SearchLabel> list = this.labelList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.labelIndex;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.labelColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.topHeight;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EntityCardLabel(labelList=");
        LIZ.append(this.labelList);
        LIZ.append(", labelIndex=");
        LIZ.append(this.labelIndex);
        LIZ.append(", labelColor=");
        LIZ.append(this.labelColor);
        LIZ.append(", topHeight=");
        return s0.LIZJ(LIZ, this.topHeight, ')', LIZ);
    }

    public EntityCardLabel(List<SearchLabel> list, Integer num, String str, Integer num2) {
        this.labelList = list;
        this.labelIndex = num;
        this.labelColor = str;
        this.topHeight = num2;
    }

    public /* synthetic */ EntityCardLabel(List list, Integer num, String str, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num2);
    }
}
