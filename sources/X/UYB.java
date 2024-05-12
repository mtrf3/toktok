package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.sheet.TextIconItem;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UYB implements Parcelable.Creator<TextIconItem> {
    @Override // android.os.Parcelable.Creator
    public final TextIconItem createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return new TextIconItem();
    }

    @Override // android.os.Parcelable.Creator
    public final TextIconItem[] newArray(int i) {
        return new TextIconItem[i];
    }
}
