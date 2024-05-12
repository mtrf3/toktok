package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import com.ss.android.ugc.aweme.editSticker.text.bean.ForegroundColorStyle;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class ForegroundColorStyle extends InlineRichTextStyle {
    public static final Parcelable.Creator<ForegroundColorStyle> CREATOR = new Parcelable.Creator<ForegroundColorStyle>() { // from class: X.6F1
        @Override // android.os.Parcelable.Creator
        public final ForegroundColorStyle createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new ForegroundColorStyle(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ForegroundColorStyle[] newArray(int i) {
            return new ForegroundColorStyle[i];
        }
    };

    @InterfaceC65349Pkn("color")
    public final int color;

    @Override // com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyle, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.color);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyle
    public final CharacterStyle LIZ() {
        return new ForegroundColorSpan(this.color);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ForegroundColorStyle(color=");
        LIZ.append(this.color);
        LIZ.append(", type='");
        return JBR.LJFF(LIZ, this.type, "')", LIZ);
    }

    public ForegroundColorStyle(int i) {
        super("ForegroundColorStyle");
        this.color = i;
    }
}
