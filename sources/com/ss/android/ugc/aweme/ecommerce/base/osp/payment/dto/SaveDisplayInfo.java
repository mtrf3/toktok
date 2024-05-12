package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SaveDisplayInfo {

    @InterfaceC65349Pkn("save_display_popup_content")
    public final List<SaveDisplayInfoContent> content;

    @InterfaceC65349Pkn("name")
    public final String name;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveDisplayInfo)) {
            return false;
        }
        SaveDisplayInfo saveDisplayInfo = (SaveDisplayInfo) obj;
        return o.LJ(this.name, saveDisplayInfo.name) && o.LJ(this.content, saveDisplayInfo.content);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<SaveDisplayInfoContent> list = this.content;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SaveDisplayInfo(name=");
        LIZ.append(this.name);
        LIZ.append(", content=");
        return C1NE.LIZIZ(LIZ, this.content, ')', LIZ);
    }

    public SaveDisplayInfo(String str, List<SaveDisplayInfoContent> list) {
        this.name = str;
        this.content = list;
    }
}
