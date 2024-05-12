package com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ToolPanelEntryCardStyleDTO {

    @InterfaceC65349Pkn("button_name")
    public String buttonName;

    @InterfaceC65349Pkn("icon")
    public ToolPanelEntryIconDTO icon;

    @InterfaceC65349Pkn("link")
    public ToolPanelEntryLinkDTO link;

    @InterfaceC65349Pkn("link_title")
    public ToolPanelEntryTitleDTO linkTitle;

    @InterfaceC65349Pkn("title")
    public ToolPanelEntryTitleDTO title;

    /* JADX WARN: Multi-variable type inference failed */
    public ToolPanelEntryCardStyleDTO() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ToolPanelEntryCardStyleDTO copy$default(ToolPanelEntryCardStyleDTO toolPanelEntryCardStyleDTO, String str, ToolPanelEntryIconDTO toolPanelEntryIconDTO, ToolPanelEntryLinkDTO toolPanelEntryLinkDTO, ToolPanelEntryTitleDTO toolPanelEntryTitleDTO, ToolPanelEntryTitleDTO toolPanelEntryTitleDTO2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toolPanelEntryCardStyleDTO.buttonName;
        }
        if ((i & 2) != 0) {
            toolPanelEntryIconDTO = toolPanelEntryCardStyleDTO.icon;
        }
        if ((i & 4) != 0) {
            toolPanelEntryLinkDTO = toolPanelEntryCardStyleDTO.link;
        }
        if ((i & 8) != 0) {
            toolPanelEntryTitleDTO = toolPanelEntryCardStyleDTO.linkTitle;
        }
        if ((i & 16) != 0) {
            toolPanelEntryTitleDTO2 = toolPanelEntryCardStyleDTO.title;
        }
        return toolPanelEntryCardStyleDTO.copy(str, toolPanelEntryIconDTO, toolPanelEntryLinkDTO, toolPanelEntryTitleDTO, toolPanelEntryTitleDTO2);
    }

    public final ToolPanelEntryCardStyleDTO copy(String str, ToolPanelEntryIconDTO toolPanelEntryIconDTO, ToolPanelEntryLinkDTO toolPanelEntryLinkDTO, ToolPanelEntryTitleDTO toolPanelEntryTitleDTO, ToolPanelEntryTitleDTO toolPanelEntryTitleDTO2) {
        return new ToolPanelEntryCardStyleDTO(str, toolPanelEntryIconDTO, toolPanelEntryLinkDTO, toolPanelEntryTitleDTO, toolPanelEntryTitleDTO2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToolPanelEntryCardStyleDTO)) {
            return false;
        }
        ToolPanelEntryCardStyleDTO toolPanelEntryCardStyleDTO = (ToolPanelEntryCardStyleDTO) obj;
        return o.LJ(this.buttonName, toolPanelEntryCardStyleDTO.buttonName) && o.LJ(this.icon, toolPanelEntryCardStyleDTO.icon) && o.LJ(this.link, toolPanelEntryCardStyleDTO.link) && o.LJ(this.linkTitle, toolPanelEntryCardStyleDTO.linkTitle) && o.LJ(this.title, toolPanelEntryCardStyleDTO.title);
    }

    public int hashCode() {
        String str = this.buttonName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ToolPanelEntryIconDTO toolPanelEntryIconDTO = this.icon;
        int hashCode2 = (hashCode + (toolPanelEntryIconDTO == null ? 0 : toolPanelEntryIconDTO.hashCode())) * 31;
        ToolPanelEntryLinkDTO toolPanelEntryLinkDTO = this.link;
        int hashCode3 = (hashCode2 + (toolPanelEntryLinkDTO == null ? 0 : toolPanelEntryLinkDTO.hashCode())) * 31;
        ToolPanelEntryTitleDTO toolPanelEntryTitleDTO = this.linkTitle;
        int hashCode4 = (hashCode3 + (toolPanelEntryTitleDTO == null ? 0 : toolPanelEntryTitleDTO.hashCode())) * 31;
        ToolPanelEntryTitleDTO toolPanelEntryTitleDTO2 = this.title;
        return hashCode4 + (toolPanelEntryTitleDTO2 != null ? toolPanelEntryTitleDTO2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ToolPanelEntryCardStyleDTO(buttonName=");
        LIZ.append(this.buttonName);
        LIZ.append(", icon=");
        LIZ.append(this.icon);
        LIZ.append(", link=");
        LIZ.append(this.link);
        LIZ.append(", linkTitle=");
        LIZ.append(this.linkTitle);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getButtonName() {
        return this.buttonName;
    }

    public final ToolPanelEntryIconDTO getIcon() {
        return this.icon;
    }

    public final ToolPanelEntryLinkDTO getLink() {
        return this.link;
    }

    public final ToolPanelEntryTitleDTO getLinkTitle() {
        return this.linkTitle;
    }

    public final ToolPanelEntryTitleDTO getTitle() {
        return this.title;
    }

    public final void setButtonName(String str) {
        this.buttonName = str;
    }

    public final void setIcon(ToolPanelEntryIconDTO toolPanelEntryIconDTO) {
        this.icon = toolPanelEntryIconDTO;
    }

    public final void setLink(ToolPanelEntryLinkDTO toolPanelEntryLinkDTO) {
        this.link = toolPanelEntryLinkDTO;
    }

    public final void setLinkTitle(ToolPanelEntryTitleDTO toolPanelEntryTitleDTO) {
        this.linkTitle = toolPanelEntryTitleDTO;
    }

    public final void setTitle(ToolPanelEntryTitleDTO toolPanelEntryTitleDTO) {
        this.title = toolPanelEntryTitleDTO;
    }

    public ToolPanelEntryCardStyleDTO(String str, ToolPanelEntryIconDTO toolPanelEntryIconDTO, ToolPanelEntryLinkDTO toolPanelEntryLinkDTO, ToolPanelEntryTitleDTO toolPanelEntryTitleDTO, ToolPanelEntryTitleDTO toolPanelEntryTitleDTO2) {
        this.buttonName = str;
        this.icon = toolPanelEntryIconDTO;
        this.link = toolPanelEntryLinkDTO;
        this.linkTitle = toolPanelEntryTitleDTO;
        this.title = toolPanelEntryTitleDTO2;
    }

    public /* synthetic */ ToolPanelEntryCardStyleDTO(String str, ToolPanelEntryIconDTO toolPanelEntryIconDTO, ToolPanelEntryLinkDTO toolPanelEntryLinkDTO, ToolPanelEntryTitleDTO toolPanelEntryTitleDTO, ToolPanelEntryTitleDTO toolPanelEntryTitleDTO2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : toolPanelEntryIconDTO, (i & 4) != 0 ? null : toolPanelEntryLinkDTO, (i & 8) != 0 ? null : toolPanelEntryTitleDTO, (i & 16) == 0 ? toolPanelEntryTitleDTO2 : null);
    }
}
