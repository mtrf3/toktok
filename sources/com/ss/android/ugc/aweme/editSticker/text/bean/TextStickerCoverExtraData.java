package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerCoverExtraData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TextStickerCoverExtraData extends F9E implements Parcelable {
    public static final Parcelable.Creator<TextStickerCoverExtraData> CREATOR = new Parcelable.Creator<TextStickerCoverExtraData>() { // from class: X.5Zp
        @Override // android.os.Parcelable.Creator
        public final TextStickerCoverExtraData createFromParcel(Parcel parcel) {
            boolean z;
            o.LJIIIZ(parcel, "parcel");
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new TextStickerCoverExtraData(z);
        }

        @Override // android.os.Parcelable.Creator
        public final TextStickerCoverExtraData[] newArray(int i) {
            return new TextStickerCoverExtraData[i];
        }
    };
    public final boolean isPortrait;

    public TextStickerCoverExtraData() {
        this(false, 1, null);
    }

    public static /* synthetic */ TextStickerCoverExtraData copy$default(TextStickerCoverExtraData textStickerCoverExtraData, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = textStickerCoverExtraData.isPortrait;
        }
        return textStickerCoverExtraData.copy(z);
    }

    public final TextStickerCoverExtraData copy(boolean z) {
        return new TextStickerCoverExtraData(z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isPortrait)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.isPortrait ? 1 : 0);
    }

    public final boolean isPortrait() {
        return this.isPortrait;
    }

    public TextStickerCoverExtraData(boolean z) {
        this.isPortrait = z;
    }

    public /* synthetic */ TextStickerCoverExtraData(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
