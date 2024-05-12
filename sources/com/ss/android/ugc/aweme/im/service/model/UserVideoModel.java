package com.ss.android.ugc.aweme.im.service.model;

import X.C1NE;
import X.C78940UyW;
import X.C78942UyY;
import X.C79062V1e;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UserVideoModel implements Parcelable {
    public final String localVideoPath;
    public final int originalHeight;
    public final int originalWidth;
    public final String senderNickname;
    public final List<String> thumbnails;
    public final String vid;
    public final String videoModel;
    public static final C78942UyY Companion = new C78942UyY();
    public static final Parcelable.Creator<UserVideoModel> CREATOR = new C78940UyW();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserVideoModel)) {
            return false;
        }
        UserVideoModel userVideoModel = (UserVideoModel) obj;
        return o.LJ(this.senderNickname, userVideoModel.senderNickname) && o.LJ(this.vid, userVideoModel.vid) && this.originalWidth == userVideoModel.originalWidth && this.originalHeight == userVideoModel.originalHeight && o.LJ(this.localVideoPath, userVideoModel.localVideoPath) && o.LJ(this.videoModel, userVideoModel.videoModel) && o.LJ(this.thumbnails, userVideoModel.thumbnails);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.senderNickname);
        out.writeString(this.vid);
        out.writeInt(this.originalWidth);
        out.writeInt(this.originalHeight);
        out.writeString(this.localVideoPath);
        out.writeString(this.videoModel);
        out.writeStringList(this.thumbnails);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = (((C79062V1e.LJ(this.vid, this.senderNickname.hashCode() * 31, 31) + this.originalWidth) * 31) + this.originalHeight) * 31;
        String str = this.localVideoPath;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str2 = this.videoModel;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.thumbnails.hashCode() + ((i2 + i) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserVideoModel(senderNickname=");
        LIZ.append(this.senderNickname);
        LIZ.append(", vid=");
        LIZ.append(this.vid);
        LIZ.append(", originalWidth=");
        LIZ.append(this.originalWidth);
        LIZ.append(", originalHeight=");
        LIZ.append(this.originalHeight);
        LIZ.append(", localVideoPath=");
        LIZ.append(this.localVideoPath);
        LIZ.append(", videoModel=");
        LIZ.append(this.videoModel);
        LIZ.append(", thumbnails=");
        return C1NE.LIZIZ(LIZ, this.thumbnails, ')', LIZ);
    }

    public UserVideoModel(String senderNickname, String vid, String str, int i, int i2, List thumbnails, String str2) {
        o.LJIIIZ(senderNickname, "senderNickname");
        o.LJIIIZ(vid, "vid");
        o.LJIIIZ(thumbnails, "thumbnails");
        this.senderNickname = senderNickname;
        this.vid = vid;
        this.originalWidth = i;
        this.originalHeight = i2;
        this.localVideoPath = str;
        this.videoModel = str2;
        this.thumbnails = thumbnails;
    }
}
