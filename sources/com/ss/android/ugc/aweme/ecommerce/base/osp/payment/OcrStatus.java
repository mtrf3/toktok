package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.C79062V1e;
import X.HH1;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class OcrStatus {

    @InterfaceC65349Pkn("card_number")
    public final String cardNumber;

    @InterfaceC65349Pkn("date")
    public final String date;

    @InterfaceC65349Pkn("holder_name")
    public final String holder;

    /* JADX WARN: Multi-variable type inference failed */
    public OcrStatus() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OcrStatus)) {
            return false;
        }
        OcrStatus ocrStatus = (OcrStatus) obj;
        return o.LJ(this.cardNumber, ocrStatus.cardNumber) && o.LJ(this.date, ocrStatus.date) && o.LJ(this.holder, ocrStatus.holder);
    }

    public final int hashCode() {
        return this.holder.hashCode() + C79062V1e.LJ(this.date, this.cardNumber.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('{');
        LIZ.append(this.cardNumber);
        LIZ.append(',');
        LIZ.append(this.date);
        LIZ.append(',');
        return q.LIZIZ(LIZ, this.holder, '}', LIZ);
    }

    public OcrStatus(String str, String str2, String str3) {
        HH1.LIZ(str, "cardNumber", str2, "date", str3, "holder");
        this.cardNumber = str;
        this.date = str2;
        this.holder = str3;
    }

    public static OcrStatus LIZ(OcrStatus ocrStatus, String cardNumber, String date, int i) {
        String holder;
        if ((i & 1) != 0) {
            cardNumber = ocrStatus.cardNumber;
        }
        if ((i & 2) != 0) {
            date = ocrStatus.date;
        }
        if ((i & 4) != 0) {
            holder = ocrStatus.holder;
        } else {
            holder = null;
        }
        ocrStatus.getClass();
        o.LJIIIZ(cardNumber, "cardNumber");
        o.LJIIIZ(date, "date");
        o.LJIIIZ(holder, "holder");
        return new OcrStatus(cardNumber, date, holder);
    }

    public /* synthetic */ OcrStatus(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "-1" : str, (i & 2) != 0 ? "-1" : str2, (i & 4) != 0 ? "-1" : str3);
    }
}
