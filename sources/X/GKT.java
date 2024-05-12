package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.CustomizeYourExperienceCommonContentStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GKT implements Parcelable.Creator<CustomizeYourExperienceCommonContentStruct> {
    @Override // android.os.Parcelable.Creator
    public final CustomizeYourExperienceCommonContentStruct createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new CustomizeYourExperienceCommonContentStruct(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final CustomizeYourExperienceCommonContentStruct[] newArray(int i) {
        return new CustomizeYourExperienceCommonContentStruct[i];
    }
}
