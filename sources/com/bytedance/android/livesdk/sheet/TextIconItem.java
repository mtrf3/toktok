package com.bytedance.android.livesdk.sheet;

import X.UYB;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TextIconItem implements Parcelable {
    public static final Parcelable.Creator<TextIconItem> CREATOR = new UYB();
    public String iconName;
    public Integer id;
    public String text;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(1);
    }
}
