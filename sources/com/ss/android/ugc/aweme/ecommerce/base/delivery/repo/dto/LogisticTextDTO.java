package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C27105AkP;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LogisticTextDTO implements Parcelable {
    public static final Parcelable.Creator<LogisticTextDTO> CREATOR = new C27105AkP();

    @InterfaceC65349Pkn("delivery_status_text")
    public final String deliveryStatusText;

    @InterfaceC65349Pkn("discount_desc_text")
    public final String discountDescText;

    @InterfaceC65349Pkn("discount_views")
    public final List<LogisticDiscountView> discountViews;

    @InterfaceC65349Pkn("estimated_arrival_text")
    public final String estimatedArrivalText;

    @InterfaceC65349Pkn("lead_message")
    public final LeadMessage leadMessage;

    @InterfaceC65349Pkn("lead_time_text")
    public final String leadTimeText;

    @InterfaceC65349Pkn("service_text")
    public final String serviceText;

    @InterfaceC65349Pkn("threshold_text")
    public final String thresholdText;

    @InterfaceC65349Pkn("threshold_text_en")
    public final String thresholdTextEn;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogisticTextDTO)) {
            return false;
        }
        LogisticTextDTO logisticTextDTO = (LogisticTextDTO) obj;
        return o.LJ(this.discountDescText, logisticTextDTO.discountDescText) && o.LJ(this.serviceText, logisticTextDTO.serviceText) && o.LJ(this.leadTimeText, logisticTextDTO.leadTimeText) && o.LJ(this.deliveryStatusText, logisticTextDTO.deliveryStatusText) && o.LJ(this.thresholdText, logisticTextDTO.thresholdText) && o.LJ(this.thresholdTextEn, logisticTextDTO.thresholdTextEn) && o.LJ(this.discountViews, logisticTextDTO.discountViews) && o.LJ(this.leadMessage, logisticTextDTO.leadMessage) && o.LJ(this.estimatedArrivalText, logisticTextDTO.estimatedArrivalText);
    }

    public final int hashCode() {
        String str = this.discountDescText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.serviceText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.leadTimeText;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deliveryStatusText;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.thresholdText;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.thresholdTextEn;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<LogisticDiscountView> list = this.discountViews;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        LeadMessage leadMessage = this.leadMessage;
        int hashCode8 = (hashCode7 + (leadMessage == null ? 0 : leadMessage.hashCode())) * 31;
        String str7 = this.estimatedArrivalText;
        return hashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LogisticTextDTO(discountDescText=");
        LIZ.append(this.discountDescText);
        LIZ.append(", serviceText=");
        LIZ.append(this.serviceText);
        LIZ.append(", leadTimeText=");
        LIZ.append(this.leadTimeText);
        LIZ.append(", deliveryStatusText=");
        LIZ.append(this.deliveryStatusText);
        LIZ.append(", thresholdText=");
        LIZ.append(this.thresholdText);
        LIZ.append(", thresholdTextEn=");
        LIZ.append(this.thresholdTextEn);
        LIZ.append(", discountViews=");
        LIZ.append(this.discountViews);
        LIZ.append(", leadMessage=");
        LIZ.append(this.leadMessage);
        LIZ.append(", estimatedArrivalText=");
        return q.LIZIZ(LIZ, this.estimatedArrivalText, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.discountDescText);
        out.writeString(this.serviceText);
        out.writeString(this.leadTimeText);
        out.writeString(this.deliveryStatusText);
        out.writeString(this.thresholdText);
        out.writeString(this.thresholdTextEn);
        List<LogisticDiscountView> list = this.discountViews;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((LogisticDiscountView) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        LeadMessage leadMessage = this.leadMessage;
        if (leadMessage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            leadMessage.writeToParcel(out, i);
        }
        out.writeString(this.estimatedArrivalText);
    }

    public LogisticTextDTO(String str, String str2, String str3, String str4, String str5, String str6, List<LogisticDiscountView> list, LeadMessage leadMessage, String str7) {
        this.discountDescText = str;
        this.serviceText = str2;
        this.leadTimeText = str3;
        this.deliveryStatusText = str4;
        this.thresholdText = str5;
        this.thresholdTextEn = str6;
        this.discountViews = list;
        this.leadMessage = leadMessage;
        this.estimatedArrivalText = str7;
    }
}
