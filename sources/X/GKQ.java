package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.ChooseYourExperienceStruct;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.CustomizeYourExperienceStruct;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.JourneyConsistentContentAndAdChoicesStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GKQ implements Parcelable.Creator<JourneyConsistentContentAndAdChoicesStruct> {
    @Override // android.os.Parcelable.Creator
    public final JourneyConsistentContentAndAdChoicesStruct createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new JourneyConsistentContentAndAdChoicesStruct(ChooseYourExperienceStruct.CREATOR.createFromParcel(parcel), CustomizeYourExperienceStruct.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final JourneyConsistentContentAndAdChoicesStruct[] newArray(int i) {
        return new JourneyConsistentContentAndAdChoicesStruct[i];
    }
}
