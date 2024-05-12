package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Gwh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43155Gwh implements Parcelable.Creator<CustomStickerInfo> {
    @Override // android.os.Parcelable.Creator
    public final CustomStickerInfo createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new CustomStickerInfo(readString, readString2, readInt, readInt2, z);
    }

    @Override // android.os.Parcelable.Creator
    public final CustomStickerInfo[] newArray(int i) {
        return new CustomStickerInfo[i];
    }
}
