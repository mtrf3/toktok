package com.ss.android.ugc.aweme.editSticker.model;

import X.C41782GaY;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CreateAwemeCoverInfo extends F9E implements Parcelable, Serializable {
    public static final Parcelable.Creator<CreateAwemeCoverInfo> CREATOR = new C41782GaY();

    @InterfaceC65349Pkn("cover_text_attr")
    public final CreateAwemeCoverTextAttr coverTextAttr;

    @InterfaceC65349Pkn("is_cover_positioned")
    public final int isCoverPositioned;

    @InterfaceC65349Pkn("is_cover_text")
    public final int isCoverText;

    public static /* synthetic */ CreateAwemeCoverInfo copy$default(CreateAwemeCoverInfo createAwemeCoverInfo, int i, int i2, CreateAwemeCoverTextAttr createAwemeCoverTextAttr, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = createAwemeCoverInfo.isCoverText;
        }
        if ((i3 & 2) != 0) {
            i2 = createAwemeCoverInfo.isCoverPositioned;
        }
        if ((i3 & 4) != 0) {
            createAwemeCoverTextAttr = createAwemeCoverInfo.coverTextAttr;
        }
        return createAwemeCoverInfo.copy(i, i2, createAwemeCoverTextAttr);
    }

    public final CreateAwemeCoverInfo copy(int i, int i2, CreateAwemeCoverTextAttr coverTextAttr) {
        o.LJIIIZ(coverTextAttr, "coverTextAttr");
        return new CreateAwemeCoverInfo(i, i2, coverTextAttr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.isCoverText), Integer.valueOf(this.isCoverPositioned), this.coverTextAttr};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeInt(this.isCoverText);
        parcel.writeInt(this.isCoverPositioned);
        this.coverTextAttr.writeToParcel(parcel, 0);
    }

    public final CreateAwemeCoverTextAttr getCoverTextAttr() {
        return this.coverTextAttr;
    }

    public final int isCoverPositioned() {
        return this.isCoverPositioned;
    }

    public final int isCoverText() {
        return this.isCoverText;
    }

    public CreateAwemeCoverInfo(int i, int i2, CreateAwemeCoverTextAttr coverTextAttr) {
        o.LJIIIZ(coverTextAttr, "coverTextAttr");
        this.isCoverText = i;
        this.isCoverPositioned = i2;
        this.coverTextAttr = coverTextAttr;
    }
}
