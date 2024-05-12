package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextUnderlineIndexRange;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TextStickerTextUnderlineIndexRange implements Parcelable, Cloneable {
    public static final Parcelable.Creator<TextStickerTextUnderlineIndexRange> CREATOR = new Parcelable.Creator<TextStickerTextUnderlineIndexRange>() { // from class: X.68b
        @Override // android.os.Parcelable.Creator
        public final TextStickerTextUnderlineIndexRange createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new TextStickerTextUnderlineIndexRange(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final TextStickerTextUnderlineIndexRange[] newArray(int i) {
            return new TextStickerTextUnderlineIndexRange[i];
        }
    };
    public int end;
    public int start;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.start);
        out.writeInt(this.end);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public TextStickerTextUnderlineIndexRange m111clone() {
        return new TextStickerTextUnderlineIndexRange(this.start, this.end);
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public int hashCode() {
        return this.start;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStickerTextUnderlineIndexRange)) {
            return false;
        }
        TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange = (TextStickerTextUnderlineIndexRange) obj;
        if (this.start == textStickerTextUnderlineIndexRange.start && this.end == textStickerTextUnderlineIndexRange.end) {
            return true;
        }
        return false;
    }

    public final boolean isValid(int i) {
        int i2;
        int i3;
        if (i > 0 && (i2 = this.start) >= 0 && (i3 = this.end) <= i && i3 - i2 > 0) {
            return true;
        }
        return false;
    }

    public final void setEnd(int i) {
        this.end = i;
    }

    public final void setStart(int i) {
        this.start = i;
    }

    public TextStickerTextUnderlineIndexRange(int i, int i2) {
        this.start = i;
        this.end = i2;
    }
}
