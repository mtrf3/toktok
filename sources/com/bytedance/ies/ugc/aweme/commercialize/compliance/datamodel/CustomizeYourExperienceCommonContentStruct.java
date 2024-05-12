package com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel;

import X.GKT;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CustomizeYourExperienceCommonContentStruct implements Parcelable {
    public static final Parcelable.Creator<CustomizeYourExperienceCommonContentStruct> CREATOR = new GKT();

    @InterfaceC65349Pkn("generic_desc")
    public final String generic_desc;

    @InterfaceC65349Pkn("generic_title")
    public final String generic_title;

    @InterfaceC65349Pkn("personalized_desc")
    public final String personalized_desc;

    @InterfaceC65349Pkn("personalized_link")
    public final String personalized_link;

    @InterfaceC65349Pkn("personalized_link_text")
    public final String personalized_link_text;

    @InterfaceC65349Pkn("personalized_off_tiktok_desc")
    public final String personalized_off_tiktok_desc;

    @InterfaceC65349Pkn("personalized_off_tiktok_title")
    public final String personalized_off_tiktok_title;

    @InterfaceC65349Pkn("personalized_title")
    public final String personalized_title;

    @InterfaceC65349Pkn("title")
    public final String title;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.title);
        out.writeString(this.personalized_title);
        out.writeString(this.personalized_desc);
        out.writeString(this.personalized_link);
        out.writeString(this.personalized_link_text);
        out.writeString(this.generic_title);
        out.writeString(this.generic_desc);
        out.writeString(this.personalized_off_tiktok_title);
        out.writeString(this.personalized_off_tiktok_desc);
    }

    public CustomizeYourExperienceCommonContentStruct(String title, String personalized_title, String personalized_desc, String personalized_link, String personalized_link_text, String generic_title, String generic_desc, String personalized_off_tiktok_title, String personalized_off_tiktok_desc) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(personalized_title, "personalized_title");
        o.LJIIIZ(personalized_desc, "personalized_desc");
        o.LJIIIZ(personalized_link, "personalized_link");
        o.LJIIIZ(personalized_link_text, "personalized_link_text");
        o.LJIIIZ(generic_title, "generic_title");
        o.LJIIIZ(generic_desc, "generic_desc");
        o.LJIIIZ(personalized_off_tiktok_title, "personalized_off_tiktok_title");
        o.LJIIIZ(personalized_off_tiktok_desc, "personalized_off_tiktok_desc");
        this.title = title;
        this.personalized_title = personalized_title;
        this.personalized_desc = personalized_desc;
        this.personalized_link = personalized_link;
        this.personalized_link_text = personalized_link_text;
        this.generic_title = generic_title;
        this.generic_desc = generic_desc;
        this.personalized_off_tiktok_title = personalized_off_tiktok_title;
        this.personalized_off_tiktok_desc = personalized_off_tiktok_desc;
    }
}
