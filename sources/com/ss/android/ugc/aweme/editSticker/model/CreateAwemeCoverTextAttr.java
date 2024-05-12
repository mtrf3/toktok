package com.ss.android.ugc.aweme.editSticker.model;

import X.C41783GaZ;
import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CreateAwemeCoverTextAttr extends F9E implements Parcelable, Serializable {
    public static final Parcelable.Creator<CreateAwemeCoverTextAttr> CREATOR = new C41783GaZ();

    @InterfaceC65349Pkn("cover_text_font")
    public final String coverTextFont;

    @InterfaceC65349Pkn("cover_text_id")
    public final String coverTextId;

    @InterfaceC65349Pkn("cover_text_color")
    public final String covertTextColor;

    public static /* synthetic */ CreateAwemeCoverTextAttr copy$default(CreateAwemeCoverTextAttr createAwemeCoverTextAttr, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createAwemeCoverTextAttr.coverTextId;
        }
        if ((i & 2) != 0) {
            str2 = createAwemeCoverTextAttr.coverTextFont;
        }
        if ((i & 4) != 0) {
            str3 = createAwemeCoverTextAttr.covertTextColor;
        }
        return createAwemeCoverTextAttr.copy(str, str2, str3);
    }

    public final CreateAwemeCoverTextAttr copy(String coverTextId, String coverTextFont, String covertTextColor) {
        o.LJIIIZ(coverTextId, "coverTextId");
        o.LJIIIZ(coverTextFont, "coverTextFont");
        o.LJIIIZ(covertTextColor, "covertTextColor");
        return new CreateAwemeCoverTextAttr(coverTextId, coverTextFont, covertTextColor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.coverTextId, this.coverTextFont, this.covertTextColor};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.coverTextId);
        parcel.writeString(this.coverTextFont);
        parcel.writeString(this.covertTextColor);
    }

    public final String getCoverTextFont() {
        return this.coverTextFont;
    }

    public final String getCoverTextId() {
        return this.coverTextId;
    }

    public final String getCovertTextColor() {
        return this.covertTextColor;
    }

    public CreateAwemeCoverTextAttr(String str, String str2, String str3) {
        HH1.LIZ(str, "coverTextId", str2, "coverTextFont", str3, "covertTextColor");
        this.coverTextId = str;
        this.coverTextFont = str2;
        this.covertTextColor = str3;
    }
}
