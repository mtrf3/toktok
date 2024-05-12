package com.ss.android.ugc.aweme.im.message.template.card.infocard;

import X.V0N;
import X.V3D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.CardButtonType;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public enum CardButtonType implements BaseComponent<V3D> {
    DEFAULT(V3D.DEFAULT.getValue()),
    CLICKABLE_TEXT(V3D.CLICKABLE_TEXT.getValue());

    public static final Parcelable.Creator<CardButtonType> CREATOR = new Parcelable.Creator<CardButtonType>() { // from class: X.V3E
        @Override // android.os.Parcelable.Creator
        public final CardButtonType createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return CardButtonType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CardButtonType[] newArray(int i) {
            return new CardButtonType[i];
        }
    };
    public final int value;

    public static CardButtonType valueOf(String str) {
        return (CardButtonType) V0N.LJJJ(CardButtonType.class, str);
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
    public V3D m128toProto() {
        V3D fromValue = V3D.fromValue(this.value);
        o.LJIIIIZZ(fromValue, "fromValue(value)");
        return fromValue;
    }

    public final int getValue() {
        return this.value;
    }

    CardButtonType(int i) {
        this.value = i;
    }
}
