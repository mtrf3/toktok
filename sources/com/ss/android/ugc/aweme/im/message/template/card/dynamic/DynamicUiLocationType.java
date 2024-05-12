package com.ss.android.ugc.aweme.im.message.template.card.dynamic;

import X.V0N;
import X.V3G;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicUiLocationType;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public enum DynamicUiLocationType implements BaseComponent<V3G> {
    MESSAGE_NORMAL(V3G.MessageNormal.getValue()),
    MESSAGE_CENTER(V3G.MessageCenter.getValue()),
    BANNER_TOP(V3G.BannerTop.getValue()),
    BANNER_BOTTOM(V3G.BannerBottom.getValue()),
    POPUP_TOP(V3G.PopupTop.getValue()),
    POPUP_BOTTOM(V3G.PopupBottom.getValue());

    public static final Parcelable.Creator<DynamicUiLocationType> CREATOR = new Parcelable.Creator<DynamicUiLocationType>() { // from class: X.V3H
        @Override // android.os.Parcelable.Creator
        public final DynamicUiLocationType createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return DynamicUiLocationType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DynamicUiLocationType[] newArray(int i) {
            return new DynamicUiLocationType[i];
        }
    };
    public final int value;

    public static DynamicUiLocationType valueOf(String str) {
        return (DynamicUiLocationType) V0N.LJJJ(DynamicUiLocationType.class, str);
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
    public V3G m127toProto() {
        V3G fromValue = V3G.fromValue(this.value);
        o.LJIIIIZZ(fromValue, "fromValue(value)");
        return fromValue;
    }

    public final int getValue() {
        return this.value;
    }

    DynamicUiLocationType(int i) {
        this.value = i;
    }
}
