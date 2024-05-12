package com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel;

import X.GKQ;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class JourneyConsistentContentAndAdChoicesStruct implements Parcelable {
    public static final Parcelable.Creator<JourneyConsistentContentAndAdChoicesStruct> CREATOR = new GKQ();

    @InterfaceC65349Pkn("choose_your_experience_data")
    public final ChooseYourExperienceStruct chooseYourExperienceData;

    @InterfaceC65349Pkn("customize_your_experience_data")
    public final CustomizeYourExperienceStruct customizeYourExperienceData;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.chooseYourExperienceData.writeToParcel(out, i);
        this.customizeYourExperienceData.writeToParcel(out, i);
    }

    public JourneyConsistentContentAndAdChoicesStruct(ChooseYourExperienceStruct chooseYourExperienceData, CustomizeYourExperienceStruct customizeYourExperienceData) {
        o.LJIIIZ(chooseYourExperienceData, "chooseYourExperienceData");
        o.LJIIIZ(customizeYourExperienceData, "customizeYourExperienceData");
        this.chooseYourExperienceData = chooseYourExperienceData;
        this.customizeYourExperienceData = customizeYourExperienceData;
    }
}
