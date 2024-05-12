package com.ss.android.ugc.aweme.ecommerce.base.common.model;

import X.C1FJ;
import X.C48255Iwl;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class VideoInfo implements Parcelable {
    public static final Parcelable.Creator<VideoInfo> CREATOR = new C48255Iwl();

    @InterfaceC65349Pkn("backup_url")
    public final String backupUrl;

    @InterfaceC65349Pkn("bitrate")
    public final Integer bitrate;

    @InterfaceC65349Pkn("file_hash")
    public final String fileHash;

    @InterfaceC65349Pkn("format")
    public final String format;

    @InterfaceC65349Pkn("height")
    public final Integer height;

    @InterfaceC65349Pkn("main_url")
    public final String mainUrl;

    @InterfaceC65349Pkn("size")
    public final Integer size;

    @InterfaceC65349Pkn("url_expire")
    public final Integer urlExpire;

    @InterfaceC65349Pkn("width")
    public final Integer width;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInfo)) {
            return false;
        }
        VideoInfo videoInfo = (VideoInfo) obj;
        return o.LJ(this.mainUrl, videoInfo.mainUrl) && o.LJ(this.backupUrl, videoInfo.backupUrl) && o.LJ(this.urlExpire, videoInfo.urlExpire) && o.LJ(this.width, videoInfo.width) && o.LJ(this.height, videoInfo.height) && o.LJ(this.fileHash, videoInfo.fileHash) && o.LJ(this.format, videoInfo.format) && o.LJ(this.size, videoInfo.size) && o.LJ(this.bitrate, videoInfo.bitrate);
    }

    public final int hashCode() {
        String str = this.mainUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.backupUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.urlExpire;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.width;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.height;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.fileHash;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.format;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num4 = this.size;
        int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.bitrate;
        return hashCode8 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoInfo(mainUrl=");
        LIZ.append(this.mainUrl);
        LIZ.append(", backupUrl=");
        LIZ.append(this.backupUrl);
        LIZ.append(", urlExpire=");
        LIZ.append(this.urlExpire);
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        LIZ.append(this.height);
        LIZ.append(", fileHash=");
        LIZ.append(this.fileHash);
        LIZ.append(", format=");
        LIZ.append(this.format);
        LIZ.append(", size=");
        LIZ.append(this.size);
        LIZ.append(", bitrate=");
        return s0.LIZJ(LIZ, this.bitrate, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.mainUrl);
        out.writeString(this.backupUrl);
        Integer num = this.urlExpire;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
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
        out.writeString(this.fileHash);
        out.writeString(this.format);
        Integer num4 = this.size;
        if (num4 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num4);
        }
        Integer num5 = this.bitrate;
        if (num5 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num5);
        }
    }

    public VideoInfo(String str, String str2, Integer num, Integer num2, Integer num3, String str3, String str4, Integer num4, Integer num5) {
        this.mainUrl = str;
        this.backupUrl = str2;
        this.urlExpire = num;
        this.width = num2;
        this.height = num3;
        this.fileHash = str3;
        this.format = str4;
        this.size = num4;
        this.bitrate = num5;
    }
}
