package com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel;

import X.GKP;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ChooseYourExperienceStruct implements Parcelable {
    public static final Parcelable.Creator<ChooseYourExperienceStruct> CREATOR = new GKP();

    @InterfaceC65349Pkn("gen_data")
    public final ChooseYourExperienceCommonContentStruct gen_data;

    @InterfaceC65349Pkn("header_title")
    public final String header_title;

    @InterfaceC65349Pkn("learn_more_data")
    public final ChooseYourExperienceCommonContentStruct learn_more_data;

    @InterfaceC65349Pkn("more_options_data")
    public final ChooseYourExperienceCommonContentStruct more_options_data;

    @InterfaceC65349Pkn("personalize_data")
    public final ChooseYourExperienceCommonContentStruct personalize_data;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.header_title);
        this.personalize_data.writeToParcel(out, i);
        this.gen_data.writeToParcel(out, i);
        this.more_options_data.writeToParcel(out, i);
        this.learn_more_data.writeToParcel(out, i);
    }

    public ChooseYourExperienceStruct(String header_title, ChooseYourExperienceCommonContentStruct personalize_data, ChooseYourExperienceCommonContentStruct gen_data, ChooseYourExperienceCommonContentStruct more_options_data, ChooseYourExperienceCommonContentStruct learn_more_data) {
        o.LJIIIZ(header_title, "header_title");
        o.LJIIIZ(personalize_data, "personalize_data");
        o.LJIIIZ(gen_data, "gen_data");
        o.LJIIIZ(more_options_data, "more_options_data");
        o.LJIIIZ(learn_more_data, "learn_more_data");
        this.header_title = header_title;
        this.personalize_data = personalize_data;
        this.gen_data = gen_data;
        this.more_options_data = more_options_data;
        this.learn_more_data = learn_more_data;
    }
}
