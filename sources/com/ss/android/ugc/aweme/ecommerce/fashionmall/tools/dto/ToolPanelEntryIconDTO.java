package com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ToolPanelEntryIconDTO {

    @InterfaceC65349Pkn("url_list")
    public List<String> urlList;

    /* JADX WARN: Multi-variable type inference failed */
    public ToolPanelEntryIconDTO() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ToolPanelEntryIconDTO copy$default(ToolPanelEntryIconDTO toolPanelEntryIconDTO, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = toolPanelEntryIconDTO.urlList;
        }
        return toolPanelEntryIconDTO.copy(list);
    }

    public final ToolPanelEntryIconDTO copy(List<String> list) {
        return new ToolPanelEntryIconDTO(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ToolPanelEntryIconDTO) && o.LJ(this.urlList, ((ToolPanelEntryIconDTO) obj).urlList);
    }

    public int hashCode() {
        List<String> list = this.urlList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ToolPanelEntryIconDTO(urlList=");
        return C1NE.LIZIZ(LIZ, this.urlList, ')', LIZ);
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public ToolPanelEntryIconDTO(List<String> list) {
        this.urlList = list;
    }

    public final void setUrlList(List<String> list) {
        this.urlList = list;
    }

    public /* synthetic */ ToolPanelEntryIconDTO(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
