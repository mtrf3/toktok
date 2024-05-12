package com.ss.android.ugc.aweme.infosticker;

import X.H7W;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class InfoStickerCategoryParams implements Serializable, Parcelable {
    public static final H7W CREATOR = new H7W();

    @InterfaceC65349Pkn("info_sticker_category")
    public LinkedHashMap<String, String> infoStickerCategoryMap;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public InfoStickerCategoryParams() {
        this.infoStickerCategoryMap = new LinkedHashMap<>();
    }

    public final LinkedHashMap<String, String> getInfoStickerCategoryMap() {
        return this.infoStickerCategoryMap;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InfoStickerCategoryParams(Parcel parcel) {
        this();
        o.LJIIIZ(parcel, "parcel");
        Serializable readSerializable = parcel.readSerializable();
        o.LJII(readSerializable, "null cannot be cast to non-null type java.util.LinkedHashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.LinkedHashMap<kotlin.String, kotlin.String> }");
        this.infoStickerCategoryMap = (LinkedHashMap) readSerializable;
    }

    public final void setInfoStickerCategoryMap(LinkedHashMap<String, String> linkedHashMap) {
        o.LJIIIZ(linkedHashMap, "<set-?>");
        this.infoStickerCategoryMap = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        o.LJIIIZ(dest, "dest");
        dest.writeSerializable(this.infoStickerCategoryMap);
    }
}
