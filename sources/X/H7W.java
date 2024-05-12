package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.infosticker.InfoStickerCategoryParams;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H7W implements Parcelable.Creator<InfoStickerCategoryParams> {
    @Override // android.os.Parcelable.Creator
    public final InfoStickerCategoryParams createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new InfoStickerCategoryParams(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final InfoStickerCategoryParams[] newArray(int i) {
        return new InfoStickerCategoryParams[i];
    }
}
