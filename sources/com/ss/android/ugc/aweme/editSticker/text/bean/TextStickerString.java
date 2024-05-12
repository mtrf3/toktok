package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerString;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TextStickerString implements Parcelable {
    public static final Parcelable.Creator<TextStickerString> CREATOR = new Parcelable.Creator<TextStickerString>() { // from class: X.68a
        @Override // android.os.Parcelable.Creator
        public final TextStickerString createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new TextStickerString(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TextStickerString[] newArray(int i) {
            return new TextStickerString[i];
        }
    };
    public final String str;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.str);
    }

    public final String getStr() {
        return this.str;
    }

    public TextStickerString(String str) {
        o.LJIIIZ(str, "str");
        this.str = str;
    }
}
