package com.ss.android.ugc.aweme.shortvideo.model;

import X.C05040Hs;
import X.C79062V1e;
import X.JBR;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ReturnEcommerceCommentModel implements Parcelable {
    public static final Parcelable.Creator<ReturnEcommerceCommentModel> CREATOR = new Creator();
    public final String compressFilePath;
    public final long fileSize;
    public final String forBase64FilePath;
    public final int index;
    public final String mediaType;
    public final String mimeType;
    public final String originFilePath;
    public final Long originFileSize;

    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<ReturnEcommerceCommentModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReturnEcommerceCommentModel createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new ReturnEcommerceCommentModel(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReturnEcommerceCommentModel[] newArray(int i) {
            return new ReturnEcommerceCommentModel[i];
        }
    }

    public static /* synthetic */ ReturnEcommerceCommentModel copy$default(ReturnEcommerceCommentModel returnEcommerceCommentModel, int i, String str, String str2, Long l, long j, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = returnEcommerceCommentModel.index;
        }
        if ((i2 & 2) != 0) {
            str = returnEcommerceCommentModel.originFilePath;
        }
        if ((i2 & 4) != 0) {
            str2 = returnEcommerceCommentModel.compressFilePath;
        }
        if ((i2 & 8) != 0) {
            l = returnEcommerceCommentModel.originFileSize;
        }
        if ((i2 & 16) != 0) {
            j = returnEcommerceCommentModel.fileSize;
        }
        if ((i2 & 32) != 0) {
            str3 = returnEcommerceCommentModel.mediaType;
        }
        if ((i2 & 64) != 0) {
            str4 = returnEcommerceCommentModel.forBase64FilePath;
        }
        if ((i2 & 128) != 0) {
            str5 = returnEcommerceCommentModel.mimeType;
        }
        return returnEcommerceCommentModel.copy(i, str, str2, l, j, str3, str4, str5);
    }

    public final ReturnEcommerceCommentModel copy(int i, String originFilePath, String compressFilePath, Long l, long j, String mediaType, String forBase64FilePath, String mimeType) {
        o.LJIIIZ(originFilePath, "originFilePath");
        o.LJIIIZ(compressFilePath, "compressFilePath");
        o.LJIIIZ(mediaType, "mediaType");
        o.LJIIIZ(forBase64FilePath, "forBase64FilePath");
        o.LJIIIZ(mimeType, "mimeType");
        return new ReturnEcommerceCommentModel(i, originFilePath, compressFilePath, l, j, mediaType, forBase64FilePath, mimeType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReturnEcommerceCommentModel)) {
            return false;
        }
        ReturnEcommerceCommentModel returnEcommerceCommentModel = (ReturnEcommerceCommentModel) obj;
        return this.index == returnEcommerceCommentModel.index && o.LJ(this.originFilePath, returnEcommerceCommentModel.originFilePath) && o.LJ(this.compressFilePath, returnEcommerceCommentModel.compressFilePath) && o.LJ(this.originFileSize, returnEcommerceCommentModel.originFileSize) && this.fileSize == returnEcommerceCommentModel.fileSize && o.LJ(this.mediaType, returnEcommerceCommentModel.mediaType) && o.LJ(this.forBase64FilePath, returnEcommerceCommentModel.forBase64FilePath) && o.LJ(this.mimeType, returnEcommerceCommentModel.mimeType);
    }

    public int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.compressFilePath, C79062V1e.LJ(this.originFilePath, this.index * 31, 31), 31);
        Long l = this.originFileSize;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return this.mimeType.hashCode() + C79062V1e.LJ(this.forBase64FilePath, C79062V1e.LJ(this.mediaType, JBR.LIZJ(this.fileSize, (LJ + hashCode) * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReturnEcommerceCommentModel(index=");
        LIZ.append(this.index);
        LIZ.append(", originFilePath=");
        LIZ.append(this.originFilePath);
        LIZ.append(", compressFilePath=");
        LIZ.append(this.compressFilePath);
        LIZ.append(", originFileSize=");
        LIZ.append(this.originFileSize);
        LIZ.append(", fileSize=");
        LIZ.append(this.fileSize);
        LIZ.append(", mediaType=");
        LIZ.append(this.mediaType);
        LIZ.append(", forBase64FilePath=");
        LIZ.append(this.forBase64FilePath);
        LIZ.append(", mimeType=");
        return q.LIZIZ(LIZ, this.mimeType, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.index);
        out.writeString(this.originFilePath);
        out.writeString(this.compressFilePath);
        Long l = this.originFileSize;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        out.writeLong(this.fileSize);
        out.writeString(this.mediaType);
        out.writeString(this.forBase64FilePath);
        out.writeString(this.mimeType);
    }

    public ReturnEcommerceCommentModel(int i, String originFilePath, String compressFilePath, Long l, long j, String mediaType, String forBase64FilePath, String mimeType) {
        o.LJIIIZ(originFilePath, "originFilePath");
        o.LJIIIZ(compressFilePath, "compressFilePath");
        o.LJIIIZ(mediaType, "mediaType");
        o.LJIIIZ(forBase64FilePath, "forBase64FilePath");
        o.LJIIIZ(mimeType, "mimeType");
        this.index = i;
        this.originFilePath = originFilePath;
        this.compressFilePath = compressFilePath;
        this.originFileSize = l;
        this.fileSize = j;
        this.mediaType = mediaType;
        this.forBase64FilePath = forBase64FilePath;
        this.mimeType = mimeType;
    }

    public /* synthetic */ ReturnEcommerceCommentModel(int i, String str, String str2, Long l, long j, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, str, str2, l, j, str3, str4, str5);
    }
}
