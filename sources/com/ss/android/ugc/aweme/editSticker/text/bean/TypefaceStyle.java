package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C43588H8u;
import X.C68M;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.CharacterStyle;
import com.ss.android.ugc.aweme.editSticker.text.bean.TypefaceStyle;
import com.ss.android.ugc.aweme.editSticker.text.view.CustomTypefaceSpan;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TypefaceStyle extends InlineRichTextStyle {
    public static final Parcelable.Creator<TypefaceStyle> CREATOR = new Parcelable.Creator<TypefaceStyle>() { // from class: X.69H
        @Override // android.os.Parcelable.Creator
        public final TypefaceStyle createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new TypefaceStyle(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TypefaceStyle[] newArray(int i) {
            return new TypefaceStyle[i];
        }
    };

    @InterfaceC65349Pkn("font_id")
    public final String fontId;

    @InterfaceC65349Pkn("font_path")
    public final String fontPath;

    @InterfaceC65349Pkn("font_res_id")
    public String fontResId;

    @InterfaceC65349Pkn("font_name")
    public final String fontType;

    @Override // com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyle, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.fontType);
        out.writeString(this.fontId);
        out.writeString(this.fontResId);
        out.writeString(this.fontPath);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyle
    public final CharacterStyle LIZ() {
        try {
            Typeface typeface = C68M.LJIIJ().LJIIL(this.fontType);
            String str = this.fontType;
            o.LJIIIIZZ(typeface, "typeface");
            return new CustomTypefaceSpan(typeface, str);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Get Font Failed fontName = ");
            LIZ.append(this.fontType);
            throw new RuntimeException(X1D.LIZIZ(LIZ), e);
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TypefaceStyle(fontType='");
        LIZ.append(this.fontType);
        LIZ.append("', fontId='");
        LIZ.append(this.fontId);
        LIZ.append("', fontResId='");
        LIZ.append(this.fontResId);
        LIZ.append("', fontPath='");
        LIZ.append(this.fontPath);
        LIZ.append("', type='");
        return JBR.LJFF(LIZ, this.type, "')", LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypefaceStyle(String str, String str2, String str3, String str4) {
        super("TypefaceStyle");
        C43588H8u.LIZLLL(str, "fontType", str2, "fontId", str3, "fontResId", str4, "fontPath");
        this.fontType = str;
        this.fontId = str2;
        this.fontResId = str3;
        this.fontPath = str4;
    }
}
