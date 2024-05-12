package com.ss.android.ugc.aweme.model;

import X.V0N;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public enum PostModeEntranceMechanism implements Parcelable {
    SEE_MORE_BTN("click_see_more"),
    RED_BUBBLE("click_red_bubble"),
    EXPLORE_CARD("click_explore_card"),
    TAP_TEXT("tap_text"),
    TAP_PHOTO("tap_photo"),
    TAP_THUMBNAIL("tap_thumbnail"),
    SLIDE_LEFT("slide_left"),
    PINCH("pinch");

    public static final Parcelable.Creator<PostModeEntranceMechanism> CREATOR = new Parcelable.Creator<PostModeEntranceMechanism>() { // from class: X.812
        @Override // android.os.Parcelable.Creator
        public final PostModeEntranceMechanism createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return PostModeEntranceMechanism.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PostModeEntranceMechanism[] newArray(int i) {
            return new PostModeEntranceMechanism[i];
        }
    };
    public final String value;

    public static PostModeEntranceMechanism valueOf(String str) {
        return (PostModeEntranceMechanism) V0N.LJJJ(PostModeEntranceMechanism.class, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(name());
    }

    public final String getValue() {
        return this.value;
    }

    PostModeEntranceMechanism(String str) {
        this.value = str;
    }
}
