package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.ChooseYourExperienceCommonContentStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GKS implements Parcelable.Creator<ChooseYourExperienceCommonContentStruct> {
    @Override // android.os.Parcelable.Creator
    public final ChooseYourExperienceCommonContentStruct createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ChooseYourExperienceCommonContentStruct(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ChooseYourExperienceCommonContentStruct[] newArray(int i) {
        return new ChooseYourExperienceCommonContentStruct[i];
    }
}
