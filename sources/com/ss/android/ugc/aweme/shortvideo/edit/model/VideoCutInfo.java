package com.ss.android.ugc.aweme.shortvideo.edit.model;

import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class VideoCutInfo extends F9E implements Parcelable, Serializable {
    public static final Parcelable.Creator<VideoCutInfo> CREATOR = new Parcelable.Creator<VideoCutInfo>() { // from class: X.5u9
        @Override // android.os.Parcelable.Creator
        public final VideoCutInfo createFromParcel(Parcel in) {
            o.LJIIIZ(in, "in");
            return new VideoCutInfo(in.readLong(), in.readLong(), in.readFloat(), in.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoCutInfo[] newArray(int i) {
            return new VideoCutInfo[i];
        }
    };
    public long end;
    public int rotate;
    public float speed;
    public long start;

    public static /* synthetic */ VideoCutInfo copy$default(VideoCutInfo videoCutInfo, long j, long j2, float f, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = videoCutInfo.start;
        }
        if ((i2 & 2) != 0) {
            j2 = videoCutInfo.end;
        }
        if ((i2 & 4) != 0) {
            f = videoCutInfo.speed;
        }
        if ((i2 & 8) != 0) {
            i = videoCutInfo.rotate;
        }
        return videoCutInfo.copy(j, j2, f, i);
    }

    public final VideoCutInfo copy(long j, long j2, float f, int i) {
        return new VideoCutInfo(j, j2, f, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.start), Long.valueOf(this.end), Float.valueOf(this.speed), Integer.valueOf(this.rotate)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeLong(this.start);
        parcel.writeLong(this.end);
        parcel.writeFloat(this.speed);
        parcel.writeInt(this.rotate);
    }

    public final long getEnd() {
        return this.end;
    }

    public final int getRotate() {
        return this.rotate;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final long getStart() {
        return this.start;
    }

    public final void setEnd(long j) {
        this.end = j;
    }

    public final void setRotate(int i) {
        this.rotate = i;
    }

    public final void setSpeed(float f) {
        this.speed = f;
    }

    public final void setStart(long j) {
        this.start = j;
    }

    public VideoCutInfo(long j, long j2, float f, int i) {
        this.start = j;
        this.end = j2;
        this.speed = f;
        this.rotate = i;
    }
}
