package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMobModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TextMobModel extends F9E implements Parcelable {
    public static final Parcelable.Creator<TextMobModel> CREATOR = new Parcelable.Creator<TextMobModel>() { // from class: X.5V6
        @Override // android.os.Parcelable.Creator
        public final TextMobModel createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new TextMobModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TextMobModel[] newArray(int i) {
            return new TextMobModel[i];
        }
    };

    @InterfaceC65349Pkn("is_editorpro_adjust_text_color")
    public String adjustTextColorInEditorPro;

    @InterfaceC65349Pkn("is_editorpro_adjust_text_font")
    public String adjustTextFontInEditorPro;

    @InterfaceC65349Pkn("is_editorpro_adjust_text_paragraph")
    public String adjustTextParagraph;

    @InterfaceC65349Pkn("is_editorpro_adjust_text_position")
    public String adjustTextPositionInEditorPro;

    @InterfaceC65349Pkn("is_editorpro_adjust_text_style")
    public String adjustTextStyleInEditorPro;

    @InterfaceC65349Pkn("is_editorpro_copy_text")
    public String isEditorProCopyText;

    @InterfaceC65349Pkn("is_editorpro_trim_text_length")
    public String isEditorProTrimLength;

    /* JADX WARN: Multi-variable type inference failed */
    public TextMobModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.adjustTextStyleInEditorPro, this.adjustTextParagraph, this.adjustTextFontInEditorPro, this.adjustTextColorInEditorPro, this.adjustTextPositionInEditorPro, this.isEditorProTrimLength, this.isEditorProCopyText};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.adjustTextStyleInEditorPro);
        out.writeString(this.adjustTextParagraph);
        out.writeString(this.adjustTextFontInEditorPro);
        out.writeString(this.adjustTextColorInEditorPro);
        out.writeString(this.adjustTextPositionInEditorPro);
        out.writeString(this.isEditorProTrimLength);
        out.writeString(this.isEditorProCopyText);
    }

    public TextMobModel(String adjustTextStyleInEditorPro, String adjustTextParagraph, String adjustTextFontInEditorPro, String adjustTextColorInEditorPro, String adjustTextPositionInEditorPro, String isEditorProTrimLength, String isEditorProCopyText) {
        o.LJIIIZ(adjustTextStyleInEditorPro, "adjustTextStyleInEditorPro");
        o.LJIIIZ(adjustTextParagraph, "adjustTextParagraph");
        o.LJIIIZ(adjustTextFontInEditorPro, "adjustTextFontInEditorPro");
        o.LJIIIZ(adjustTextColorInEditorPro, "adjustTextColorInEditorPro");
        o.LJIIIZ(adjustTextPositionInEditorPro, "adjustTextPositionInEditorPro");
        o.LJIIIZ(isEditorProTrimLength, "isEditorProTrimLength");
        o.LJIIIZ(isEditorProCopyText, "isEditorProCopyText");
        this.adjustTextStyleInEditorPro = adjustTextStyleInEditorPro;
        this.adjustTextParagraph = adjustTextParagraph;
        this.adjustTextFontInEditorPro = adjustTextFontInEditorPro;
        this.adjustTextColorInEditorPro = adjustTextColorInEditorPro;
        this.adjustTextPositionInEditorPro = adjustTextPositionInEditorPro;
        this.isEditorProTrimLength = isEditorProTrimLength;
        this.isEditorProCopyText = isEditorProCopyText;
    }

    public /* synthetic */ TextMobModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CardStruct.IStatusCode.DEFAULT : str, (i & 2) != 0 ? CardStruct.IStatusCode.DEFAULT : str2, (i & 4) != 0 ? CardStruct.IStatusCode.DEFAULT : str3, (i & 8) != 0 ? CardStruct.IStatusCode.DEFAULT : str4, (i & 16) != 0 ? CardStruct.IStatusCode.DEFAULT : str5, (i & 32) != 0 ? CardStruct.IStatusCode.DEFAULT : str6, (i & 64) == 0 ? str7 : CardStruct.IStatusCode.DEFAULT);
    }
}
