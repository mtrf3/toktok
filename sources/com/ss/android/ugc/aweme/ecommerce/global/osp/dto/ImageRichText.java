package com.ss.android.ugc.aweme.ecommerce.global.osp.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ImageRichText {

    @InterfaceC65349Pkn("icons")
    public final List<Icon> icons;

    @InterfaceC65349Pkn("text")
    public final String text;

    /* JADX WARN: Multi-variable type inference failed */
    public ImageRichText() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageRichText)) {
            return false;
        }
        ImageRichText imageRichText = (ImageRichText) obj;
        return o.LJ(this.text, imageRichText.text) && o.LJ(this.icons, imageRichText.icons);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Icon> list = this.icons;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImageRichText(text=");
        LIZ.append(this.text);
        LIZ.append(", icons=");
        return C1NE.LIZIZ(LIZ, this.icons, ')', LIZ);
    }

    public ImageRichText(String str, List<Icon> list) {
        this.text = str;
        this.icons = list;
    }

    public /* synthetic */ ImageRichText(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
