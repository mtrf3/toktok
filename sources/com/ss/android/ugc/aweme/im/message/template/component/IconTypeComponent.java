package com.ss.android.ugc.aweme.im.message.template.component;

import X.EnumC79091V2h;
import X.V0N;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public enum IconTypeComponent implements BaseComponent<EnumC79091V2h> {
    DEFAULT(EnumC79091V2h.Default.getValue()),
    SERVER_ERROR(EnumC79091V2h.ServerError.getValue()),
    MODERATION(EnumC79091V2h.Moderation.getValue()),
    LOADING(EnumC79091V2h.Loading.getValue()),
    RESTRICTED(EnumC79091V2h.Restricted.getValue()),
    ABNORMAL(EnumC79091V2h.Abnormal.getValue());

    public static final Parcelable.Creator<IconTypeComponent> CREATOR = new Parcelable.Creator<IconTypeComponent>() { // from class: X.V2i
        @Override // android.os.Parcelable.Creator
        public final IconTypeComponent createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return IconTypeComponent.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IconTypeComponent[] newArray(int i) {
            return new IconTypeComponent[i];
        }
    };
    public final int value;

    public static IconTypeComponent valueOf(String str) {
        return (IconTypeComponent) V0N.LJJJ(IconTypeComponent.class, str);
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
    public EnumC79091V2h m130toProto() {
        return EnumC79091V2h.fromValue(this.value);
    }

    public final int getValue() {
        return this.value;
    }

    IconTypeComponent(int i) {
        this.value = i;
    }
}
