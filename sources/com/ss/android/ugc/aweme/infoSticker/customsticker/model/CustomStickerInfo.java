package com.ss.android.ugc.aweme.infoSticker.customsticker.model;

import X.C221108m2;
import X.C43155Gwh;
import X.C48339Iy7;
import X.C5H3;
import X.C79062V1e;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CustomStickerInfo implements Parcelable {
    public static final Parcelable.Creator<CustomStickerInfo> CREATOR = new C43155Gwh();
    public final boolean cutout;
    public final int height;
    public final C5H3 map$delegate;
    public final String path;
    public final String stickerId;
    public final int width;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomStickerInfo)) {
            return false;
        }
        CustomStickerInfo customStickerInfo = (CustomStickerInfo) obj;
        return o.LJ(this.stickerId, customStickerInfo.stickerId) && o.LJ(this.path, customStickerInfo.path) && this.width == customStickerInfo.width && this.height == customStickerInfo.height && this.cutout == customStickerInfo.cutout;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.stickerId);
        out.writeString(this.path);
        out.writeInt(this.width);
        out.writeInt(this.height);
        out.writeInt(this.cutout ? 1 : 0);
    }

    public final HashMap<String, String> LIZ() {
        return (HashMap) this.map$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        String str = this.stickerId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ = (((C79062V1e.LJ(this.path, hashCode * 31, 31) + this.width) * 31) + this.height) * 31;
        boolean z = this.cutout;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return LJ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CustomStickerInfo(stickerId=");
        LIZ.append(this.stickerId);
        LIZ.append(", path=");
        LIZ.append(this.path);
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        LIZ.append(this.height);
        LIZ.append(", cutout=");
        return C48339Iy7.LIZJ(LIZ, this.cutout, ')', LIZ);
    }

    public CustomStickerInfo(String str, String path, int i, int i2, boolean z) {
        o.LJIIIZ(path, "path");
        this.stickerId = str;
        this.path = path;
        this.width = i;
        this.height = i2;
        this.cutout = z;
        this.map$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 128));
    }
}
