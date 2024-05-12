package com.ss.android.ugc.aweme.im.message.template.card;

import X.V0N;
import X.V3T;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.AnswerStatusComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public enum AnswerStatusComponent implements BaseComponent<V3T> {
    ANSWER_NORMAL(V3T.AnswerNormal.getValue()),
    ANSWER_TIMEOUT(V3T.AnswerTimeout.getValue()),
    ANSWER_BAD_WORD(V3T.AnswerBadWord.getValue()),
    ANSWER_RISK_QUESTION(V3T.AnswerRiskQuestion.getValue());

    public static final Parcelable.Creator<AnswerStatusComponent> CREATOR = new Parcelable.Creator<AnswerStatusComponent>() { // from class: X.V3U
        @Override // android.os.Parcelable.Creator
        public final AnswerStatusComponent createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return AnswerStatusComponent.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AnswerStatusComponent[] newArray(int i) {
            return new AnswerStatusComponent[i];
        }
    };
    public final int value;

    public static AnswerStatusComponent valueOf(String str) {
        return (AnswerStatusComponent) V0N.LJJJ(AnswerStatusComponent.class, str);
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
    public V3T m126toProto() {
        V3T fromValue = V3T.fromValue(this.value);
        o.LJIIIIZZ(fromValue, "fromValue(value)");
        return fromValue;
    }

    public final int getValue() {
        return this.value;
    }

    AnswerStatusComponent(int i) {
        this.value = i;
    }
}
