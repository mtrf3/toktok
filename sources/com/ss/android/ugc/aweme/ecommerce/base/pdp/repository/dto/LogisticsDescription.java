package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C26977AiL;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LogisticsDescription implements Parcelable {
    public static final Parcelable.Creator<LogisticsDescription> CREATOR = new C26977AiL();

    @InterfaceC65349Pkn("appendix_template")
    public final LogisticLinkRichText appendixTemplate;

    @InterfaceC65349Pkn("description_title")
    public final String descriptionTitle;

    @InterfaceC65349Pkn("descriptions")
    public final List<LogisticLinkRichText> descriptions;

    @InterfaceC65349Pkn("logistics_rich_text")
    public final LogisticLinkRichText logisticsRichText;

    @InterfaceC65349Pkn("text_color")
    public final String textColor;

    @InterfaceC65349Pkn("text_dark_color")
    public final String textDarkColor;

    /* JADX WARN: Multi-variable type inference failed */
    public LogisticsDescription() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogisticsDescription)) {
            return false;
        }
        LogisticsDescription logisticsDescription = (LogisticsDescription) obj;
        return o.LJ(this.descriptionTitle, logisticsDescription.descriptionTitle) && o.LJ(this.descriptions, logisticsDescription.descriptions) && o.LJ(this.appendixTemplate, logisticsDescription.appendixTemplate) && o.LJ(this.logisticsRichText, logisticsDescription.logisticsRichText) && o.LJ(this.textColor, logisticsDescription.textColor) && o.LJ(this.textDarkColor, logisticsDescription.textDarkColor);
    }

    public final int hashCode() {
        String str = this.descriptionTitle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<LogisticLinkRichText> list = this.descriptions;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        LogisticLinkRichText logisticLinkRichText = this.appendixTemplate;
        int hashCode3 = (hashCode2 + (logisticLinkRichText == null ? 0 : logisticLinkRichText.hashCode())) * 31;
        LogisticLinkRichText logisticLinkRichText2 = this.logisticsRichText;
        int hashCode4 = (hashCode3 + (logisticLinkRichText2 == null ? 0 : logisticLinkRichText2.hashCode())) * 31;
        String str2 = this.textColor;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.textDarkColor;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LogisticsDescription(descriptionTitle=");
        LIZ.append(this.descriptionTitle);
        LIZ.append(", descriptions=");
        LIZ.append(this.descriptions);
        LIZ.append(", appendixTemplate=");
        LIZ.append(this.appendixTemplate);
        LIZ.append(", logisticsRichText=");
        LIZ.append(this.logisticsRichText);
        LIZ.append(", textColor=");
        LIZ.append(this.textColor);
        LIZ.append(", textDarkColor=");
        return q.LIZIZ(LIZ, this.textDarkColor, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.descriptionTitle);
        List<LogisticLinkRichText> list = this.descriptions;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((LogisticLinkRichText) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        LogisticLinkRichText logisticLinkRichText = this.appendixTemplate;
        if (logisticLinkRichText == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            logisticLinkRichText.writeToParcel(out, i);
        }
        LogisticLinkRichText logisticLinkRichText2 = this.logisticsRichText;
        if (logisticLinkRichText2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            logisticLinkRichText2.writeToParcel(out, i);
        }
        out.writeString(this.textColor);
        out.writeString(this.textDarkColor);
    }

    public LogisticsDescription(String str, List<LogisticLinkRichText> list, LogisticLinkRichText logisticLinkRichText, LogisticLinkRichText logisticLinkRichText2, String str2, String str3) {
        this.descriptionTitle = str;
        this.descriptions = list;
        this.appendixTemplate = logisticLinkRichText;
        this.logisticsRichText = logisticLinkRichText2;
        this.textColor = str2;
        this.textDarkColor = str3;
    }

    public /* synthetic */ LogisticsDescription(String str, List list, LogisticLinkRichText logisticLinkRichText, LogisticLinkRichText logisticLinkRichText2, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : logisticLinkRichText, (i & 8) != 0 ? null : logisticLinkRichText2, (i & 16) != 0 ? null : str2, (i & 32) == 0 ? str3 : null);
    }
}
