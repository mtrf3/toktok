package com.ss.android.ugc.aweme.music.model;

import X.C0MT;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MusicHighPrecisionDuration implements Serializable, Parcelable {
    public static final Parcelable.Creator<MusicHighPrecisionDuration> CREATOR = new Creator();

    @InterfaceC65349Pkn("audition_duration_precision")
    public Float auditionDurationPrecision;

    @InterfaceC65349Pkn("duration_precision")
    public Float durationPrecision;

    @InterfaceC65349Pkn("shoot_duration_precision")
    public Float shootDurationPrecision;

    @InterfaceC65349Pkn("video_duration_precision")
    public Float videoDurationPrecision;

    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<MusicHighPrecisionDuration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MusicHighPrecisionDuration createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new MusicHighPrecisionDuration(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MusicHighPrecisionDuration[] newArray(int i) {
            return new MusicHighPrecisionDuration[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MusicHighPrecisionDuration() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final float convertMS2S(int i) {
        return i / 1000;
    }

    public final int convertS2MS(float f) {
        return (int) (f * 1000);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Float getAuditionDurationPrecision() {
        return this.auditionDurationPrecision;
    }

    public final Float getDurationPrecision() {
        return this.durationPrecision;
    }

    public final Float getShootDurationPrecision() {
        return this.shootDurationPrecision;
    }

    public final Float getVideoDurationPrecision() {
        return this.videoDurationPrecision;
    }

    public final boolean checkDataValidate(Float f) {
        if (f == null) {
            return false;
        }
        f.floatValue();
        if (f.floatValue() <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void setAuditionDurationPrecision(Float f) {
        this.auditionDurationPrecision = f;
    }

    public final void setDurationPrecision(Float f) {
        this.durationPrecision = f;
    }

    public final void setShootDurationPrecision(Float f) {
        this.shootDurationPrecision = f;
    }

    public final void setVideoDurationPrecision(Float f) {
        this.videoDurationPrecision = f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Float f = this.durationPrecision;
        if (f == null) {
            out.writeInt(0);
        } else {
            C0MT.LIZJ(out, 1, f);
        }
        Float f2 = this.shootDurationPrecision;
        if (f2 == null) {
            out.writeInt(0);
        } else {
            C0MT.LIZJ(out, 1, f2);
        }
        Float f3 = this.auditionDurationPrecision;
        if (f3 == null) {
            out.writeInt(0);
        } else {
            C0MT.LIZJ(out, 1, f3);
        }
        Float f4 = this.videoDurationPrecision;
        if (f4 == null) {
            out.writeInt(0);
        } else {
            C0MT.LIZJ(out, 1, f4);
        }
    }

    public MusicHighPrecisionDuration(Float f, Float f2, Float f3, Float f4) {
        this.durationPrecision = f;
        this.shootDurationPrecision = f2;
        this.auditionDurationPrecision = f3;
        this.videoDurationPrecision = f4;
    }

    public /* synthetic */ MusicHighPrecisionDuration(Float f, Float f2, Float f3, Float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2, (i & 4) != 0 ? null : f3, (i & 8) != 0 ? null : f4);
    }
}
