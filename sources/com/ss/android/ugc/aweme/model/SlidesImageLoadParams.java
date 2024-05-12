package com.ss.android.ugc.aweme.model;

import X.C07670Rv;
import X.C16880lQ;
import X.C1FJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class SlidesImageLoadParams implements Parcelable {
    public static final Parcelable.Creator<SlidesImageLoadParams> CREATOR = new Parcelable.Creator<SlidesImageLoadParams>() { // from class: X.81i
        @Override // android.os.Parcelable.Creator
        public final SlidesImageLoadParams createFromParcel(Parcel parcel) {
            boolean z;
            Integer valueOf;
            Integer valueOf2;
            Integer valueOf3;
            Integer valueOf4;
            Integer valueOf5;
            Integer valueOf6;
            boolean z2;
            o.LJIIIZ(parcel, "parcel");
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString = parcel.readString();
            int readInt3 = parcel.readInt();
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String readString3 = parcel.readString();
            Integer num = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new SlidesImageLoadParams(readLong, readInt, readInt2, readString, readInt3, readString2, z, readString3, valueOf, readString4, readString5, readString6, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, z2, readString7, readString8, num, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SlidesImageLoadParams[] newArray(int i) {
            return new SlidesImageLoadParams[i];
        }
    };
    public final String aid;
    public final String allBitrateGears;
    public final long duration;
    public final String errorMsg;
    public final Integer height;
    public final Integer imageSize;
    public final int index;
    public final boolean isImageCached;
    public final Integer originHeight;
    public final Integer originWidth;
    public final String originalUrl;
    public final String photoLoaderType;
    public final Integer playLadderErrCode;
    public final String playLadderGear;
    public final String requestInfo;
    public final String resolution;
    public final String sourceFromScene;
    public final int status;
    public final Integer statusCode;
    public final int totalCount;
    public final String url;
    public final boolean useMultiBitRate;
    public final Integer width;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlidesImageLoadParams)) {
            return false;
        }
        SlidesImageLoadParams slidesImageLoadParams = (SlidesImageLoadParams) obj;
        return this.duration == slidesImageLoadParams.duration && this.status == slidesImageLoadParams.status && this.index == slidesImageLoadParams.index && o.LJ(this.url, slidesImageLoadParams.url) && this.totalCount == slidesImageLoadParams.totalCount && o.LJ(this.aid, slidesImageLoadParams.aid) && this.useMultiBitRate == slidesImageLoadParams.useMultiBitRate && o.LJ(this.sourceFromScene, slidesImageLoadParams.sourceFromScene) && o.LJ(this.playLadderErrCode, slidesImageLoadParams.playLadderErrCode) && o.LJ(this.playLadderGear, slidesImageLoadParams.playLadderGear) && o.LJ(this.allBitrateGears, slidesImageLoadParams.allBitrateGears) && o.LJ(this.resolution, slidesImageLoadParams.resolution) && o.LJ(this.width, slidesImageLoadParams.width) && o.LJ(this.height, slidesImageLoadParams.height) && o.LJ(this.originWidth, slidesImageLoadParams.originWidth) && o.LJ(this.originHeight, slidesImageLoadParams.originHeight) && o.LJ(this.imageSize, slidesImageLoadParams.imageSize) && this.isImageCached == slidesImageLoadParams.isImageCached && o.LJ(this.originalUrl, slidesImageLoadParams.originalUrl) && o.LJ(this.photoLoaderType, slidesImageLoadParams.photoLoaderType) && o.LJ(this.statusCode, slidesImageLoadParams.statusCode) && o.LJ(this.requestInfo, slidesImageLoadParams.requestInfo) && o.LJ(this.errorMsg, slidesImageLoadParams.errorMsg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LLJIJIL = ((((C16880lQ.LLJIJIL(this.duration) * 31) + this.status) * 31) + this.index) * 31;
        String str = this.url;
        int hashCode = (((LLJIJIL + (str == null ? 0 : str.hashCode())) * 31) + this.totalCount) * 31;
        String str2 = this.aid;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.useMultiBitRate;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        String str3 = this.sourceFromScene;
        int hashCode3 = (i2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.playLadderErrCode;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.playLadderGear;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.allBitrateGears;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.resolution;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.width;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.height;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.originWidth;
        int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.originHeight;
        int hashCode11 = (hashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.imageSize;
        int hashCode12 = (((hashCode11 + (num6 == null ? 0 : num6.hashCode())) * 31) + (this.isImageCached ? 1 : 0)) * 31;
        String str7 = this.originalUrl;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.photoLoaderType;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num7 = this.statusCode;
        int hashCode15 = (hashCode14 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str9 = this.requestInfo;
        int hashCode16 = (hashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.errorMsg;
        return hashCode16 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlidesImageLoadParams(duration=");
        sb.append(this.duration);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", index=");
        sb.append(this.index);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", totalCount=");
        sb.append(this.totalCount);
        sb.append(", aid=");
        sb.append(this.aid);
        sb.append(", useMultiBitRate=");
        sb.append(this.useMultiBitRate);
        sb.append(", sourceFromScene=");
        sb.append(this.sourceFromScene);
        sb.append(", playLadderErrCode=");
        sb.append(this.playLadderErrCode);
        sb.append(", playLadderGear=");
        sb.append(this.playLadderGear);
        sb.append(", allBitrateGears=");
        sb.append(this.allBitrateGears);
        sb.append(", resolution=");
        sb.append(this.resolution);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", originWidth=");
        sb.append(this.originWidth);
        sb.append(", originHeight=");
        sb.append(this.originHeight);
        sb.append(", imageSize=");
        sb.append(this.imageSize);
        sb.append(", isImageCached=");
        sb.append(this.isImageCached);
        sb.append(", originalUrl=");
        sb.append(this.originalUrl);
        sb.append(", photoLoaderType=");
        sb.append(this.photoLoaderType);
        sb.append(", statusCode=");
        sb.append(this.statusCode);
        sb.append(", requestInfo=");
        sb.append(this.requestInfo);
        sb.append(", errorMsg=");
        return C07670Rv.LIZIZ(sb, this.errorMsg, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeLong(this.duration);
        out.writeInt(this.status);
        out.writeInt(this.index);
        out.writeString(this.url);
        out.writeInt(this.totalCount);
        out.writeString(this.aid);
        out.writeInt(this.useMultiBitRate ? 1 : 0);
        out.writeString(this.sourceFromScene);
        Integer num = this.playLadderErrCode;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.playLadderGear);
        out.writeString(this.allBitrateGears);
        out.writeString(this.resolution);
        Integer num2 = this.width;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        Integer num3 = this.height;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num3);
        }
        Integer num4 = this.originWidth;
        if (num4 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num4);
        }
        Integer num5 = this.originHeight;
        if (num5 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num5);
        }
        Integer num6 = this.imageSize;
        if (num6 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num6);
        }
        out.writeInt(this.isImageCached ? 1 : 0);
        out.writeString(this.originalUrl);
        out.writeString(this.photoLoaderType);
        Integer num7 = this.statusCode;
        if (num7 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num7);
        }
        out.writeString(this.requestInfo);
        out.writeString(this.errorMsg);
    }

    public static SlidesImageLoadParams LIZ(SlidesImageLoadParams slidesImageLoadParams, String str, Integer num, Integer num2, Integer num3, Integer num4, String str2, String str3, int i) {
        long j;
        int i2;
        int i3;
        String str4;
        int i4;
        String str5;
        boolean z;
        String str6;
        Integer num5;
        String str7;
        String str8;
        Integer num6;
        Integer num7;
        boolean z2;
        String str9;
        String str10 = str3;
        Integer num8 = num3;
        String str11 = str;
        Integer num9 = num2;
        Integer num10 = num4;
        Integer num11 = num;
        String str12 = str2;
        if ((i & 1) != 0) {
            j = slidesImageLoadParams.duration;
        } else {
            j = 0;
        }
        if ((i & 2) != 0) {
            i2 = slidesImageLoadParams.status;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            i3 = slidesImageLoadParams.index;
        } else {
            i3 = 0;
        }
        String str13 = null;
        if ((i & 8) != 0) {
            str4 = slidesImageLoadParams.url;
        } else {
            str4 = null;
        }
        if ((i & 16) != 0) {
            i4 = slidesImageLoadParams.totalCount;
        } else {
            i4 = 0;
        }
        if ((i & 32) != 0) {
            str5 = slidesImageLoadParams.aid;
        } else {
            str5 = null;
        }
        if ((i & 64) != 0) {
            z = slidesImageLoadParams.useMultiBitRate;
        } else {
            z = false;
        }
        if ((i & 128) != 0) {
            str6 = slidesImageLoadParams.sourceFromScene;
        } else {
            str6 = null;
        }
        if ((i & 256) != 0) {
            num5 = slidesImageLoadParams.playLadderErrCode;
        } else {
            num5 = null;
        }
        if ((i & 512) != 0) {
            str7 = slidesImageLoadParams.playLadderGear;
        } else {
            str7 = null;
        }
        if ((i & 1024) != 0) {
            str8 = slidesImageLoadParams.allBitrateGears;
        } else {
            str8 = null;
        }
        if ((i & 2048) != 0) {
            str11 = slidesImageLoadParams.resolution;
        }
        if ((i & 4096) != 0) {
            num11 = slidesImageLoadParams.width;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            num9 = slidesImageLoadParams.height;
        }
        if ((i & 16384) != 0) {
            num6 = slidesImageLoadParams.originWidth;
        } else {
            num6 = null;
        }
        if ((32768 & i) != 0) {
            num7 = slidesImageLoadParams.originHeight;
        } else {
            num7 = null;
        }
        if ((65536 & i) != 0) {
            num8 = slidesImageLoadParams.imageSize;
        }
        if ((131072 & i) != 0) {
            z2 = slidesImageLoadParams.isImageCached;
        } else {
            z2 = false;
        }
        if ((262144 & i) != 0) {
            str9 = slidesImageLoadParams.originalUrl;
        } else {
            str9 = null;
        }
        if ((524288 & i) != 0) {
            str13 = slidesImageLoadParams.photoLoaderType;
        }
        if ((1048576 & i) != 0) {
            num10 = slidesImageLoadParams.statusCode;
        }
        if ((2097152 & i) != 0) {
            str12 = slidesImageLoadParams.requestInfo;
        }
        if ((i & 4194304) != 0) {
            str10 = slidesImageLoadParams.errorMsg;
        }
        return new SlidesImageLoadParams(j, i2, i3, str4, i4, str5, z, str6, num5, str7, str8, str11, num11, num9, num6, num7, num8, z2, str9, str13, num10, str12, str10);
    }

    public SlidesImageLoadParams(long j, int i, int i2, String str, int i3, String str2, boolean z, String str3, Integer num, String str4, String str5, String str6, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, boolean z2, String str7, String str8, Integer num7, String str9, String str10) {
        this.duration = j;
        this.status = i;
        this.index = i2;
        this.url = str;
        this.totalCount = i3;
        this.aid = str2;
        this.useMultiBitRate = z;
        this.sourceFromScene = str3;
        this.playLadderErrCode = num;
        this.playLadderGear = str4;
        this.allBitrateGears = str5;
        this.resolution = str6;
        this.width = num2;
        this.height = num3;
        this.originWidth = num4;
        this.originHeight = num5;
        this.imageSize = num6;
        this.isImageCached = z2;
        this.originalUrl = str7;
        this.photoLoaderType = str8;
        this.statusCode = num7;
        this.requestInfo = str9;
        this.errorMsg = str10;
    }
}
