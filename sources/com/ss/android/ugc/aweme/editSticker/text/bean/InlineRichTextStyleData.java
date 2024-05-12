package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyle;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyleData;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class InlineRichTextStyleData implements Parcelable {
    public static final Parcelable.Creator<InlineRichTextStyleData> CREATOR = new Parcelable.Creator<InlineRichTextStyleData>() { // from class: X.6Et
        @Override // android.os.Parcelable.Creator
        public final InlineRichTextStyleData createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new InlineRichTextStyleData(parcel.readInt(), parcel.readInt(), (InlineRichTextStyle) parcel.readParcelable(InlineRichTextStyleData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final InlineRichTextStyleData[] newArray(int i) {
            return new InlineRichTextStyleData[i];
        }
    };

    @InterfaceC65349Pkn("end")
    public final int end;

    @InterfaceC65349Pkn("inline_style")
    public final InlineRichTextStyle inlineStyle;

    @InterfaceC65349Pkn("start")
    public final int start;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.start);
        out.writeInt(this.end);
        out.writeParcelable(this.inlineStyle, i);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InlineTextStyleData(start=");
        LIZ.append(this.start);
        LIZ.append(", end=");
        LIZ.append(this.end);
        LIZ.append(", inlineStyle=");
        LIZ.append(this.inlineStyle);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public InlineRichTextStyleData(int i, int i2, InlineRichTextStyle inlineStyle) {
        o.LJIIIZ(inlineStyle, "inlineStyle");
        this.start = i;
        this.end = i2;
        this.inlineStyle = inlineStyle;
    }
}
