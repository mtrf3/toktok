package com.ss.android.ugc.aweme.im.message.template.component;

import X.V0N;
import X.V2T;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.QuotePreviewTypeComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public enum QuotePreviewTypeComponent implements BaseComponent<V2T> {
    TEXT(V2T.TEXT.getValue()),
    PICTURE(V2T.PICTURE.getValue());

    public static final Parcelable.Creator<QuotePreviewTypeComponent> CREATOR = new Parcelable.Creator<QuotePreviewTypeComponent>() { // from class: X.V2V
        @Override // android.os.Parcelable.Creator
        public final QuotePreviewTypeComponent createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return QuotePreviewTypeComponent.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final QuotePreviewTypeComponent[] newArray(int i) {
            return new QuotePreviewTypeComponent[i];
        }
    };
    public final int value;

    public static QuotePreviewTypeComponent valueOf(String str) {
        return (QuotePreviewTypeComponent) V0N.LJJJ(QuotePreviewTypeComponent.class, str);
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
    public V2T m132toProto() {
        return V2T.fromValue(this.value);
    }

    public final int getValue() {
        return this.value;
    }

    QuotePreviewTypeComponent(int i) {
        this.value = i;
    }
}
