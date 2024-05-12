package com.ss.android.ugc.aweme.im.message.template.component;

import X.EnumC79088V2e;
import X.V0N;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewIconTypeComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public enum PreviewIconTypeComponent implements BaseComponent<EnumC79088V2e> {
    NOICON(EnumC79088V2e.NoIcon.getValue()),
    PLAYICON(EnumC79088V2e.PlayIcon.getValue());

    public static final Parcelable.Creator<PreviewIconTypeComponent> CREATOR = new Parcelable.Creator<PreviewIconTypeComponent>() { // from class: X.V2f
        @Override // android.os.Parcelable.Creator
        public final PreviewIconTypeComponent createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return PreviewIconTypeComponent.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PreviewIconTypeComponent[] newArray(int i) {
            return new PreviewIconTypeComponent[i];
        }
    };
    public final int value;

    public static PreviewIconTypeComponent valueOf(String str) {
        return (PreviewIconTypeComponent) V0N.LJJJ(PreviewIconTypeComponent.class, str);
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
    public EnumC79088V2e m131toProto() {
        return EnumC79088V2e.fromValue(this.value);
    }

    public final int getValue() {
        return this.value;
    }

    PreviewIconTypeComponent(int i) {
        this.value = i;
    }
}
