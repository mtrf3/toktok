package com.ss.android.ugc.aweme.ecommerce.mall.tools.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ToolPanelEntryIconDTO {

    @InterfaceC65349Pkn("height")
    public Integer height;

    @InterfaceC65349Pkn("url_list")
    public List<String> urlList;

    @InterfaceC65349Pkn("width")
    public Integer width;

    /* JADX WARN: Multi-variable type inference failed */
    public ToolPanelEntryIconDTO() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ToolPanelEntryIconDTO copy$default(ToolPanelEntryIconDTO toolPanelEntryIconDTO, List list, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = toolPanelEntryIconDTO.urlList;
        }
        if ((i & 2) != 0) {
            num = toolPanelEntryIconDTO.width;
        }
        if ((i & 4) != 0) {
            num2 = toolPanelEntryIconDTO.height;
        }
        return toolPanelEntryIconDTO.copy(list, num, num2);
    }

    public final ToolPanelEntryIconDTO copy(List<String> list, Integer num, Integer num2) {
        return new ToolPanelEntryIconDTO(list, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToolPanelEntryIconDTO)) {
            return false;
        }
        ToolPanelEntryIconDTO toolPanelEntryIconDTO = (ToolPanelEntryIconDTO) obj;
        return o.LJ(this.urlList, toolPanelEntryIconDTO.urlList) && o.LJ(this.width, toolPanelEntryIconDTO.width) && o.LJ(this.height, toolPanelEntryIconDTO.height);
    }

    public int hashCode() {
        List<String> list = this.urlList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.width;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ToolPanelEntryIconDTO(urlList=");
        LIZ.append(this.urlList);
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        return s0.LIZJ(LIZ, this.height, ')', LIZ);
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public final void setHeight(Integer num) {
        this.height = num;
    }

    public final void setUrlList(List<String> list) {
        this.urlList = list;
    }

    public final void setWidth(Integer num) {
        this.width = num;
    }

    public ToolPanelEntryIconDTO(List<String> list, Integer num, Integer num2) {
        this.urlList = list;
        this.width = num;
        this.height = num2;
    }

    public /* synthetic */ ToolPanelEntryIconDTO(List list, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }
}
