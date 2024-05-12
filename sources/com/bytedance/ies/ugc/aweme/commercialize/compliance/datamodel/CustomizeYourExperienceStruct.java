package com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel;

import X.GKR;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CustomizeYourExperienceStruct implements Parcelable {
    public static final Parcelable.Creator<CustomizeYourExperienceStruct> CREATOR = new GKR();

    @InterfaceC65349Pkn("ads_experience_data")
    public final CustomizeYourExperienceCommonContentStruct ads_experience_data;

    @InterfaceC65349Pkn("header_title")
    public final String header_title;

    @InterfaceC65349Pkn("learn_more_data")
    public final ChooseYourExperienceCommonContentStruct learn_more_data;

    @InterfaceC65349Pkn("next_button_text")
    public final String next_button_text;

    @InterfaceC65349Pkn("video_experience_data")
    public final CustomizeYourExperienceCommonContentStruct video_experience_data;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.header_title);
        this.video_experience_data.writeToParcel(out, i);
        this.ads_experience_data.writeToParcel(out, i);
        this.learn_more_data.writeToParcel(out, i);
        out.writeString(this.next_button_text);
    }

    public CustomizeYourExperienceStruct(String header_title, CustomizeYourExperienceCommonContentStruct video_experience_data, CustomizeYourExperienceCommonContentStruct ads_experience_data, ChooseYourExperienceCommonContentStruct learn_more_data, String next_button_text) {
        o.LJIIIZ(header_title, "header_title");
        o.LJIIIZ(video_experience_data, "video_experience_data");
        o.LJIIIZ(ads_experience_data, "ads_experience_data");
        o.LJIIIZ(learn_more_data, "learn_more_data");
        o.LJIIIZ(next_button_text, "next_button_text");
        this.header_title = header_title;
        this.video_experience_data = video_experience_data;
        this.ads_experience_data = ads_experience_data;
        this.learn_more_data = learn_more_data;
        this.next_button_text = next_button_text;
    }
}
