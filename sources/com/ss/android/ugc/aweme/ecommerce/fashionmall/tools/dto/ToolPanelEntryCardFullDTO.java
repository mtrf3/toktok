package com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ToolPanelEntryCardFullDTO {

    @InterfaceC65349Pkn("style")
    public ToolPanelEntryCardStyleDTO style;

    @InterfaceC65349Pkn("type")
    public Integer type;

    /* JADX WARN: Multi-variable type inference failed */
    public ToolPanelEntryCardFullDTO() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ToolPanelEntryCardFullDTO copy$default(ToolPanelEntryCardFullDTO toolPanelEntryCardFullDTO, ToolPanelEntryCardStyleDTO toolPanelEntryCardStyleDTO, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            toolPanelEntryCardStyleDTO = toolPanelEntryCardFullDTO.style;
        }
        if ((i & 2) != 0) {
            num = toolPanelEntryCardFullDTO.type;
        }
        return toolPanelEntryCardFullDTO.copy(toolPanelEntryCardStyleDTO, num);
    }

    public final ToolPanelEntryCardFullDTO copy(ToolPanelEntryCardStyleDTO toolPanelEntryCardStyleDTO, Integer num) {
        return new ToolPanelEntryCardFullDTO(toolPanelEntryCardStyleDTO, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToolPanelEntryCardFullDTO)) {
            return false;
        }
        ToolPanelEntryCardFullDTO toolPanelEntryCardFullDTO = (ToolPanelEntryCardFullDTO) obj;
        return o.LJ(this.style, toolPanelEntryCardFullDTO.style) && o.LJ(this.type, toolPanelEntryCardFullDTO.type);
    }

    public int hashCode() {
        ToolPanelEntryCardStyleDTO toolPanelEntryCardStyleDTO = this.style;
        int hashCode = (toolPanelEntryCardStyleDTO == null ? 0 : toolPanelEntryCardStyleDTO.hashCode()) * 31;
        Integer num = this.type;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ToolPanelEntryCardFullDTO(style=");
        LIZ.append(this.style);
        LIZ.append(", type=");
        return s0.LIZJ(LIZ, this.type, ')', LIZ);
    }

    public final ToolPanelEntryCardStyleDTO getStyle() {
        return this.style;
    }

    public final Integer getType() {
        return this.type;
    }

    public final void setStyle(ToolPanelEntryCardStyleDTO toolPanelEntryCardStyleDTO) {
        this.style = toolPanelEntryCardStyleDTO;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public ToolPanelEntryCardFullDTO(ToolPanelEntryCardStyleDTO toolPanelEntryCardStyleDTO, Integer num) {
        this.style = toolPanelEntryCardStyleDTO;
        this.type = num;
    }

    public /* synthetic */ ToolPanelEntryCardFullDTO(ToolPanelEntryCardStyleDTO toolPanelEntryCardStyleDTO, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : toolPanelEntryCardStyleDTO, (i & 2) != 0 ? null : num);
    }
}
