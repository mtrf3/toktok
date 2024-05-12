package com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ToolPanelEntryTitleDTO {

    @InterfaceC65349Pkn("default_text")
    public String defaultText;

    @InterfaceC65349Pkn("starling_key")
    public String starlingKey;

    @InterfaceC65349Pkn("text")
    public String text;

    /* JADX WARN: Multi-variable type inference failed */
    public ToolPanelEntryTitleDTO() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ToolPanelEntryTitleDTO copy$default(ToolPanelEntryTitleDTO toolPanelEntryTitleDTO, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toolPanelEntryTitleDTO.text;
        }
        if ((i & 2) != 0) {
            str2 = toolPanelEntryTitleDTO.starlingKey;
        }
        if ((i & 4) != 0) {
            str3 = toolPanelEntryTitleDTO.defaultText;
        }
        return toolPanelEntryTitleDTO.copy(str, str2, str3);
    }

    public final ToolPanelEntryTitleDTO copy(String str, String str2, String str3) {
        return new ToolPanelEntryTitleDTO(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToolPanelEntryTitleDTO)) {
            return false;
        }
        ToolPanelEntryTitleDTO toolPanelEntryTitleDTO = (ToolPanelEntryTitleDTO) obj;
        return o.LJ(this.text, toolPanelEntryTitleDTO.text) && o.LJ(this.starlingKey, toolPanelEntryTitleDTO.starlingKey) && o.LJ(this.defaultText, toolPanelEntryTitleDTO.defaultText);
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.starlingKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.defaultText;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ToolPanelEntryTitleDTO(text=");
        LIZ.append(this.text);
        LIZ.append(", starlingKey=");
        LIZ.append(this.starlingKey);
        LIZ.append(", defaultText=");
        return q.LIZIZ(LIZ, this.defaultText, ')', LIZ);
    }

    public final String getDefaultText() {
        return this.defaultText;
    }

    public final String getStarlingKey() {
        return this.starlingKey;
    }

    public final String getText() {
        return this.text;
    }

    public final void setDefaultText(String str) {
        this.defaultText = str;
    }

    public final void setStarlingKey(String str) {
        this.starlingKey = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public ToolPanelEntryTitleDTO(String str, String str2, String str3) {
        this.text = str;
        this.starlingKey = str2;
        this.defaultText = str3;
    }

    public /* synthetic */ ToolPanelEntryTitleDTO(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
