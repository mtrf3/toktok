package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.ChooseYourExperienceCommonContentStruct;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.ChooseYourExperienceStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GKP implements Parcelable.Creator<ChooseYourExperienceStruct> {
    @Override // android.os.Parcelable.Creator
    public final ChooseYourExperienceStruct createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        Parcelable.Creator<ChooseYourExperienceCommonContentStruct> creator = ChooseYourExperienceCommonContentStruct.CREATOR;
        return new ChooseYourExperienceStruct(readString, creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final ChooseYourExperienceStruct[] newArray(int i) {
        return new ChooseYourExperienceStruct[i];
    }
}
