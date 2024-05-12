package com.bytedance.effectcreatormobile.ckeapi.api.text;

import X.C93491aRj;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class TextModel extends F9E implements Parcelable {
    public static final Parcelable.Creator<TextModel> CREATOR = new C93491aRj();

    @InterfaceC65349Pkn("text_color")
    public final String color;

    @InterfaceC65349Pkn("text_font")
    public final String fontId;

    @InterfaceC65349Pkn("text_style")
    public final TextStyle style;

    @InterfaceC65349Pkn("text_content")
    public final String text;

    @InterfaceC65349Pkn("text_align")
    public final TextAlign textAlign;

    @InterfaceC65349Pkn("text_sticker")
    public final String textSticker;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.text, this.color, this.fontId, this.style, this.textAlign, this.textSticker};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.text);
        parcel.writeString(this.color);
        parcel.writeString(this.fontId);
        parcel.writeString(this.style.name());
        parcel.writeString(this.textAlign.name());
        parcel.writeString(this.textSticker);
    }

    public TextModel(String text, String color, String fontId, TextStyle style, TextAlign textAlign, String str) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(color, "color");
        o.LJIIIZ(fontId, "fontId");
        o.LJIIIZ(style, "style");
        o.LJIIIZ(textAlign, "textAlign");
        this.text = text;
        this.color = color;
        this.fontId = fontId;
        this.style = style;
        this.textAlign = textAlign;
        this.textSticker = str;
    }
}
