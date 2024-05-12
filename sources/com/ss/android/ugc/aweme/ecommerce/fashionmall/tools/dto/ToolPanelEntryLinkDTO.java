package com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ToolPanelEntryLinkDTO {

    @InterfaceC65349Pkn("link")
    public String link;

    /* JADX WARN: Multi-variable type inference failed */
    public ToolPanelEntryLinkDTO() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ToolPanelEntryLinkDTO copy$default(ToolPanelEntryLinkDTO toolPanelEntryLinkDTO, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toolPanelEntryLinkDTO.link;
        }
        return toolPanelEntryLinkDTO.copy(str);
    }

    public final ToolPanelEntryLinkDTO copy(String str) {
        return new ToolPanelEntryLinkDTO(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ToolPanelEntryLinkDTO) && o.LJ(this.link, ((ToolPanelEntryLinkDTO) obj).link);
    }

    public int hashCode() {
        String str = this.link;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ToolPanelEntryLinkDTO(link=");
        return q.LIZIZ(LIZ, this.link, ')', LIZ);
    }

    public final String getLink() {
        return this.link;
    }

    public ToolPanelEntryLinkDTO(String str) {
        this.link = str;
    }

    public final void setLink(String str) {
        this.link = str;
    }

    public /* synthetic */ ToolPanelEntryLinkDTO(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
