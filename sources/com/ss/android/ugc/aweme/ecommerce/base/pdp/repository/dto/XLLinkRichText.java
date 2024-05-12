package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FJ;
import X.C1NE;
import X.C27618Asg;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class XLLinkRichText implements Parcelable {
    public static final Parcelable.Creator<XLLinkRichText> CREATOR = new C27618Asg();

    @InterfaceC65349Pkn("li_texts")
    public final List<LogisticLinkRichText> liTexts;

    @InterfaceC65349Pkn("xl_type")
    public final Integer xlType;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XLLinkRichText)) {
            return false;
        }
        XLLinkRichText xLLinkRichText = (XLLinkRichText) obj;
        return o.LJ(this.xlType, xLLinkRichText.xlType) && o.LJ(this.liTexts, xLLinkRichText.liTexts);
    }

    public final int hashCode() {
        Integer num = this.xlType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<LogisticLinkRichText> list = this.liTexts;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("XLLinkRichText(xlType=");
        LIZ.append(this.xlType);
        LIZ.append(", liTexts=");
        return C1NE.LIZIZ(LIZ, this.liTexts, ')', LIZ);
    }

    public XLLinkRichText(Integer num, List<LogisticLinkRichText> list) {
        this.xlType = num;
        this.liTexts = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Integer num = this.xlType;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        List<LogisticLinkRichText> list = this.liTexts;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
        while (LIZIZ.hasNext()) {
            ((LogisticLinkRichText) LIZIZ.next()).writeToParcel(out, i);
        }
    }

    public /* synthetic */ XLLinkRichText(Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, (i & 2) != 0 ? null : list);
    }
}
