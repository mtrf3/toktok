package com.ss.android.ugc.aweme.im.message.template.component;

import X.V0N;
import X.V3O;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverType;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public enum VideoCoverType implements BaseComponent<V3O> {
    INVALID(-1),
    VIDEO(V3O.Video.getValue()),
    LIVE(V3O.Live.getValue());

    public static final Parcelable.Creator<VideoCoverType> CREATOR = new Parcelable.Creator<VideoCoverType>() { // from class: X.V3P
        @Override // android.os.Parcelable.Creator
        public final VideoCoverType createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return VideoCoverType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoCoverType[] newArray(int i) {
            return new VideoCoverType[i];
        }
    };
    public final int value;

    public static VideoCoverType valueOf(String str) {
        return (VideoCoverType) V0N.LJJJ(VideoCoverType.class, str);
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

    /* renamed from: toProto, reason: merged with bridge method [inline-methods] */
    public V3O m133toProto() {
        return V3O.fromValue(this.value);
    }

    public final int getValue() {
        return this.value;
    }

    VideoCoverType(int i) {
        this.value = i;
    }
}
