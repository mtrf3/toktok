package com.ss.android.ugc.aweme.shortvideo.inlinecaption;

import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionQueryInfo;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class CaptionQueryInfo implements Parcelable {
    public static final Parcelable.Creator<CaptionQueryInfo> CREATOR = new Parcelable.Creator<CaptionQueryInfo>() { // from class: X.5Rd
        @Override // android.os.Parcelable.Creator
        public final CaptionQueryInfo createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new CaptionQueryInfo(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CaptionQueryInfo[] newArray(int i) {
            return new CaptionQueryInfo[i];
        }
    };
    public String audioTosKey;
    public String taskId;

    public CaptionQueryInfo() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptionQueryInfo)) {
            return false;
        }
        CaptionQueryInfo captionQueryInfo = (CaptionQueryInfo) obj;
        return o.LJ(this.audioTosKey, captionQueryInfo.audioTosKey) && o.LJ(this.taskId, captionQueryInfo.taskId);
    }

    public final int hashCode() {
        String str = this.audioTosKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.taskId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.audioTosKey);
        out.writeString(this.taskId);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CaptionQueryInfo(audioTosKey=");
        LIZ.append(this.audioTosKey);
        LIZ.append(", taskId=");
        return q.LIZIZ(LIZ, this.taskId, ')', LIZ);
    }

    public CaptionQueryInfo(String str, String str2) {
        this.audioTosKey = str;
        this.taskId = str2;
    }
}
