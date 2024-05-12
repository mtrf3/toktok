package com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ExtraFeeDialog {

    @InterfaceC65349Pkn("button")
    public final ExtraFeeButton button;

    @InterfaceC65349Pkn("contents")
    public final List<String> content;

    @InterfaceC65349Pkn("title")
    public final String title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtraFeeDialog)) {
            return false;
        }
        ExtraFeeDialog extraFeeDialog = (ExtraFeeDialog) obj;
        return o.LJ(this.title, extraFeeDialog.title) && o.LJ(this.content, extraFeeDialog.content) && o.LJ(this.button, extraFeeDialog.button);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.content;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        ExtraFeeButton extraFeeButton = this.button;
        return hashCode2 + (extraFeeButton != null ? extraFeeButton.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExtraFeeDialog(title=");
        LIZ.append(this.title);
        LIZ.append(", content=");
        LIZ.append(this.content);
        LIZ.append(", button=");
        LIZ.append(this.button);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ExtraFeeDialog(String str, List<String> list, ExtraFeeButton extraFeeButton) {
        this.title = str;
        this.content = list;
        this.button = extraFeeButton;
    }
}
