package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.ChooseYourExperienceCommonContentStruct;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.CustomizeYourExperienceCommonContentStruct;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.CustomizeYourExperienceStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GKR implements Parcelable.Creator<CustomizeYourExperienceStruct> {
    @Override // android.os.Parcelable.Creator
    public final CustomizeYourExperienceStruct createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        Parcelable.Creator<CustomizeYourExperienceCommonContentStruct> creator = CustomizeYourExperienceCommonContentStruct.CREATOR;
        return new CustomizeYourExperienceStruct(readString, creator.createFromParcel(parcel), creator.createFromParcel(parcel), ChooseYourExperienceCommonContentStruct.CREATOR.createFromParcel(parcel), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final CustomizeYourExperienceStruct[] newArray(int i) {
        return new CustomizeYourExperienceStruct[i];
    }
}
