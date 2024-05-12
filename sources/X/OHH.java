package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicUiLocationType;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OHH implements Parcelable.Creator<DynamicInfoComponent> {
    @Override // android.os.Parcelable.Creator
    public final DynamicInfoComponent createFromParcel(Parcel parcel) {
        DynamicUiLocationType createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = DynamicUiLocationType.CREATOR.createFromParcel(parcel);
        }
        return new DynamicInfoComponent(readString, readString2, readString3, readString4, readString5, readString6, readInt, readInt2, createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final DynamicInfoComponent[] newArray(int i) {
        return new DynamicInfoComponent[i];
    }
}
