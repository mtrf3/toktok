package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TextFontModel extends F9E implements Parcelable {
    public static final Parcelable.Creator<TextFontModel> CREATOR = new Parcelable.Creator<TextFontModel>() { // from class: X.5Zl
        @Override // android.os.Parcelable.Creator
        public final TextFontModel createFromParcel(Parcel parcel) {
            boolean z;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            return new TextFontModel(readString, readString2, readString3, readString4, readInt, readString5, readString6, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final TextFontModel[] newArray(int i) {
            return new TextFontModel[i];
        }
    };

    @InterfaceC65349Pkn("enable_bg_color")
    public final boolean enableBgColor;

    @InterfaceC65349Pkn("enable_maskblur_light_color")
    public final boolean enableMaskBlurLightColor;

    @InterfaceC65349Pkn("file_name")
    public final String fileName;

    @InterfaceC65349Pkn("font_id")
    public final String fontId;

    @InterfaceC65349Pkn("font_name")
    public final String fontName;

    @InterfaceC65349Pkn("font_res_id")
    public final String fontResId;

    @InterfaceC65349Pkn("font_size")
    public final int fontSize;

    @InterfaceC65349Pkn("font_title")
    public final String fontTitle;

    @InterfaceC65349Pkn("local_path")
    public final String localPath;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextFontModel() {
        /*
            r12 = this;
            r1 = 0
            r5 = 0
            r10 = 511(0x1ff, float:7.16E-43)
            r0 = r12
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r1
            r7 = r1
            r8 = r5
            r9 = r5
            r11 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.fontId, this.fontResId, this.fontName, this.fontTitle, Integer.valueOf(this.fontSize), this.fileName, this.localPath, Boolean.valueOf(this.enableBgColor), Boolean.valueOf(this.enableMaskBlurLightColor)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.fontId);
        out.writeString(this.fontResId);
        out.writeString(this.fontName);
        out.writeString(this.fontTitle);
        out.writeInt(this.fontSize);
        out.writeString(this.fileName);
        out.writeString(this.localPath);
        out.writeInt(this.enableBgColor ? 1 : 0);
        out.writeInt(this.enableMaskBlurLightColor ? 1 : 0);
    }

    public TextFontModel(String fontId, String fontResId, String fontName, String fontTitle, int i, String fileName, String localPath, boolean z, boolean z2) {
        o.LJIIIZ(fontId, "fontId");
        o.LJIIIZ(fontResId, "fontResId");
        o.LJIIIZ(fontName, "fontName");
        o.LJIIIZ(fontTitle, "fontTitle");
        o.LJIIIZ(fileName, "fileName");
        o.LJIIIZ(localPath, "localPath");
        this.fontId = fontId;
        this.fontResId = fontResId;
        this.fontName = fontName;
        this.fontTitle = fontTitle;
        this.fontSize = i;
        this.fileName = fileName;
        this.localPath = localPath;
        this.enableBgColor = z;
        this.enableMaskBlurLightColor = z2;
    }

    public static TextFontModel L(TextFontModel textFontModel, String str, String str2, String str3, int i, String str4, String str5, boolean z, boolean z2, int i2) {
        String fontResId;
        boolean z3 = z2;
        boolean z4 = z;
        String fontName = str2;
        String fontId = str;
        String fontTitle = str3;
        int i3 = i;
        String fileName = str4;
        String localPath = str5;
        if ((i2 & 1) != 0) {
            fontId = textFontModel.fontId;
        }
        if ((i2 & 2) != 0) {
            fontResId = textFontModel.fontResId;
        } else {
            fontResId = null;
        }
        if ((i2 & 4) != 0) {
            fontName = textFontModel.fontName;
        }
        if ((i2 & 8) != 0) {
            fontTitle = textFontModel.fontTitle;
        }
        if ((i2 & 16) != 0) {
            i3 = textFontModel.fontSize;
        }
        if ((i2 & 32) != 0) {
            fileName = textFontModel.fileName;
        }
        if ((i2 & 64) != 0) {
            localPath = textFontModel.localPath;
        }
        if ((i2 & 128) != 0) {
            z4 = textFontModel.enableBgColor;
        }
        if ((i2 & 256) != 0) {
            z3 = textFontModel.enableMaskBlurLightColor;
        }
        textFontModel.getClass();
        o.LJIIIZ(fontId, "fontId");
        o.LJIIIZ(fontResId, "fontResId");
        o.LJIIIZ(fontName, "fontName");
        o.LJIIIZ(fontTitle, "fontTitle");
        o.LJIIIZ(fileName, "fileName");
        o.LJIIIZ(localPath, "localPath");
        return new TextFontModel(fontId, fontResId, fontName, fontTitle, i3, fileName, localPath, z4, z3);
    }

    public /* synthetic */ TextFontModel(String str, String str2, String str3, String str4, int i, String str5, String str6, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? 28 : i, (i2 & 32) != 0 ? "" : str5, (i2 & 64) == 0 ? str6 : "", (i2 & 128) != 0 ? true : z, (i2 & 256) != 0 ? false : z2);
    }
}
