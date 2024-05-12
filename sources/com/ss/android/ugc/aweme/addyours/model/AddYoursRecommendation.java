package com.ss.android.ugc.aweme.addyours.model;

import X.C05040Hs;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.addyours.model.AddYoursRecommendation;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AddYoursRecommendation implements Serializable, Parcelable {
    public static final Parcelable.Creator<AddYoursRecommendation> CREATOR = new Parcelable.Creator<AddYoursRecommendation>() { // from class: X.8ul
        @Override // android.os.Parcelable.Creator
        public final AddYoursRecommendation createFromParcel(Parcel parcel) {
            Long valueOf;
            o.LJIIIZ(parcel, "parcel");
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(parcel.readLong());
            }
            return new AddYoursRecommendation(valueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddYoursRecommendation[] newArray(int i) {
            return new AddYoursRecommendation[i];
        }
    };

    @InterfaceC65349Pkn("topic_id")
    public Long topicId;

    @InterfaceC65349Pkn("topic_text")
    public String topicText;

    /* JADX WARN: Multi-variable type inference failed */
    public AddYoursRecommendation() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Long getTopicId() {
        return this.topicId;
    }

    public final String getTopicText() {
        return this.topicText;
    }

    public AddYoursRecommendation(Long l, String str) {
        this.topicId = l;
        this.topicText = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Long l = this.topicId;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        out.writeString(this.topicText);
    }

    public /* synthetic */ AddYoursRecommendation(Long l, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str);
    }
}
