package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C27159AlH;
import X.C27161AlJ;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LogisticItem implements Parcelable {

    @InterfaceC65349Pkn("da_info")
    public final String daInfo;

    @InterfaceC65349Pkn("promotion_threshold_text")
    public final String thresholdText;

    @InterfaceC65349Pkn("promotion_title")
    public final String title;

    @InterfaceC65349Pkn("promotion_type")
    public final Integer type;
    public static final C27161AlJ Companion = new C27161AlJ();
    public static final Parcelable.Creator<LogisticItem> CREATOR = new C27159AlH();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        Integer num = this.type;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.title);
        out.writeString(this.thresholdText);
        out.writeString(this.daInfo);
    }

    public final int hashCode() {
        int i;
        int i2;
        Integer num = this.type;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 131;
        }
        int i3 = i * 31;
        String str = this.title;
        int i4 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i3 + i2) * 31;
        String str2 = this.thresholdText;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i5 + i4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LogisticItem) {
            LogisticItem logisticItem = (LogisticItem) obj;
            if (o.LJ(this.type, logisticItem.type) && o.LJ(this.title, logisticItem.title) && o.LJ(this.thresholdText, logisticItem.thresholdText)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.SpannableStringBuilder LIZ(android.content.Context r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticItem.LIZ(android.content.Context, boolean):android.text.SpannableStringBuilder");
    }

    public LogisticItem(Integer num, String str, String str2, String str3) {
        this.type = num;
        this.title = str;
        this.thresholdText = str2;
        this.daInfo = str3;
    }
}
