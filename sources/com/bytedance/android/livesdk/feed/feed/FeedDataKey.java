package com.bytedance.android.livesdk.feed.feed;

import X.X1D;
import Y.IDCreatorS49S0000000_5;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes6.dex */
public class FeedDataKey implements Parcelable {
    public long id;
    public String label;
    public int repeatCheck;
    public String url;
    public static final Integer REPEAT_CHECK_ENABLE = 1;
    public static final Integer REPEAT_CHECK_DISABLE = 0;
    public static final Integer HASH_CODE_NUM = 31;
    public static final Parcelable.Creator<FeedDataKey> CREATOR = new IDCreatorS49S0000000_5(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int i;
        Integer num = HASH_CODE_NUM;
        int intValue = num.intValue();
        String str = this.label;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int intValue2 = num.intValue() * (intValue + i);
        String str2 = this.url;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return Long.valueOf(this.id).hashCode() + (num.intValue() * (intValue2 + i2));
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("label: ");
        String str = this.label;
        String str2 = "null";
        if (str == null) {
            str = "null";
        }
        LIZ.append(str);
        LIZ.append("; url: ");
        String str3 = this.url;
        if (str3 != null) {
            str2 = str3;
        }
        LIZ.append(str2);
        LIZ.append("; id: ");
        LIZ.append(this.id);
        LIZ.append("; repeatCheck: ");
        LIZ.append(this.repeatCheck);
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof FeedDataKey)) {
            return false;
        }
        FeedDataKey feedDataKey = (FeedDataKey) obj;
        if (!TextUtils.equals(this.label, feedDataKey.label) || !TextUtils.equals(this.url, feedDataKey.url) || this.id != feedDataKey.id) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.label);
        parcel.writeString(this.url);
        parcel.writeLong(this.id);
        parcel.writeInt(this.repeatCheck);
    }

    public static FeedDataKey LIZ(long j, String str, String str2) {
        int intValue = REPEAT_CHECK_ENABLE.intValue();
        if (!TextUtils.isEmpty(str)) {
            return new FeedDataKey(intValue, str, str2, j);
        }
        throw new IllegalArgumentException("label must not be null or empty");
    }

    public FeedDataKey(int i, String str, String str2, long j) {
        this.url = "";
        this.label = "";
        this.id = Long.MIN_VALUE;
        REPEAT_CHECK_ENABLE.intValue();
        this.label = str;
        this.url = str2;
        this.id = j;
        this.repeatCheck = i;
    }
}
