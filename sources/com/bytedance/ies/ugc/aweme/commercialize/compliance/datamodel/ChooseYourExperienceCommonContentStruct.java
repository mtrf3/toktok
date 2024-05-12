package com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel;

import X.GKS;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ChooseYourExperienceCommonContentStruct implements Parcelable {
    public static final Parcelable.Creator<ChooseYourExperienceCommonContentStruct> CREATOR = new GKS();

    @InterfaceC65349Pkn("button_text")
    public final String button_text;

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("link")
    public final String link;

    @InterfaceC65349Pkn("link_text")
    public final String link_text;

    @InterfaceC65349Pkn("sub_title")
    public final String sub_title;

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
        out.writeString(this.sub_title);
        out.writeString(this.desc);
        out.writeString(this.link_text);
        out.writeString(this.link);
        out.writeString(this.button_text);
    }

    public ChooseYourExperienceCommonContentStruct(String title, String sub_title, String desc, String link_text, String link, String button_text) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(sub_title, "sub_title");
        o.LJIIIZ(desc, "desc");
        o.LJIIIZ(link_text, "link_text");
        o.LJIIIZ(link, "link");
        o.LJIIIZ(button_text, "button_text");
        this.title = title;
        this.sub_title = sub_title;
        this.desc = desc;
        this.link_text = link_text;
        this.link = link;
        this.button_text = button_text;
    }
}
