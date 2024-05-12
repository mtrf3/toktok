package com.ss.android.ugc.aweme.ecommerce.api.model;

import X.C26763Aet;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class InputBoxHintContent implements Parcelable {
    public static final Parcelable.Creator<InputBoxHintContent> CREATOR = new C26763Aet();

    @InterfaceC65349Pkn("hint_message")
    public final String hintMessage;

    @InterfaceC65349Pkn("input_box_hint_type")
    public final Integer inputBoxHintType;

    @InterfaceC65349Pkn("input_box_key")
    public final String inputBoxKey;

    public static /* synthetic */ InputBoxHintContent copy$default(InputBoxHintContent inputBoxHintContent, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = inputBoxHintContent.inputBoxHintType;
        }
        if ((i & 2) != 0) {
            str = inputBoxHintContent.inputBoxKey;
        }
        if ((i & 4) != 0) {
            str2 = inputBoxHintContent.hintMessage;
        }
        return inputBoxHintContent.copy(num, str, str2);
    }

    public final InputBoxHintContent copy(Integer num, String str, String str2) {
        return new InputBoxHintContent(num, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputBoxHintContent)) {
            return false;
        }
        InputBoxHintContent inputBoxHintContent = (InputBoxHintContent) obj;
        return o.LJ(this.inputBoxHintType, inputBoxHintContent.inputBoxHintType) && o.LJ(this.inputBoxKey, inputBoxHintContent.inputBoxKey) && o.LJ(this.hintMessage, inputBoxHintContent.hintMessage);
    }

    public int hashCode() {
        Integer num = this.inputBoxHintType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.inputBoxKey;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.hintMessage;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        Integer num = this.inputBoxHintType;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.inputBoxKey);
        out.writeString(this.hintMessage);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InputBoxHintContent(inputBoxHintType=");
        LIZ.append(this.inputBoxHintType);
        LIZ.append(", inputBoxKey=");
        LIZ.append(this.inputBoxKey);
        LIZ.append(", hintMessage=");
        return q.LIZIZ(LIZ, this.hintMessage, ')', LIZ);
    }

    public final String getHintMessage() {
        return this.hintMessage;
    }

    public final Integer getInputBoxHintType() {
        return this.inputBoxHintType;
    }

    public final String getInputBoxKey() {
        return this.inputBoxKey;
    }

    public InputBoxHintContent(Integer num, String str, String str2) {
        this.inputBoxHintType = num;
        this.inputBoxKey = str;
        this.hintMessage = str2;
    }
}
