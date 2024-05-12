package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ImageItem;
import kotlin.jvm.internal.o;

/* renamed from: X.S5s, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71536S5s implements Parcelable.Creator<ImageItem> {
    @Override // android.os.Parcelable.Creator
    public final ImageItem createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new ImageItem(readString, readString2, z);
    }

    @Override // android.os.Parcelable.Creator
    public final ImageItem[] newArray(int i) {
        return new ImageItem[i];
    }
}
