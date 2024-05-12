package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddressTipInfo {

    @InterfaceC65349Pkn("buttons")
    public final List<AddressTipButton> buttons;

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("tips")
    public final String tips;

    @InterfaceC65349Pkn("title")
    public final String title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressTipInfo)) {
            return false;
        }
        AddressTipInfo addressTipInfo = (AddressTipInfo) obj;
        return o.LJ(this.title, addressTipInfo.title) && o.LJ(this.content, addressTipInfo.content) && o.LJ(this.tips, addressTipInfo.tips) && o.LJ(this.buttons, addressTipInfo.buttons);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tips;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<AddressTipButton> list = this.buttons;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddressTipInfo(title=");
        LIZ.append(this.title);
        LIZ.append(", content=");
        LIZ.append(this.content);
        LIZ.append(", tips=");
        LIZ.append(this.tips);
        LIZ.append(", buttons=");
        return C1NE.LIZIZ(LIZ, this.buttons, ')', LIZ);
    }

    public AddressTipInfo(String str, String str2, String str3, List<AddressTipButton> list) {
        this.title = str;
        this.content = str2;
        this.tips = str3;
        this.buttons = list;
    }
}
